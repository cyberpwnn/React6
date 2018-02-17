package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;
import org.cyberpwn.gmath.M;

import react.Gate;
import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandAccess extends ReactCommand
{
	private GMap<Player, Long> last;
	public static GSet<Player> req = new GSet<Player>();

	public CommandAccess()
	{
		command = Info.COMMAND_TEMPACCESS;
		aliases = new String[] {Info.COMMAND_TEMPACCESS_ALIAS_1, Info.COMMAND_TEMPACCESS_ALIAS_2};
		permissions = new String[] {};
		usage = Info.COMMAND_TEMPACCESS_USAGE;
		description = Info.COMMAND_TEMPACCESS_DESCRIPTION;
		sideGate = SideGate.PLAYERS_ONLY;
		last = new GMap<Player, Long>();
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(Permissable.ACCESS.has(sender))
		{
			if(Permissable.isAccessor((Player) sender))
			{
				Gate.msgError(sender, "You already have temporary access. Disconnecting will expire the access.");
			}

			else
			{
				Gate.msgError(sender, "You already have react permissions. This is used for requesting temporary access.");
			}
		}

		else if(sender.hasPermission("react.tempaccess"))
		{
			if(last.containsKey(sender) && last.get(sender) > M.ms())
			{
				Gate.msgError(sender, "You can request access again in " + F.time(last.get(sender) - M.ms(), 0));
			}

			else
			{
				last.put((Player) sender, M.ms() + 30000);

				if(req.contains(sender))
				{
					Gate.msgSuccess(sender, "Request re-sent! An admin must use /re accept <you>");
				}

				else
				{
					req.add((Player) sender);
					Gate.msgSuccess(sender, "Request sent! An admin must use /re accept <you>");
				}
			}
		}

		else
		{
			Gate.msgError(sender, "You do not have permission to request access.");
		}
	}
}
