package react.physics;

import org.bukkit.Location;

public class RedstoneUpdate
{
	private Location location;
	private int currentLevel;
	private int nextLevel;

	public RedstoneUpdate(Location location, int currentLevel, int nextLevel)
	{
		this.location = location;
		this.currentLevel = currentLevel;
		this.nextLevel = nextLevel;
	}

	public Location getLocation()
	{
		return location;
	}

	public int getCurrentLevel()
	{
		return currentLevel;
	}

	public int getNextLevel()
	{
		return nextLevel;
	}

	@SuppressWarnings("deprecation")
	public void fire()
	{
		location.getBlock().setData((byte) nextLevel, true);
	}
}
