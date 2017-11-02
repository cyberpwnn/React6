package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import react.Config;
import surge.Surge;
import surge.control.Controller;
import surge.pool.S;
import surge.util.Area;
import surge.util.VectorMath;

public class DropMergeController extends Controller
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

	@EventHandler
	public void on(ItemMergeEvent e)
	{
		if(!Config.DROPSTACK_USEDEFAULT)
		{
			e.setCancelled(true);
		}

		if(!Config.DROPSTACK_STACKDROPS)
		{
			e.setCancelled(true);
		}
	}

	@Override
	public void tick()
	{
		if(Config.DROPSTACK_USEDEFAULT)
		{
			return;
		}

		if(!Config.DROPSTACK_STACKDROPS)
		{
			return;
		}

		for(World i : Bukkit.getWorlds())
		{
			new S()
			{
				@Override
				public void run()
				{
					try
					{
						for(Chunk c : i.getLoadedChunks())
						{
							for(Entity ja : c.getEntities())
							{
								for(Entity ka : new Area(ja.getLocation(), Config.DROPSTACK_RADIUS).getNearbyEntities())
								{
									if(ja instanceof Item && ka instanceof Item)
									{
										if(!ja.isDead() && !ka.isDead())
										{
											if(ja.getTicksLived() > 100 && ka.getTicksLived() > 100)
											{
												if(((Item) ja).getItemStack().getAmount() == 1 || ((Item) ka).getItemStack().getAmount() == 1)
												{
													stack((Item) ja, (Item) ka);
												}

												else
												{
													merge((Item) ja, (Item) ka);
												}
											}
										}
									}
								}
							}
						}
					}

					catch(Exception e)
					{

					}
				}
			};
		}
	}

	public void stack(Item j, Item k)
	{
		if(k.getUniqueId().equals(j.getUniqueId()))
		{
			return;
		}

		if(k.getLocation().distanceSquared(j.getLocation()) <= Config.DROPSTACK_RADIUS * Config.DROPSTACK_RADIUS)
		{
			double distance = k.getLocation().distance(j.getLocation());
			Item destination;
			Item source;

			ItemStack isa = k.getItemStack().clone();
			ItemStack isb = j.getItemStack().clone();
			int isca = isa.getAmount();
			int iscb = isb.getAmount();
			isa.setAmount(1);
			isb.setAmount(1);

			if(!isa.equals(isb))
			{
				return;
			}

			if(isa.getMaxStackSize() < isca + iscb)
			{
				return;
			}

			if(k.getTicksLived() == j.getTicksLived())
			{
				k.setTicksLived(k.getTicksLived() + 2);
			}

			if(k.getTicksLived() > j.getTicksLived())
			{
				destination = k;
				source = j;
			}

			else
			{
				return;
			}

			Vector initial = source.getVelocity();
			Vector dir = VectorMath.direction(source.getLocation(), destination.getLocation().clone()).multiply((distance / Config.DROPSTACK_RADIUS));
			Vector fi = initial.add(dir.multiply(0.29));

			if(!Config.DROPSTACK_SMOOTHSTACK)
			{
				ItemStack is = destination.getItemStack().clone();
				is.setAmount(isca + iscb);
				destination.setItemStack(is);
				source.remove();
				return;
			}

			try
			{
				source.setVelocity(fi);
			}

			catch(Exception e)
			{

			}

			if(distance < 0.3325)
			{
				ItemStack is = destination.getItemStack().clone();
				is.setAmount(isca + iscb);
				destination.setItemStack(is);
				source.remove();
			}
		}
	}

	public void merge(Item j, Item k)
	{
		if(k.getUniqueId().equals(j.getUniqueId()))
		{
			return;
		}

		if(k.getLocation().distanceSquared(j.getLocation()) <= Config.DROPSTACK_RADIUS * Config.DROPSTACK_RADIUS)
		{
			double distance = k.getLocation().distance(j.getLocation());
			Item destination;
			Item source;

			ItemStack isa = k.getItemStack().clone();
			ItemStack isb = j.getItemStack().clone();
			int isca = isa.getAmount();
			int iscb = isb.getAmount();
			isa.setAmount(1);
			isb.setAmount(1);

			if(!isa.equals(isb))
			{
				return;
			}

			if(isa.getMaxStackSize() < isca + iscb)
			{
				return;
			}

			if(k.getTicksLived() == j.getTicksLived())
			{
				k.setTicksLived(k.getTicksLived() + 2);
			}

			if(k.getTicksLived() > j.getTicksLived())
			{
				destination = k;
				source = j;
			}

			else
			{
				return;
			}

			Vector initial = source.getVelocity();
			Vector dir = VectorMath.direction(source.getLocation(), destination.getLocation().clone()).multiply((distance / Config.DROPSTACK_RADIUS));
			Vector fi = initial.add(dir.multiply(0.29));

			if(!Config.DROPSTACK_SMOOTHSTACK)
			{
				ItemStack is = destination.getItemStack().clone();
				is.setAmount(isca + iscb);
				destination.setItemStack(is);
				source.remove();
				return;
			}

			try
			{
				source.setVelocity(fi);
				destination.setVelocity(VectorMath.reverse(fi));
			}

			catch(Exception e)
			{

			}

			if(distance < 0.3325)
			{
				ItemStack is = destination.getItemStack().clone();
				is.setAmount(isca + iscb);
				destination.setItemStack(is);
				source.remove();
			}
		}
	}
}
