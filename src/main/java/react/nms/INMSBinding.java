package react.nms;

import org.bukkit.Location;

import surge.util.MaterialBlock;

public interface INMSBinding
{
	public String getPackageVersion();

	public void setBlock(Location l, MaterialBlock m);
}
