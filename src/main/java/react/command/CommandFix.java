package react.command;

import org.bukkit.command.CommandSender;
import org.cyberpwn.glang.GList;

import react.Gate;
import react.Info;
import react.React;
import react.api.IFix;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandFix extends ReactCommand
{
	public CommandFix()
	{
		command = Info.COMMAND_FIX;
		aliases = new String[] {Info.COMMAND_FIX_ALIAS_1, Info.COMMAND_FIX_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_FIX_USAGE;
		description = Info.COMMAND_FIX_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(args.length == 0)
		{
			sender.sendMessage(Gate.header("Fixes", C.AQUA));

			for(IFix i : React.instance.fixController.getFixes())
			{
				sender.sendMessage(C.AQUA + "/re fix " + C.GRAY + i.getId() + " " + C.WHITE + i.getUsage());
			}

			sender.sendMessage(Gate.header(C.AQUA));
			return;
		}

		String name = args[0];
		GList<String> argx = new GList<String>(args);
		argx.remove(0);
		React.instance.fixController.runFix(sender, name, argx.toArray(new String[argx.size()]));
	}
}