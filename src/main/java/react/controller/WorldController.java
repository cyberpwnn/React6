package react.controller;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.WorldUnloadEvent;
import org.cyberpwn.gconcurrent.TICK;

import react.Config;
import react.React;
import react.action.source.RAIActionSource;
import react.api.ActionType;
import surge.Surge;
import surge.control.Controller;

public class WorldController extends Controller
{
	private boolean aboutToWipe;

	@Override
	public void start()
	{
		aboutToWipe = false;
		Surge.register(this);

		for(World i : Bukkit.getWorlds())
		{
			Config.getWorldConfig(i);
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);

		for(World i : Bukkit.getWorlds())
		{
			Config.closeWorldConfig(i);
		}

		if(aboutToWipe)
		{
			File fx = new File(Surge.getAmp().getPluginInstance().getDataFolder(), "worlds");

			for(File i : fx.listFiles())
			{
				i.delete();
			}
		}
	}

	@Override
	public void tick()
	{
		if(TICK.tick % Config.PURGE_INTERVAL == 0 && Config.PURGE)
		{
			try
			{
				React.instance.actionController.fire(ActionType.PURGE_CHUNKS, new RAIActionSource());
			}

			catch(Exception e)
			{

			}
		}
	}

	@EventHandler
	public void on(WorldUnloadEvent e)
	{
		Config.closeWorldConfig(e.getWorld());
	}

	public void wipe()
	{
		aboutToWipe = true;
	}
}
