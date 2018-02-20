package surge.control;

import java.io.IOException;
import java.util.UUID;

import org.bukkit.plugin.java.JavaPlugin;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.ParallelPoolManager;
import org.cyberpwn.gconcurrent.QueueMode;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.glang.GList;

import surge.Surge;
import surge.sched.IMasterTickComponent;
import surge.server.CoreTickThread;
import surge.util.D;
import surge.util.Protocol;

public abstract class AmpedPlugin extends JavaPlugin implements SurgePlugin, IMasterTickComponent
{
	private GList<IController> controllers;
	private ParallelPoolManager pp;
	private CoreTickThread ctt;
	public static UUID idx;

	public abstract void doScan() throws IOException, ClassNotFoundException;

	public abstract long getNanoSync();

	public abstract int getThreadCount();

	public void onReload()
	{

	}

	@Override
	public void onEnable()
	{
		destroyOldThreads();
		idx = UUID.randomUUID();

		try
		{
			doScan();
		}

		catch(Exception e)
		{
			e.printStackTrace();
			return;
		}

		controllers = new GList<IController>();
		pp = new ParallelPoolManager("Cruncher", getThreadCount(), QueueMode.ROUND_ROBIN)
		{
			@Override
			public long getNanoGate()
			{
				return getNanoSync();
			}
		};

		ctt = new CoreTickThread();
		onControllerRegistry();
		onPreInit();
		onPostInit();
		pp.start();
		A.mgr = pp;
		S.mgr = pp;
		ctt.start();

		Surge.createAmp(this).connect();

		for(IController i : getControllers())
		{
			i.start();
		}

		onStart(Protocol.getProtocolVersion());
		Surge.registerTicked(this);
	}

	@Override
	public void onDisable()
	{
		Surge.getAsyncTickComponents().clear();
		Surge.getTickComponents().clear();
		onStop();
		pp.shutdown();
		ctt.interrupt();
		ctt.r = false;

		if(Surge.getAmp() != null)
		{
			Surge.getAmp().disconnect();
		}
	}

	@Override
	public GList<IController> getControllers()
	{
		return controllers;
	}

	@Override
	public void registerController(IController c)
	{
		getControllers().add(c);
	}

	@Override
	public void onTick()
	{
		if(!Surge.hasAmp())
		{
			return;
		}

		for(IController i : getControllers())
		{
			i.tick();
		}

		pp.tickSyncQueue();
	}

	@Override
	public String getTickName()
	{
		return getName() + "-tick";
	}

	@Override
	public ParallelPoolManager getThreadPool()
	{
		return pp;
	}

	public void destroyOldThreads()
	{
		GList<Thread> tthreads = new GList<Thread>();

		for(Thread i : new GList<Thread>(Thread.getAllStackTraces().keySet()))
		{
			if(i.getName().startsWith("Surge "))
			{
				tthreads.add(i);
				D.v("Shutting Down: " + i.getName());
			}
		}

		if(!tthreads.isEmpty())
		{
			Thread t = new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					for(Thread i : new GList<Thread>(Thread.getAllStackTraces().keySet()))
					{
						if(i.getName().startsWith("Surge "))
						{
							try
							{
								i.interrupt();

								if(i instanceof CoreTickThread)
								{
									((CoreTickThread) i).r = false;
								}

								i.join(100);
							}

							catch(Throwable e)
							{

							}

							if(i.isAlive())
							{
								D.v("Failed to destroy thread: " + i.getName());
							}

							else
							{
								D.v("Shut down thread: " + i.getName());
							}
						}
					}
				}
			});

			t.setName("Surge Thread Monitor");
			t.setPriority(Thread.MAX_PRIORITY);
			t.start();
		}
	}

	@Override
	public abstract void onControllerRegistry();

	@Override
	public abstract void onStart(Protocol serverProtocol);

	@Override
	public abstract void onStop();

	@Override
	public abstract void onPostInit();

	@Override
	public abstract void onPreInit();
}
