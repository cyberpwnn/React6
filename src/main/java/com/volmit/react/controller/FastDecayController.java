package com.volmit.react.controller;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
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
import org.bukkit.util.Vector;

import com.volmit.react.Config;
import com.volmit.react.React;
import com.volmit.react.Surge;
import com.volmit.react.api.Gate;
import com.volmit.react.util.BlockFinder;
import com.volmit.react.util.Controller;
import com.volmit.react.util.GList;
import com.volmit.react.util.GSound;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.M;
import com.volmit.react.util.MSound;
import com.volmit.react.util.MaterialBlock;
import com.volmit.react.util.TICK;
import com.volmit.react.util.TaskLater;
import com.volmit.react.util.W;

public class FastDecayController extends Controller
{
	private GList<Material> leaves;
	private GList<Material> logs;
	private GList<Block> queue;

	@Override
	public void dump(JSONObject object)
	{
		object.put("queue", queue.size());
	}

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
		queue = new GList<Block>();
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

		checkBreak(e.getBlock());
	}

	public void checkBreak(Block source)
	{
		new TaskLater("tleaf1", 0)
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
							if(Config.FASTLEAF_INSTANT)
							{
								decay(i);
							}

							else
							{
								new TaskLater("dvdxleaf", (int) ((Math.random() * Config.FASTLEAF_DECAYPERIOD)))
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
				}
			}
		};
	}

	public void decay(Block b)
	{
		queue.add(b);
	}

	@SuppressWarnings("deprecation")
	public void doDecay(Block b)
	{
		if(!leaves.contains(b.getType()))
		{
			return;
		}

		if(!new Leaves(b.getType(), b.getData()).isDecayable())
		{
			return;
		}

		if(b.getType().equals(Material.LEAVES) || b.getType().equals(Material.LEAVES_2))
		{
			Leaves l = new Leaves(b.getType(), b.getData());

			if(!l.isDecayable())
			{
				return;
			}
		}

		if(M.r(0.09))
		{
			new GSound(MSound.STEP_GRASS.bukkitSound(), 0.8f, 0.1f + (float) (Math.random() / 2f)).play(b.getLocation());
		}

		for(int i = 0; i < 1 + (4 * Math.random()); i++)
		{
			b.getWorld().playEffect(b.getLocation().clone().add(0.5, 0.5, 0.5).clone().add(Vector.getRandom().subtract(Vector.getRandom())), Effect.TILE_BREAK, b.getTypeId(), b.getData());
		}

		if(React.instance.featureController.hasBinding() && Config.FAST_LEAF_NMS)
		{
			Location c = b.getLocation().clone().add(0.5, 0.5, 0.5);

			for(ItemStack i : getDrops(b))
			{
				new GSound(MSound.DIG_GRASS.bukkitSound(), 0.4f, 1.67f + (float) (Math.random() / 3f)).play(b.getLocation());
				b.getWorld().dropItemNaturally(c, i);
			}

			React.instance.featureController.setBlock(b.getLocation(), new MaterialBlock());
			LeavesDecayEvent de = new LeavesDecayEvent(b);
			Bukkit.getPluginManager().callEvent(de);

			if(b.getRelative(BlockFace.UP).getType().equals(Material.SNOW))
			{
				if(b.getRelative(BlockFace.UP).getData() < 15)
				{
					b.breakNaturally();
				}
			}

			for(Block i : W.blockFaces(b))
			{
				if(i.getType().equals(Material.VINE))
				{
					i.breakNaturally();
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
		try
		{
			if(TICK.tick % Config.NMS_CHUNK_UPDATE_INTERVAL == 0)
			{
				Gate.refreshChunks();
			}

			long ns = M.ns();

			while(!queue.isEmpty() && M.ns() - ns < Config.FAST_LEAF_MAX_MS * 1000000)
			{
				doDecay(queue.popRandom());
			}
		}

		catch(Throwable e)
		{

		}
	}
}
