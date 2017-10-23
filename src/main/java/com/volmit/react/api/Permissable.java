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

	private final String node;

	private Permissable()
	{
		node = "react." + getClass().getAnnotation(Tag.class).value();
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
