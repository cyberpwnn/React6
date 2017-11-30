package react.remote;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class PacketSendToken extends RPacket
{
	private String token;

	@Override
	public String getName()
	{
		return "send-token";
	}

	@Override
	public int getId()
	{
		return 1;
	}

	@Override
	public void read(ByteBuffer buf) throws IOException
	{
		ByteArrayInputStream bin = new ByteArrayInputStream(buf.array());
		DataInputStream din = new DataInputStream(bin);
		token = din.readUTF();
		din.close();
	}

	@Override
	public ByteBuffer write() throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(boas);
		dos.writeUTF(token);
		dos.close();
		return ByteBuffer.wrap(boas.toByteArray());
	}

	public String getToken()
	{
		return token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}
}
