package react.remote;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class PacketGetToken extends RPacket
{
	private String username;
	private String password;

	@Override
	public String getName()
	{
		return "get-token";
	}

	@Override
	public int getId()
	{
		return 0;
	}

	@Override
	public void read(ByteBuffer buf) throws IOException
	{
		ByteArrayInputStream bin = new ByteArrayInputStream(buf.array());
		DataInputStream din = new DataInputStream(bin);
		username = din.readUTF();
		password = din.readUTF();
		din.close();
	}

	@Override
	public ByteBuffer write() throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(boas);
		dos.writeUTF(username);
		dos.writeUTF(password);
		dos.close();
		return ByteBuffer.wrap(boas.toByteArray());
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
