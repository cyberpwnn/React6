package react.controller;

import java.io.IOException;

import org.bukkit.plugin.Plugin;

import com.volmit.react.surge.Surge;
import com.volmit.react.util.A;
import com.volmit.react.util.AsyncTick;
import com.volmit.react.util.CPS;
import com.volmit.react.util.Callback;
import com.volmit.react.util.Controller;
import com.volmit.react.util.D;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.GSet;
import com.volmit.react.util.IMasterTickComponent;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.Task;

import react.Lang;
import react.React;
import react.api.Async;
import react.api.Unused;
import react.notification.Note;

@AsyncTick
public class SpikeController extends Controller implements IMasterTickComponent
{
	private GMap<String, Integer> spikes = new GMap<String, Integer>();

	@Override
	public void dump(JSONObject object)
	{
		JSONObject j = new JSONObject();

		for(String i : spikes.k())
		{
			j.put(i, spikes.get(i));
		}

		object.put("spikes", j);
	}

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
				try
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
							Note.SPIKES.bake("Spike -> " + j + " (" + spikes.get(j) + " time" + (spikes.get(j) == 1 ? "" : "s") + ")");
						}
					}
				}

				catch(Throwable e)
				{

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
						if(j == null || Surge.getAmp().getPluginInstance() == null)
						{
							continue;
						}

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
