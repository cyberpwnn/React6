package react.api;

import org.bukkit.entity.Player;

import react.Gate;

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
		Gate.msg(p, r);
	}

	@Override
	public void sendResponseSuccess(String r)
	{
		Gate.msgSuccess(p, r);
	}

	@Override
	public void sendResponseError(String r)
	{
		Gate.msgError(p, r);
	}

	@Override
	public void sendResponseActing(String r)
	{
		Gate.msgActing(p, r);
	}
}
