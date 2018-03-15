package com.volmit.react.util;

import com.volmit.react.E;
import com.volmit.react.Surge;

public class CoreTickThread
{
	public boolean r = true;

	public CoreTickThread()
	{

	}

	public void run()
	{
		try
		{
			for(IMasterTickComponent i : Surge.getAsyncTickComponents())
			{
				try
				{
					i.onTick();
				}

				catch(Throwable e)
				{
					E.t(e);

				}
			}
		}

		catch(Throwable e)
		{
			E.t(e);
		}
	}
}
