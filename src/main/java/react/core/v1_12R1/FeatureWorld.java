package react.core.v1_12R1;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.cyberpwn.glang.GList;

import net.minecraft.server.v1_12_R1.BlockPosition;
import net.minecraft.server.v1_12_R1.IBlockData;
import react.core.IFeatureWorld;
import surge.util.MaterialBlock;

public class FeatureWorld implements IFeatureWorld
{
	private GList<Chunk> dirty;

	public FeatureWorld()
	{
		dirty = new GList<Chunk>();
	}

	@Override
	@SuppressWarnings("deprecation")
	public void setBlockFast(Location l, MaterialBlock mb)
	{
		World worldbukkit = l.getWorld();
		net.minecraft.server.v1_12_R1.World world = ((CraftWorld) worldbukkit).getHandle();
		net.minecraft.server.v1_12_R1.Chunk chunk = world.getChunkAt(l.getBlockX() >> 4, l.getBlockZ() >> 4);
		BlockPosition bp = new BlockPosition(l.getBlockX(), l.getBlockY(), l.getBlockZ());
		IBlockData ibd = net.minecraft.server.v1_12_R1.Block.getByCombinedId(mb.getMaterial().getId() + (mb.getData().intValue() << 12));
		chunk.a(bp, ibd);
		dirty.add(worldbukkit.getChunkAt(chunk.locX, chunk.locZ));
	}

	@Override
	@SuppressWarnings("deprecation")
	public void refreshChunk(Chunk c)
	{
		c.getWorld().refreshChunk(c.getX(), c.getZ());
	}

	@Override
	public GList<Chunk> getDirtyChunks()
	{
		return dirty;
	}
}
