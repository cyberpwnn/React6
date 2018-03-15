package com.volmit.react.api;

import org.bukkit.Chunk;
import org.bukkit.Location;

import com.volmit.react.E;
import com.volmit.react.util.GMap;

public class LagMap
{
	private GMap<Chunk, LagMapChunk> chunks;

	public LagMap()
	{
		chunks = new GMap<Chunk, LagMapChunk>();
	}

	public GMap<ChunkIssue, Double> getGrandTotalMilliseconds()
	{
		GMap<ChunkIssue, Double> m = new GMap<ChunkIssue, Double>();

		for(ChunkIssue i : ChunkIssue.values())
		{
			m.put(i, i.getMS());
		}

		return m;
	}

	public GMap<ChunkIssue, Double> getGrandTotal()
	{
		GMap<ChunkIssue, Double> d = new GMap<ChunkIssue, Double>();

		for(LagMapChunk i : chunks.v())
		{
			for(ChunkIssue j : i.getHits().k())
			{
				if(!d.containsKey(j))
				{
					d.put(j, 0.0);
				}

				try
				{
					d.put(j, d.get(j) + i.getHits().get(j));
				}

				catch(Throwable e)
				{
					E.t(e);
				}
			}
		}

		return d;
	}

	public void pump()
	{
		for(Chunk i : chunks.k())
		{
			try
			{
				chunks.get(i).pump();
			}

			catch(Throwable e)
			{
				E.t(e);
			}

			try
			{
				if(chunks.get(i).getHits().isEmpty())
				{
					chunks.remove(i);
				}
			}

			catch(Throwable e)
			{
				E.t(e);

				if(i != null && chunks != null)
				{
					chunks.remove(i);
				}
			}
		}
	}

	public void hit(Location location, ChunkIssue type, double amt)
	{
		if(!chunks.containsKey(location.getChunk()))
		{
			chunks.put(location.getChunk(), new LagMapChunk(location.getChunk()));
		}

		chunks.get(location.getChunk()).hit(type, amt);
	}

	public void hit(Chunk c, ChunkIssue type, double amt)
	{
		if(!chunks.containsKey(c))
		{
			chunks.put(c, new LagMapChunk(c));
		}

		chunks.get(c).hit(type, amt);
	}

	public GMap<Chunk, LagMapChunk> getChunks()
	{
		return chunks;
	}
}
