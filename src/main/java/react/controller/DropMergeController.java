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

import react.Info;
import surge.Surge;
import surge.control.Controller;
import surge.pool.A;
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
		e.setCancelled(true);
	}

	@Override
	public void tick()
	{
		for(World i : Bukkit.getWorlds())
		{
			new A()
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
								if(ja instanceof Item)
								{
									for(Entity ka : new Area(ja.getLocation(), Info.CORE_DROP_STACK_RADIUS).getNearbyEntities())
									{
										if(ka instanceof Item)
										{
											stack((Item) ja, (Item) ka);
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

		if(k.getLocation().distanceSquared(j.getLocation()) <= Info.CORE_DROP_STACK_RADIUS * Info.CORE_DROP_STACK_RADIUS)
		{
			double distance = k.getLocation().distance(j.getLocation());
			Item destination;
			Item source;

			ItemStack isa = k.getItemStack();
			ItemStack isb = j.getItemStack();
			int isca = isa.getAmount();
			int iscb = isb.getAmount();
			isa.setAmount(1);
			isb.setAmount(1);

			if(!isa.equals(isb))
			{
				isa.setAmount(isca);
				isb.setAmount(iscb);
				return;
			}

			if(isa.getMaxStackSize() < isca + iscb)
			{
				isa.setAmount(isca);
				isb.setAmount(iscb);
				return;
			}

			isa.setAmount(isca);
			isb.setAmount(iscb);

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
			Vector dir = VectorMath.direction(source.getLocation(), destination.getLocation()).multiply(1.1 - (distance / Info.CORE_DROP_STACK_RADIUS));
			Vector fi = initial.add(dir.multiply(0.12));

			new S()
			{
				@Override
				public void run()
				{
					try
					{
						source.setVelocity(fi);
					}

					catch(Exception e)
					{

					}

					if(distance < 0.55)
					{
						ItemStack is = destination.getItemStack();
						is.setAmount(isca + iscb);
						destination.setItemStack(is);
						source.remove();
					}
				}
			};
		}
	}
}
