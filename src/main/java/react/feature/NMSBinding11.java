package react.feature;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_11_R1.CraftWorld;

import net.minecraft.server.v1_11_R1.BlockPosition;
import net.minecraft.server.v1_11_R1.IBlockData;
import surge.util.MaterialBlock;

public class NMSBinding11 extends NMSBinding
{
	public NMSBinding11(String packageVersion)
	{
		super(packageVersion);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setBlock(Location l, MaterialBlock m)
	{
		int x = l.getBlockX();
		int y = l.getBlockY();
		int z = l.getBlockZ();
		net.minecraft.server.v1_11_R1.World w = ((CraftWorld) l.getWorld()).getHandle();
		net.minecraft.server.v1_11_R1.Chunk chunk = w.getChunkAt(x >> 4, z >> 4);
		BlockPosition bp = new BlockPosition(x, y, z);
		int combined = m.getMaterial().getId() + (m.getData() << 12);
		IBlockData ibd = net.minecraft.server.v1_11_R1.Block.getByCombinedId(combined);
		chunk.a(bp, ibd);
	}
}
