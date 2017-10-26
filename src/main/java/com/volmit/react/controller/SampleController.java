package com.volmit.react.controller;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkUnloadEvent;

import com.volmit.react.api.ISampler;
import com.volmit.react.api.SampledType;
import com.volmit.react.api.Sampler;

import surge.Surge;
import surge.collection.GMap;
import surge.control.Controller;
import surge.math.Average;
import surge.sched.TICK;
import surge.server.SuperSampler;
import surge.util.C;
import surge.util.D;
import surge.util.F;

public class SampleController extends Controller
{
	private GMap<String, ISampler> samplers;
	private SuperSampler ss;
	private boolean chunksChanged = false;
	private int chunksLoaded = 0;
	private int totalEntities;
	private int totalDrops;
	private int totalLivingEntities;
	private int totalTileEntities;

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
				setID(SampledType.TPS.toString());
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
				return F.f(getValue() > 19.89 ? 20 : getValue(), 0) + "\u2126";
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Tick Time");
				setDescription("Tick time in milliseconds");
				setID(SampledType.TICK.toString());
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
				return F.f(getValue(), 0) + "ms \u27A4";
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Tick Utilization");
				setDescription("Tick usage via percent");
				setID(SampledType.TIU.toString());
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
				setID(SampledType.MEM.toString());
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
				setID(SampledType.FREEMEM.toString());
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
				setID(SampledType.MAXMEM.toString());
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
				setID(SampledType.ALLOCMEM.toString());
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
				setID(SampledType.MAHS.toString());
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
				return "\u21AF " + F.memSize((long) getValue());
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Chunks");
				setDescription("Total loaded chunks");
				setID(SampledType.CHK.toString());
				setValue(1);
				setColor(C.RED, C.RED);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				if(chunksChanged)
				{
					int c = 0;

					for(World i : Bukkit.getServer().getWorlds())
					{
						c += i.getLoadedChunks().length;
					}

					setValue(c);
					chunksChanged = false;
				}
			}

			@Override
			public String get()
			{
				return F.f((int) getValue()) + "\u2691";
			}
		});

		registerSampler(new Sampler()
		{
			private Average a = new Average(5);

			@Override
			public void construct()
			{
				setName("Chunks/s");
				setDescription("Chunks per second");
				setID(SampledType.CHKS.toString());
				setValue(1);
				setColor(C.RED, C.RED);
				setInterval(20);
			}

			@Override
			public void sample()
			{
				a.put(chunksLoaded);
				chunksLoaded = 0;
				setValue(a.getAverage());
			}

			@Override
			public String get()
			{
				return "\u29F1 " + F.f((int) getValue()) + "/s";
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Entities");
				setDescription("Total Entities");
				setID(SampledType.ENT.toString());
				setValue(0);
				setColor(C.AQUA, C.AQUA);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(totalEntities);
			}

			@Override
			public String get()
			{
				return F.f((int) getValue()) + "\u2618";
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Living");
				setDescription("Total Living");
				setID(SampledType.ENTLIV.toString());
				setValue(0);
				setColor(C.AQUA, C.AQUA);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(totalLivingEntities);
			}

			@Override
			public String get()
			{
				return "\u2764" + F.f((int) getValue());
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Drops");
				setDescription("Total Drops");
				setID(SampledType.ENTDROP.toString());
				setValue(0);
				setColor(C.AQUA, C.AQUA);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(totalDrops);
			}

			@Override
			public String get()
			{
				return "\u25CF" + F.f((int) getValue());
			}
		});

		registerSampler(new Sampler()
		{
			@Override
			public void construct()
			{
				setName("Tiles");
				setDescription("Total Tiles");
				setID(SampledType.ENTTILE.toString());
				setValue(0);
				setColor(C.AQUA, C.AQUA);
				setInterval(1);
			}

			@Override
			public void sample()
			{
				setValue(totalTileEntities);
			}

			@Override
			public String get()
			{
				return "\u2756" + F.f((int) getValue());
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
		Surge.register(this);
	}

	@Override
	public void stop()
	{
		ss.stop();
		Surge.unregister(this);
	}

	@EventHandler
	public void on(ChunkLoadEvent e)
	{
		chunksChanged = true;
		chunksLoaded++;
	}

	@EventHandler
	public void on(ChunkUnloadEvent e)
	{
		chunksChanged = true;
	}

	@Override
	public void tick()
	{
		totalEntities = 0;
		totalDrops = 0;
		totalLivingEntities = 0;
		totalTileEntities = 0;

		for(World i : Bukkit.getWorlds())
		{
			int k = i.getEntities().size();
			int l = i.getEntitiesByClass(Item.class).size();
			totalLivingEntities += k - l;
			totalEntities += k;
			totalDrops += l;

			for(Chunk j : i.getLoadedChunks())
			{
				totalTileEntities += j.getTileEntities().length;
				totalEntities += j.getTileEntities().length;
			}
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

			catch(Exception e)
			{
				D.f("Failed to sample " + i.getName());
				e.printStackTrace();
			}
		}
	}
}
