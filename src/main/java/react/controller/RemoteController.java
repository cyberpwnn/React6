package react.controller;

import java.io.IOException;

import org.cyberpwn.reactlink.RemoteServer;
import org.cyberpwn.reactlink.ServerInformation;

import react.React;
import surge.Surge;
import surge.control.Controller;
import surge.util.Protocol;

public class RemoteController extends Controller
{
	private RemoteServer s;
	private int port;

	@Override
	public void start()
	{

	}

	public void startServer(int port)
	{
		try
		{
			s = new RemoteServer(port)
			{
				@Override
				public ServerInformation defineServerInformation()
				{
					ServerInformation serverInfo = new ServerInformation();
					serverInfo.setProtocol(Protocol.getProtocolVersion().getVersion());
					serverInfo.setVersion(Protocol.getProtocolVersion().toString());
					serverInfo.setReactVersion(Surge.getAmp().getPluginInstance().getDescription().getVersion());
					serverInfo.setActions(React.instance.actionController.getActionNames());
					serverInfo.setSamplers(React.instance.sampleController.getSamplerNames());

					return serverInfo;
				}
			};
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{

	}

	public RemoteServer getS()
	{
		return s;
	}

	public int getPort()
	{
		return port;
	}
}
