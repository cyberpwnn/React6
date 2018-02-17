package react.command;

import org.bukkit.command.CommandSender;
import org.cyberpwn.gformat.F;

import react.Gate;
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
		aliases = new String[] {"frz", "lock"};
		permissions = new String[] {Permissable.ACCESS.toString()};
		usage = "[time in ms]";
		description = "Freeze the main thread (by sleeping) for a given time to test locking.";
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		long time = 5000;

		if(args.length == 1)
		{
			try
			{
				time = Long.valueOf(args[0]);
			}

			catch(NumberFormatException e)
			{
				Gate.msgError(sender, "Invalind LONG format: " + args[0]);
			}
		}

		Gate.msgActing(sender, "SERVER LOCK for " + F.timeLong(time, 1));

		try
		{
			Thread.sleep(time);
		}

		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		Gate.msgSuccess(sender, "Server Thawed... Is everyone ok?");
	}
}
