package react.action.source;

import org.bukkit.entity.Player;

import react.Gate;
import react.api.Permissable;
import surge.util.P;

public class AccessActionSource implements IActionSource
{
	@Override
	public void sendResponse(String r)
	{
		for(Player i : P.onlinePlayers())
		{
			if(Permissable.ACCESS.has(i))
			{
				Gate.msg(i, r);
			}
		}
	}

	@Override
	public void sendResponseSuccess(String r)
	{
		for(Player i : P.onlinePlayers())
		{
			if(Permissable.ACCESS.has(i))
			{
				Gate.msgSuccess(i, r);
			}
		}
	}

	@Override
	public void sendResponseError(String r)
	{
		for(Player i : P.onlinePlayers())
		{
			if(Permissable.ACCESS.has(i))
			{
				Gate.msgError(i, r);
			}
		}
	}

	@Override
	public void sendResponseActing(String r)
	{
		for(Player i : P.onlinePlayers())
		{
			if(Permissable.ACCESS.has(i))
			{
				Gate.msgActing(i, r);
			}
		}
	}
}
