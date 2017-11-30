package react.remote;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.React;
import surge.Surge;
import surge.util.D;
import surge.util.Protocol;

public class RemoteServer extends Thread
{
	private GMap<KnownUser, String> tokens;
	private GList<KnownUser> users;
	private ServerSocket ss;
	private boolean running;
	private PacketHandler in;
	private ServerInformation serverInfo;

	public RemoteServer(int port) throws IOException
	{
		ss = new ServerSocket(port);
		ss.setSoTimeout(100);
		running = false;
		in = new PacketHandler();
		in.register(new PacketGetToken());
		in.register(new PacketRefreshToken());
		in.register(new PacketDeleteToken());
		in.register(new PacketGetServerInformation());
		serverInfo = new ServerInformation();
		serverInfo.setProtocol(Protocol.getProtocolVersion().getVersion());
		serverInfo.setVersion(Protocol.getProtocolVersion().toString());
		serverInfo.setReactVersion(Surge.getAmp().getPluginInstance().getDescription().getVersion());
		serverInfo.setActions(React.instance.actionController.getActionNames());
		serverInfo.setSamplers(React.instance.sampleController.getSamplerNames());
	}

	@Override
	public void run()
	{
		running = true;

		while(running)
		{
			try
			{
				Socket socket = ss.accept();
				DataInputStream din = new DataInputStream(socket.getInputStream());
				int d = din.readInt();
				byte[] b = new byte[d];
				din.read(b);

				try
				{
					IRPacket irp = in.in(b);
					DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
					IRPacket irr = handleResponse(irp);
					byte[] res = irr.toBytes();
					dos.writeInt(res.length);
					dos.write(res);
					dos.flush();

					while(socket.isConnected())
					{
						try
						{
							Thread.sleep(1);
						}

						catch(Exception e)
						{
							socket.close();
							break;
						}
					}

					socket.close();
				}

				catch(Exception e)
				{
					D.f("Failed to handle packet");
					e.printStackTrace();
				}
			}

			catch(IOException e)
			{
				D.f("Failed to handle connection");
				e.printStackTrace();
			}
		}
	}

	private IRPacket handleResponse(IRPacket irp)
	{
		if(irp instanceof PacketGetToken)
		{
			return handleGetToken((PacketGetToken) irp);
		}

		if(irp instanceof PacketRefreshToken)
		{
			return handleRefreshToken((PacketRefreshToken) irp);
		}

		if(irp instanceof PacketDeleteToken)
		{
			return handleDeleteToken((PacketDeleteToken) irp);
		}

		if(irp instanceof PacketGetServerInformation)
		{
			return handleGetServerInformation((PacketGetServerInformation) irp);
		}

		PacketOk po = new PacketOk();
		po.setOk(false);
		po.setMessage("Unsupported Packet");
		return po;
	}

	private IRPacket handleGetServerInformation(PacketGetServerInformation irp)
	{
		PacketSendServerInformation ss = new PacketSendServerInformation();
		ss.setServerInformation(serverInfo);
		return auth(irp.getToken(), ss);
	}

	private IRPacket handleDeleteToken(PacketDeleteToken irp)
	{
		PacketOk po = new PacketOk();
		po.setOk(true);
		po.setMessage("Deleted Token");

		return auth(irp.getToken(), po, new Runnable()
		{
			@Override
			public void run()
			{
				for(KnownUser i : tokens.k())
				{
					if(tokens.get(i).equals(irp.getToken()))
					{
						tokens.remove(i);
					}
				}
			}
		});
	}

	private IRPacket handleRefreshToken(PacketRefreshToken irp)
	{
		for(KnownUser i : tokens.k())
		{
			if(tokens.get(i).equals(irp.getToken()))
			{
				String newToken = genToken();
				tokens.put(i, newToken);
				PacketSendToken st = new PacketSendToken();
				st.setToken(newToken);
				return st;
			}
		}

		PacketOk po = new PacketOk();
		po.setOk(false);
		po.setMessage("Invalid Token");
		return po;
	}

	private IRPacket handleGetToken(PacketGetToken irp)
	{
		String u = irp.getUsername();
		String p = irp.getPassword();

		for(KnownUser i : users)
		{
			if(i.getUsername().equals(u) && i.getPassword().equals(p))
			{
				String token = genToken();
				tokens.put(i, token);
				PacketSendToken st = new PacketSendToken();
				st.setToken(token);
				return st;
			}
		}

		PacketOk po = new PacketOk();
		po.setOk(false);
		po.setMessage("Invalid Credentials");
		return po;
	}

	private IRPacket auth(String token, IRPacket successfulResponse)
	{
		for(KnownUser i : tokens.k())
		{
			if(tokens.get(i).equals(token))
			{
				return successfulResponse;
			}
		}

		PacketOk po = new PacketOk();
		po.setOk(false);
		po.setMessage("Invalid Token");
		return po;
	}

	private IRPacket auth(String token, IRPacket successfulResponse, Runnable alsoRunIfSuccess)
	{
		for(KnownUser i : tokens.k())
		{
			if(tokens.get(i).equals(token))
			{
				alsoRunIfSuccess.run();
				return successfulResponse;
			}
		}

		PacketOk po = new PacketOk();
		po.setOk(false);
		po.setMessage("Invalid Token");
		return po;
	}

	private String genToken()
	{
		String token = UUID.randomUUID().toString() + UUID.randomUUID().toString() + UUID.randomUUID().toString();
		token = token.replaceAll("-", "");
		return token;
	}
}
