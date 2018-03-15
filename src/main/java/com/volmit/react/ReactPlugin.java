package com.volmit.react;

import java.io.File;
import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import com.volmit.react.api.Gate;
import com.volmit.react.api.Permissable;
import com.volmit.react.util.Control;
import com.volmit.react.util.Ex;
import com.volmit.react.util.GList;
import com.volmit.react.util.HotloadManager;
import com.volmit.react.util.IController;
import com.volmit.react.util.P;
import com.volmit.react.util.ParallelPoolManager;
import com.volmit.react.util.Profiler;
import com.volmit.react.util.S;
import com.volmit.react.util.TICK;
import com.volmit.react.util.Task;
import com.volmit.react.util.TaskLater;

public class ReactPlugin extends JavaPlugin
{
	public static ReactPlugin i;
	private GList<IController> controllers;
	private React react;
	private ParallelPoolManager pool;
	private HotloadManager mgr;

	@Override
	public void onEnable()
	{
		controllers = new GList<IController>();
		Surge.m();
		i = this;
		new TaskLater("del")
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

		pool = new ParallelPoolManager(1)
		{
			@Override
			public long getNanoGate()
			{
				return 0;
			}
		};

		S.mgr = pool;
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

		mgr = new HotloadManager();
		Runnable rl = new Runnable()
		{
			@Override
			public void run()
			{
				for(Player i : P.onlinePlayers())
				{
					if(Permissable.ACCESS.has(i))
					{
						Gate.msgSuccess(i, "Injecting Configuration Changes");
					}
				}

				reload();
			}
		};

		mgr.track(new File(getDataFolder(), "config.yml"), rl);
		mgr.track(new File(getDataFolder(), "config-experimental.yml"), rl);

		new Task("controller-main.tick", 0)
		{
			@Override
			public void run()
			{
				TICK.tick++;

				if(TICK.tick % 5 == 0)
				{
					mgr.onTick();
				}

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

		mgr.untrackall();
		controllers.clear();
		pool.shutdown();
	}

	public static void reload()
	{
		i.onDisable();
		Bukkit.getScheduler().cancelTasks(i);
		HandlerList.unregisterAll(i);
		i.onEnable();
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
