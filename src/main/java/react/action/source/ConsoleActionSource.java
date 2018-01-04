package react.action.source;

import org.bukkit.Bukkit;

import react.Gate;

public class ConsoleActionSource implements IActionSource
{
	@Override
	public void sendResponse(String r)
	{
		Gate.msg(Bukkit.getConsoleSender(), r);
	}

	@Override
	public void sendResponseSuccess(String r)
	{
		Gate.msgSuccess(Bukkit.getConsoleSender(), r);
	}

	@Override
	public void sendResponseError(String r)
	{
		Gate.msgError(Bukkit.getConsoleSender(), r);
	}

	@Override
	public void sendResponseActing(String r)
	{
		Gate.msgActing(Bukkit.getConsoleSender(), r);
	}
}
