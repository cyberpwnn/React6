package react.controller;

import react.api.ISampler;
import react.sampler.SampleChunksLoaded;
import react.sampler.SampleChunksLoadedPerSecond;
import react.sampler.SampleEntitiesDrops;
import react.sampler.SampleEntitiesLiving;
import react.sampler.SampleEntitiesTiles;
import react.sampler.SampleEntitiesTotal;
import react.sampler.SampleMemoryAllocated;
import react.sampler.SampleMemoryAllocationPerSecond;
import react.sampler.SampleMemoryFree;
import react.sampler.SampleMemoryMax;
import react.sampler.SampleMemoryUse;
import react.sampler.SampleTickTime;
import react.sampler.SampleTickUtilization;
import react.sampler.SampleTicksPerSecond;
import surge.Surge;
import surge.collection.GMap;
import surge.control.Controller;
import surge.sched.IMasterTickComponent;
import surge.sched.TICK;
import surge.server.AsyncTick;
import surge.server.SuperSampler;
import surge.util.D;

@AsyncTick
public class SampleController extends Controller implements IMasterTickComponent
{
	private GMap<String, ISampler> samplers;
	private SuperSampler ss;

	public SampleController()
	{
		samplers = new GMap<String, ISampler>();
		ss = new SuperSampler();
		constructSamplers();
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
		registerSampler(new SampleTicksPerSecond());
		registerSampler(new SampleTickTime());
		registerSampler(new SampleTickUtilization());
		registerSampler(new SampleMemoryUse());
		registerSampler(new SampleMemoryFree());
		registerSampler(new SampleMemoryMax());
		registerSampler(new SampleMemoryAllocated());
		registerSampler(new SampleMemoryAllocationPerSecond());
		registerSampler(new SampleChunksLoaded());
		registerSampler(new SampleChunksLoadedPerSecond());
		registerSampler(new SampleEntitiesTotal());
		registerSampler(new SampleEntitiesLiving());
		registerSampler(new SampleEntitiesDrops());
		registerSampler(new SampleEntitiesTiles());

		for(ISampler i : samplers.v())
		{
			D.v("Sampler: " + i.getID() + " (" + i.getName() + ") @ " + i.getInterval());
			i.construct();
		}
	}

	@Override
	public void start()
	{
		ss.start();
		Surge.register(this);
		Surge.registerTicked(this);
	}

	@Override
	public void stop()
	{
		ss.stop();
		Surge.unregister(this);
		Surge.unregisterTicked(this);
	}

	@Override
	public void tick()
	{

	}

	public SuperSampler getSuperSampler()
	{
		return ss;
	}

	@Override
	public void onTick()
	{
		for(ISampler i : samplers.v())
		{
			try
			{
				if(TICK.tick % i.getInterval() == 0)
				{
					i.sample();
				}
			}

			catch(Exception e)
			{
				D.f("Failed to sample " + i.getName());
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getTickName()
	{
		return "Sampler";
	}
}
