package react.api;

import org.bukkit.entity.Player;

public class PlayerActionSource implements IActionSource
{
	private final Player p;

	public PlayerActionSource(Player p)
	{
		this.p = p;
	}

	public Player getPlayer()
	{
		return p;
	}
}
