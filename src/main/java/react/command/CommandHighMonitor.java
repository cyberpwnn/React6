package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Gate;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandHighMonitor extends ReactCommand
{
	public CommandHighMonitor()
	{
		command = "high-monitor";
		aliases = new String[] {"hm", "high"};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_TITLE.getNode()};
		usage = "(toggle)";
		description = "Pushes the monitor up from the action bar into subtitle space.";
		sideGate = SideGate.PLAYERS_ONLY;
		registerParameterDescription("(toggle)", "Toggles the monitor between action space and subtitle space.");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player p = (Player) sender;
		React.instance.playerController.getPlayer(p).highMonitor = !React.instance.playerController.getPlayer(p).highMonitor;
		Gate.msgSuccess(p, "High Monitor " + (React.instance.playerController.getPlayer(p).highMonitor ? "enabled" : "disabled"));
	}
}
