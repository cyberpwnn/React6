package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Config;
import react.Gate;
import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import react.api.TemporaryAccessor;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandRequests extends ReactCommand
{
	public CommandRequests()
	{
		command = Info.COMMAND_REQUESTS;
		aliases = new String[] {Info.COMMAND_REQUESTS_ALIAS_1, Info.COMMAND_REQUESTS_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.toString()};
		usage = Info.COMMAND_REQUESTS_USAGE;
		description = Info.COMMAND_REQUESTS_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(!Config.ALLOW_TEMPACCESS)
		{
			Gate.msgError(sender, "Temporary Access is disabled.");
			return;
		}

		sender.sendMessage(Gate.header("Accessors", C.AQUA));

		for(Player i : CommandAccess.req)
		{
			sender.sendMessage(C.YELLOW + "REQUEST: " + C.WHITE + i.getName());
		}

		for(TemporaryAccessor i : Permissable.accessors)
		{
			sender.sendMessage(C.RED + "HAS ACCESS: " + C.WHITE + i.getPlayer().getName());
		}

		sender.sendMessage(Gate.header(C.AQUA));
	}
}
