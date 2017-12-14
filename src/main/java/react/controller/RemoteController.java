package react.controller;

import org.cyberpwn.gnet.packet.IncompatablePacketException;
import org.cyberpwn.reactlink.server.IFrameComputer;
import org.cyberpwn.reactlink.server.RemoteServer;
import org.cyberpwn.reactlink.server.ServerInfo;

import react.Config;
import surge.control.Controller;
import surge.sched.TaskLater;

public class RemoteController extends Controller
{
	private RemoteServer remoteServer;

	@Override
	public void start()
	{
		new TaskLater("server-delay", 2)
		{
			@Override
			public void run()
			{
				if(Config.REACT_REMOTE_ENABLED)
				{
					startRemoteServer();
				}
			}
		};
	}

	private void startRemoteServer()
	{
		try
		{
			remoteServer = new RemoteServer(Config.REACT_REMOTE_PORT)
			{
				@Override
				public ServerInfo getServerInfo()
				{
					return new ReactServerInfo();
				}

				@Override
				public IFrameComputer getFrameComputer()
				{
					return new ReactFremComputer();
				}
			};

			remoteServer.start();
		}

		catch(IncompatablePacketException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void stop()
	{
		if(Config.REACT_REMOTE_ENABLED)
		{
			remoteServer.interrupt();
		}
	}

	@Override
	public void tick()
	{

	}
}
