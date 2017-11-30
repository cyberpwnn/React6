package react.remote;

import java.io.IOException;

public interface IRPacket
{
	public String getName();

	public int getId();

	public byte[] toBytes() throws IOException;

	public void fromBytes(byte[] b) throws IOException;
}
