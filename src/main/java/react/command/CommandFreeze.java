package react.command;

import org.bukkit.command.CommandSender;

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
		usage = "does freezing stuff";
		description = "freezes the server for 5 seconds.";
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		sender.sendMessage("Freezing Server for 5000 milliseconds");

		try
		{
			Thread.sleep(5000);
		}

		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
