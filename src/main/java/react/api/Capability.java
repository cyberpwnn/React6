package react.api;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.cyberpwn.glang.GList;

import react.Gate;
import surge.util.C;
import surge.util.Protocol;

public class Capability
{
	public static final Capability DUAL_WEILD = new Capability("Dual Wielding", Protocol.R1_9);
	public static final Capability SCOREBOARD = new Capability("Scoreboards", Protocol.B1_5);
	public static final Capability SCOREBOARD_ADVANCED = new Capability("Advanced Scoreboards", Protocol.R1_8);
	public static final Capability HOPPER = new Capability("Hoppers", Protocol.B1_5);
	public static final Capability ENTITY_ATTRIBUTES = new Capability("Entity Attributes", Protocol.R1_9);
	public static final Capability ENTITY_AI = new Capability("Entity AI", Protocol.R1_9);
	public static final Capability ACTION_BAR = new Capability("Action Bars", Protocol.R1_8);
	public static final Capability ENTITY_NAMES = new Capability("Entity Naming", Protocol.R1_8);
	public static final Capability TITLE_BAR = new Capability("Title Bar", Protocol.R1_7_1);
	public static final Capability CHUNK_RELIGHTING = new Capability("Chunk Relighting", "FastAsyncWorldEdit");
	public static final Capability MONITOR_SUBMISSIVENESS = new Capability("Monitor Submissiveness", Protocol.R1_7_1, "ProtocolLib");
	public static final Capability ACCELERATED_PING = new Capability("Accelerated Ping", Protocol.R1_7_1, "ProtocolLib");
	public static final Capability ENTITY_THROTTLING = new Capability("Entity Throttling", Protocol.R1_8, Flavor.SOGGY_SPIGOT);
	public static final Capability TILE_THROTTLING = new Capability("Tile Throttling", Protocol.R1_8, Flavor.SOGGY_SPIGOT);
	public static final GList<Capability> capabilities = new GList<Capability>();

	static
	{
		capabilities.add(DUAL_WEILD);
		capabilities.add(SCOREBOARD);
		capabilities.add(SCOREBOARD_ADVANCED);
		capabilities.add(HOPPER);
		capabilities.add(ENTITY_ATTRIBUTES);
		capabilities.add(ENTITY_AI);
		capabilities.add(ACTION_BAR);
		capabilities.add(ENTITY_NAMES);
		capabilities.add(TITLE_BAR);
		capabilities.add(CHUNK_RELIGHTING);
		capabilities.add(MONITOR_SUBMISSIVENESS);
		capabilities.add(ACCELERATED_PING);
		capabilities.add(ENTITY_THROTTLING);
		capabilities.add(TILE_THROTTLING);
	}

	private final Protocol version;
	private final Flavor flavor;
	private final String plugin;
	private final String name;

	public Capability(String name, Protocol version, Flavor flavor, String plugin)
	{
		this.name = name;
		this.version = version;
		this.flavor = flavor;
		this.plugin = plugin;
	}

	public Capability(String name, Protocol version, Flavor flavor)
	{
		this(name, version, flavor, null);
	}

	public Capability(String name, Protocol version, String plugin)
	{
		this(name, version, Flavor.ANY, plugin);
	}

	public Capability(String name, String plugin)
	{
		this(name, Protocol.EARLIEST, Flavor.ANY, plugin);
	}

	public Capability(String name, Flavor flavor)
	{
		this(name, Protocol.EARLIEST, flavor, null);
	}

	public Capability(String name, Protocol version)
	{
		this(name, version, Flavor.ANY);
	}

	public boolean isPluginCapable()
	{
		if(plugin != null)
		{
			return Bukkit.getPluginManager().getPlugin(plugin) != null;
		}

		return true;
	}

	public boolean isFlavorCapable()
	{
		return Flavor.getHostFlavor().compatableWith(getFlavor());
	}

	public boolean isVersionCapable()
	{
		return version.to(Protocol.LATEST).contains(Protocol.getProtocolVersion());
	}

	public boolean isCapable()
	{
		return isPluginCapable() && isVersionCapable() && isFlavorCapable();
	}

	public Protocol getVersion()
	{
		return version;
	}

	public Flavor getFlavor()
	{
		return flavor;
	}

	public String getPlugin()
	{
		return plugin;
	}

	public String getName()
	{
		return name;
	}

	public void sendNotCapable(Player sender)
	{
		if(!this.isFlavorCapable())
		{
			Gate.msgError(sender, C.RED + this.getName() + C.GRAY + " (requires " + C.WHITE + this.getFlavor().fancyName() + C.GRAY + ")");
		}

		else if(!this.isPluginCapable())
		{
			Gate.msgError(sender, C.RED + this.getName() + C.GRAY + " (requires " + C.WHITE + this.getPlugin() + C.GRAY + ")");
		}

		else if(!this.isVersionCapable())
		{
			Gate.msgError(sender, C.RED + this.getName() + C.GRAY + " (requires " + C.WHITE + this.getVersion().getVersionString() + "+" + C.GRAY + ")");
		}
	}

	public void sendNotCapable(IActionSource source)
	{
		if(!this.isFlavorCapable())
		{
			source.sendResponseError(C.RED + this.getName() + C.GRAY + " (requires " + C.WHITE + this.getFlavor().fancyName() + C.GRAY + ")");
		}

		else if(!this.isPluginCapable())
		{
			source.sendResponseError(C.RED + this.getName() + C.GRAY + " (requires " + C.WHITE + this.getPlugin() + C.GRAY + ")");
		}

		else if(!this.isVersionCapable())
		{
			source.sendResponseError(C.RED + this.getName() + C.GRAY + " (requires " + C.WHITE + this.getVersion().getVersionString() + "+" + C.GRAY + ")");
		}
	}
}
