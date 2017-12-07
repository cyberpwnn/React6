package react.api;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import react.Gate;
import surge.util.D;

public class RAIActionSource implements IActionSource
{
	@Override
	public void sendResponse(String r)
	{
		D.v("[RAI]: " + r);

		for(Player i : Bukkit.getOnlinePlayers())
		{
			Gate.msgRAI(i, r);
		}

	}

	@Override
	public void sendResponseSuccess(String r)
	{
		D.v("[RAI]: " + r);

		for(Player i : Bukkit.getOnlinePlayers())
		{
			Gate.msgRAI(i, r);
		}
	}

	@Override
	public void sendResponseError(String r)
	{
		D.v("[RAI]: " + r);

		for(Player i : Bukkit.getOnlinePlayers())
		{
			Gate.msgRAI(i, r);
		}
	}

	@Override
	public void sendResponseActing(String r)
	{
		D.v("[RAI]: " + r);

		for(Player i : Bukkit.getOnlinePlayers())
		{
			Gate.msgRAI(i, r);
		}
	}
}
