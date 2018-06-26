package com.volmit.react.controller;

import java.io.File;
import java.io.IOException;

import com.volmit.react.Config;
import com.volmit.react.Gate;
import com.volmit.react.React;
import com.volmit.react.ReactPlugin;
import com.volmit.react.api.DataLogArray;
import com.volmit.react.util.Controller;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.M;

public class DataLogController extends Controller
{
	private int k = 20;
	private DataLogArray dla;

	public int getK()
	{
		return k;
	}

	public DataLogArray getDla()
	{
		return dla;
	}

	@Override
	public void start()
	{

	}

	@Override
	public void stop()
	{
		if(!Config.DATALOG_ENABLED)
		{
			return;
		}

		try
		{
			if(!dla.forceClose())
			{
				dla.getLog().getFile().delete();
			}
		}

		catch(Throwable e)
		{

		}
	}

	@Override
	public void tick()
	{

	}

	@Override
	public void dump(JSONObject object)
	{
		// TODO Auto-generated method stub

	}

	public void onTickAsync()
	{
		if(Gate.isLowMemory())
		{
			return;
		}

		if(!Config.DATALOG_ENABLED)
		{
			return;
		}

		if(k > 0)
		{
			k--;
			return;
		}

		if(dla == null)
		{
			dla = new DataLogArray(new File(ReactPlugin.i.getDataFolder(), "cache"));
		}

		try
		{
			dla.sample();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public long getTotalDuration() throws IOException
	{
		long duration = 0;

		for(File i : dla.getLogs().k())
		{
			duration += dla.getDuration(i);
		}

		return duration;
	}

	public long getTotalFragmentation() throws IOException
	{
		long dur = getTotalDuration();

		return (M.ms() - getOldest()) - dur;
	}

	public long getOldest()
	{
		return getDla().getLogs().get(React.instance.dataLogController.getDla().oldest());
	}

	@Override
	public int getInterval()
	{
		return 1305;
	}

	@Override
	public boolean isUrgent()
	{
		return false;
	}
}
