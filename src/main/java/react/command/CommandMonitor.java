package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Gate;
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
		registerParameterDescription("[options]", "-- high or -h to push the monitor up or down (toggle)");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player player = (Player) sender;

		if(!Capability.TITLE_BAR.isCapable())
		{
			Capability.TITLE_BAR.sendNotCapable(player);
			return;
		}

		if(!Capability.ACTION_BAR.isCapable())
		{
			Capability.ACTION_BAR.sendNotCapable(player);
			return;
		}

		if(args.length > 0 && (args[0].equalsIgnoreCase("-h") || args[0].equalsIgnoreCase("--high")))
		{
			Player p = (Player) sender;
			React.instance.playerController.getPlayer(p).highMonitor = !React.instance.playerController.getPlayer(p).highMonitor;
			Gate.msgSuccess(p, "High Monitor " + (React.instance.playerController.getPlayer(p).highMonitor ? "enabled" : "disabled"));
			return;
		}

		React.instance.monitorController.toggleMonitoring(player);
	}
}
