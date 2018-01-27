package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandBoom extends ReactCommand
{
	public CommandBoom()
	{
		command = "boom";
		aliases = new String[] {"boom"};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.RELOAD.getNode()};
		usage = "";
		description = Info.COMMAND_RELOAD_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		for(int i = 0; i < 250; i++)
		{
			((Player) sender).getWorld().spawnEntity(((Player) sender).getLocation(), EntityType.COW);
		}
	}
}
