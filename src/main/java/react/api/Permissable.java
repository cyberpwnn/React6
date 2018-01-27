package react.api;

import org.bukkit.command.CommandSender;

import react.Info;

public enum Permissable
{
	ACCESS(Info.PERM_ACCESS),
	TELEPORT(Info.PERM_TELEPORT),
	MONITOR(Info.PERM_MONITOR),
	MONITOR_TITLE(Info.PERM_MONITOR_TITLE),
	MONITOR_ACTIONLOG(Info.PERM_MONITOR_TITLE),
	MONITOR_MAP(Info.PERM_MONITOR_MAP),
	MONITOR_ENVIRONMENT(Info.PERM_MONITOR_ENVIRONMENT),
	MONITOR_GLASSES(Info.PERM_MONITOR_GLASSES),
	MONITOR_CHUNK_BLAME(Info.PERM_MONITOR_CHUNK_BLAME),
	RAI_MONITOR(Info.PERM_RAI_MONITOR),
	RAI_CONTROL(Info.PERM_RAI_CONTROL),
	RAI_ACCESS(Info.PERM_RAI_ACCESS),
	RAI(Info.PERM_RAI),
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
