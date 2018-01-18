package react.controller;

import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import react.React;
import react.api.ChunkIssue;
import react.api.SampledChunk;
import react.api.Unused;
import surge.Surge;
import surge.control.Controller;
import surge.sched.IMasterTickComponent;
import surge.server.AsyncTick;

@AsyncTick
public class PhysicsController extends Controller implements IMasterTickComponent
{
	private GMap<Chunk, SampledChunk> samples;
	private int redstonePerTick;
	private int redstonePerSecond;
	private boolean firstTickList;
	private long firstTick;
	private long lastTick;
	private Average aRSMS;
	private Average aRST;
	private Average aRSS;

	@Override
	public void start()
	{
		samples = new GMap<Chunk, SampledChunk>();
		Surge.register(this);
		Surge.registerTicked(this);
		redstonePerTick = 0;
		redstonePerSecond = 0;
		aRSMS = new Average(20);
		aRST = new Average(15);
		aRSS = new Average(3);
		firstTickList = false;
		firstTick = M.ns();
		lastTick = M.ns();
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(BlockPhysicsEvent e)
	{
		tickNextTickList();
		React.instance.physicsController.onPhysics(e.getBlock().getChunk());
		redstonePerSecond++;
		redstonePerTick++;
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(BlockFromToEvent e)
	{
		tickNextTickList();
		React.instance.physicsController.onPhysics(e.getBlock().getChunk());
		redstonePerSecond++;
		redstonePerTick++;
	}

	private void flushTickList()
	{
		if(lastTick < firstTick)
		{
			firstTick = lastTick;
		}

		aRSMS.put(lastTick - firstTick);
		firstTickList = false;
	}

	private void tickNextTickList()
	{
		if(!firstTickList)
		{
			firstTickList = true;
			firstTick = M.ns();
		}

		else
		{
			lastTick = M.ns();
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
		Surge.unregisterTicked(this);
	}

	@Unused
	@Override
	public void tick()
	{
		aRST.put(redstonePerTick);
		aRSS.put(redstonePerSecond);
		redstonePerTick = 0;
		redstonePerSecond = 0;
		flushTickList();

	}

	public void onRedstone(Chunk c)
	{
		hit(c, ChunkIssue.REDSTONE, 10);
	}

	public void onPhysics(Chunk c)
	{
		hit(c, ChunkIssue.PHYSICS, 10);
	}

	public void onHopper(Chunk c)
	{
		hit(c, ChunkIssue.HOPPER, 10);
	}

	public void onFluid(Chunk c)
	{
		hit(c, ChunkIssue.FLUID, 10);
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(ChunkUnloadEvent e)
	{
		samples.remove(e.getChunk());
	}

	public void hit(Chunk c, ChunkIssue issue, int weight)
	{
		if(!samples.containsKey(c))
		{
			samples.put(c, new SampledChunk(c));
		}

		samples.get(c).hit(issue, weight);
		EventController.map.hit(c, issue, (double) weight);
	}

	@Override
	public void onTick()
	{
		try
		{
			for(Chunk i : samples.k())
			{
				SampledChunk sc = samples.get(i);
				sc.dec();
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		new A()
		{
			@Override
			public void run()
			{
				EventController.map.pump();
			}
		};
	}

	@Override
	public String getTickName()
	{
		return "physics-controller";
	}

	public GMap<Chunk, SampledChunk> getSamples()
	{
		return samples;
	}

	public int getRedstonePerTick()
	{
		return redstonePerTick;
	}

	public int getRedstonePerSecond()
	{
		return redstonePerSecond;
	}

	public boolean isFirstTickList()
	{
		return firstTickList;
	}

	public long getFirstTick()
	{
		return firstTick;
	}

	public long getLastTick()
	{
		return lastTick;
	}

	public Average getaRSMS()
	{
		return aRSMS;
	}

	public Average getaRST()
	{
		return aRST;
	}

	public Average getaRSS()
	{
		return aRSS;
	}
}
