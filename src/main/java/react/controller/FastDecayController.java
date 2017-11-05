package react.controller;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.Config;
import surge.Surge;
import surge.control.Controller;
import surge.sched.Task;

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
		if(!Config.FASTLEAF_ENABLED)
		{
			return;
		}

		checkBreak(e.getBlock());
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(BlockBurnEvent e)
	{
		if(!Config.FASTLEAF_ENABLED)
		{
			return;
		}

		checkBreak(e.getBlock());
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(LeavesDecayEvent e)
	{
		if(!Config.FASTLEAF_ENABLED)
		{
			return;
		}

		checkBreak(e.getBlock());
	}

	public void checkBreak(Block source)
	{
		if(!Config.FASTLEAF_ENABLED)
		{
			return;
		}

		if(source.getType().equals(Material.LOG) || source.getType().equals(Material.LOG_2) || source.getType().equals(Material.LEAVES) || source.getType().equals(Material.LEAVES_2))
		{
			GMap<Integer, GList<Location>> locs = new GMap<Integer, GList<Location>>();

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
					if(Config.FASTLEAF_INSTANT)
					{
						if(isAllowedSplooge(l))
						{
							l.getBlock().breakNaturally();
						}
					}

					else
					{
						int rnd = M.rand(0, Config.FASTLEAF_DECAYPERIOD);

						if(!locs.containsKey(rnd))
						{
							locs.put(rnd, new GList<Location>());
						}

						locs.get(rnd).add(l);
					}
				}

				@Override
				public void finished()
				{
					if(!Config.FASTLEAF_INSTANT)
					{
						for(int i : locs.k())
						{
							new Task("leaf-decay", i, 2)
							{
								@Override
								public void run()
								{
									if(ticks == 1)
									{
										for(Location j : locs.get(i))
										{
											if(isAllowedSplooge(j))
											{
												j.getBlock().breakNaturally();
											}
										}
									}
								}
							};
						}
					}
				}
			};
		}
	}

	@Override
	public void tick()
	{

	}
}
