package react.controller;

import java.lang.reflect.InvocationTargetException;

import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.api.ISampler;
import surge.Main;
import surge.Surge;
import surge.control.Controller;
import surge.sched.IMasterTickComponent;
import surge.server.AsyncTick;
import surge.server.SuperSampler;
import surge.util.D;

@AsyncTick
public class SampleController extends Controller implements IMasterTickComponent
{
	private GMap<String, ISampler> samplers;
	private int cd;

	public SampleController()
	{
		samplers = new GMap<String, ISampler>();
		constructSamplers();
		cd = 4;
	}

	public boolean checkThreads()
	{
		GList<String> mf = new GList<String>();

		for(Thread i : Thread.getAllStackTraces().keySet())
		{
			if(i.getName().startsWith("Surge Thread Monitor") && i.isAlive())
			{
				return false;
			}
		}

		for(Thread i : Thread.getAllStackTraces().keySet())
		{
			if(i.getName().startsWith("Surge ") && i.isAlive())
			{
				if(!mf.contains(i.getName()))
				{
					mf.add(i.getName());
				}

				else
				{
					return true;
				}
			}
		}

		return false;
	}

	public void registerSampler(ISampler s)
	{
		samplers.put(s.getID(), s);
	}

	public ISampler getSampler(String id)
	{
		return samplers.get(id);
	}

	private void constructSamplers()
	{
		for(Class<?> i : Main.anchors.get(2))
		{
			try
			{
				registerSampler((ISampler) i.getConstructor().newInstance());
			}

			catch(InstantiationException e)
			{
				e.printStackTrace();
			}

			catch(IllegalAccessException e)
			{
				e.printStackTrace();
			}

			catch(IllegalArgumentException e)
			{
				e.printStackTrace();
			}

			catch(InvocationTargetException e)
			{
				e.printStackTrace();
			}

			catch(NoSuchMethodException e)
			{
				e.printStackTrace();
			}

			catch(SecurityException e)
			{
				e.printStackTrace();
			}
		}

		for(ISampler i : samplers.v())
		{
			D.v("Sampler: " + i.getID() + " (" + i.getName() + ") @ " + i.getInterval()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			i.construct();
		}
	}

	@Override
	public void start()
	{
		Surge.register(this);
		Surge.registerTicked(this);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
		Surge.unregisterTicked(this);
	}

	@Override
	public void tick()
	{

	}

	public SuperSampler getSuperSampler()
	{
		return Main.getSuperSampler();
	}

	@Override
	public void onTick()
	{
		if(TICK.tick < 2)
		{
			return;
		}

		if(cd > 0)
		{
			cd--;
			return;
		}

		for(ISampler i : samplers.v())
		{
			try
			{
				if(TICK.tick % i.getInterval() == 0)
				{
					i.sample();
				}
			}

			catch(Throwable e)
			{

			}
		}
	}

	@Override
	public String getTickName()
	{
		return "Sampler"; //$NON-NLS-1$
	}

	public GMap<String, ISampler> getSamplers()
	{
		return samplers;
	}

	public SuperSampler getSs()
	{
		return Main.getSuperSampler();
	}

	public int getCd()
	{
		return cd;
	}

	public GList<String> getSamplerNames()
	{
		GList<String> samps = new GList<String>();

		for(String i : getSamplers().k())
		{
			samps.add(i);
		}

		return samps;
	}
}
