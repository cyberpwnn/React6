package com.volmit.react.api;

import org.bukkit.entity.Player;

import surge.util.Tag;

public enum Permissable
{
	@Tag("access")
	ACCESS,

	@Tag("monitor")
	MONITOR,

	@Tag("monitor.title")
	MONITOR_TITLE,

	@Tag("monitor.map")
	MONITOR_MAP,

	@Tag("monitor.environment")
	MONITOR_ENVIRONMENT,

	@Tag("act")
	ACT,

	@Tag("reload")
	RELOAD;

	private String node;

	private Permissable()
	{
		try
		{
			node = "react." + Permissable.class.getField(name()).getAnnotation(Tag.class).value();
		}

		catch(Exception e)
		{

		}
	}

	public boolean has(Player p)
	{
		return p.hasPermission(getNode());
	}

	public String getNode()
	{
		return node;
	}
}
