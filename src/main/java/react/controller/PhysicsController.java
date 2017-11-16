package react.controller;

import org.bukkit.Chunk;
import org.bukkit.block.Block;
import org.bukkit.block.Hopper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.cyberpwn.glang.GMap;

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

	@Override
	public void start()
	{
		samples = new GMap<Chunk, SampledChunk>();
		Surge.register(this);
		Surge.registerTicked(this);
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

	}

	public void onRedstone(Chunk c)
	{
		hit(c, ChunkIssue.REDSTONE, 10);
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(ChunkUnloadEvent e)
	{
		samples.remove(e.getChunk());
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(InventoryMoveItemEvent e)
	{
		if(e.getDestination().getHolder() instanceof Hopper)
		{
			Block b = ((Hopper) e.getDestination().getHolder()).getBlock();
			hit(b.getChunk(), ChunkIssue.HOPPER, 10);
		}

		if(e.getSource().getHolder() instanceof Hopper)
		{
			Block b = ((Hopper) e.getSource().getHolder()).getBlock();
			hit(b.getChunk(), ChunkIssue.HOPPER, 10);
		}
	}

	public void hit(Chunk c, ChunkIssue issue, int weight)
	{
		if(!samples.containsKey(c))
		{
			samples.put(c, new SampledChunk(c));
		}

		samples.get(c).hit(issue, weight);
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
}
