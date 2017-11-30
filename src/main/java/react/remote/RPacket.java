package react.remote;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.GZIPOutputStream;

public abstract class RPacket implements IRPacket
{
	@Override
	public abstract String getName();

	@Override
	public abstract int getId();

	@Override
	public byte[] toBytes() throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		GZIPOutputStream gzo = new GZIPOutputStream(boas);
		DataOutputStream dos = new DataOutputStream(gzo);
		dos.writeInt(getId());
		byte[] da = write().array();
		dos.writeInt(da.length);
		dos.write(da);
		dos.close();

		return boas.toByteArray();
	}

	@Override
	public void fromBytes(byte[] b) throws IOException
	{
		ByteArrayInputStream bin = new ByteArrayInputStream(b);
		DataInputStream din = new DataInputStream(bin);
		byte[] buf = new byte[din.readInt()];
		din.read(buf);
		din.close();
		read(ByteBuffer.wrap(buf));
	}

	public abstract void read(ByteBuffer buf) throws IOException;

	public abstract ByteBuffer write() throws IOException;
}
