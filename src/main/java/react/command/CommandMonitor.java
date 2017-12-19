package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Info;
import react.React;
import react.api.Capability;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandMonitor extends ReactCommand
{
	public CommandMonitor()
	{
		command = Info.COMMAND_MONITOR;
		aliases = new String[] {Info.COMMAND_MONITOR_ALIAS_1, Info.COMMAND_MONITOR_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_TITLE.getNode()};
		usage = Info.COMMAND_MONITOR_USAGE;
		description = Info.COMMAND_MONITOR_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
		registerParameterDescription("(toggle)", "Using this command either turns it on or off.");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player player = (Player) sender;

		if(!Capability.ACTION_BAR.isCapable())
		{
			Capability.ACTION_BAR.sendNotCapable(player);
			return;
		}

		React.instance.monitorController.toggleMonitoring(player);
	}
}
