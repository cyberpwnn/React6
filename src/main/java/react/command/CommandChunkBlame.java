package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GMap;

import react.Gate;
import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandChunkBlame extends ReactCommand
{
	public CommandChunkBlame()
	{
		command = Info.COMMAND_CBLAME;
		aliases = new String[] {Info.COMMAND_CBLAME_ALIAS_1, Info.COMMAND_CBLAME_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_GLASSES.getNode()};
		usage = Info.COMMAND_CBLAME_USAGE;
		description = Info.COMMAND_CBLAME_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		new A()
		{
			@Override
			public void run()
			{
				GMap<Player, Integer> player = React.instance.chunkController.getPlayerLoads();
				GMap<Plugin, Integer> plugin = React.instance.chunkController.getPluginLoads();
				GMap<String, Integer> top = new GMap<String, Integer>();
				int total = 0;

				for(Player i : player.k())
				{
					top.put(C.GREEN + i.getName(), player.get(i));
					total += player.get(i);
				}

				for(Plugin i : plugin.k())
				{
					top.put(C.AQUA + i.getName(), plugin.get(i));
					total += plugin.get(i);
				}

				total += React.instance.chunkController.getServerLoads();
				top.put(C.YELLOW + "Server", React.instance.chunkController.getServerLoads());

				int totalx = total;

				for(String i : top.sortK())
				{
					new S()
					{
						@Override
						public void run()
						{
							Gate.msgActing(sender, i + C.RESET + C.GRAY + ": " + F.pc((double) top.get(i) / (double) totalx, 1));
						}
					};
				}
			}
		};
	}
}
