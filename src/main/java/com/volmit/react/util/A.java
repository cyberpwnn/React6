package com.volmit.react.util;

import org.bukkit.Bukkit;

public abstract class A implements Runnable
{
	@SuppressWarnings("deprecation")
	public A()
	{
		Bukkit.getScheduler().scheduleAsyncDelayedTask(Bukkit.getPluginManager().getPlugin("React"), this);
	}
}
