package com.volmit.react;

import surge.control.AmpedPlugin;
import surge.util.D;
import surge.util.Protocol;

public class React extends AmpedPlugin
{
	@Override
	public void onControllerRegistry()
	{

	}

	@Override
	public void onStart(Protocol serverProtocol)
	{
		D.v("Starting React on " + serverProtocol);
	}

	@Override
	public void onStop()
	{

	}

	@Override
	public void onPostInit()
	{

	}

	@Override
	public void onPreInit()
	{

	}
}
