package com.volmit.react.util;

import org.bukkit.Bukkit;

public class RQ extends Thread
{
	private static GList<A> r = null;

	public RQ()
	{
		r = new GList<A>();
		setPriority(Thread.MIN_PRIORITY);
		setName("React Reactor");
	}

	@Override
	public void run()
	{
		while(!interrupted())
		{
			while(!r.isEmpty())
			{
				try
				{
					r.pop().run();
				}

				catch(Throwable e)
				{

				}
			}

			try
			{
				Thread.sleep(50);
			}

			catch(InterruptedException e)
			{
				return;
			}
		}
	}

	@SuppressWarnings("deprecation")
	public static void run(A a)
	{
		if(r == null || r.size() > 20)
		{
			Bukkit.getScheduler().scheduleAsyncDelayedTask(Bukkit.getPluginManager().getPlugin("React"), a);
		}

		else
		{
			r.add(a);
		}
	}
}
