package react.command;

import org.bukkit.command.CommandSender;

import react.Gate;
import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.Surge;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandVersion extends ReactCommand
{
	public CommandVersion()
	{
		command = Info.COMMAND_VERSION;
		aliases = new String[] {Info.COMMAND_VERSION_ALIAS_1, Info.COMMAND_VERSION_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_VERSION_USAGE;
		description = Info.COMMAND_VERSION_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		String vt = "";
		String vs = Surge.getAmp().getPluginInstance().getDescription().getVersion();

		if(vs.contains("a"))
		{
			vt += C.RED + C.UNDERLINE.toString() + vs;
		}

		else
		{
			vt += C.GREEN + vs;
		}

		Gate.msgSuccess(sender, C.WHITE + "React " + vt + " " + (Surge.isObfuscated() ? C.AQUA + "Obfuscated" : C.RED + "NOT OBFUSCATED"));
	}
}
