package com.volmit.react.controller;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.WorldUnloadEvent;

import com.volmit.react.Config;
import com.volmit.react.E;
import com.volmit.react.React;
import com.volmit.react.Surge;
import com.volmit.react.api.ActionType;
import com.volmit.react.api.RAIActionSource;
import com.volmit.react.util.Controller;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.TICK;

public class WorldController extends Controller
{
	private boolean aboutToWipe;

	@Override
	public void dump(JSONObject object)
	{

	}

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

			catch(Throwable e)
			{
				E.t(e);
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
