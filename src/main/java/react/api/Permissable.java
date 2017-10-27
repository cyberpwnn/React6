package react.api;

import org.bukkit.entity.Player;

import react.Info;

public enum Permissable
{
	ACCESS(Info.ACCESS),
	MONITOR(Info.MONITOR),
	MONITOR_TITLE(Info.MONITOR_TITLE),
	MONITOR_MAP(Info.MONITOR_MAP),
	MONITOR_ENVIRONMENT(Info.MONITOR_ENVIRONMENT),
	ACT(Info.ACT),
	RELOAD(Info.RELOAD);

	private String node;

	private Permissable(String s)
	{
		try
		{
			node = Info.REACT_DOT + s;
		}

		catch(Exception e)
		{

		}
	}

	public boolean has(Player p)
	{
		return p.hasPermission(getNode());
	}

	public String getNode()
	{
		return node;
	}
}
