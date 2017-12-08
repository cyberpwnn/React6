package react.command;

import org.bukkit.command.CommandSender;

import react.Info;
import react.api.Capabilities;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandCapabilities extends ReactCommand
{
	public CommandCapabilities()
	{
		command = Info.COMMAND_CAPABILITIES;
		aliases = new String[] {Info.COMMAND_CAPABILITIES_ALIAS_1, Info.COMMAND_CAPABILITIES_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_CAPABILITIES_USAGE;
		description = Info.COMMAND_CAPABILITIES_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		for(Capabilities i : Capabilities.values())
		{
			if(i.isCapable())
			{
				i.sendCapable(sender);
			}

			else
			{
				i.sendNotCapable(sender);
			}
		}
	}
}
