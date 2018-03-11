package react.controller;

import java.lang.reflect.Field;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.volmit.react.surge.Main;
import com.volmit.react.surge.Surge;
import com.volmit.react.util.AsyncTick;
import com.volmit.react.util.Control;
import com.volmit.react.util.Controller;
import com.volmit.react.util.D;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.I;
import com.volmit.react.util.IController;
import com.volmit.react.util.IMasterTickComponent;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.SuperSampler;
import com.volmit.react.util.TICK;
import com.volmit.react.util.TaskLater;

import react.Gate;
import react.React;
import react.api.ISampler;
import react.api.SampledType;
import react.sampler.SampleAsyncQueue;
import react.sampler.SampleCPU;
import react.sampler.SampleChunkTime;
import react.sampler.SampleChunksLoaded;
import react.sampler.SampleChunksLoadedPerSecond;
import react.sampler.SampleEntitiesDrops;
import react.sampler.SampleEntitiesLiving;
import react.sampler.SampleEntitiesTiles;
import react.sampler.SampleEntitiesTotal;
import react.sampler.SampleEntityDroppedTicks;
import react.sampler.SampleEntityTime;
import react.sampler.SampleEntityTimeLock;
import react.sampler.SampleExplosionTime;
import react.sampler.SampleFluidPerSecond;
import react.sampler.SampleFluidPerTick;
import react.sampler.SampleFluidTickTime;
import react.sampler.SampleFluidTickUtilization;
import react.sampler.SampleGrowthTime;
import react.sampler.SampleHopperPerSecond;
import react.sampler.SampleHopperPerTick;
import react.sampler.SampleHopperTickTime;
import react.sampler.SampleHopperTickUtilization;
import react.sampler.SampleMemoryAllocated;
import react.sampler.SampleMemoryAllocationPerSecond;
import react.sampler.SampleMemoryFree;
import react.sampler.SampleMemoryMax;
import react.sampler.SampleMemoryUse;
import react.sampler.SamplePhysicsTickTime;
import react.sampler.SampleReactTaskTime;
import react.sampler.SampleReactTime;
import react.sampler.SampleRedstonePerSecond;
import react.sampler.SampleRedstonePerTick;
import react.sampler.SampleRedstoneTickTime;
import react.sampler.SampleRedstoneTickUtilization;
import react.sampler.SampleSyncQueue;
import react.sampler.SampleTickTime;
import react.sampler.SampleTickUtilization;
import react.sampler.SampleTicksPerSecond;
import react.sampler.SampleTileDroppedTicks;
import react.sampler.SampleTileTime;
import react.sampler.SampleTileTimeLock;
import react.timings.TimingsReport;

@AsyncTick
public class SampleController extends Controller implements IMasterTickComponent
{
	private GMap<String, ISampler> samplers;
	private int cd;
	private int sct;
	public static GMap<String, Double> reports;
	private GList<IController> controllers;
	public static double msu = 0;
	public static double totalTime = 0;
	public static double totalTaskTime = 0;
	public static TimingsReport t = null;

	@Override
	public void dump(JSONObject object)
	{
		object.put("reports", reports.size());

		JSONObject js = new JSONObject();

		for(String i : samplers.k())
		{
			js.put(i, samplers.get(i).get());
		}

		object.put("samplers", js);
	}

	public SampleController()
	{
		controllers = new GList<IController>();
		reports = new GMap<String, Double>();
		sct = 0;
		samplers = new GMap<String, ISampler>();
		constructSamplers();
		cd = 4;
	}

	public void construct()
	{
		controllers = new GList<IController>();

		for(Field i : React.class.getDeclaredFields())
		{
			if(i.isAnnotationPresent(Control.class))
			{
				try
				{
					controllers.add((IController) i.get(React.instance));
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public void report(String key, double d)
	{
		if(!reports.containsKey(key))
		{
			reports.put(key, 0.0);
		}

		reports.put(key, reports.get(key) + d);
	}

	public boolean checkThreads()
	{
		GList<String> mf = new GList<String>();

		for(Thread i : Thread.getAllStackTraces().keySet())
		{
			if(i.getName().startsWith("Surge Thread Monitor") && i.isAlive())
			{
				return false;
			}
		}

		for(Thread i : Thread.getAllStackTraces().keySet())
		{
			if(i.getName().startsWith("Surge ") && i.isAlive())
			{
				if(!mf.contains(i.getName()))
				{
					mf.add(i.getName());
				}

				else
				{
					return true;
				}
			}
		}

		return false;
	}

	public void registerSampler(ISampler s)
	{
		samplers.put(s.getID(), s);
	}

	public ISampler getSampler(String id)
	{
		return samplers.get(id);
	}

	private void constructSamplers()
	{
		registerSampler(new SampleAsyncQueue());
		registerSampler(new SampleChunksLoaded());
		registerSampler(new SampleChunksLoadedPerSecond());
		registerSampler(new SampleChunkTime());
		registerSampler(new SampleCPU());
		registerSampler(new SampleEntitiesDrops());
		registerSampler(new SampleEntitiesLiving());
		registerSampler(new SampleEntitiesTiles());
		registerSampler(new SampleEntitiesTotal());
		registerSampler(new SampleEntityDroppedTicks());
		registerSampler(new SampleEntityTime());
		registerSampler(new SampleEntityTimeLock());
		registerSampler(new SampleExplosionTime());
		registerSampler(new SampleFluidPerSecond());
		registerSampler(new SampleFluidPerTick());
		registerSampler(new SampleFluidTickTime());
		registerSampler(new SampleFluidTickUtilization());
		registerSampler(new SampleGrowthTime());
		registerSampler(new SampleHopperPerSecond());
		registerSampler(new SampleHopperPerTick());
		registerSampler(new SampleHopperTickTime());
		registerSampler(new SampleHopperTickUtilization());
		registerSampler(new SampleMemoryAllocated());
		registerSampler(new SampleMemoryAllocationPerSecond());
		registerSampler(new SampleMemoryFree());
		registerSampler(new SampleMemoryMax());
		registerSampler(new SampleMemoryUse());
		registerSampler(new SamplePhysicsTickTime());
		registerSampler(new SampleReactTaskTime());
		registerSampler(new SampleReactTime());
		registerSampler(new SampleRedstonePerSecond());
		registerSampler(new SampleRedstonePerTick());
		registerSampler(new SampleRedstoneTickTime());
		registerSampler(new SampleRedstoneTickUtilization());
		registerSampler(new SampleSyncQueue());
		registerSampler(new SampleTicksPerSecond());
		registerSampler(new SampleTickTime());
		registerSampler(new SampleTickUtilization());
		registerSampler(new SampleTileDroppedTicks());
		registerSampler(new SampleTileTime());
		registerSampler(new SampleTileTimeLock());

		for(ISampler i : samplers.v())
		{
			D.v("Sampler: " + i.getID() + " (" + i.getName() + ") @ " + i.getInterval()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			i.construct();
		}
	}

	@Override
	public void start()
	{
		Surge.register(this);
		Surge.registerTicked(this);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
		Surge.unregisterTicked(this);
	}

	@Override
	public void tick()
	{
		I.hit++;

		if(SampledType.TICK.get().getValue() == 0)
		{
			sct++;
		}

		if(TICK.tick % 5 == 0)
		{
			sct -= 2;

			if(sct > 20)
			{
				D.w("Super Sampler did not start correctly. Resetting");
				Main.reload();
			}
		}

		reports.clear();
		if(controllers.isEmpty())
		{
			construct();
		}

		for(IController i : controllers)
		{
			report("Controller " + i.getClass().getSimpleName().replaceAll("Controller", ""), i.getTime());
		}

		report("Tasks", msu);
		msu = 0;
		double nsv = 0;
		for(String i : reports.k())
		{
			nsv += reports.get(i);
		}

		totalTime = nsv;
		totalTaskTime = msu;
	}

	public SuperSampler getSuperSampler()
	{
		return Main.getSuperSampler();
	}

	@Override
	public void onTick()
	{

		if(TICK.tick < 2)
		{
			return;
		}

		if(cd > 0)
		{
			cd--;
			return;
		}

		for(ISampler i : samplers.v())
		{
			try
			{
				if(TICK.tick % i.getInterval() == 0)
				{
					i.sample();
				}
			}

			catch(Throwable e)
			{

			}
		}
	}

	@Override
	public String getTickName()
	{
		return "Sampler"; //$NON-NLS-1$
	}

	public GMap<String, ISampler> getSamplers()
	{
		return samplers;
	}

	public SuperSampler getSs()
	{
		return Main.getSuperSampler();
	}

	public int getCd()
	{
		return cd;
	}

	public GList<String> getSamplerNames()
	{
		GList<String> samps = new GList<String>();

		for(String i : getSamplers().k())
		{
			samps.add(i);
		}

		return samps;
	}

	@EventHandler
	public void on(PlayerCommandPreprocessEvent e)
	{
		if(e.getMessage().equalsIgnoreCase("/timings on"))
		{
			if(t != null)
			{
				t.stop();
				t = null;
			}

			t = new TimingsReport();
			t.start();
			Gate.msgActing(e.getPlayer(), "Timings Started");
		}

		if(e.getMessage().equalsIgnoreCase("/timings off"))
		{
			if(t != null)
			{
				t.stop();
				t = null;
				Gate.msgSuccess(e.getPlayer(), "Timings Stopped");
			}
		}

		if(e.getMessage().equalsIgnoreCase("/timings reset"))
		{
			if(t != null)
			{
				t.stop();
				t = null;
			}

			t = new TimingsReport();
			t.start();
			Gate.msgSuccess(e.getPlayer(), "Timings Reset");
		}

		if(e.getMessage().equalsIgnoreCase("/timings paste"))
		{
			if(t != null)
			{
				t.stop();
				t.reportTo(e.getPlayer());
				t = null;
			}
		}

		if(e.getMessage().equalsIgnoreCase("/timings peek"))
		{
			if(t != null)
			{
				t.reportTo(e.getPlayer());
				Gate.msgActing(e.getPlayer(), "Timings Peeked. Timings will continue to sample.");
			}

			e.setCancelled(true);
		}

		if(e.getMessage().equalsIgnoreCase("/timings spam"))
		{
			if(t != null)
			{
				Gate.msgActing(e.getPlayer(), "Timings data will be sent 4 times a second.");
				Gate.msgActing(e.getPlayer(), "You can turn this off by using /timings spam");

				new TaskLater("tf", 45)
				{
					@Override
					public void run()
					{
						if(t != null)
						{
							t.spam(e.getPlayer());
						}
					}
				};
			}

			e.setCancelled(true);
		}
	}
}
