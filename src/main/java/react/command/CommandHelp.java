package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.Info;
import react.Lang;
import react.React;
import react.api.ICommand;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import react.text.ColoredString;
import react.text.RTEX;
import react.text.RTX;
import react.text.RawText;
import surge.Surge;
import surge.util.Anchor;
import surge.util.C;

@Anchor(0)
public class CommandHelp extends ReactCommand
{
	public CommandHelp()
	{
		command = Info.COMMAND_HELP;
		aliases = new String[] {Info.COMMAND_HELP_ALIAS_1, Info.COMMAND_HELP_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_HELP_USAGE;
		description = Info.COMMAND_HELP_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
		registerParameterDescription(Lang.getString("command.help.page"), Lang.getString("command.help.descriptor-page")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		sendPage(sender, args.length == 0 ? 0 : Integer.valueOf(args[0]), 9);
	}

	public void sendPage(CommandSender sender, int page, int maxEntries)
	{
		sender.sendMessage("  "); //$NON-NLS-1$
		sendHeader(sender, page, maxEntries);

		for(ICommand i : getPage(page, maxEntries))
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
		rtx.addTextHover(Lang.getString("command.help.react-cmd"), rtex, C.AQUA); //$NON-NLS-1$

		return rtx;
	}

	public void sendCommand(CommandSender sender, ICommand command)
	{
		if(sender instanceof Player)
		{
			RTX rtx = getBeginningRTX();
			RTEX desc = new RTEX();
			desc.getExtras().add(new ColoredString(C.AQUA, Lang.getString("command.help.aliases"))); //$NON-NLS-1$

			for(String i : command.getAliases())
			{
				desc.getExtras().add(new ColoredString(C.GRAY, Lang.getString("command.help.nreact") + i)); //$NON-NLS-1$
			}

			desc.getExtras().add(new ColoredString(C.AQUA, Lang.getString("command.help.ndescription"))); //$NON-NLS-1$

			for(String i : F.wrapWords("\"" + command.getDescription() + "\"", 28).split("\n")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			{
				desc.getExtras().add(new ColoredString(C.GRAY, "\n" + i)); //$NON-NLS-1$
			}

			rtx.addTextHover(" " + command.getCommand(), desc, C.GRAY); //$NON-NLS-1$

			if(command.getUsage().trim().length() > 0)
			{
				for(String i : command.getUsage().trim().split(" ")) //$NON-NLS-1$
				{
					RTEX us = new RTEX();
					C prefix = C.AQUA;
					ColoredString descx = new ColoredString(C.AQUA, Lang.getString("command.help.basic-par")); //$NON-NLS-1$
					String des = Lang.getString("command.help.nondescript"); //$NON-NLS-1$

					if(command.getDescriptionForParameter(i.toLowerCase().trim()) != null)
					{
						des = command.getDescriptionForParameter(i.toLowerCase().trim());
					}

					if(i.startsWith("<")) //$NON-NLS-1$
					{
						prefix = C.RED;
						descx = new ColoredString(prefix, Lang.getString("command.help.required-par")); //$NON-NLS-1$
					}

					if(i.startsWith("[")) //$NON-NLS-1$
					{
						prefix = C.GOLD;
						descx = new ColoredString(prefix, Lang.getString("command.help.optional-par")); //$NON-NLS-1$
					}

					if(i.startsWith("(")) //$NON-NLS-1$
					{
						prefix = C.GREEN;
						descx = new ColoredString(prefix, Lang.getString("command.help.mode-par")); //$NON-NLS-1$
					}

					us.getExtras().add(descx);
					us.getExtras().add(new ColoredString(C.GRAY, "\n" + F.wrapWords("\"" + des + "\"", 28))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					rtx.addTextHover(" " + i, us, prefix); //$NON-NLS-1$
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
				rtx.addTextWithHoverCommand(Lang.getString("command.help.symbol-prev"), RawText.COLOR_AQUA, Lang.getString("command.help.rehelpjumper") + (page - 1), Lang.getString("command.help.previous-page"), RawText.COLOR_AQUA, false, false, false, false, false); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

			else
			{
				rtx.addTextWithHover(Lang.getString("command.help.symbol-pipe"), RawText.COLOR_DARK_GRAY, Lang.getString("command.help.previous-page"), RawText.COLOR_RED, false, false, false, false, false); //$NON-NLS-1$ //$NON-NLS-2$
			}

			rtx.addText(F.repeat(C.GRAY + " ", 17), RawText.COLOR_DARK_GRAY, false, false, true, true, false); //$NON-NLS-1$
			rtx.addText(F.repeat(C.GRAY + " ", 17), RawText.COLOR_DARK_GRAY, false, false, true, true, false); //$NON-NLS-1$

			if(page < getPageSize(maxEntries) - 1)
			{
				rtx.addTextWithHoverCommand(Lang.getString("command.help.symbol-next"), RawText.COLOR_AQUA, Lang.getString("command.help.rehelpjumper") + (page + 1), Lang.getString("command.help.next-page"), RawText.COLOR_AQUA, false, false, false, false, false); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}

			else
			{
				rtx.addTextWithHover(Lang.getString("command.help.symbol-pipe"), RawText.COLOR_DARK_GRAY, Lang.getString("command.help.next-page"), RawText.COLOR_RED, false, false, false, false, false); //$NON-NLS-1$ //$NON-NLS-2$
			}

			rtx.tellRawTo(Surge.getAmp().getPluginInstance(), (Player) sender);
		}
	}

	public GList<ICommand> getSortedCommands()
	{
		GMap<String, ICommand> cmds = new GMap<String, ICommand>();

		for(ICommand i : React.instance.commandController.getCommands())
		{
			cmds.put(i.getCommand(), i);
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

	public GList<ICommand> getPage(int page, int maxEntries)
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
