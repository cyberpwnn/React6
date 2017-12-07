package react.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gnet.Download;
import org.cyberpwn.gnet.DownloadMonitor;
import org.cyberpwn.gnet.DownloadState;
import org.cyberpwn.json.JSONObject;

import react.Config;
import react.Lang;
import react.React;
import surge.Surge;
import surge.control.Controller;
import surge.sched.TaskLater;
import surge.util.D;
import surge.util.PluginUtil;

public class LanguageController extends Controller
{
	private File languageFolder;
	private int oldVersion = 0;
	File dlf;

	@Override
	public void start()
	{
		languageFolder = new File(Surge.getAmp().getPluginInstance().getDataFolder(), "lang");
		languageFolder.mkdirs();

		try
		{
			writeDefaults();
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}

		try
		{
			loadLanguage(Config.LANGUAGE);
			D.s("Language: " + Config.LANGUAGE);
		}

		catch(Exception e)
		{
			Lang.PRIMARY_BUNDLE = Lang.RESOURCE_BUNDLE;
			D.f("Failed to load language: " + Config.LANGUAGE + ".properties (in plugins/React/lang/");
		}

		dlf = new File(languageFolder, "index.json");
		Thread t = new Thread()
		{
			@Override
			public void run()
			{
				checkForLanguageUpdates();
			}
		};
		t.setPriority(Thread.MIN_PRIORITY);
		t.setName("Surge Language Injector");
	}

	public void checkForLanguageUpdates()
	{
		new A()
		{
			@Override
			public void run()
			{
				try
				{
					if(dlf.exists())
					{
						String cf = "";
						BufferedReader bu = new BufferedReader(new FileReader(dlf));
						String ln = "";

						while((ln = bu.readLine()) != null)
						{
							cf += ln;
						}

						bu.close();
						JSONObject jso = new JSONObject(cf);
						oldVersion = jso.getInt("version");
					}

					Download dl = new Download(new DownloadMonitor()
					{
						@Override
						public void onDownloadUpdateProgress(Download download, long bytes, long totalBytes, double percentComplete)
						{

						}

						@Override
						public void onDownloadStateChanged(Download download, DownloadState from, DownloadState to)
						{

						}

						@Override
						public void onDownloadStarted(Download download)
						{

						}

						@Override
						public void onDownloadFinished(Download download)
						{
							D.s("Downloaded Language Index");
							check();
						}

						@Override
						public void onDownloadFailed(Download download)
						{

						}
					}, new URL("https://raw.githubusercontent.com/VolmitSoftware/React/master/language/index.json"), dlf, 8192);

					dl.start();
				}

				catch(MalformedURLException e)
				{
					e.printStackTrace();
				}

				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}

				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		};
	}

	private void downloadAll(boolean b) throws IOException
	{
		String cf = "";
		BufferedReader bu = new BufferedReader(new FileReader(dlf));
		String ln = "";

		while((ln = bu.readLine()) != null)
		{
			cf += ln;
		}

		bu.close();
		JSONObject jso = new JSONObject(cf);

		boolean ud = false;

		for(Object i : jso.getJSONArray("languages"))
		{
			if(b)
			{
				ud = true;
				downloadLanguage((String) i);
			}

			else if(!b && !new File(languageFolder, i.toString()).exists())
			{
				ud = true;
				downloadLanguage((String) i);
			}
		}

		if(ud)
		{
			D.s("Languages out of date. Updating...");

			new TaskLater("dlwaiter", 5)
			{
				@Override
				public void run()
				{
					Thread t = new Thread()
					{
						@Override
						public void run()
						{
							D.v("Waiting to apply language updates...");
							A.mgr.lock();

							new TaskLater("Reload waiter", 20)
							{
								@Override
								public void run()
								{
									PluginUtil.reload(Surge.getAmp().getPluginInstance());
								}
							};
						}
					};
					t.setName("Surge Language Updater");
					t.start();
				}
			};
		}
	}

	private void downloadLanguage(String i) throws IOException
	{
		File dld = new File(languageFolder, i);

		Download dl = new Download(new DownloadMonitor()
		{
			@Override
			public void onDownloadUpdateProgress(Download download, long bytes, long totalBytes, double percentComplete)
			{

			}

			@Override
			public void onDownloadStateChanged(Download download, DownloadState from, DownloadState to)
			{

			}

			@Override
			public void onDownloadStarted(Download download)
			{

			}

			@Override
			public void onDownloadFinished(Download download)
			{
				D.s("Downloaded Language: " + dld.getName().split("\\.")[0]);
			}

			@Override
			public void onDownloadFailed(Download download)
			{

			}
		}, new URL("https://raw.githubusercontent.com/VolmitSoftware/React/master/language/" + i), dld, 8192);

		dl.start();
	}

	private void check()
	{
		try
		{
			String cf = "";
			BufferedReader bu = new BufferedReader(new FileReader(dlf));
			String ln = "";

			while((ln = bu.readLine()) != null)
			{
				cf += ln;
			}

			bu.close();
			JSONObject jso = new JSONObject(cf);
			int newVersion = jso.getInt("version");

			if(newVersion != oldVersion)
			{
				downloadAll(true);
			}

			else
			{
				downloadAll(false);
			}
		}

		catch(Exception e)
		{

		}
	}

	public void loadLanguage(String key) throws Exception
	{
		File f = getFileForLanguage(key).getParentFile();
		URL[] urls = {f.toURI().toURL()};
		ClassLoader loader = new URLClassLoader(urls);
		ResourceBundle rb = ResourceBundle.getBundle(key, Locale.getDefault(), loader);

		if(rb != null)
		{
			Lang.PRIMARY_BUNDLE = rb;
			return;
		}

		throw new Exception("Unable to load resourceBundle");
	}

	public File getFileForLanguage(String name)
	{
		return new File(languageFolder, name + ".properties");
	}

	public void writeDefaults() throws IOException
	{
		InputStream in = React.class.getResourceAsStream("/react/lang.properties");
		FileOutputStream fos = new FileOutputStream(new File(languageFolder, "enUS.properties"));
		byte[] buf = new byte[4096];
		int read = 0;

		while((read = in.read(buf)) != -1)
		{
			fos.write(buf, 0, read);
		}

		fos.close();
		in.close();
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{

	}
}
