package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandActionLog extends ReactCommand
{
	public CommandActionLog()
	{
		command = Info.COMMAND_ACTIONLOG;
		aliases = new String[] {Info.COMMAND_ACTIONLOG_ALIAS_1, Info.COMMAND_ACTIONLOG_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_TITLE.getNode()};
		usage = Info.COMMAND_ACTIONLOG_USAGE;
		description = Info.COMMAND_ACTIONLOG_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
		registerParameterDescription("(toggle)", "Using this command either turns it on or off.");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player player = (Player) sender;
		React.instance.monitorController.toggleActionLog(player);
	}
}
