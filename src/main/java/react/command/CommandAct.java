package react.command;

import org.bukkit.Chunk;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import react.Base;
import react.Info;
import react.React;
import react.api.ActionAlreadyRunningException;
import react.api.ActionHandle;
import react.api.ConsoleActionSource;
import react.api.IAction;
import react.api.IActionSource;
import react.api.ISelector;
import react.api.Permissable;
import react.api.PlayerActionSource;
import react.api.ReactCommand;
import react.api.Selector;
import react.api.SelectorParseException;
import react.api.SideGate;
import surge.collection.GList;
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
			Base.msg(sender, "Some list of actions should be here.");
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
			Base.msg(sender, "Unknown Action: " + C.RED + tag);
			return;
		}

		if(action.getHandleType().equals(ActionHandle.AUTOMATIC))
		{
			Base.msg(sender, C.RED + "Action: " + action.getName() + " does not support manual invocations.");
			return;
		}

		int ch = 0;

		if(args.length > 0)
		{
			for(int i = 0; i < args.length - 1; i++)
			{
				try
				{
					String val = args[i + 1].toLowerCase().trim();
					selectors[i] = Selector.createSelector(sender, val);
					int sel = Selector.pop();

					if(!action.getDefaultSelectors().k().contains(selectors[i].getType()))
					{
						Base.msg(sender, C.RED + "Action: " + action.getName() + " does not support the selector: " + selectors[i].getName());
						return;
					}

					if(selectors[i].getType().equals(Chunk.class))
					{
						ch += sel;
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

			try
			{
				action.act(source, selectors);

				if(ch > 0)
				{
					Base.msg(sender, "-> Selected " + ch + " Chunk" + (ch != 1 ? "s" : ""));
				}
			}

			catch(ActionAlreadyRunningException e)
			{
				Base.msg(sender, C.RED + action.getName() + ": Already Running -> " + action.getStatus());
			}
		}

		else
		{
			Base.msg(sender, C.RED + "Action: " + action.getName() + " failed to parse supplied input.");

			for(String i : errors)
			{
				Base.msg(sender, C.RED + action.getName() + ": " + i);
			}
		}
	}
}
