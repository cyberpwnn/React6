package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.cyberpwn.glang.GList;
import org.cyberpwn.gnet.streams.writable.Streamable;
import org.cyberpwn.reactlink.server.RemotePlugin;
import org.cyberpwn.reactlink.server.ServerInfo;

import react.React;
import surge.Surge;
import surge.util.Protocol;

public class ReactServerInfo extends ServerInfo
{
	@Override
	public String dgetMotd()
	{
		return Bukkit.getMotd();
	}

	@Override
	public int dgetGameProtocol()
	{
		return Protocol.getProtocolVersion().getVersion();
	}

	@Override
	public String dgetGameVersion()
	{
		return Protocol.getProtocolVersion().getVersionString();
	}

	@Override
	public String dgetReactVersion()
	{
		return Surge.getAmp().getPluginInstance().getDescription().getVersion();
	}

	@Override
	public int dgetMaxPlayers()
	{
		return Bukkit.getMaxPlayers();
	}

	@Override
	public GList<String> dgetConnectedPlayers()
	{
		GList<String> plrs = new GList<String>();

		for(Player i : Bukkit.getOnlinePlayers())
		{
			plrs.add(i.getName());
		}

		return plrs;
	}

	@Override
	public int dgetViewDistance()
	{
		return Bukkit.getViewDistance();
	}

	@Override
	public int dgetGamePort()
	{
		return Bukkit.getPort();
	}

	@Override
	public String dgetGameAddress()
	{
		return Bukkit.getIp();
	}

	@Override
	public GList<Streamable> dgetRemotePlugins()
	{
		GList<Streamable> plgs = new GList<Streamable>();

		for(Plugin i : Bukkit.getPluginManager().getPlugins())
		{
			plgs.add(new RemotePlugin(i.getName(), i.getDescription().getVersion(), new GList<String>(i.getDescription().getAuthors()).toString(",")));
		}

		return plgs;
	}

	@Override
	public GList<String> dgetWorlds()
	{
		GList<String> wl = new GList<String>();

		for(World i : Bukkit.getWorlds())
		{
			wl.add(i.getName());
		}

		return wl;
	}

	@Override
	public GList<String> dgetActions()
	{
		return React.instance.actionController.getActionNames();
	}

	@Override
	public GList<String> dgetSamplers()
	{
		return React.instance.sampleController.getSamplerNames();
	}
}
