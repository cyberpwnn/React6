package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Gate;
import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import react.notification.Note;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandSubscribe extends ReactCommand
{
	public CommandSubscribe()
	{
		command = Info.COMMAND_SUB;
		aliases = new String[] {Info.COMMAND_SUB_ALIAS_1, Info.COMMAND_SUB_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR.getNode()};
		usage = Info.COMMAND_SUB_USAGE;
		description = Info.COMMAND_SUB_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;

		String ch = "Channels: ";

		for(Note i : Note.values())
		{
			ch += C.WHITE + i.toString().toLowerCase() + ", ";
		}

		registerParameterDescription("[channel]", "The channel to subscribe to. " + ch + C.GRAY);
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Player player = (Player) sender;

		if(args.length == 0)
		{
			player.sendMessage(Gate.header("Subscribed", C.AQUA));

			for(Note i : Note.values())
			{
				if(React.instance.messageController.isSubscribed(player, i))
				{
					Gate.msg(player, C.YELLOW + i.toString().toLowerCase());
				}
			}

			player.sendMessage(Gate.header("Subscriptions", C.AQUA));

			for(Note i : Note.values())
			{
				if(!React.instance.messageController.isSubscribed(player, i))
				{
					Gate.msg(player, i.toString().toLowerCase());
				}
			}

			return;
		}

		try
		{
			Note n = Note.valueOf(args[0].toUpperCase());

			if(n != null)
			{
				React.instance.messageController.subscribe(player, Note.valueOf(args[0].toUpperCase()));
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
