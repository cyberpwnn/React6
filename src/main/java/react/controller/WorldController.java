package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.WorldUnloadEvent;

import react.Config;
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

	}

	@EventHandler
	public void on(WorldUnloadEvent e)
	{
		Config.closeWorldConfig(e.getWorld());
	}
}
