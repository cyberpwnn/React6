package react.controller;

import java.io.IOException;

import org.bukkit.plugin.Plugin;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;

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

		new Task("waiter")
		{
			@Override
			public void run()
			{
				new A()
				{
					@Override
					public void run()
					{
						D.l("Scanning Plugins...");
						try
						{
							CPS.scan();
							D.l("Completed!");
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
		GMap<Long, GList<StackTraceElement>> vv = React.instance.sampleController.getSuperSampler().getSpikes();

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

		React.instance.sampleController.getSuperSampler().getSpikes().clear();
	}

	@Override
	public String getTickName()
	{
		return "spike-controller";
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
}
