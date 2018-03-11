package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.volmit.react.util.Anchor;
import com.volmit.react.util.F;
import com.volmit.react.util.GMap;
import com.volmit.react.util.GSet;
import com.volmit.react.util.M;

import react.Config;
import react.Gate;
import react.Info;
import react.Lang;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;

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
		if(!Config.ALLOW_TEMPACCESS)
		{
			Gate.msgError(sender, Lang.getString("command.access.temp-disabled")); //$NON-NLS-1$
			return;
		}

		if(Permissable.ACCESS.has(sender))
		{
			if(Permissable.isAccessor((Player) sender))
			{
				Gate.msgError(sender, Lang.getString("command.access.already-access")); //$NON-NLS-1$
			}

			else
			{
				Gate.msgError(sender, Lang.getString("command.access.already-have-full-access")); //$NON-NLS-1$
			}
		}

		else if(sender.hasPermission("react.tempaccess")) //$NON-NLS-1$
		{
			if(last.containsKey(sender) && last.get(sender) > M.ms())
			{
				Gate.msgError(sender, Lang.getString("command.access.request-again") + F.time(last.get(sender) - M.ms(), 0)); //$NON-NLS-1$
			}

			else
			{
				last.put((Player) sender, M.ms() + 30000);

				if(req.contains(sender))
				{
					Gate.msgSuccess(sender, Lang.getString("command.access.re-request-sent")); //$NON-NLS-1$
				}

				else
				{
					req.add((Player) sender);
					Gate.msgSuccess(sender, Lang.getString("command.access.request-sent")); //$NON-NLS-1$
				}
			}
		}

		else
		{
			Gate.msgError(sender, Lang.getString("command.access.no-perm")); //$NON-NLS-1$
		}
	}
}
