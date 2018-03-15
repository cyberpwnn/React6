package com.volmit.react;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.volmit.react.util.Control;
import com.volmit.react.util.Ex;
import com.volmit.react.util.GList;
import com.volmit.react.util.IController;
import com.volmit.react.util.PluginUtil;
import com.volmit.react.util.Profiler;
import com.volmit.react.util.Task;
import com.volmit.react.util.TaskLater;

public class ReactPlugin extends JavaPlugin
{
	public static ReactPlugin i;
	private GList<IController> controllers;
	private React react;

	@Override
	public void onEnable()
	{
		controllers = new GList<IController>();
		Surge.m();
		i = this;
		new TaskLater("del", 5)
		{
			@Override
			public void run()
			{
				enable();
			}
		};
	}

	private void enable()
	{
		react = new React();
		React.instance = react;
		Config.onRead(i);

		for(Field i : React.class.getFields())
		{
			if(i.isAnnotationPresent(Control.class))
			{
				try
				{
					IController controller = (IController) i.getType().getConstructor().newInstance();
					i.set(react, controller);
					controllers.add(controller);
				}

				catch(Throwable e)
				{
					e.printStackTrace();
				}
			}
		}

		for(IController i : controllers)
		{
			try
			{
				i.start();
			}

			catch(Throwable e)
			{
				e.printStackTrace();
			}
		}

		new Task("controller-main.tick", 0)
		{
			@Override
			public void run()
			{
				for(IController i : controllers)
				{
					try
					{
						Profiler p = new Profiler();
						p.begin();
						i.tick();
						p.end();
						i.setTime(p.getMilliseconds());
					}

					catch(Throwable e)
					{
						Ex.t(e);
					}
				}
			}
		};
	}

	@Override
	public void onDisable()
	{
		for(IController i : controllers)
		{
			try
			{
				i.stop();
			}

			catch(Throwable e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void reload()
	{
		PluginUtil.reload(i);
	}

	public int startTask(int delay, Runnable r)
	{
		return Bukkit.getScheduler().scheduleSyncDelayedTask(this, r, delay);
	}

	public int startRepeatingTask(int delay, int interval, Runnable r)
	{
		return Bukkit.getScheduler().scheduleSyncRepeatingTask(this, r, delay, interval);
	}

	public void stopTask(int id)
	{
		Bukkit.getScheduler().cancelTask(id);
	}
}
