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
public class CommandShowHoppers extends ReactCommand
{
	public CommandShowHoppers()
	{
		command = "sh";
		aliases = new String[] {"shh"};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_HELP_USAGE;
		description = Info.COMMAND_HELP_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		React.instance.chronophyHopperController.drawPathsFor((Player) sender);
	}
}
