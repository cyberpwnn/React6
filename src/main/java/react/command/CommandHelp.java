package react.command;

import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Gate;
import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.sched.TaskLater;
import surge.util.Anchor;

@Anchor(0)
public class CommandHelp extends ReactCommand
{
	public CommandHelp()
	{
		command = Info.COMMAND_HELP;
		aliases = new String[] {Info.COMMAND_HELP_ALIAS_1, Info.COMMAND_HELP_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_HELP_USAGE;
		description = Info.COMMAND_HELP_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		sender.sendMessage("This is the help screen");

		new TaskLater("s", 20)
		{
			@Override
			public void run()
			{
				sender.sendMessage("Setting tt to 1");
				World w = ((Player)sender).getWorld();

				try
				{
					Gate.tweakEntityTickMax(w, 1);
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}

				new TaskLater("s", 200)
				{
					@Override
					public void run()
					{
						sender.sendMessage("Setting tt to 50");
						World w = ((Player) sender).getWorld();

						try
						{
							Gate.tweakEntityTickMax(w, 50);
						}

						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				};
			}
		};
	}
}
