package com.volmit.react.api;

import java.io.File;

import org.bukkit.entity.Player;

import surge.Surge;
import surge.cluster.ConfigurationDataInput;
import surge.cluster.ConfigurationDataOutput;
import surge.cluster.IConfigurable;
import surge.cluster.Key;

public class ReactPlayer implements IConfigurable
{
	@Key("state.monitoring")
	public boolean monitoring = false;

	@Key("state.mapping")
	public boolean mapping = false;

	private Player p;

	public ReactPlayer(Player p)
	{
		this.p = p;
		load();
	}

	public void save()
	{
		try
		{
			new ConfigurationDataOutput().write(this, new File(Surge.folder("cache"), p.getUniqueId().toString() + ".yml"));
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void load()
	{
		try
		{
			new ConfigurationDataInput().read(this, new File(Surge.folder("cache"), p.getUniqueId().toString() + ".yml"));
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public boolean isMonitoring()
	{
		return monitoring;
	}

	public boolean isMapping()
	{
		return mapping;
	}

	public Player getP()
	{
		return p;
	}

	public void setMonitoring(boolean monitoring)
	{
		this.monitoring = monitoring;
	}

	public void setMapping(boolean mapping)
	{
		this.mapping = mapping;
	}
}
