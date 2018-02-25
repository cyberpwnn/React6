package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Config;
import react.Gate;
import react.Info;
import react.Lang;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import react.api.TemporaryAccessor;
import surge.util.Anchor;
import surge.util.P;

@Anchor(0)
public class CommandAccept extends ReactCommand
{
	public CommandAccept()
	{
		command = Info.COMMAND_ACCEPT;
		aliases = new String[] {Info.COMMAND_ACCEPT_ALIAS_1, Info.COMMAND_ACCEPT_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.toString()};
		usage = Info.COMMAND_ACCEPT_USAGE;
		description = Info.COMMAND_ACCEPT_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(!Config.ALLOW_TEMPACCESS)
		{
			Gate.msgError(sender, Lang.getString("command.accept.temp-disabled")); //$NON-NLS-1$
			return;
		}

		if(sender instanceof Player && Permissable.isAccessor((Player) sender))
		{
			Gate.msgError(sender, Lang.getString("command.accept.fail-accept-temp")); //$NON-NLS-1$
			return;
		}

		if(args.length == 1)
		{
			Player p = P.findPlayer(args[0]);

			if(p != null)
			{
				if(Permissable.isAccessor(p))
				{
					Gate.msgError(sender, p.getName() + Lang.getString("command.accept.already-temp")); //$NON-NLS-1$
					return;
				}

				if(!CommandAccess.req.contains(p))
				{
					Gate.msgActing(sender, p.getName() + Lang.getString("command.accept.not-requested-but-forcing")); //$NON-NLS-1$
				}

				TemporaryAccessor t = new TemporaryAccessor(p);
				t.addPermission(Permissable.ACCESS);
				t.addPermission(Permissable.RAI_ACCESS);
				t.addPermission(Permissable.ACT);

				for(Permissable i : Permissable.values())
				{
					if(i.toString().contains("MONITOR")) //$NON-NLS-1$
					{
						t.addPermission(i);
					}
				}

				Permissable.addAccessor(t);
				CommandAccess.req.remove(p);
				Gate.msgSuccess(sender, p.getName() + Lang.getString("command.accept.now-has-access")); //$NON-NLS-1$
			}

			else
			{
				Gate.msgError(sender, Lang.getString("command.accept.cant-find") + args[0] + Lang.getString("command.accept.cant-find-2")); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}

		else
		{
			Gate.msgError(sender, "/re accept <PLAYER>"); //$NON-NLS-1$
		}
	}
}
