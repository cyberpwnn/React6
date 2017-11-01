package react.controller;

import java.util.Iterator;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.util.Vector;

import surge.collection.GList;
import surge.collection.GSet;
import surge.pool.A;
import surge.pool.S;
import surge.util.Cuboid;

public abstract class SploogeCounter
{
	private GList<Location> sources;
	private GList<Location> splooge;
	private GSet<Location> destroy;

	public SploogeCounter(int checkDistance, int maxDistance, Location start)
	{
		sources = new GList<Location>();
		splooge = new GList<Location>();
		destroy = new GSet<Location>();
		Location a = start.clone().add(new Vector(checkDistance, checkDistance, checkDistance));
		Location b = start.clone().add(new Vector(-checkDistance, -checkDistance, -checkDistance));
		Cuboid c = new Cuboid(a, b);
		Iterator<Block> it = c.iterator();

		new A()
		{
			@Override
			public void run()
			{
				while(it.hasNext())
				{
					Block bx = it.next();

					if(bx.getLocation().equals(start))
					{
						continue;
					}

					if(isAllowedSplooge(bx.getLocation()))
					{
						splooge.add(bx.getLocation());
					}

					else if(isAllowedSource(bx.getLocation()))
					{
						sources.add(bx.getLocation());
					}
				}

				if(splooge.isEmpty())
				{
					return;
				}

				for(Location i : splooge)
				{
					int min = Integer.MAX_VALUE;

					for(Location j : sources)
					{
						int dist = getManhattanDistance(i, j);

						if(dist < min && isValid(i, j))
						{
							min = dist;
						}
					}

					if(min > maxDistance)
					{
						destroy.add(i);
					}
				}

				new S()
				{
					@Override
					public void run()
					{
						for(Location i : destroy)
						{
							clipped(i);
						}
					}
				};
			}
		};
	}

	public boolean isValid(Location afrom, Location to)
	{
		Location from = afrom.clone();

		for(int i = Math.min(from.getBlockX(), to.getBlockX()); i < Math.max(from.getBlockX(), to.getBlockX()); i++)
		{
			Location check = new Location(from.getWorld(), i, from.getY(), from.getZ());

			if(!sources.contains(check) && !splooge.contains(check))
			{
				return false;
			}

			if(i >= Math.max(from.getBlockX(), to.getBlockX()))
			{
				from = check.clone();
			}
		}

		for(int j = Math.min(from.getBlockY(), to.getBlockY()); j < Math.max(from.getBlockY(), to.getBlockY()); j++)
		{
			Location check = new Location(from.getWorld(), from.getX(), j, from.getZ());

			if(!sources.contains(check) && !splooge.contains(check))
			{
				return false;
			}

			if(j >= Math.max(from.getBlockY(), to.getBlockY()))
			{
				from = check.clone();
			}
		}

		for(int k = Math.min(from.getBlockZ(), to.getBlockZ()); k < Math.max(from.getBlockZ(), to.getBlockZ()); k++)
		{
			Location check = new Location(from.getWorld(), from.getX(), from.getBlockY(), k);

			if(!sources.contains(check) && !splooge.contains(check))
			{
				return false;
			}

			if(k >= Math.max(from.getBlockZ(), to.getBlockZ()))
			{
				from = check.clone();
			}
		}

		return true;
	}

	public int getManhattanDistance(Location from, Location start)
	{
		return Math.abs(from.getBlockX() - start.getBlockX()) + Math.abs(from.getBlockY() - start.getBlockY()) + Math.abs(from.getBlockZ() - start.getBlockZ());
	}

	public abstract void clipped(Location l);

	public abstract boolean isAllowedSplooge(Location l);

	public abstract boolean isAllowedSource(Location l);
}