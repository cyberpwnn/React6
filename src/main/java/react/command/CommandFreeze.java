package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.React;
import react.api.ActionAlreadyRunningException;
import react.api.ActionType;
import react.api.IAction;
import react.api.Permissable;
import react.api.PlayerActionSource;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandFreeze extends ReactCommand
{
	public CommandFreeze()
	{
		command = "freeze";
		aliases = new String[] {"fr"};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = "does freezing stuff";
		description = "freezes the server for 5 seconds.";
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		sender.sendMessage("doact");

		try
		{
			IAction a = React.instance.actionController.getAction(ActionType.PURGE_ENTITIES);
			a.act(new PlayerActionSource((Player) sender));
		}

		catch(ActionAlreadyRunningException e)
		{
			e.printStackTrace();
			// Well alright then.
		}
	}
}
