package react.remote;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.cyberpwn.glang.GList;

public class ServerInformation
{
	private int protocol;
	private String version;
	private String reactVersion;
	private GList<String> samplers;
	private GList<String> actions;

	public byte[] toBytes() throws IOException
	{
		ByteArrayOutputStream boas = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(boas);
		dos.writeInt(protocol);
		dos.writeUTF(version);
		dos.writeUTF(reactVersion);
		dos.writeInt(samplers.size());

		for(String i : samplers)
		{
			dos.writeUTF(i);
		}

		dos.writeInt(actions.size());

		for(String i : actions)
		{
			dos.writeUTF(i);
		}

		dos.close();
		return boas.toByteArray();
	}

	public void fromBytes(byte[] b) throws IOException
	{
		ByteArrayInputStream bin = new ByteArrayInputStream(b);
		DataInputStream din = new DataInputStream(bin);
		GList<String> s = new GList<String>();
		GList<String> a = new GList<String>();
		protocol = din.readInt();
		version = din.readUTF();
		reactVersion = din.readUTF();
		int samps = din.readInt();

		for(int i = 0; i < samps; i++)
		{
			s.add(din.readUTF());
		}

		int acts = din.readInt();

		for(int i = 0; i < acts; i++)
		{
			a.add(din.readUTF());
		}

		setActions(a);
		setSamplers(s);
		din.close();
	}

	public int getProtocol()
	{
		return protocol;
	}

	public void setProtocol(int protocol)
	{
		this.protocol = protocol;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public String getReactVersion()
	{
		return reactVersion;
	}

	public void setReactVersion(String reactVersion)
	{
		this.reactVersion = reactVersion;
	}

	public GList<String> getSamplers()
	{
		return samplers;
	}

	public void setSamplers(GList<String> samplers)
	{
		this.samplers = samplers;
	}

	public GList<String> getActions()
	{
		return actions;
	}

	public void setActions(GList<String> actions)
	{
		this.actions = actions;
	}
}
