package react;

import org.bukkit.command.CommandSender;

import surge.util.C;
import surge.util.TXT;

public class Base
{
	public static void msg(CommandSender p, String msg)
	{
		p.sendMessage(TXT.makeTag(C.RED, C.DARK_GRAY, C.GRAY, Info.CORE_NAME) + msg);
	}
}
