package react.api;

import org.bukkit.command.CommandSender;

public class CommandSenderActionSource implements IActionSource
{
	private CommandSender sender;

	public CommandSenderActionSource(CommandSender sender)
	{
		this.sender = sender;
	}

	public CommandSender getSender()
	{
		return sender;
	}
}
