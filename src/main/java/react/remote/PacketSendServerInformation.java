package react.remote;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class PacketSendServerInformation extends RPacket
{
	private ServerInformation serverInformation;

	@Override
	public String getName()
	{
		return "send-server-information";
	}

	@Override
	public int getId()
	{
		return 6;
	}

	@Override
	public void read(ByteBuffer buf) throws IOException
	{
		ByteArrayInputStream bin = new ByteArrayInputStream(buf.array());
		DataInputStream din = new DataInputStream(bin);
		byte[] inf = new byte[din.readInt()];
		din.read(inf);
		serverInformation = new ServerInformation();
		serverInformation.fromBytes(inf);
		din.close();
	}

	@Override
	public ByteBuffer write() throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(boas);
		byte[] inf = serverInformation.toBytes();
		dos.writeInt(inf.length);
		dos.write(inf);
		dos.close();
		return ByteBuffer.wrap(boas.toByteArray());
	}

	public ServerInformation getServerInformation()
	{
		return serverInformation;
	}

	public void setServerInformation(ServerInformation serverInformation)
	{
		this.serverInformation = serverInformation;
	}
}
