package react.api;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public enum Side
{
	PLAYER,
	CONSOLE;

	public static Side get(CommandSender sender)
	{
		if(sender instanceof Player)
		{
			return Side.PLAYER;
		}

		return Side.CONSOLE;
	}
}
