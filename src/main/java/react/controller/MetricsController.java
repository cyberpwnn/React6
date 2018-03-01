package react.controller;

import java.util.concurrent.Callable;

import org.bukkit.Bukkit;

import react.BStats;
import react.Config;
import react.api.SampledType;
import react.api.Unused;
import surge.Main;
import surge.control.Controller;

public class MetricsController extends Controller
{
	private BStats stats;

	@Override
	public void start()
	{
		stats = new BStats((Main) Bukkit.getPluginManager().getPlugin("React"));

		stats.addCustomChart(new BStats.SimplePie("max_memory", new Callable<String>()
		{
			@Override
			public String call() throws Exception
			{
				return SampledType.MAXMEM.get().get();
			}
		}));

		stats.addCustomChart(new BStats.SimplePie("language", new Callable<String>()
		{
			@Override
			public String call() throws Exception
			{
				return Config.LANGUAGE;
			}
		}));

		stats.addCustomChart(new BStats.SimplePie("view_distance", new Callable<String>()
		{
			@Override
			public String call() throws Exception
			{
				return Bukkit.getServer().getViewDistance() + "";
			}
		}));

		stats.addCustomChart(new BStats.SimplePie("using_protocollib", new Callable<String>()
		{
			@Override
			public String call() throws Exception
			{
				return Bukkit.getPluginManager().getPlugin("ProtocolLib") != null ? "Yes" : "No";
			}
		}));

		stats.addCustomChart(new BStats.SimplePie("using_fawe", new Callable<String>()
		{
			@Override
			public String call() throws Exception
			{
				return Bukkit.getPluginManager().getPlugin("FastAsyncWorldEdit") != null ? "Yes" : "No";
			}
		}));
	}

	@Override
	public void stop()
	{

	}

	@Unused
	@Override
	public void tick()
	{

	}
}
