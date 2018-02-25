package react.protocol;

import org.bukkit.plugin.Plugin;
import org.cyberpwn.glang.GMap;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.events.PacketOutputHandler;

import surge.Surge;

public class PacketStreamHandler implements PacketOutputHandler
{
	public static long wrote = 0;
	public static GMap<PacketType, Long> avgPacketSize = new GMap<PacketType, Long>();

	@Override
	public ListenerPriority getPriority()
	{
		return ListenerPriority.HIGHEST;
	}

	@Override
	public Plugin getPlugin()
	{
		return Surge.getAmp().getPlugin();
	}

	@Override
	public byte[] handle(PacketEvent event, byte[] buffer)
	{
		avgPacketSize.put(event.getPacketType(), (long) buffer.length);
		wrote += buffer.length;
		return buffer;
	}

}
