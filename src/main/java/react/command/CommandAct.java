package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cyberpwn.glang.GList;

import react.Info;
import react.React;
import react.api.ActionHandle;
import react.api.ActionState;
import react.api.ConsoleActionSource;
import react.api.Gate;
import react.api.IAction;
import react.api.IActionSource;
import react.api.ISelector;
import react.api.Permissable;
import react.api.PlayerActionSource;
import react.api.ReactCommand;
import react.api.Selector;
import react.api.SelectorParseException;
import react.api.SideGate;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandAct extends ReactCommand
{
	public CommandAct()
	{
		command = Info.COMMAND_ACT;
		aliases = new String[] {Info.COMMAND_ACT_ALIAS_1, Info.COMMAND_ACT_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_ACT_USAGE;
		description = Info.COMMAND_ACT_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(args.length == 0)
		{
			Gate.msg(sender, "Some list of actions should be here.");
			return;
		}

		String tag = args[0];
		ISelector[] selectors = new ISelector[args.length - 1];
		GList<String> errors = new GList<String>();
		IAction action = null;

		seeking: for(IAction i : React.instance.actionController.getActions())
		{
			for(String j : i.getNodes())
			{
				if(j.equalsIgnoreCase(tag))
				{
					action = i;
					break seeking;
				}
			}
		}

		if(action == null)
		{
			Gate.msg(sender, "Unknown Action: " + C.RED + tag);
			return;
		}

		if(action.getHandleType().equals(ActionHandle.AUTOMATIC))
		{
			Gate.msg(sender, C.RED + "Action: " + action.getName() + " does not support manual invocations.");
			return;
		}

		if(args.length > 0)
		{
			for(int i = 0; i < args.length - 1; i++)
			{
				try
				{
					String val = args[i + 1].toLowerCase().trim();
					selectors[i] = Selector.createSelector(sender, val);
					Selector.pop();

					if(!action.getDefaultSelectors().k().contains(selectors[i].getType()))
					{
						Gate.msg(sender, C.RED + "Action: " + action.getName() + " does not support the selector: " + selectors[i].getName());
						return;
					}
				}

				catch(SelectorParseException e)
				{
					errors.add(e.getMessage());
					e.printStackTrace();
				}
			}
		}

		if(errors.isEmpty())
		{
			IActionSource source = new ConsoleActionSource();

			if(sender instanceof Player)
			{
				source = new PlayerActionSource((Player) sender);
			}

			if(action.getState().equals(ActionState.RUNNING))
			{
				Gate.msgError(sender, action.getName() + " " + C.AQUA + action.getStatus());
				Gate.msgSuccess(sender, "Your action has been queued to run.");
			}

			React.instance.actionController.fire(action.getType(), source, selectors);
		}

		else
		{
			Gate.msg(sender, C.RED + "Action: " + action.getName() + " failed to parse supplied input.");

			for(String i : errors)
			{
				Gate.msg(sender, C.RED + action.getName() + ": " + i);
			}
		}
	}
}
