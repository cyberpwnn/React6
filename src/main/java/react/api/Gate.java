package react.api;

import org.bukkit.Chunk;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import react.Info;
import react.React;
import surge.util.C;
import surge.util.TXT;

public class Gate
{
	public static String msg(CommandSender p, String msg)
	{
		String s = TXT.makeTag(C.AQUA, C.DARK_GRAY, C.GRAY, Info.CORE_NAME) + msg;
		p.sendMessage(s);

		return s;
	}

	public static String msgSuccess(CommandSender p, String msg)
	{
		return msg(p, C.GREEN + "\u2714 " + C.GRAY + msg);
	}

	public static String msgError(CommandSender p, String msg)
	{
		return msg(p, C.RED + "\u2718 " + C.GRAY + msg);
	}

	public static String msgActing(CommandSender p, String msg)
	{
		return msg(p, C.GOLD + "\u26A0 " + C.GRAY + msg);
	}

	public static void removeEntity(Entity e)
	{
		if(e instanceof Player)
		{
			return;
		}

		e.remove();
	}

	public static void cacheEntity(Entity e)
	{
		if(e instanceof Player)
		{
			return;
		}

		React.instance.entityCacheController.pop(e);
	}

	public static int restoreEntities(Chunk chunk)
	{
		return React.instance.entityCacheController.push(chunk);
	}

	public static void cullEntity(Entity i)
	{
		removeEntity(i);
	}
}
