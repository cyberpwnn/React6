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
public class CommandGlasses extends ReactCommand
{
	public CommandGlasses()
	{
		command = Info.COMMAND_GLASS;
		aliases = new String[] {Info.COMMAND_GLASS_ALIAS_1, Info.COMMAND_GLASS_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_GLASSES.getNode()};
		usage = Info.COMMAND_GLASS_USAGE;
		description = Info.COMMAND_GLASS_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player player = (Player) sender;
		React.instance.glassController.toggleGlasses(player);
	}
}
