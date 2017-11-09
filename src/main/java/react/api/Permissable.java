package react.api;

import org.bukkit.command.CommandSender;

import react.Info;

public enum Permissable
{
	ACCESS(Info.PERM_ACCESS),
	MONITOR(Info.PERM_MONITOR),
	MONITOR_TITLE(Info.PERM_MONITOR_TITLE),
	MONITOR_MAP(Info.PERM_MONITOR_MAP),
	MONITOR_ENVIRONMENT(Info.PERM_MONITOR_ENVIRONMENT),
	MONITOR_GLASSES(Info.PERM_MONITOR_GLASSES),
	ACT(Info.PERM_ACT),
	RELOAD(Info.PERM_RELOAD);

	private String node;

	private Permissable(String s)
	{
		try
		{
			node = Info.CORE_REACT_DOT + s;
		}

		catch(Exception e)
		{

		}
	}

	public boolean has(CommandSender p)
	{
		return p.hasPermission(getNode());
	}

	public String getNode()
	{
		return node;
	}
}
