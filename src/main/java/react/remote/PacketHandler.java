package react.remote;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

import org.cyberpwn.glang.GList;

public class PacketHandler
{
	private GList<IRPacket> reg;

	public PacketHandler()
	{
		reg = new GList<IRPacket>();
		register(new PacketGetToken());
		register(new PacketSendToken());
		register(new PacketRefreshToken());
		register(new PacketDeleteToken());
		register(new PacketOk());
	}

	public void register(IRPacket pack)
	{
		reg.add(pack);
	}

	public IRPacket in(byte[] data) throws IOException, InstantiationException, IllegalAccessException
	{
		ByteArrayInputStream bin = new ByteArrayInputStream(data);
		GZIPInputStream gzi = new GZIPInputStream(bin);
		DataInputStream din = new DataInputStream(gzi);
		int id = din.readInt();

		for(IRPacket i : reg)
		{
			if(i.getId() == id)
			{
				ByteArrayOutputStream boas = new ByteArrayOutputStream();
				byte[] buf = new byte[1024];
				int read = 0;

				while((read = din.read(buf)) != -1)
				{
					boas.write(buf, 0, read);
				}

				IRPacket ira = i.getClass().newInstance();
				ira.fromBytes(boas.toByteArray());

				return ira;
			}
		}

		throw new IOException("Unknown Packet: " + id);
	}
}
