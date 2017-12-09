package react.controller;

import java.io.IOException;

import org.cyberpwn.reactlink.IFrameComputer;
import org.cyberpwn.reactlink.KnownUser;
import org.cyberpwn.reactlink.RemoteServer;
import org.cyberpwn.reactlink.ServerInformation;

import react.React;
import react.api.ReactFrameComputer;
import surge.Surge;
import surge.control.Controller;
import surge.sched.TaskLater;
import surge.util.D;
import surge.util.Protocol;

public class RemoteController extends Controller
{
	private RemoteServer s;
	private int port;

	@Override
	public void start()
	{
		new TaskLater("Start waiter", 20)
		{
			@Override
			public void run()
			{
				D.v("Starting ReactRemote server on port 8447 + ");
				startServer(8447);
			}
		};
	}

	public void startServer(int port)
	{
		try
		{
			s = new RemoteServer(port)
			{
				@Override
				public ServerInformation getServerInformation()
				{
					ServerInformation serverInfo = new ServerInformation();
					serverInfo.setProtocol(Protocol.getProtocolVersion().getVersion());
					serverInfo.setVersion(Protocol.getProtocolVersion().toString());
					serverInfo.setReactVersion(Surge.getAmp().getPluginInstance().getDescription().getVersion());
					serverInfo.setActions(React.instance.actionController.getActionNames());
					serverInfo.setSamplers(React.instance.sampleController.getSamplerNames());

					return serverInfo;
				}

				@Override
				public IFrameComputer getFrameComputer()
				{
					return new ReactFrameComputer();
				}
			};

			s.registerUser(new KnownUser("cyberpwn", "123"));
			s.start();
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void stop()
	{
		s.shutDown();
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
