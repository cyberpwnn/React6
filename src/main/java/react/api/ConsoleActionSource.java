package react.api;

import org.bukkit.Bukkit;

import react.Info;

public class ConsoleActionSource implements IActionSource
{
	@Override
	public void sendResponse(String r)
	{
		Info.msg(Bukkit.getConsoleSender(), r);
	}
}
