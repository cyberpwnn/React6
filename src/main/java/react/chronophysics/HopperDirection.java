package react.chronophysics;

import org.bukkit.Location;
import org.bukkit.block.Hopper;

public enum HopperDirection
{
	DOWN(0),
	NORTH(2),
	SOUTH(3),
	EAST(5),
	WEST(4);

	private int direction;

	private HopperDirection(int direction)
	{
		this.direction = direction;
	}

	public Location shift(Location location)
	{
		switch(this)
		{
			case DOWN:
				return location.clone().add(0, -1, 0);
			case EAST:
				return location.clone().add(1, 0, 0);
			case NORTH:
				return location.clone().add(0, 0, -1);
			case SOUTH:
				return location.clone().add(0, 0, 1);
			case WEST:
				return location.clone().add(-1, 0, 0);
		}

		return null;
	}

	@SuppressWarnings("deprecation")
	public static boolean isLocked(Hopper h)
	{
		return h.getRawData() >= 8;
	}

	@SuppressWarnings("deprecation")
	public static HopperDirection getDirection(Hopper h)
	{
		int d = h.getRawData();

		if(d >= 8)
		{
			d -= 8;
		}

		for(HopperDirection i : HopperDirection.values())
		{
			if(i.direction == d)
			{
				return i;
			}
		}

		return null;
	}
}
