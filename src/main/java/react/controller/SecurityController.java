package react.controller;

import org.cyberpwn.glang.GList;

import surge.Main;
import surge.control.Controller;

public class SecurityController extends Controller
{
	public static GList<String> failures = new GList<String>();

	@Override
	public void start()
	{
		scan(new Runnable()
		{
			@Override
			public void run()
			{

			}
		});
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
