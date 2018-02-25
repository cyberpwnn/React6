package react.superhax;

import org.bukkit.plugin.Plugin;

import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.events.PacketOutputHandler;

import surge.Surge;

public class POH implements PacketOutputHandler
{
	public static long wrote = 0;

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
		wrote += buffer.length;
		return buffer;
	}

}
