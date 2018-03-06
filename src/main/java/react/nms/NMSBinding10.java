package react.nms;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_10_R1.CraftWorld;

import net.minecraft.server.v1_10_R1.BlockPosition;
import net.minecraft.server.v1_10_R1.IBlockData;
import surge.util.MaterialBlock;

public class NMSBinding10 extends NMSBinding
{
	public NMSBinding10(String packageVersion)
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
		net.minecraft.server.v1_10_R1.World w = ((CraftWorld) l.getWorld()).getHandle();
		net.minecraft.server.v1_10_R1.Chunk chunk = w.getChunkAt(x >> 4, z >> 4);
		BlockPosition bp = new BlockPosition(x, y, z);
		int combined = m.getMaterial().getId() + (m.getData() << 12);
		IBlockData ibd = net.minecraft.server.v1_10_R1.Block.getByCombinedId(combined);
		chunk.a(bp, ibd);
	}

	@Override
	public void updateBlock(Block bfg)
	{
		net.minecraft.server.v1_10_R1.Block b = org.bukkit.craftbukkit.v1_10_R1.util.CraftMagicNumbers.getBlock((org.bukkit.craftbukkit.v1_10_R1.block.CraftBlock) bfg);
		net.minecraft.server.v1_10_R1.BlockPosition bp = new net.minecraft.server.v1_10_R1.BlockPosition(bfg.getX(), bfg.getY(), bfg.getZ());
		org.bukkit.craftbukkit.v1_10_R1.CraftWorld w = (org.bukkit.craftbukkit.v1_10_R1.CraftWorld) bfg.getWorld();
		net.minecraft.server.v1_10_R1.World v = (net.minecraft.server.v1_10_R1.World) w.getHandle();
		v.update(bp, b);
	}
}
