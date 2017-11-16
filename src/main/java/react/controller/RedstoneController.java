package react.controller;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import react.Gate;
import react.React;
import surge.Surge;
import surge.control.Controller;

public class RedstoneController extends Controller
{
	private GSet<Material> ignore;
	private GSet<Chunk> frozen;
	private GMap<Chunk, GSet<Block>> queue;
	private GMap<Chunk, Long> freezeTimes;
	private int redstonePerTick;
	private int redstonePerSecond;
	private Average aRST;
	private Average aRSS;
	private Average aRSMS;
	private boolean firstTickList;
	private long firstTick;
	private long lastTick;

	@Override
	public void start()
	{
		Surge.register(this);
		queue = new GMap<Chunk, GSet<Block>>();
		freezeTimes = new GMap<Chunk, Long>();
		frozen = new GSet<Chunk>();
		ignore = new GSet<Material>();
		ignore.add(Material.REDSTONE_WIRE);
		ignore.add(Material.REDSTONE_TORCH_OFF);
		ignore.add(Material.REDSTONE_TORCH_ON);
		ignore.add(Material.REDSTONE_COMPARATOR_OFF);
		ignore.add(Material.REDSTONE_COMPARATOR_ON);
		ignore.add(Material.REDSTONE_LAMP_OFF);
		ignore.add(Material.REDSTONE_LAMP_ON);
		ignore.add(Material.REDSTONE_BLOCK);
		ignore.add(Material.DIODE_BLOCK_OFF);
		ignore.add(Material.DIODE_BLOCK_ON);
		ignore.add(Material.LEVER);
		ignore.add(Material.STONE_BUTTON);
		ignore.add(Material.WOOD_BUTTON);
		ignore.add(Material.GOLD_PLATE);
		ignore.add(Material.IRON_PLATE);
		ignore.add(Material.STONE_PLATE);
		ignore.add(Material.WOOD_PLATE);
		redstonePerTick = 0;
		redstonePerSecond = 0;
		aRST = new Average(15);
		aRSS = new Average(3);
		aRSMS = new Average(20);
		firstTickList = false;
		firstTick = M.ns();
		lastTick = M.ns();
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);

		for(Chunk i : new GList<Chunk>(frozen))
		{
			releaseChunk(i);
		}
	}

	public void releaseChunk(Chunk i)
	{
		if(isFrozen(i))
		{
			unfreeze(i);
			checkChunk(i);
		}
	}

	@Override
	public void tick()
	{
		checkChunks();
		aRST.put(redstonePerTick);
		aRSS.put(redstonePerSecond);
		redstonePerTick = 0;
		redstonePerSecond = 0;
		flushTickList();
	}

	private void checkChunks()
	{
		GSet<Chunk> cx = new GSet<Chunk>();
		cx.addAll(queue.k());
		cx.addAll(frozen);

		for(Chunk i : cx)
		{
			checkChunk(i);
		}
	}

	private void checkChunk(Chunk i)
	{
		if(!isFrozen(i))
		{
			if(queue.containsKey(i))
			{
				for(Block j : queue.get(i))
				{
					Gate.updateBlock(j);
				}

				queue.remove(i);
			}
		}

		if(isFrozen(i) && M.ms() >= freezeTimes.get(i))
		{
			releaseChunk(i);
		}
	}

	public void queue(Block b)
	{
		if(!queue.containsKey(b.getChunk()))
		{
			queue.put(b.getChunk(), new GSet<Block>());
		}

		queue.get(b.getChunk()).add(b);
	}

	public boolean isFrozen(Chunk c)
	{
		return frozen.contains(c);
	}

	public void freeze(Chunk c)
	{
		freeze(c, 10000);
	}

	private void flushTickList()
	{
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

	public void unfreeze(Chunk c)
	{
		if(!frozen.contains(c))
		{
			return;
		}

		frozen.remove(c);

		new S()
		{
			@Override
			public void run()
			{
				for(Entity i : c.getEntities())
				{
					if(i instanceof Player)
					{
						Gate.msgActing(i, "Redstone has been unlocked in this area");
					}
				}
			}
		};
	}

	public void freeze(Chunk c, long ms)
	{
		if(isFrozen(c))
		{
			return;
		}

		frozen.add(c);
		freezeTimes.put(c, M.ms() + ms);

		new S()
		{
			@Override
			public void run()
			{
				for(Entity i : c.getEntities())
				{
					if(i instanceof Player)
					{
						Gate.msgActing(i, "Redstone has been locked in this area for " + F.time(ms, 1));
					}
				}
			}
		};
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(ChunkUnloadEvent e)
	{
		releaseChunk(e.getChunk());
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(BlockPhysicsEvent e)
	{
		if(ignore.contains(e.getChangedType()))
		{
			tickNextTickList();
			React.instance.physicsController.onRedstone(e.getBlock().getChunk());
			redstonePerSecond++;
			redstonePerTick++;

			if(isFrozen(e.getBlock().getChunk()))
			{
				queue(e.getBlock());
				e.setCancelled(true);
			}
		}
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(BlockFromToEvent e)
	{
		if(ignore.contains(e.getToBlock().getType()))
		{
			tickNextTickList();
			React.instance.physicsController.onRedstone(e.getBlock().getChunk());
			redstonePerSecond++;
			redstonePerTick++;

			if(isFrozen(e.getBlock().getChunk()))
			{
				queue(e.getBlock());
				e.setCancelled(true);
			}
		}
	}

	public GSet<Material> getIgnore()
	{
		return ignore;
	}

	public GSet<Chunk> getFrozen()
	{
		return frozen;
	}

	public GMap<Chunk, GSet<Block>> getQueue()
	{
		return queue;
	}

	public GMap<Chunk, Long> getFreezeTimes()
	{
		return freezeTimes;
	}

	public int getRedstonePerTick()
	{
		return redstonePerTick;
	}

	public int getRedstonePerSecond()
	{
		return redstonePerSecond;
	}

	public Average getaRST()
	{
		return aRST;
	}

	public Average getaRSS()
	{
		return aRSS;
	}

	public Average getaRSMS()
	{
		return aRSMS;
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
}
