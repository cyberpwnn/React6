package react.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

import react.Config;
import react.Lang;
import react.React;
import surge.Surge;
import surge.control.Controller;
import surge.util.D;

public class LanguageController extends Controller
{
	private File languageFolder;

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
