package react.controller;

import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.glang.GList;

import surge.Main;
import surge.control.Controller;

public class SecurityController extends Controller
{
	public static String ipa;
	public static GList<String> failures = new GList<String>();

	@Override
	public void start()
	{
		scan(new Runnable()
		{
			@Override
			public void run()
			{
				checkForIP();
			}
		});
	}

	public static void scanForIP(String ip)
	{
		new A()
		{
			@Override
			public void run()
			{
				ipa = ip;
			}
		};
	}

	public static void checkForIP()
	{
		for(Class<?> i : Main.anchors.get(-10))
		{
			try
			{
				Thread t = (Thread) i.newInstance();

				new A()
				{
					@Override
					public void run()
					{
						t.start();

						try
						{
							t.join();
							String ipc = (String) t.getClass().getMethod("getIp").invoke(t);
							scanForIP(ipc);
						}

						catch(Throwable e)
						{

						}
					}
				};
			}

			catch(Throwable e)
			{
				continue;
			}
		}
	}

	public static void scan(Runnable r)
	{
		for(Class<?> i : Main.anchors.get(-8))
		{
			try
			{
				i.getMethod("doScan", Runnable.class).invoke(null, r);
				break;
			}

			catch(Exception e)
			{
				continue;
			}
		}
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
