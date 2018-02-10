package surge.util;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.cyberpwn.glang.GList;

import surge.util.Cuboid.CuboidDirection;

public class BlockFinder
{
	public static boolean follow(Block block, GList<Material> follow, GList<Material> goal, int maxTravel)
	{
		Cuboid c = new Cuboid(block.getLocation());
		c = c.expand(CuboidDirection.Up, maxTravel);
		c = c.expand(CuboidDirection.Down, maxTravel);
		c = c.expand(CuboidDirection.North, maxTravel);
		c = c.expand(CuboidDirection.South, maxTravel);
		c = c.expand(CuboidDirection.East, maxTravel);
		c = c.expand(CuboidDirection.West, maxTravel);

		return tail(c, block, follow, goal, maxTravel);
	}

	public static boolean tail(Cuboid c, Block b, GList<Material> f, GList<Material> g, int t)
	{
		if(t <= 0)
		{
			return false;
		}

		for(Block i : W.blockFaces(b))
		{
			if(!c.contains(i))
			{
				continue;
			}

			if(f.contains(i.getType()))
			{
				return tail(c, i, f, g, t - 1);
			}

			if(g.contains(i.getType()))
			{
				return true;
			}
		}

		return false;
	}
}
