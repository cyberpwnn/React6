package react.nms;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;

import net.minecraft.server.v1_8_R3.BlockPosition;
import net.minecraft.server.v1_8_R3.IBlockData;
import surge.util.MaterialBlock;

public class NMSBinding8 extends NMSBinding
{
	public NMSBinding8(String packageVersion)
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
		net.minecraft.server.v1_8_R3.World w = ((CraftWorld) l.getWorld()).getHandle();
		net.minecraft.server.v1_8_R3.Chunk chunk = w.getChunkAt(x >> 4, z >> 4);
		BlockPosition bp = new BlockPosition(x, y, z);
		int combined = m.getMaterial().getId() + (m.getData() << 12);
		IBlockData ibd = net.minecraft.server.v1_8_R3.Block.getByCombinedId(combined);
		chunk.a(bp, ibd);
	}

	@Override
	public void updateBlock(Block bfg)
	{
		net.minecraft.server.v1_8_R3.Block b = org.bukkit.craftbukkit.v1_8_R3.util.CraftMagicNumbers.getBlock((org.bukkit.craftbukkit.v1_8_R3.block.CraftBlock) bfg);
		net.minecraft.server.v1_8_R3.BlockPosition bp = new net.minecraft.server.v1_8_R3.BlockPosition(bfg.getX(), bfg.getY(), bfg.getZ());
		org.bukkit.craftbukkit.v1_8_R3.CraftWorld w = (org.bukkit.craftbukkit.v1_8_R3.CraftWorld) bfg.getWorld();
		net.minecraft.server.v1_8_R3.World v = (net.minecraft.server.v1_8_R3.World) w.getHandle();
		v.update(bp, b);
	}
}
