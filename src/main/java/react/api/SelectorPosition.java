package react.api;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;

import surge.util.W;

public class SelectorPosition extends Selector
{
	public SelectorPosition()
	{
		super(Chunk.class, SelectionMode.BLACKLIST);
	}

	public void add(Chunk c)
	{
		getPossibilities().add(c);
	}

	public void add(Chunk c, int rad)
	{
		getPossibilities().addAll(W.chunkRadius(c, rad));
	}

	public void add(World w)
	{
		for(Chunk i : w.getLoadedChunks())
		{
			add(i);
		}
	}

	public void addAll()
	{
		for(World i : Bukkit.getWorlds())
		{
			add(i);
		}
	}
}
