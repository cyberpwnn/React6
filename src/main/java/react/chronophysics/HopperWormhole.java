package react.chronophysics;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Hopper;
import org.cyberpwn.glang.GList;

import react.api.Async;
import react.api.Restricted;

public class HopperWormhole
{
	private Hopper source;
	private GList<Hopper> path;
	private Hopper destination;

	public HopperWormhole(Hopper source, GList<Hopper> path, Hopper destination)
	{
		this.source = source;
		this.path = path;
		this.destination = destination;
	}

	public Hopper getSource()
	{
		return source;
	}

	public GList<Hopper> getPath()
	{
		return path;
	}

	public Hopper getDestination()
	{
		return destination;
	}

	@Async
	@Restricted
	public static HopperWormhole findPath(Hopper start, int maxDistance, int minDistance)
	{
		int manhattanDistance = 0;
		boolean looking = true;
		GList<Hopper> breadcrumbs = new GList<Hopper>();
		Hopper cursor = start;

		while(looking)
		{
			breadcrumbs.add(cursor);
			HopperDirection currentDirection = HopperDirection.getDirection(cursor);
			Location currentLocation = cursor.getLocation();
			Location nextLocation = currentDirection.shift(currentLocation);

			if(nextLocation.getBlock().getState() instanceof Hopper)
			{
				if(!currentDirection.equals(HopperDirection.DOWN))
				{
					Location poss = HopperDirection.DOWN.shift(currentLocation);

					if(poss.getBlock().getType().equals(Material.HOPPER))
					{
						if(breadcrumbs.size() > 1)
						{
							breadcrumbs.removeLast();
							cursor = breadcrumbs.get(breadcrumbs.last());
							break;
						}

						return null;
					}
				}

				manhattanDistance++;
				cursor = (Hopper) nextLocation.getBlock().getState();
			}

			else
			{
				looking = false;
			}

			if(manhattanDistance >= maxDistance)
			{
				looking = false;
			}
		}

		breadcrumbs.add(cursor);

		if(manhattanDistance < minDistance)
		{
			return null;
		}

		return new HopperWormhole(start, breadcrumbs, cursor);
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		HopperWormhole other = (HopperWormhole) obj;
		if(destination == null)
		{
			if(other.destination != null)
				return false;
		}
		else if(!destination.equals(other.destination))
			return false;
		if(path == null)
		{
			if(other.path != null)
				return false;
		}
		else if(!path.equals(other.path))
			return false;
		if(source == null)
		{
			if(other.source != null)
				return false;
		}
		else if(!source.equals(other.source))
			return false;
		return true;
	}
}
