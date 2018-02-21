package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;
import org.cyberpwn.glang.GBiset;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;

import surge.Surge;
import surge.control.Controller;
import surge.util.Protocol;
import surge.util.ProtocolRange;

public class ProtocolController extends Controller
{
	private boolean safe;
	private boolean longs;
	private GMap<Player, Double> pings;
	private GMap<Player, Long> ago;
	private GMap<Player, GBiset<Long, Long>> times;
	private double avgPing;

	@Override
	public void start()
	{
		Surge.register(this);
		avgPing = 0;
		pings = new GMap<Player, Double>();
		ago = new GMap<Player, Long>();
		times = new GMap<Player, GBiset<Long, Long>>();
		safe = Bukkit.getPluginManager().getPlugin("ProtocolLib") != null;
		longs = !new ProtocolRange(Protocol.EARLIEST, Protocol.R1_11_2).contains(Protocol.getProtocolVersion());

		if(safe)
		{
			ProtocolLibrary.getProtocolManager().addPacketListener(new PacketAdapter(Surge.getAmp().getPlugin(), PacketType.Play.Server.KEEP_ALIVE)
			{
				@Override
				public void onPacketSending(PacketEvent e)
				{
					long id = longs ? e.getPacket().getLongs().read(0) : e.getPacket().getIntegers().read(0);
					times.put(e.getPlayer(), new GBiset<Long, Long>(id, M.ns()));
				}
			});

			ProtocolLibrary.getProtocolManager().addPacketListener(new PacketAdapter(Surge.getAmp().getPlugin(), PacketType.Play.Client.KEEP_ALIVE)
			{
				@Override
				public void onPacketReceiving(PacketEvent e)
				{
					if(times.containsKey(e.getPlayer()))
					{
						long id = longs ? e.getPacket().getLongs().read(0) : e.getPacket().getIntegers().read(0);

						if(id == times.get(e.getPlayer()).getA())
						{
							long timeNS = M.ns() - times.get(e.getPlayer()).getB();
							times.remove(e.getPlayer());
							pings.put(e.getPlayer(), (double) timeNS / 1000000.0);
							ago.put(e.getPlayer(), M.ms());
						}
					}
				}
			});
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);

		if(safe)
		{
			ProtocolLibrary.getProtocolManager().removePacketListeners(Surge.getAmp().getPluginInstance());
		}
	}

	@EventHandler
	public void on(PlayerQuitEvent e)
	{
		ago.remove(e.getPlayer());
		pings.remove(e.getPlayer());
		times.remove(e.getPlayer());
	}

	@Override
	public void tick()
	{
		Average a = new Average(pings.size());

		for(Double i : pings.v())
		{
			a.put(i);
		}

		avgPing = a.getAverage();
	}

	public double getAvgPing()
	{
		return avgPing;
	}

	public double ping(Player p)
	{
		if(pings.containsKey(p))
		{
			return pings.get(p);
		}

		return -1;
	}

	public long ago(Player p)
	{
		if(ago.containsKey(p))
		{
			return ago.get(p);
		}

		return -1;
	}

	public boolean isSafe()
	{
		return safe;
	}

	public boolean isLongs()
	{
		return longs;
	}

	public GMap<Player, Double> getPings()
	{
		return pings;
	}

	public GMap<Player, Long> getAgo()
	{
		return ago;
	}

	public GMap<Player, GBiset<Long, Long>> getTimes()
	{
		return times;
	}
}
