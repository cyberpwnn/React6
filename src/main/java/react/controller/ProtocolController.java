package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.volmit.react.util.Controller;
import com.volmit.react.util.GBiset;
import com.volmit.react.util.GMap;
import com.volmit.react.util.JSONObject;

import react.Config;
import react.api.Capability;
import react.protocol.ProtocolAdapter;

public class ProtocolController extends Controller
{
	private boolean safe;
	private ProtocolAdapter proto;

	@Override
	public void dump(JSONObject object)
	{
		object.put("safe", safe);
	}

	@Override
	public void start()
	{
		safe = Bukkit.getPluginManager().getPlugin("ProtocolLib") != null && Capability.ACCELERATED_PING.isCapable();

		if(safe && !Config.FAST_PING)
		{
			safe = false;
		}

		if(safe)
		{
			proto = new ProtocolAdapter();
			proto.start();
		}
	}

	@Override
	public void stop()
	{
		if(safe)
		{
			proto.stop();
		}
	}

	@Override
	public void tick()
	{
		if(safe)
		{
			proto.tick();
		}
	}

	public double getAvgPing()
	{
		return proto.getAvgPing();
	}

	public double ping(Player p)
	{
		return proto.ping(p);
	}

	public long ago(Player p)
	{
		return proto.ago(p);
	}

	public boolean isSafe()
	{
		return safe;
	}

	public boolean isLongs()
	{
		return proto.isLongs();
	}

	public GMap<Player, Double> getPings()
	{
		return proto.getPings();
	}

	public GMap<Player, Long> getAgo()
	{
		return proto.getAgo();
	}

	public GMap<Player, GBiset<Long, Long>> getTimes()
	{
		return proto.getTimes();
	}
}
