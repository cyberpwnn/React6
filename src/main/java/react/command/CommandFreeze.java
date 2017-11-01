package react.command;

import org.bukkit.command.CommandSender;

import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandFreeze extends ReactCommand
{
	public CommandFreeze()
	{
		command = "freeze";
		aliases = new String[] {"fr"};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_HELP_USAGE;
		description = Info.COMMAND_HELP_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Info.msg(sender, "Freezing Server for 10 seconds...");

		try
		{
			Thread.sleep(10000);
		}

		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
