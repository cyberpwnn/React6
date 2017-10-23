package com.volmit.react.controller;

import com.volmit.react.api.ISampler;
import com.volmit.react.api.Sampler;

import surge.collection.GMap;
import surge.control.Controller;
import surge.sched.TICK;
import surge.server.SuperSampler;
import surge.util.C;
import surge.util.D;
import surge.util.F;

public class SampleController extends Controller
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
		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Ticks Per Second");
				setDescription("Samples the tps");
				setID("TPS");
				setValue(20);
				setColor(C.GREEN, C.GREEN);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(ss.getTicksPerSecond());
			}

			@Override
			public String get()
			{
				return F.f(getValue() > 19.89 ? 20 : getValue(), 1);
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Tick Time");
				setDescription("Tick time in milliseconds");
				setID("TICK");
				setValue(1);
				setColor(C.GREEN, C.GREEN);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(ss.getTickTime());
			}

			@Override
			public String get()
			{
				return F.f(getValue(), 0) + "ms";
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Tick Utilization");
				setDescription("Tick usage via percent");
				setID("TIU");
				setValue(1);
				setColor(C.GREEN, C.GREEN);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(ss.getTickUtilization());
			}

			@Override
			public String get()
			{
				return F.pc(getValue(), 0);
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Used Memory");
				setDescription("Memory currently used");
				setID("MEM");
				setValue(1);
				setColor(C.GOLD, C.GOLD);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(ss.getMemoryUse());
			}

			@Override
			public String get()
			{
				return F.memSize((long) getValue());
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Free Memory");
				setDescription("Memory currently free");
				setID("FREEMEM");
				setValue(1);
				setColor(C.GOLD, C.GOLD);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(ss.getMemoryMonitor().getMemoryMax() - ss.getMemoryUse());
			}

			@Override
			public String get()
			{
				return F.memSize((long) getValue());
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Max Memory");
				setDescription("Maximum Memory");
				setID("MAXMEM");
				setValue(1);
				setColor(C.GOLD, C.GOLD);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(ss.getMemoryMonitor().getMemoryMax());
			}

			@Override
			public String get()
			{
				return F.memSize((long) getValue());
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Allocated Memory");
				setDescription("Allocated Memory");
				setID("ALLOCMEM");
				setValue(1);
				setColor(C.GOLD, C.GOLD);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(ss.getMemoryAllocated());
			}

			@Override
			public String get()
			{
				return F.memSize((long) getValue());
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Memory allocated per second");
				setDescription("Memory allocated per second");
				setID("MAHS");
				setValue(1);
				setColor(C.GOLD, C.GOLD);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(ss.getMahs());
			}

			@Override
			public String get()
			{
				return F.memSize((long) getValue());
			}
		});

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
	}

	@Override
	public void stop()
	{
		ss.stop();
	}

	@Override
	public void tick()
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
}
