package react.controller;

import java.io.IOException;

import org.bukkit.plugin.Plugin;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.glang.Callback;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;

import react.Lang;
import react.React;
import react.api.Async;
import react.api.Unused;
import surge.Surge;
import surge.control.Controller;
import surge.sched.IMasterTickComponent;
import surge.sched.Task;
import surge.server.AsyncTick;
import surge.server.CPS;
import surge.util.D;

@AsyncTick
public class SpikeController extends Controller implements IMasterTickComponent
{
	private GMap<String, Integer> spikes = new GMap<String, Integer>();

	@Override
	public void start()
	{
		Surge.registerTicked(this);

		new Task("waiter") //$NON-NLS-1$
		{
			@Override
			public void run()
			{
				new A()
				{
					@Override
					public void run()
					{
						D.l(Lang.getString("controller.spike-manager.scanning-plugins")); //$NON-NLS-1$
						try
						{
							CPS.scan();
							D.l(Lang.getString("controller.spike-manager.completed")); //$NON-NLS-1$
						}

						catch(IOException e)
						{
							e.printStackTrace();
						}
					}
				};
			}
		};
	}

	@Override
	public void stop()
	{
		Surge.unregisterTicked(this);
	}

	@Async
	@Override
	public void onTick()
	{
		GMap<Long, GList<StackTraceElement>> vv = React.instance.sampleController.getSuperSampler().getSpikes().copy();
		React.instance.sampleController.getSuperSampler().getSpikes().clear();

		new A()
		{
			@Override
			public void run()
			{
				for(long i : vv.k())
				{
					GSet<String> gv = new GSet<String>();

					for(StackTraceElement j : vv.get(i))
					{
						for(Plugin k : CPS.identify(j.getClassName()))
						{
							if(!gv.contains(k.getName()))
							{
								gv.add(k.getName());
							}
						}
					}

					for(String j : gv)
					{
						if(!spikes.contains(j))
						{
							spikes.put(j, 0);
						}

						spikes.put(j, spikes.get(j) + 1);
					}
				}
			}
		};
	}

	@Override
	public String getTickName()
	{
		return "spike-controller"; //$NON-NLS-1$
	}

	@Unused
	@Override
	public void tick()
	{

	}

	public GMap<String, Integer> getSpikes()
	{
		return spikes;
	}

	public void whoFuckingDidThis(Callback<Plugin> callback)
	{
		Thread t = Thread.currentThread();

		new A()
		{
			@Override
			public void run()
			{
				StackTraceElement[] els = t.getStackTrace();
				Plugin plg = null;
				GList<Plugin> plgs = new GList<Plugin>();

				for(StackTraceElement i : els)
				{
					for(Plugin j : CPS.identify(i.getClassName()))
					{
						if(j.equals(Surge.getAmp().getPluginInstance()))
						{
							continue;
						}

						plgs.add(j);
					}
				}

				if(!plgs.isEmpty())
				{
					plg = plgs.mostCommon();
				}

				callback.run(plg);
			}
		};
	}
}
