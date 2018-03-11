package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.volmit.react.util.Anchor;

import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;

@Anchor(0)
public class CommandMap extends ReactCommand
{
	public CommandMap()
	{
		command = Info.COMMAND_MAP;
		aliases = new String[] {Info.COMMAND_MAP_ALIAS_1, Info.COMMAND_MAP_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_MAP.getNode()};
		usage = Info.COMMAND_MAP_USAGE;
		description = Info.COMMAND_MAP_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
		registerParameterDescription("(toggle)", "Using this command either turns it on or off.");
		registerParameterDescription("[options]", "-i To place map on item frame\n-e to view eod map view");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player player = (Player) sender;

		React.instance.graphController.toggleMapping(player, args);
	}
}
