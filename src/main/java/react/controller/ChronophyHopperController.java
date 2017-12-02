package react.controller;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Hopper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.inventory.ItemStack;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;

import react.chronophysics.HopperWormhole;
import react.chronophysics.PsychopathicHopper;
import surge.Surge;
import surge.control.Controller;
import surge.sched.Task;
import surge.util.MaterialBlock;
import surge.util.W;

public class ChronophyHopperController extends Controller
{
	private GMap<Location, HopperWormhole> entries;
	private GMap<Location, GList<HopperWormhole>> paths;
	private GList<Location> overtickLock;

	@Override
	public void start()
	{
		Surge.register(this);
		entries = new GMap<Location, HopperWormhole>();
		paths = new GMap<Location, GList<HopperWormhole>>();
		overtickLock = new GList<Location>();
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	private void registerHopperWormhole(HopperWormhole wh)
	{
		for(Hopper i : wh.getPath())
		{
			if(!paths.containsKey(i.getLocation()))
			{
				paths.put(i.getLocation(), new GList<HopperWormhole>());
			}

			paths.get(i.getLocation()).add(wh);
		}

		entries.put(wh.getSource().getLocation(), wh);
	}

	private void unregisterHopperWormhole(HopperWormhole wh)
	{
		for(Hopper i : wh.getPath())
		{
			if(paths.containsKey(i.getLocation()))
			{
				paths.get(i.getLocation()).remove(wh);

				if(paths.get(i.getLocation()).isEmpty())
				{
					paths.remove(i.getLocation());
				}
			}
		}

		entries.remove(wh.getSource().getLocation());
	}

	public boolean isStartRegistered(Location l)
	{
		return entries.containsKey(l);
	}

	public boolean isRegistered(Location l)
	{
		return entries.containsKey(l) || paths.containsKey(l);
	}

	private void tryHopperWormhole(Hopper hopper)
	{
		if(isRegistered(hopper.getLocation()))
		{
			return;
		}

		new A()
		{
			@Override
			public void run()
			{
				HopperWormhole hw = tryHopperWormhole(hopper, 64, 4);

				new S()
				{
					@Override
					public void run()
					{
						if(hw != null)
						{
							if(isRegistered(hopper.getLocation()))
							{
								return;
							}

							registerHopperWormhole(hw);
						}
					}
				};
			}
		};
	}

	public GList<HopperWormhole> getWormhole(Block b)
	{
		GList<HopperWormhole> w = new GList<HopperWormhole>();

		if(entries.containsKey(b.getLocation()))
		{
			w.add(entries.get(b.getLocation()));
		}

		if(paths.contains(b.getLocation()))
		{
			w.addAll(paths.get(b.getLocation()));
		}

		return w;
	}

	@SuppressWarnings("deprecation")
	public void drawPathsFor(Player p)
	{
		GMap<HopperWormhole, DyeColor> wh = new GMap<HopperWormhole, DyeColor>();
		GList<DyeColor> colors = new GList<DyeColor>(DyeColor.values());
		GMap<Location, MaterialBlock> memb = new GMap<Location, MaterialBlock>();

		for(Location i : entries.k())
		{
			if(colors.isEmpty())
			{
				colors.addAll(new GList<DyeColor>(DyeColor.values()));
			}

			wh.put(entries.get(i), colors.pop());
		}

		for(HopperWormhole i : wh.k())
		{
			GSet<Location> glc = new GSet<Location>();

			for(Hopper j : i.getPath())
			{
				glc.add(j.getLocation());
			}

			glc.add(i.getSource().getLocation());
			glc.add(i.getDestination().getLocation());

			for(Location j : glc)
			{
				if(memb.containsKey(j))
				{
					continue;
				}

				memb.put(j, new MaterialBlock(j.getBlock()));
				p.sendBlockChange(j, Material.STAINED_GLASS.getId(), wh.get(i).getWoolData());
			}
		}

		new Task("waiter-dye-chrono-hopper", 20, 10)
		{
			@Override
			public void run()
			{
				if(ticks == 9)
				{
					cancel();
					for(Location i : memb.k())
					{
						p.sendBlockChange(i, memb.get(i).getMaterial().getId(), memb.get(i).getData());
					}
				}
			}
		};
	}

	private HopperWormhole tryHopperWormhole(Hopper hopper, int min, int max)
	{
		return HopperWormhole.findPath(hopper, min, max);
	}

	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
	public void on(ChunkUnloadEvent e)
	{
		for(Location i : entries.k())
		{
			if(i.getChunk().equals(e.getChunk()))
			{
				entries.remove(i);
			}
		}

		for(Location i : paths.k())
		{
			if(i.getChunk().equals(e.getChunk()))
			{
				paths.remove(i);
			}
		}
	}

	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
	public void on(BlockPlaceEvent e)
	{
		for(Block i : W.blockFaces(e.getBlock()))
		{
			if(i.getType().equals(Material.HOPPER))
			{
				for(HopperWormhole j : getWormhole(i))
				{
					unregisterHopperWormhole(j);
				}
			}
		}

		if(e.getBlock().getType().equals(Material.HOPPER))
		{
			for(HopperWormhole i : getWormhole(e.getBlock()))
			{
				unregisterHopperWormhole(i);
			}
		}
	}

	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
	public void on(BlockBreakEvent e)
	{
		for(HopperWormhole i : getWormhole(e.getBlock()))
		{
			unregisterHopperWormhole(i);
		}
	}

	@EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
	public void on(InventoryMoveItemEvent e)
	{
		if(overtickLock.contains(e.getSource().getLocation()))
		{
			e.setCancelled(true);
			return;
		}

		overtickLock.add(e.getSource().getLocation());

		if(e.getDestination().firstEmpty() == -1)
		{
			return;
		}

		if(e.getSource().getHolder() instanceof Hopper)
		{
			if(isStartRegistered(((Hopper) e.getSource().getHolder()).getLocation()))
			{
				if(isRegistered(((Hopper) e.getSource().getHolder()).getLocation()))
				{
					return;
				}

				tryHopperWormhole((Hopper) e.getSource().getHolder());
			}

			else
			{
				HopperWormhole wh = entries.get(((Hopper) e.getSource().getHolder()).getLocation());

				if(wh.getDestination().getInventory().firstEmpty() == -1)
				{
					return;
				}

				if(wh != null)
				{
					e.setItem(new ItemStack(Material.AIR));

					new Task("transport-hopper")
					{
						@Override
						public void run()
						{
							PsychopathicHopper h = new PsychopathicHopper(wh.getDestination());
							h.addFrom(e.getSource(), 1);
						}
					};
				}
			}
		}
	}

	@Override
	public void tick()
	{
		overtickLock.clear();
	}
}
