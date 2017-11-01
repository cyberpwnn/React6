package react.controller;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.LeavesDecayEvent;

import surge.Surge;
import surge.control.Controller;

public class FastDecayController extends Controller
{
	@Override
	public void start()
	{
		Surge.register(this);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(BlockBreakEvent e)
	{
		checkBreak(e.getBlock());
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(BlockBurnEvent e)
	{
		checkBreak(e.getBlock());
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(LeavesDecayEvent e)
	{
		checkBreak(e.getBlock());
	}

	public void checkBreak(Block source)
	{
		if(source.getType().equals(Material.LOG) || source.getType().equals(Material.LOG_2) || source.getType().equals(Material.LEAVES) || source.getType().equals(Material.LEAVES_2))
		{
			new SploogeCounter(5, 5, source.getLocation())
			{
				@Override
				public boolean isAllowedSplooge(Location l)
				{
					return l.getBlock().getType().equals(Material.LEAVES) || l.getBlock().getType().equals(Material.LEAVES_2);
				}

				@Override
				public boolean isAllowedSource(Location l)
				{
					return l.getBlock().getType().equals(Material.LOG) || l.getBlock().getType().equals(Material.LOG_2);
				}

				@Override
				public void clipped(Location l)
				{
					l.getBlock().breakNaturally();
				}
			};
		}
	}

	@Override
	public void tick()
	{

	}
}
