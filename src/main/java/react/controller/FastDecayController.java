package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Leaves;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GList;
import org.cyberpwn.gmath.M;

import react.Config;
import react.Gate;
import react.React;
import surge.Surge;
import surge.collection.GSound;
import surge.control.Controller;
import surge.sched.TaskLater;
import surge.util.BlockFinder;
import surge.util.MSound;
import surge.util.MaterialBlock;
import surge.util.W;

public class FastDecayController extends Controller
{
	private GList<Material> leaves;
	private GList<Material> logs;

	@Override
	public void start()
	{
		Surge.register(this);
		leaves = new GList<Material>();
		logs = new GList<Material>();
		leaves.add(Material.LEAVES);
		leaves.add(Material.LEAVES_2);
		logs.add(Material.LOG_2);
		logs.add(Material.LOG);
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
		new TaskLater("t", 10)
		{
			@Override
			public void run()
			{
				if(!Config.FASTLEAF_ENABLED)
				{
					return;
				}

				if(!Config.getWorldConfig(source.getWorld()).allowFastLeafDecay)
				{
					return;
				}

				for(Block i : W.blockFaces(source))
				{
					if(leaves.contains(i.getType()))
					{
						if(!BlockFinder.follow(i, leaves, logs, 5))
						{
							new TaskLater("dvd", (int) (0 + (Math.random() * 12)))
							{
								@Override
								public void run()
								{
									decay(i);
								}
							};
						}
					}
				}

				if(leaves.contains(source.getType()))
				{
					if(!BlockFinder.follow(source, leaves, logs, 5))
					{
						new TaskLater("dvd", (int) (0 + (Math.random() * 12)))
						{
							@Override
							public void run()
							{
								decay(source);
							}
						};
					}
				}
			}
		};
	}

	@SuppressWarnings("deprecation")
	public void decay(Block b)
	{
		if(!leaves.contains(b.getType()))
		{
			return;
		}

		if(M.r(0.06))
		{
			new GSound(MSound.DIG_GRASS.bukkitSound(), 4f, 0.1f + (float) (Math.random() / 2f)).play(b.getLocation());
		}

		if(React.instance.featureController.hasBinding())
		{
			Location c = b.getLocation().clone().add(0.5, 0.5, 0.5);

			for(ItemStack i : getDrops(b))
			{
				b.getWorld().dropItemNaturally(c, i);
			}

			React.instance.featureController.setBlock(b.getLocation(), new MaterialBlock());
			LeavesDecayEvent de = new LeavesDecayEvent(b);
			Bukkit.getPluginManager().callEvent(de);

			if(b.getRelative(BlockFace.UP).getType().equals(Material.SNOW))
			{
				if(b.getRelative(BlockFace.UP).getData() < 15)
				{
					React.instance.featureController.setBlock(b.getRelative(BlockFace.UP).getLocation(), new MaterialBlock());
				}
			}
		}

		else
		{
			b.breakNaturally();
		}
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
