package react.security.locks;

import java.io.File;

import org.bukkit.event.Listener;

import react.api.PluginSelfDeleter;
import react.controller.SecurityController;
import surge.Surge;
import surge.util.Anchor;

@Anchor(-7)
public class SecurityLockBravo implements Listener
{
	public SecurityLockBravo()
	{
		try
		{
			if(!SecurityController.failures.isEmpty())
			{
				File f = Surge.getPluginJarFile();
				new PluginSelfDeleter(Surge.getAmp().getPluginInstance(), f, new Runnable()
				{
					@Override
					public void run()
					{
						if(f.exists())
						{
							try
							{
								f.delete();
								f.deleteOnExit();
							}

							catch(Throwable e)
							{

							}
						}
					}
				}).start();
			}
		}

		catch(Exception e)
		{

		}
	}
}
