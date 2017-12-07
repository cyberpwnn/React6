package react.api;

import org.bukkit.command.CommandSender;

public interface ICommand
{
	public String getCommand();

	public String[] getAliases();

	public String[] getPermissions();

	public String getUsage();

	public String getDescription();

	public String getDescriptionForParameter(String par);

	public SideGate getSideGate();

	public void registerParameterDescription(String id, String desc);

	public void fire(CommandSender sender, String[] args);
}
