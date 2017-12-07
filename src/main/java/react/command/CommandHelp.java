package react.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.Info;
import react.React;
import react.api.ICommand;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import react.text.ColoredString;
import react.text.RTEX;
import react.text.RTX;
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
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		for(ICommand i : getSortedCommands())
		{
			sendCommand(sender, i);
		}
	}

	public void sendPage(int page, int maxEntries)
	{

	}

	public RTX getBeginningRTX()
	{
		RTX rtx = new RTX();
		RTEX rtex = new RTEX();
		rtex.getExtras().add(new ColoredString(C.AQUA, "React Root Command"));
		rtex.getExtras().add(new ColoredString(C.GRAY, "\nor /re"));
		rtx.addTextHover("/react", rtex, C.AQUA);

		return rtx;
	}

	public void sendCommand(CommandSender sender, ICommand command)
	{
		if(sender instanceof Player)
		{
			RTX rtx = getBeginningRTX();
			RTEX desc = new RTEX();
			desc.getExtras().add(new ColoredString(C.AQUA, "Aliases"));

			for(String i : command.getAliases())
			{
				desc.getExtras().add(new ColoredString(C.GRAY, "\n/react " + i));
			}

			desc.getExtras().add(new ColoredString(C.AQUA, "\nDescription"));

			for(String i : F.wrapWords("\"" + command.getDescription() + "\"", 28).split("\n"))
			{
				desc.getExtras().add(new ColoredString(C.GRAY, "\n" + i));
			}

			rtx.addTextHover(" " + command.getCommand(), desc, C.GRAY);

			if(command.getUsage().trim().length() > 0)
			{
				for(String i : command.getUsage().trim().split(" "))
				{
					RTEX us = new RTEX();
					C prefix = C.AQUA;
					ColoredString descx = new ColoredString(C.AQUA, "\nBasic Parameter");

					if(i.startsWith("<"))
					{
						prefix = C.RED;
						descx = new ColoredString(C.GRAY, "\nRequired Parameter");
					}

					if(i.startsWith("["))
					{
						prefix = C.GOLD;
						descx = new ColoredString(C.GRAY, "\nOptional Parameter");
					}

					if(i.startsWith("("))
					{
						prefix = C.GREEN;
						descx = new ColoredString(C.GRAY, "\nMode Type");
					}

					us.getExtras().add(new ColoredString(prefix, i));
					us.getExtras().add(descx);
					rtx.addTextHover(" " + i, us, prefix);
				}
			}

			rtx.tellRawTo((Player) sender);
		}
	}

	public void sendHeader(CommandSender sender, int page, int maxEntries)
	{

	}

	public void sendFooter(CommandSender sender, int page, int maxEntries)
	{

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
		int end = start + maxEntries;

		return getSortedCommands().grepExplicit(start, end);
	}
}
