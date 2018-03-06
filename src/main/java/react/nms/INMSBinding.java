package react.nms;

import org.bukkit.Location;
import org.bukkit.block.Block;

import surge.util.MaterialBlock;

public interface INMSBinding
{
	public String getPackageVersion();

	public void updateBlock(Block b);

	public void setBlock(Location l, MaterialBlock m);
}
