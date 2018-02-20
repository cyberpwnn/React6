package react.command;

import java.util.Collections;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import react.Gate;
import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandPing extends ReactCommand
{
	public CommandPing()
	{
		command = Info.COMMAND_PING;
		aliases = new String[] {Info.COMMAND_PING_ALIAS_1, Info.COMMAND_PING_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_PING_USAGE;
		description = Info.COMMAND_PING_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
		registerParameterDescription("[player]", "the player to ping (or multiple)");
		registerParameterDescription("[opts]", "-g or --graph shows a realtime graph of the target's ping");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(args.length == 0)
		{
			if(sender instanceof Player)
			{
				Gate.msgSuccess(sender, "Your ping is " + C.WHITE + F.f(React.instance.protocolController.ping((Player) sender), 1) + "ms" + C.GRAY + " measured " + F.time(M.ms() - React.instance.protocolController.ago((Player) sender), 0) + " ago");
			}

			else
			{
				Gate.msgError(sender, "The console's ping is probably zero.");
			}
		}

		if(args.length == 1)
		{
			if(args[0].startsWith("-"))
			{
				if(args[0].equalsIgnoreCase("-t") || args[0].equalsIgnoreCase("--top"))
				{
					GMap<Player, Double> pings = React.instance.protocolController.getPings();
					GList<Double> d = pings.v();
					Collections.sort(d);
					Collections.reverse(d);
					Average a = new Average(d.size());

					for(Double i : d)
					{
						a.put(i);
					}

					double h = d.get(0);
					double l = d.get(d.size() - 1);
					double m = d.get(d.size() / 2);
					Player high = null;
					Player low = null;
					Player mid = null;

					if(pings.isEmpty())
					{
						Gate.msgError(sender, "There is no ping data.");
						return;
					}

					for(Player i : pings.k())
					{
						if(pings.get(i) == h)
						{
							high = i;
						}

						if(pings.get(i) == m)
						{
							mid = i;
						}

						if(pings.get(i) == l)
						{
							low = i;
						}
					}

					sender.sendMessage(Gate.header("Top Ping", C.AQUA));
					Gate.msgSuccess(sender, "Slowest Ping: " + C.RED + F.f(h, 1) + "ms" + C.GRAY + " (" + high.getName() + ")");
					Gate.msgSuccess(sender, "Median Ping: " + C.YELLOW + F.f(m, 1) + "ms" + C.GRAY + " (" + mid.getName() + ")");
					Gate.msgSuccess(sender, "Fastest Ping: " + C.GREEN + F.f(l, 1) + "ms" + C.GRAY + " (" + low.getName() + ")");
					Gate.msgSuccess(sender, "Average Ping: " + C.WHITE + F.f(a.getAverage(), 1));
					sender.sendMessage(Gate.header(C.AQUA));
				}
			}
		}
	}
}
