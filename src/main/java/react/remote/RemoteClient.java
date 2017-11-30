package react.remote;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class RemoteClient
{
	private String token;
	private String username;
	private String password;
	private String address;
	private int port;
	private PacketHandler in;
	private ServerInformation serverInformation;

	public RemoteClient(String username, String password, String address, int port) throws Exception
	{
		this.token = null;
		this.username = username;
		this.password = password;
		this.address = address;
		this.port = port;
		in = new PacketHandler();
		in.register(new PacketOk());
		in.register(new PacketSendToken());
		in.register(new PacketSendServerInformation());
		serverInformation = new ServerInformation();

		if(rauthenticateWithCredentials())
		{
			serverInformation = rgetServerInformation();
		}

		else
		{
			throw new PacketException("Failed to authenticate");
		}
	}

	private ServerInformation rgetServerInformation() throws Exception
	{
		if(token == null)
		{
			if(!rauthenticateWithCredentials())
			{
				throw new InstantiationException("Invalid Credentials");
			}
		}

		PacketGetServerInformation pgs = new PacketGetServerInformation();
		pgs.setToken(token);
		IRPacket r = rsendPacket(pgs);

		if(r instanceof PacketSendServerInformation)
		{
			return ((PacketSendServerInformation) r).getServerInformation();
		}

		throw new InstantiationException("Server responded with NOT OK (invalid token)?");
	}

	private boolean rauthenticateWithCredentials() throws Exception
	{
		PacketGetToken pgt = new PacketGetToken();
		pgt.setUsername(username);
		pgt.setPassword(password);
		IRPacket r = rsendPacket(pgt);

		if(r instanceof PacketSendToken)
		{
			token = ((PacketSendToken) r).getToken();
			return true;
		}

		return false;
	}

	private IRPacket rsendPacket(IRPacket packet) throws Exception
	{
		Socket client = new Socket();
		client.connect(new InetSocketAddress(address, port), 5000);
		byte[] data = packet.toBytes();
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		DataInputStream in = new DataInputStream(client.getInputStream());
		out.writeInt(data.length);
		out.write(data);
		out.flush();
		byte[] res = new byte[in.readInt()];
		in.read(res);
		IRPacket response = this.in.in(res);
		client.close();

		return response;
	}

	public String getToken()
	{
		return token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public int getPort()
	{
		return port;
	}

	public void setPort(int port)
	{
		this.port = port;
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
