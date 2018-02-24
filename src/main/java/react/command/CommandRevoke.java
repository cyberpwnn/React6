package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Config;
import react.Gate;
import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;
import surge.util.P;

@Anchor(0)
public class CommandRevoke extends ReactCommand
{
	public CommandRevoke()
	{
		command = Info.COMMAND_REVOKE;
		aliases = new String[] {Info.COMMAND_REVOKE_ALIAS_1, Info.COMMAND_REVOKE_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.toString()};
		usage = Info.COMMAND_REVOKE_USAGE;
		description = Info.COMMAND_REVOKE_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(!Config.ALLOW_TEMPACCESS)
		{
			Gate.msgError(sender, "Temporary Access is disabled.");
			return;
		}

		if(sender instanceof Player && Permissable.isAccessor((Player) sender))
		{
			if(args.length == 1 && P.findPlayer(args[0]) != null && P.findPlayer(args[0]).equals(sender))
			{
				Permissable.removeAccesssor((Player) sender);
				Gate.msgSuccess(sender, "Access self revoked. Have a nice day.");
				return;
			}

			Gate.msgError(sender, "Creative, but sorry. You need real access to do this :P");
			return;
		}

		if(args.length == 1)
		{
			Player p = P.findPlayer(args[0]);

			if(p != null)
			{
				if(!Permissable.isAccessor(p))
				{
					Gate.msgError(sender, p.getName() + " does not have temporary access. You can add with /re accept <player>");
					return;
				}

				Permissable.removeAccesssor(p);
				Gate.msgSuccess(sender, p.getName() + "'s react privileges revoked.");
			}

			else
			{
				Gate.msgError(sender, "Cant find '" + args[0] + "'. Make sure your keyboard is plugged in.");
			}
		}

		else
		{
			Gate.msgError(sender, "/re revoke <PLAYER>");
		}
	}
}
