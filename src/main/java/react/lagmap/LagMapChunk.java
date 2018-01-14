package react.lagmap;

import org.cyberpwn.glang.GMap;

import react.api.ChunkIssue;

public class LagMapChunk
{
	private int x;
	private int z;
	private GMap<ChunkIssue, Double> hits;

	public LagMapChunk(int x, int z)
	{
		hits = new GMap<ChunkIssue, Double>();
	}

	public void hit(ChunkIssue type, double amt)
	{
		if(!hits.containsKey(type))
		{
			hits.put(type, 0.0);
		}

		hits.put(type, hits.get(type) + amt);
	}

	public void hit(ChunkIssue type)
	{
		hit(type, 20);
	}

	public int getX()
	{
		return x;
	}

	public int getZ()
	{
		return z;
	}

	public GMap<ChunkIssue, Double> getHits()
	{
		return hits;
	}

	public void pump()
	{
		for(ChunkIssue i : getHits().k())
		{
			hits.put(i, hits.get(i) / 1.25);

			if(hits.get(i) < 1)
			{
				hits.remove(i);
			}
		}
	}
}
