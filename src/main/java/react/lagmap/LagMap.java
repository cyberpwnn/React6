package react.lagmap;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.cyberpwn.glang.GMap;

import react.api.ChunkIssue;

public class LagMap
{
	private GMap<Chunk, LagMapChunk> chunks;

	public LagMap()
	{
		chunks = new GMap<Chunk, LagMapChunk>();
	}

	public void pump()
	{
		for(Chunk i : chunks.k())
		{
			chunks.get(i).pump();

			if(chunks.get(i).getHits().isEmpty())
			{
				chunks.remove(i);
			}
		}
	}

	public void hit(Location location, ChunkIssue type, double amt)
	{
		if(!chunks.containsKey(location.getChunk()))
		{
			chunks.put(location.getChunk(), new LagMapChunk(location.getChunk().getX(), location.getChunk().getZ()));
		}

		chunks.get(location.getChunk()).hit(type, amt);
	}

	public void hit(Chunk c, ChunkIssue type, double amt)
	{
		if(!chunks.containsKey(c))
		{
			chunks.put(c, new LagMapChunk(c.getX(), c.getZ()));
		}

		chunks.get(c).hit(type, amt);
	}

	public GMap<Chunk, LagMapChunk> getChunks()
	{
		return chunks;
	}
}
