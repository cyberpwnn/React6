package surge;

import org.bukkit.Bukkit;
import org.cyberpwn.gconcurrent.TICK;

import surge.control.AmpedPlugin;
import surge.sched.IMasterTickComponent;
import surge.util.D;
import surge.util.I;

public class PluginAmp
{
	private AmpedPlugin plugin;
	private boolean connected;
	private int masterTask;
	public Runnable onReload;

	public PluginAmp(AmpedPlugin plugin)
	{
		I.a("plugin-amp.start", 1);
		this.plugin = plugin;
		connected = false;

		onReload = new Runnable()
		{
			@Override
			public void run()
			{

			}
		};
		I.b("plugin-amp.start");
	}

	public AmpedPlugin getPluginInstance()
	{
		return plugin;
	}

	public boolean isConnected()
	{
		return connected;
	}

	public void connect()
	{
		I.a("plugin-amp.connect", 1);
		connected = true;
		Surge.amp = this;
		Surge.getHotloadManager().track(Surge.getPluginJarFile(), new Runnable()
		{
			@Override
			public void run()
			{
				onReload.run();
				Main.reload();
			}
		});

		masterTask = startRepeatingTask(0, 0, new Runnable()
		{
			@Override
			public void run()
			{
				masterTick();
			}
		});
		I.b("plugin-amp.connect");
	}

	private void masterTick()
	{
		I.a("plugin-amp.master-tick", 20);
		if(!isConnected())
		{
			stopTask(masterTask);
		}

		TICK.tick++;
		D.flush();

		for(IMasterTickComponent i : Surge.getTickComponents().copy())
		{
			I.a("plugin-amp.master-tick." + i.getTickName(), 20);
			i.onTick();
			I.b("plugin-amp.master-tick." + i.getTickName());
		}

		I.b("plugin-amp.master-tick");
	}

	public void disconnect()
	{
		I.a("plugin-amp.disconnect", 1);
		connected = false;
		stopTask(masterTask);
		Surge.stopAmp();
		Surge.getHotloadManager().untrackall();
		I.b("plugin-amp.disconnect");
	}

	public int startTask(int delay, Runnable r)
	{
		if(isConnected())
		{
			return Bukkit.getScheduler().scheduleSyncDelayedTask(getPluginInstance(), r, delay);
		}

		else
		{
			D.f("No amp to start task");
		}

		return -1;
	}

	public int startRepeatingTask(int delay, int interval, Runnable r)
	{
		if(isConnected())
		{
			return Bukkit.getScheduler().scheduleSyncRepeatingTask(getPluginInstance(), r, delay, interval);
		}

		else
		{
			D.f("No amp to start repeating task");
		}

		return -1;
	}

	public void stopTask(int id)
	{
		Bukkit.getScheduler().cancelTask(id);
	}

	public AmpedPlugin getPlugin()
	{
		return plugin;
	}

	public int getMasterTask()
	{
		return masterTask;
	}

	public Runnable getOnReload()
	{
		return onReload;
	}

	public void setPlugin(AmpedPlugin plugin)
	{
		this.plugin = plugin;
	}

	public void setConnected(boolean connected)
	{
		this.connected = connected;
	}

	public void setMasterTask(int masterTask)
	{
		this.masterTask = masterTask;
	}

	public void setOnReload(Runnable onReload)
	{
		this.onReload = onReload;
	}
}
