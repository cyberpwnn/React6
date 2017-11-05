package react.controller;

import java.lang.reflect.InvocationTargetException;

import org.cyberpwn.gconcurrent.TICK;
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
	private SuperSampler ss;

	public SampleController()
	{
		samplers = new GMap<String, ISampler>();
		ss = new SuperSampler();
		constructSamplers();
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
			D.v("Sampler: " + i.getID() + " (" + i.getName() + ") @ " + i.getInterval());
			i.construct();
		}
	}

	@Override
	public void start()
	{
		ss.start();
		Surge.register(this);
		Surge.registerTicked(this);
	}

	@Override
	public void stop()
	{
		ss.stop();
		Surge.unregister(this);
		Surge.unregisterTicked(this);
	}

	@Override
	public void tick()
	{

	}

	public SuperSampler getSuperSampler()
	{
		return ss;
	}

	@Override
	public void onTick()
	{
		for(ISampler i : samplers.v())
		{
			try
			{
				if(TICK.tick % i.getInterval() == 0)
				{
					i.sample();
				}
			}

			catch(Exception e)
			{
				D.f("Failed to sample " + i.getName());
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getTickName()
	{
		return "Sampler";
	}
}
