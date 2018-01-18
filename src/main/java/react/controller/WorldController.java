package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.WorldUnloadEvent;
import org.cyberpwn.gconcurrent.TICK;

import react.Config;
import react.React;
import react.action.source.EmptyActionSource;
import react.api.ActionType;
import surge.Surge;
import surge.control.Controller;

public class WorldController extends Controller
{
	@Override
	public void start()
	{
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
	}

	@Override
	public void tick()
	{
		if(TICK.tick % 1200 == 0)
		{
			try
			{
				React.instance.actionController.fire(ActionType.PURGE_CHUNKS, new EmptyActionSource());
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
}
