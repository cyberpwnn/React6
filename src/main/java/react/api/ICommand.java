package react.api;

import org.bukkit.command.CommandSender;

public interface ICommand
{
	public String getCommand();

	public String[] getAliases();

	public String[] getPermissions();

	public String getUsage();

	public String getDescription();

	public SideGate getSideGate();

	public void fire(CommandSender sender, String[] args);
}
