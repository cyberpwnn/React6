package com.volmit.react.util;

import com.volmit.react.surge.Surge;

public class CoreTickThread extends Thread
{
	public boolean r = true;

	public CoreTickThread()
	{
		setName("Surge Sideline");
	}

	@Override
	public void run()
	{
		D.v("@Thread Sideline");

		while(!interrupted())
		{
			if(!r)
			{
				break;
			}

			if(Thread.interrupted())
			{
				return;
			}

			try
			{
				if(Thread.interrupted())
				{
					return;
				}

				Thread.sleep(50);

				for(IMasterTickComponent i : Surge.getAsyncTickComponents())
				{
					if(Thread.interrupted())
					{
						return;
					}

					try
					{
						i.onTick();
					}

					catch(Throwable e)
					{
						D.f("Failed to tick coreelement " + i.getClass().getSimpleName());
					}
				}
			}

			catch(InterruptedException e)
			{
				return;
			}

			catch(Throwable e)
			{

			}
		}
	}
}
