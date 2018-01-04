package react.command;

import org.bukkit.Chunk;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.Gate;
import react.Info;
import react.Lang;
import react.React;
import react.action.source.ActionHandle;
import react.action.source.ConsoleActionSource;
import react.action.source.IActionSource;
import react.action.source.PlayerActionSource;
import react.api.ActionState;
import react.api.ActionType;
import react.api.IAction;
import react.api.ISelector;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.Selector;
import react.api.SelectorParseException;
import react.api.SideGate;
import react.text.ColoredString;
import react.text.RTEX;
import react.text.RTX;
import react.text.RawText;
import surge.Surge;
import surge.util.Anchor;
import surge.util.C;
import surge.util.D;

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
		registerParameterDescription("<action>", "The name of the action to run");
		registerParameterDescription("[options]", "Special selectors (multiple) which change how the action executes. Use /re a to see specific selector usages.");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(args.length == 0)
		{
			sendPage(sender, 0, 9);
			return;
		}

		if(args.length == 1)
		{
			try
			{
				int k = Integer.valueOf(args[0]);
				sendPage(sender, k - 1, 9);
				D.v(k + ":f");
				return;
			}

			catch(NumberFormatException e)
			{

			}

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
			Gate.msg(sender, Lang.getString("command.act.unknown-action") + C.RED + tag); //$NON-NLS-1$
			return;
		}

		if(action.getHandleType().equals(ActionHandle.AUTOMATIC))
		{
			Gate.msg(sender, C.RED + Lang.getString("command.act.action") + action.getName() + Lang.getString("command.act.no-manual")); //$NON-NLS-1$ //$NON-NLS-2$
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
						Gate.msg(sender, C.RED + Lang.getString("command.act.action") + action.getName() + Lang.getString("command.act.no-selector") + selectors[i].getName()); //$NON-NLS-1$ //$NON-NLS-2$
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
				Gate.msgError(sender, action.getName() + " " + C.AQUA + action.getStatus()); //$NON-NLS-1$
				Gate.msgSuccess(sender, Lang.getString("command.act.queued-to-run")); //$NON-NLS-1$
			}

			React.instance.actionController.fire(action.getType(), source, selectors);
		}

		else
		{
			Gate.msg(sender, C.RED + Lang.getString("command.act.action") + action.getName() + Lang.getString("command.act.failed-to-parse")); //$NON-NLS-1$ //$NON-NLS-2$

			for(String i : errors)
			{
				Gate.msg(sender, C.RED + action.getName() + ": " + i); //$NON-NLS-1$
			}
		}
	}

	public void sendPage(CommandSender sender, int page, int maxEntries)
	{
		if(page < 0)
		{
			return;
		}

		if(page >= getPageSize(maxEntries))
		{
			return;
		}

		sender.sendMessage("  "); //$NON-NLS-1$
		sendHeader(sender, page, maxEntries);

		for(ActionType i : getPage(page, maxEntries))
		{
			sendCommand(sender, i);
		}

		sendFooter(sender, page, maxEntries);
	}

	public RTX getBeginningRTX()
	{
		RTX rtx = new RTX();
		RTEX rtex = new RTEX();
		rtex.getExtras().add(new ColoredString(C.AQUA, Lang.getString("command.help.descriptor-react"))); //$NON-NLS-1$
		rtex.getExtras().add(new ColoredString(C.GRAY, Lang.getString("command.help.or-re"))); //$NON-NLS-1$
		rtx.addTextHover(Lang.getString("command.help.react-cmd") + " act", rtex, C.AQUA); //$NON-NLS-1$

		return rtx;
	}

	public void sendCommand(CommandSender sender, ActionType command)
	{
		if(sender instanceof Player)
		{
			RTX rtx = getBeginningRTX();
			RTEX desc = new RTEX();
			desc.getExtras().add(new ColoredString(C.AQUA, Lang.getString("command.help.aliases"))); //$NON-NLS-1$

			for(String i : React.instance.actionController.getAction(command).getNodes())
			{
				desc.getExtras().add(new ColoredString(C.GRAY, Lang.getString("command.help.nreact") + "act " + i)); //$NON-NLS-1$
			}

			desc.getExtras().add(new ColoredString(C.AQUA, Lang.getString("command.help.ndescription"))); //$NON-NLS-1$

			for(String i : F.wrapWords("\"" + command.getDescription() + "\"", 28).split("\n")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			{
				desc.getExtras().add(new ColoredString(C.GRAY, "\n" + i)); //$NON-NLS-1$
			}

			rtx.addTextHover(" " + React.instance.actionController.getAction(command).getNodes()[0], desc, C.GRAY); //$NON-NLS-1$
			IAction a = React.instance.actionController.getAction(command);

			for(Class<?> i : a.getDefaultSelectors().k())
			{
				if(i.equals(Chunk.class))
				{
					RTEX rtex = new RTEX();
					rtex.getExtras().add(new ColoredString(C.GREEN, "Positional Selector\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "\"" + F.wrapWords("Supports selection of chunks using @c to control this action", 27) + "\"\n"));
					rtex.getExtras().add(new ColoredString(C.GREEN, "Default\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "@c:*\n"));
					rtex.getExtras().add(new ColoredString(C.GREEN, "Examples\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@c:this\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "Selects your chunk\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@c:this+2\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, F.wrapWords("Selects your chunk (radius of 2 around you)", 27) + "\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@c:look+2\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, F.wrapWords("Selects chunk looked at (radius of 2 around you)", 27) + "\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@c:*&!this+2\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, F.wrapWords("Selects all chunks except for yours +2 radius", 27)));

					rtx.addTextHover(" @c", rtex, C.GREEN);
				}

				if(i.equals(EntityType.class))
				{
					RTEX rtex = new RTEX();
					rtex.getExtras().add(new ColoredString(C.AQUA, "Entity Selector\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "\"" + F.wrapWords("Supports selection of entity types using @e to control this action", 27) + "\"\n"));
					rtex.getExtras().add(new ColoredString(C.AQUA, "Default\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "@e:*&!(crst)\n"));

					rtex.getExtras().add(new ColoredString(C.AQUA, "Examples\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@e:Pig\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "Selects only pigs\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@e:Pig&Cow\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, F.wrapWords("Selects only pigs and cows", 27) + "\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@e:*&!Cow&!Pig\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, F.wrapWords("Selects all entities except for pigs and cows", 27)));

					rtx.addTextHover(" @e", rtex, C.AQUA);
				}

				if(i.equals(Long.class))
				{
					RTEX rtex = new RTEX();
					rtex.getExtras().add(new ColoredString(C.GOLD, "Time Selector\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "\"" + F.wrapWords("Supports selection of a time length using @t to control this action", 27) + "\"\n"));
					rtex.getExtras().add(new ColoredString(C.GOLD, "Default\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "@t:(udf)s\n"));
					rtex.getExtras().add(new ColoredString(C.GOLD, "Examples\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@t:5s\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, "Selects 5 seconds\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@t:20t\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, F.wrapWords("Selects 20 ticks (1 second)", 27) + "\n"));
					rtex.getExtras().add(new ColoredString(C.WHITE, "@t:5h\n"));
					rtex.getExtras().add(new ColoredString(C.GRAY, F.wrapWords("Selects 5 hours", 27)));

					rtx.addTextHover(" @t", rtex, C.GOLD);
				}
			}

			rtx.tellRawTo((Player) sender);
		}
	}

	public void sendHeader(CommandSender sender, int page, int maxEntries)
	{
		if(sender instanceof Player)
		{
			RawText rtx = new RawText();

			rtx.addText(F.repeat(C.GRAY + " ", 17), RawText.COLOR_DARK_GRAY, false, false, true, true, false); //$NON-NLS-1$
			rtx.addText(" " + (page + 1) + Lang.getString("command.help.ofs") + (getPageSize(maxEntries)) + " ", RawText.COLOR_AQUA); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			rtx.addText(F.repeat(C.GRAY + " ", 17), RawText.COLOR_DARK_GRAY, false, false, true, true, false); //$NON-NLS-1$

			rtx.tellRawTo(Surge.getAmp().getPluginInstance(), (Player) sender);
		}
	}

	public void sendFooter(CommandSender sender, int page, int maxEntries)
	{
		if(sender instanceof Player)
		{
			RawText rtx = new RawText();

			if(page > 0)
			{
				rtx.addTextWithHoverCommand(Lang.getString("command.help.symbol-prev"), RawText.COLOR_AQUA, "/re a " + (page), Lang.getString("command.help.previous-page"), RawText.COLOR_AQUA, false, false, false, false, false); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

			else
			{
				rtx.addTextWithHover(Lang.getString("command.help.symbol-pipe"), RawText.COLOR_DARK_GRAY, Lang.getString("command.help.previous-page"), RawText.COLOR_RED, false, false, false, false, false); //$NON-NLS-1$ //$NON-NLS-2$
			}

			rtx.addText(F.repeat(C.GRAY + " ", 17), RawText.COLOR_DARK_GRAY, false, false, true, true, false); //$NON-NLS-1$
			rtx.addText(F.repeat(C.GRAY + " ", 17), RawText.COLOR_DARK_GRAY, false, false, true, true, false); //$NON-NLS-1$

			if(page < getPageSize(maxEntries) - 1)
			{
				rtx.addTextWithHoverCommand(Lang.getString("command.help.symbol-next"), RawText.COLOR_AQUA, "/re a " + (page + 2), Lang.getString("command.help.next-page"), RawText.COLOR_AQUA, false, false, false, false, false); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

			else
			{
				rtx.addTextWithHover(Lang.getString("command.help.symbol-pipe"), RawText.COLOR_DARK_GRAY, Lang.getString("command.help.next-page"), RawText.COLOR_RED, false, false, false, false, false); //$NON-NLS-1$ //$NON-NLS-2$
			}

			rtx.tellRawTo(Surge.getAmp().getPluginInstance(), (Player) sender);
		}
	}

	public GList<ActionType> getSortedCommands()
	{
		GMap<String, ActionType> cmds = new GMap<String, ActionType>();

		for(ActionType i : ActionType.values())
		{
			try
			{
				cmds.put(React.instance.actionController.getAction(i).getNodes()[0], i);
			}

			catch(Exception e)
			{

			}
		}

		return cmds.sortV();
	}

	public int getPageSize(int maxEntries)
	{
		int s = getSortedCommands().size();

		if((double) s % (double) maxEntries > 0)
		{
			return 1 + (int) ((double) s / (double) maxEntries);
		}

		return (int) ((double) s / (double) maxEntries);
	}

	public boolean isValidPage(int page, int maxEntries)
	{
		return page < getPageSize(maxEntries) || page >= 0;
	}

	public GList<ActionType> getPage(int page, int maxEntries)
	{
		if(!isValidPage(page, maxEntries))
		{
			return null;
		}

		int start = page * maxEntries;
		int end = start + maxEntries - 1;
		end = getSortedCommands().getIndexOrLast(end);

		return getSortedCommands().grepExplicit(start, end);
	}
}
