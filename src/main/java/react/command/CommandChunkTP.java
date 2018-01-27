package react.command;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandChunkTP extends ReactCommand
{
	public CommandChunkTP()
	{
		command = Info.COMMAND_CTP;
		aliases = new String[] {Info.COMMAND_CTP_ALIAS_1, Info.COMMAND_CTP_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.TELEPORT.getNode()};
		usage = Info.COMMAND_CTP_USAGE;
		description = Info.COMMAND_CTP_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		try
		{
			World world = Bukkit.getWorld(args[0]);
			int x = Integer.valueOf(args[1]);
			int z = Integer.valueOf(args[2]);
			Chunk c = world.getChunkAt(x, z);
			((Player) sender).teleport(world.getHighestBlockAt(c.getBlock(0, 256, 0).getLocation()).getLocation());
		}

		catch(Exception e)
		{

		}
	}
}
