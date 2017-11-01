package react.api;

import org.bukkit.entity.Player;

import react.Info;

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

	@Override
	public void sendResponse(String r)
	{
		Info.msg(p, r);
	}
}
