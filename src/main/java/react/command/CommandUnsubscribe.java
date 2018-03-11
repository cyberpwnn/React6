package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.volmit.react.util.Anchor;

import react.Gate;
import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import react.notification.Note;

@Anchor(0)
public class CommandUnsubscribe extends ReactCommand
{
	public CommandUnsubscribe()
	{
		command = Info.COMMAND_USUB;
		aliases = new String[] {Info.COMMAND_USUB_ALIAS_1, Info.COMMAND_USUB_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR.getNode()};
		usage = Info.COMMAND_USUB_USAGE;
		description = Info.COMMAND_USUB_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
		registerParameterDescription("[channel]", "The channel to unsubscribe from");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player player = (Player) sender;

		if(args.length == 0)
		{
			for(Note i : Note.values())
			{
				Gate.msg(player, i.toString().toLowerCase());
			}

			return;
		}

		try
		{
			Note n = Note.valueOf(args[0].toUpperCase());

			if(n != null)
			{
				React.instance.messageController.unsubscribe(player, Note.valueOf(args[0].toUpperCase()));
			}

			else
			{
				Gate.msgError(player, "Unknown channel");
			}
		}

		catch(Exception e)
		{
			Gate.msgError(player, "Unknown channel");
		}
	}
}
