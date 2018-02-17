package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Gate;
import react.Info;
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
		if(sender instanceof Player && Permissable.isAccessor((Player) sender))
		{
			Gate.msgError(sender, "Creative, but sorry. You need real access to do this :P");
			return;
		}

		if(args.length == 1)
		{
			Player p = P.findPlayer(args[0]);

			if(p != null)
			{
				if(Permissable.isAccessor(p))
				{
					Gate.msgError(sender, p.getName() + " already has temporary access. You can revoke with /re revoke <player>");
					return;
				}

				if(!CommandAccess.req.contains(p))
				{
					Gate.msgActing(sender, p.getName() + " has not requested access, giving access anyways. (/re revoke <player> to revoke)");
				}

				TemporaryAccessor t = new TemporaryAccessor(p);
				t.addPermission(Permissable.ACCESS);
				t.addPermission(Permissable.RAI_ACCESS);
				t.addPermission(Permissable.ACT);

				for(Permissable i : Permissable.values())
				{
					if(i.toString().contains("MONITOR"))
					{
						t.addPermission(i);
					}
				}

				Permissable.addAccessor(t);
				CommandAccess.req.remove(p);
				Gate.msgSuccess(sender, p.getName() + " now has temporary access to react.");
			}

			else
			{
				Gate.msgError(sender, "Cant find '" + args[0] + "'. Make sure your keyboard is plugged in.");
			}
		}

		else
		{
			Gate.msgError(sender, "/re accept <PLAYER>");
		}
	}
}
