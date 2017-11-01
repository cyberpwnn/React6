package react.api;

import org.bukkit.command.CommandSender;

import react.Info;

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

	@Override
	public void sendResponse(String r)
	{
		Info.msg(sender, r);
	}
}
