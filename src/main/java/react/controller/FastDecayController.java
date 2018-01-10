package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Leaves;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.Config;
import react.Gate;
import react.React;
import react.api.SploogeCounter;
import surge.Surge;
import surge.collection.GSound;
import surge.control.Controller;
import surge.sched.Task;
import surge.util.MSound;
import surge.util.MaterialBlock;
import surge.util.ParticleEffect;

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
	public void on(LeavesDecayEvent e)
	{
		if(!Config.FASTLEAF_ENABLED)
		{
			return;
		}

		if(!Config.FASTLEAF_ONDECAY)
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

		if(!Config.getWorldConfig(source.getWorld()).allowFastLeafDecay)
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
					return l.getBlock().getType().equals(Material.LEAVES) || l.getBlock().getType().equals(Material.VINE) || l.getBlock().getType().equals(Material.LEAVES_2);
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
							decay(l.getBlock());
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
												decay(j.getBlock());
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

	public void decay(Block b)
	{
		new S()
		{
			@Override
			public void run()
			{
				if(M.r(0.06))
				{
					new GSound(MSound.DIG_GRASS.bukkitSound(), 4f, 0.1f + (float) (Math.random() / 2f)).play(b.getLocation());
				}

				if(React.instance.featureController.hasBinding())
				{
					Location c = b.getLocation().clone().add(0.5, 0.5, 0.5);

					for(ItemStack i : getDrops(b))
					{
						ParticleEffect.CLOUD.display(0f, 1, c, 32);
						b.getWorld().dropItemNaturally(c, i);
					}

					React.instance.featureController.setBlock(b.getLocation(), new MaterialBlock());
					LeavesDecayEvent de = new LeavesDecayEvent(b);
					Bukkit.getPluginManager().callEvent(de);
				}

				else
				{
					b.breakNaturally();
				}
			}
		};
	}

	@SuppressWarnings("deprecation")
	public GList<ItemStack> getDrops(Block b)
	{
		GList<ItemStack> drops = new GList<ItemStack>();

		if(b.getType().equals(Material.LEAVES) || b.getType().equals(Material.LEAVES_2))
		{
			Leaves l = new Leaves(b.getType(), b.getData());

			switch(l.getSpecies())
			{
				case ACACIA:
					if(M.r(0.05))
					{
						drops.add(new ItemStack(Material.SAPLING, 1, (short) 0, (byte) 4));
					}
					break;
				case BIRCH:
					if(M.r(0.05))
					{
						drops.add(new ItemStack(Material.SAPLING, 1, (short) 0, (byte) 2));
					}
					break;
				case DARK_OAK:
					if(M.r(0.005))
					{
						drops.add(new ItemStack(Material.APPLE));
					}

					if(M.r(0.05))
					{
						drops.add(new ItemStack(Material.SAPLING, 1, (short) 0, (byte) 5));
					}
					break;
				case GENERIC: // oak
					if(M.r(0.005))
					{
						drops.add(new ItemStack(Material.APPLE));
					}

					if(M.r(0.05))
					{
						drops.add(new ItemStack(Material.SAPLING, 1, (short) 0, (byte) 0));
					}
					break;
				case JUNGLE:
					if(M.r(0.025))
					{
						drops.add(new ItemStack(Material.SAPLING, 1, (short) 0, (byte) 3));
					}
					break;
				case REDWOOD:// spruce
					if(M.r(0.05))
					{
						drops.add(new ItemStack(Material.SAPLING, 1, (short) 0, (byte) 1));
					}
					break;
			}
		}

		return drops;
	}

	@Override
	public void tick()
	{
		if(TICK.tick % 5 == 0)
		{
			Gate.refreshChunks();
		}
	}
}
