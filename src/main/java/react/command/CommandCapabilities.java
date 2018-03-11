package react.command;

import org.bukkit.command.CommandSender;

import com.volmit.react.util.Anchor;
import com.volmit.react.util.C;
import com.volmit.react.util.Protocol;

import react.Gate;
import react.Info;
import react.api.Capability;
import react.api.Flavor;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;

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
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		for(Capability i : Capability.capabilities)
		{
			if(i.isCapable())
			{
				String why = "";

				if(!i.getVersion().equals(Protocol.EARLIEST))
				{
					why += " " + C.GRAY + "mc " + C.LIGHT_PURPLE + i.getVersion().getVersionString() + C.GRAY;
				}

				if(i.getPlugin() != null)
				{
					why += " " + C.GRAY + "plugin " + C.GREEN + i.getPlugin() + C.GRAY;
				}

				if(!i.getFlavor().equals(Flavor.ANY))
				{
					if(i.getFlavor().equals(Flavor.SOGGY_SPIGOT))
					{
						why += " " + C.GRAY + "flavor " + C.AQUA + "Spigot/PaperSpigot" + C.GRAY;
					}

					else
					{
						why += " " + C.GRAY + "flavor " + C.AQUA + i.getFlavor().fancyName() + C.GRAY;
					}
				}

				Gate.msgSuccess(sender, C.WHITE + i.getName() + C.GRAY + "(" + why.substring(1) + C.GRAY + ")");
			}

			else if(!i.isFlavorCapable())
			{
				Gate.msgError(sender, C.RED + i.getName() + C.GRAY + " (requires " + C.WHITE + i.getFlavor().fancyName() + C.GRAY + ")");
			}

			else if(!i.isPluginCapable())
			{
				Gate.msgError(sender, C.RED + i.getName() + C.GRAY + " (requires " + C.WHITE + i.getPlugin() + C.GRAY + ")");
			}

			else if(!i.isVersionCapable())
			{
				Gate.msgError(sender, C.RED + i.getName() + C.GRAY + " (requires " + C.WHITE + i.getVersion().getVersionString() + "+" + C.GRAY + ")");
			}
		}
	}
}
