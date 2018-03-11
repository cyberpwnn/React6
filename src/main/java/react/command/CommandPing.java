package react.command;

import java.util.Collections;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.volmit.react.util.Anchor;
import com.volmit.react.util.Average;
import com.volmit.react.util.C;
import com.volmit.react.util.F;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.M;
import com.volmit.react.util.P;

import react.Gate;
import react.Info;
import react.React;
import react.api.Capability;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;

@Anchor(0)
public class CommandPing extends ReactCommand
{
	public CommandPing()
	{
		command = Info.COMMAND_PING;
		aliases = new String[] {Info.COMMAND_PING_ALIAS_1, Info.COMMAND_PING_ALIAS_2};
		permissions = new String[] {Permissable.PING.getNode()};
		usage = Info.COMMAND_PING_USAGE;
		description = Info.COMMAND_PING_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
		registerParameterDescription("[player]", "the player to ping (or multiple)");
		registerParameterDescription("[opts]", "-t or --top to view totals");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(!Capability.ACCELERATED_PING.isCapable())
		{
			Capability.ACCELERATED_PING.sendNotCapable(sender);
			return;
		}

		if(args.length == 0)
		{
			if(sender instanceof Player)
			{
				Gate.msgSuccess(sender, "Your ping is " + C.WHITE + F.f(React.instance.protocolController.ping((Player) sender), 2) + "ms" + C.GRAY + " measured " + F.time(M.ms() - React.instance.protocolController.ago((Player) sender), 0) + " ago");
			}

			else
			{
				Gate.msgError(sender, "The console's ping is probably zero.");
			}

			return;
		}

		if(!Permissable.PING_OTHERS.has(sender))
		{
			Gate.msgError(sender, "You do not have permission to ping other people");
			return;
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
					Gate.msgSuccess(sender, "Slowest Ping: " + C.RED + F.f(h, 2) + "ms" + C.GRAY + " (" + high.getName() + ")");
					Gate.msgSuccess(sender, "Median Ping: " + C.YELLOW + F.f(m, 2) + "ms" + C.GRAY + " (" + mid.getName() + ")");
					Gate.msgSuccess(sender, "Fastest Ping: " + C.GREEN + F.f(l, 2) + "ms" + C.GRAY + " (" + low.getName() + ")");
					Gate.msgSuccess(sender, "Average Ping: " + C.WHITE + F.f(a.getAverage(), 2));
					sender.sendMessage(Gate.header(C.AQUA));
				}
			}

			else if(P.canFindPlayer(args[0]))
			{
				Player p = P.findPlayer(args[0]);
				Gate.msgSuccess(sender, p.getName() + "'s ping is " + C.WHITE + F.f(React.instance.protocolController.ping(p), 2) + "ms" + C.GRAY + " measured " + F.time(M.ms() - React.instance.protocolController.ago(p), 0) + " ago");
			}

			else
			{
				Gate.msgError(sender, "Who is " + args[0] + "?");
			}
		}
	}
}
