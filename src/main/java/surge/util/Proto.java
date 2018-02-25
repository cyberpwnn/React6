package surge.util;

import java.lang.reflect.Field;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GBiset;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.ListenerOptions;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;

import react.superhax.POH;
import surge.Surge;

public class Proto implements Listener
{
	private boolean longs;
	private POH packetOutputHandler;
	private GMap<Player, Double> pings;
	private GMap<Player, Long> ago;
	private GMap<Player, GBiset<Long, Long>> times;
	private double avgPing;
	public static int tppsOUT;
	public static int tppsIN;
	public static int ppsOUT;
	public static int ppsIN;
	public static long tbpsIN;
	public static long bpsOUT;
	public static long bpsIN;

	public void start()
	{
		Surge.register(this);
		avgPing = 0;
		packetOutputHandler = new POH();
		pings = new GMap<Player, Double>();
		ago = new GMap<Player, Long>();
		times = new GMap<Player, GBiset<Long, Long>>();
		longs = !new ProtocolRange(Protocol.EARLIEST, Protocol.R1_11_2).contains(Protocol.getProtocolVersion());

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

		GList<PacketType> types = new GList<PacketType>();

		try
		{
			for(Field i : PacketType.Play.Server.class.getDeclaredFields())
			{
				if(i.getType().equals(PacketType.class))
				{
					try
					{
						PacketType t = (PacketType) i.get(null);
						Class<?> cc = t.getPacketClass();
						types.add(t);

						if(cc == null)
						{
							continue;
						}

						D.v("Tracking Packet: " + t.getSender().toString() + " " + cc.getSimpleName());
					}

					catch(Throwable e)
					{

					}
				}
			}

			for(Field i : PacketType.Play.Client.class.getDeclaredFields())
			{
				if(i.getType().equals(PacketType.class))
				{
					try
					{
						PacketType t = (PacketType) i.get(null);
						Class<?> cc = t.getPacketClass();

						if(cc == null)
						{
							continue;
						}

						types.add(t);
						D.v("Tracking Packet: " + t.getSender().toString() + " " + cc.getSimpleName());
					}

					catch(Throwable e)
					{

					}
				}
			}
		}

		catch(Throwable e)
		{

		}

		ProtocolLibrary.getProtocolManager().addPacketListener(new PacketAdapter(Surge.getAmp().getPlugin(), ListenerPriority.HIGHEST, types, ListenerOptions.INTERCEPT_INPUT_BUFFER)
		{
			@Override
			public void onPacketReceiving(PacketEvent e)
			{
				tppsIN++;
				tbpsIN += e.getNetworkMarker().getInputBuffer().capacity();
			}

			@Override
			public void onPacketSending(PacketEvent e)
			{
				tppsOUT++;
				e.getNetworkMarker().addOutputHandler(packetOutputHandler);
			}
		});
	}

	public void tick()
	{
		if(TICK.tick % 20 == 0)
		{
			ppsIN = tppsIN;
			ppsOUT = tppsOUT;
			bpsIN = tbpsIN;
			bpsOUT = POH.wrote;
			POH.wrote = 0;
			tbpsIN = 0;
			tppsIN = 0;
			tppsOUT = 0;
		}

		Average a = new Average(pings.size());

		for(Double i : pings.v())
		{
			a.put(i);
		}

		avgPing = a.getAverage();
	}

	@EventHandler
	public void on(PlayerQuitEvent e)
	{
		ago.remove(e.getPlayer());
		pings.remove(e.getPlayer());
		times.remove(e.getPlayer());
	}

	public void stop()
	{
		Surge.unregister(this);
		ProtocolLibrary.getProtocolManager().removePacketListeners(Surge.getAmp().getPluginInstance());
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
