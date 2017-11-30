package react.remote;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class PacketOk extends RPacket
{
	private boolean ok;
	private String message;

	@Override
	public String getName()
	{
		return "ok";
	}

	@Override
	public int getId()
	{
		return 4;
	}

	@Override
	public void read(ByteBuffer buf) throws IOException
	{
		ByteArrayInputStream bin = new ByteArrayInputStream(buf.array());
		DataInputStream din = new DataInputStream(bin);
		ok = din.readBoolean();
		message = din.readUTF();
		din.close();
	}

	@Override
	public ByteBuffer write() throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(boas);
		dos.writeBoolean(ok);
		dos.writeUTF(message);
		dos.close();
		return ByteBuffer.wrap(boas.toByteArray());
	}

	public boolean isOk()
	{
		return ok;
	}

	public void setOk(boolean ok)
	{
		this.ok = ok;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
}
