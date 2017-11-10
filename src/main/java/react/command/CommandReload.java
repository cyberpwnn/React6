package react.command;

import org.bukkit.command.CommandSender;

import react.Gate;
import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.Main;
import surge.Surge;
import surge.util.Anchor;

@Anchor(0)
public class CommandReload extends ReactCommand
{
	public CommandReload()
	{
		command = Info.COMMAND_RELOAD;
		aliases = new String[] {Info.COMMAND_RELOAD_ALIAS_1, Info.COMMAND_RELOAD_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.RELOAD.getNode()};
		usage = Info.COMMAND_RELOAD_USAGE;
		description = Info.COMMAND_RELOAD_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Gate.msgSuccess(sender, "React " + Surge.getAmp().getPluginInstance().getDescription().getVersion() + " Reloaded");
		Main.requestReload();
	}
}
