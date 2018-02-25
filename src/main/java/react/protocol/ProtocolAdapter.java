package react.protocol;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.gformat.F;
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
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;

import surge.Surge;
import surge.util.D;
import surge.util.Protocol;
import surge.util.ProtocolRange;

public class ProtocolAdapter implements Listener
{
	private boolean longs;
	private PacketStreamHandler packetOutputHandler;
	private GMap<Player, Double> pings;
	private GMap<Player, Long> ago;
	private GMap<Player, GBiset<Long, Long>> times;
	private GMap<Player, GMap<Integer, PacketContainer>> looks;
	private GMap<Player, GMap<Integer, PacketContainer>> headRotates;
	private int blockedPackets;
	private boolean burstPackets;
	private double avgPing;
	public static int tppsOUT;
	public static int tppsIN;
	public static int ppsOUT;
	public static int ppsIN;
	public static long tbpsIN;
	public static long bpsOUT;
	public static long bpsIN;
	public static int ppsSaved;
	public static long tbpsSaved;
	public static long bpsSaved;

	public void start()
	{
		Surge.register(this);
		looks = new GMap<Player, GMap<Integer, PacketContainer>>();
		headRotates = new GMap<Player, GMap<Integer, PacketContainer>>();
		avgPing = 0;
		burstPackets = false;
		packetOutputHandler = new PacketStreamHandler();
		pings = new GMap<Player, Double>();
		ago = new GMap<Player, Long>();
		times = new GMap<Player, GBiset<Long, Long>>();
		blockedPackets = 0;
		longs = !new ProtocolRange(Protocol.EARLIEST, Protocol.R1_11_2).contains(Protocol.getProtocolVersion());
		GList<PacketType> types = new GList<PacketType>();
		trackPing();
		trackPackets(types);
		trackBandwidth(types);
		throttleLookPackets();
		throttleHeadRotatePackets();
	}

	private void throttleLookPackets()
	{
		ProtocolLibrary.getProtocolManager().addPacketListener(new PacketAdapter(Surge.getAmp().getPlugin(), PacketType.Play.Server.ENTITY_LOOK)
		{
			@Override
			public void onPacketSending(PacketEvent e)
			{
				if(burstPackets)
				{
					return;
				}

				int eid = e.getPacket().getIntegers().read(0);

				if(!looks.containsKey(e.getPlayer()))
				{
					looks.put(e.getPlayer(), new GMap<Integer, PacketContainer>());
				}

				looks.get(e.getPlayer()).put(eid, e.getPacket().shallowClone());
				e.setCancelled(true);
				blockedPackets++;

				if(PacketStreamHandler.avgPacketSize.containsKey(e.getPacketType()))
				{
					tbpsSaved += PacketStreamHandler.avgPacketSize.get(e.getPacketType());
				}

				// System.out.println("BLOCKED entity look @eid:" + eid + " to cyberpwn");
			}
		});
	}

	private void throttleHeadRotatePackets()
	{
		ProtocolLibrary.getProtocolManager().addPacketListener(new PacketAdapter(Surge.getAmp().getPlugin(), PacketType.Play.Server.ENTITY_HEAD_ROTATION)
		{
			@Override
			public void onPacketSending(PacketEvent e)
			{
				if(burstPackets)
				{
					return;
				}

				int eid = e.getPacket().getIntegers().read(0);

				if(!headRotates.containsKey(e.getPlayer()))
				{
					headRotates.put(e.getPlayer(), new GMap<Integer, PacketContainer>());
				}

				headRotates.get(e.getPlayer()).put(eid, e.getPacket().shallowClone());
				e.setCancelled(true);
				blockedPackets++;

				if(PacketStreamHandler.avgPacketSize.containsKey(e.getPacketType()))
				{
					tbpsSaved += PacketStreamHandler.avgPacketSize.get(e.getPacketType());
				}

				// System.out.println("BLOCKED head look @eid:" + eid + " to cyberpwn");
			}
		});
	}

	private void trackBandwidth(GList<PacketType> types)
	{
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

	private void trackPing()
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

	private void trackPackets(GList<PacketType> types)
	{
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
	}

	public void tick()
	{
		if(TICK.tick % 5 == 0)
		{
			ppsIN = tppsIN * 4;
			ppsOUT = tppsOUT * 4;
			bpsIN = (tbpsIN * 4);
			bpsOUT = (PacketStreamHandler.wrote * 4);
			PacketStreamHandler.wrote = 0;
			tbpsIN = 0;
			tppsIN = 0;
			tppsOUT = 0;
		}

		if(TICK.tick % 20 == 0)
		{
			burstPackets = true;
			int k = 0;
			long actuallyUsed = 0;

			for(Player i : looks.k())
			{
				if(i != null && i.isOnline())
				{
					for(int j : looks.get(i).k())
					{
						try
						{
							ProtocolLibrary.getProtocolManager().sendServerPacket(i, looks.get(i).get(j));
							k++;
						}

						catch(InvocationTargetException e)
						{
							e.printStackTrace();
						}
					}
				}
			}

			for(Player i : headRotates.k())
			{
				if(i != null && i.isOnline())
				{
					for(int j : headRotates.get(i).k())
					{
						try
						{
							ProtocolLibrary.getProtocolManager().sendServerPacket(i, headRotates.get(i).get(j));
							k++;
						}

						catch(InvocationTargetException e)
						{
							e.printStackTrace();
						}
					}
				}
			}

			if(PacketStreamHandler.avgPacketSize.containsKey(PacketType.Play.Server.ENTITY_LOOK))
			{
				actuallyUsed += PacketStreamHandler.avgPacketSize.get(PacketType.Play.Server.ENTITY_LOOK);
			}

			if(PacketStreamHandler.avgPacketSize.containsKey(PacketType.Play.Server.ENTITY_HEAD_ROTATION))
			{
				actuallyUsed += PacketStreamHandler.avgPacketSize.get(PacketType.Play.Server.ENTITY_HEAD_ROTATION);
			}

			if(PacketStreamHandler.avgPacketSize.containsKey(PacketType.Play.Server.REL_ENTITY_MOVE))
			{
				actuallyUsed += PacketStreamHandler.avgPacketSize.get(PacketType.Play.Server.REL_ENTITY_MOVE);
			}

			if(PacketStreamHandler.avgPacketSize.containsKey(PacketType.Play.Server.REL_ENTITY_MOVE_LOOK))
			{
				actuallyUsed += PacketStreamHandler.avgPacketSize.get(PacketType.Play.Server.REL_ENTITY_MOVE_LOOK);
			}

			ppsSaved = blockedPackets - k;
			burstPackets = false;
			bpsSaved = Math.abs(tbpsSaved - actuallyUsed);
			System.out.println("Blocked " + blockedPackets + " / " + (k + blockedPackets) + " packets (" + F.pc(blockedPackets / (double) (k + blockedPackets)) + ") Saved " + F.fileSize(bpsSaved) + " / " + F.fileSize(bpsSaved + actuallyUsed) + " (" + F.pc(bpsSaved / (double) (bpsSaved + actuallyUsed)) + ")");

			blockedPackets = 0;
			tbpsSaved = 0;
			looks.clear();
			headRotates.clear();
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
