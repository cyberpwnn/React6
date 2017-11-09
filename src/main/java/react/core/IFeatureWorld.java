package react.core;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.cyberpwn.glang.GList;

import surge.util.MaterialBlock;

public interface IFeatureWorld extends IFeature
{
	public GList<Chunk> getDirtyChunks();

	public void setBlockFast(Location l, MaterialBlock mb);

	public void refreshChunk(Chunk c);
}
