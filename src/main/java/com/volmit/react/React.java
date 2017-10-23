package com.volmit.react;

import surge.control.Disable;
import surge.control.Enable;
import surge.control.Instance;
import surge.control.Plugin;
import surge.util.Persist;

@Persist
@Plugin
public class React
{
	@Instance
	public static React instance;

	@Enable
	public void enable()
	{

	}

	@Disable
	public void disable()
	{

	}
}
