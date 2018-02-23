package react.controller;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.inventory.ItemStack;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GSet;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import react.Config;
import react.Gate;
import react.React;
import react.api.Unused;
import surge.Surge;
import surge.control.Controller;
import surge.util.MaterialBlock;

public class ExplosiveController extends Controller
{
	private boolean firstTickList;
	private long firstTick;
	private long lastTick;
	private Average aCSMS;
	private GSet<Location> locs;

	@Override
	public void start()
	{
		Surge.register(this);
		firstTickList = false;
		firstTick = M.ns();
		lastTick = M.ns();
		aCSMS = new Average(30);
		locs = new GSet<Location>();
	}

	private void flushTickList()
	{
		if(firstTickList == false)
		{
			aCSMS.put(0);
			return;
		}

		if(lastTick < firstTick)
		{
			firstTick = lastTick;
		}

		aCSMS.put(lastTick - firstTick);
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
	}

	@Unused
	@Override
	public void tick()
	{
		flushTickList();

		for(Location i : locs)
		{
			if(M.r(0.5))
			{
				for(ItemStack j : i.getBlock().getDrops())
				{
					if(M.r(0.5))
					{
						i.getWorld().dropItemNaturally(i, j);
					}
				}
			}

			React.instance.featureController.setBlock(i, new MaterialBlock());
		}

		locs.clear();
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onLoad(EntityExplodeEvent e)
	{
		if(Config.FACTIONS && Gate.factions())
		{
			return;
		}

		if(aCSMS.getAverage() > Config.MAX_EXPLOSION_MS && Config.THROTTLE_EXPLOSIONS)
		{
			if(M.r(0.65))
			{
				e.setCancelled(true);
			}
		}

		if(!e.isCancelled())
		{
			if(Config.FAST_EXPLOSIONS)
			{
				GList<Block> bl = new GList<Block>(e.blockList());
				e.blockList().clear();

				for(Block i : bl)
				{
					if(i.getType().equals(Material.TNT))
					{
						e.blockList().add(i);
						continue;
					}

					locs.add(i.getLocation());
				}
			}
		}

		tickNextTickList();
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onLoad(BlockExplodeEvent e)
	{
		tickNextTickList();
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

	public Average getaCSMS()
	{
		return aCSMS;
	}
}
