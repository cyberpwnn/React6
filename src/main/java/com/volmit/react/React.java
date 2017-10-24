package com.volmit.react;

import com.volmit.react.controller.MonitorController;
import com.volmit.react.controller.PlayerController;
import com.volmit.react.controller.SampleController;

import surge.control.Control;
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

	@Control
	public SampleController sampleController;

	@Control
	public PlayerController playerController;

	@Control
	public MonitorController monitorController;

	@Enable
	public void enable()
	{

	}

	@Disable
	public void disable()
	{

	}
}
