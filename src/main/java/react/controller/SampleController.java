package react.controller;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.json.JSONObject;

import react.Gate;
import react.React;
import react.api.ISampler;
import react.api.SampledType;
import react.timings.TimingsReport;
import surge.Main;
import surge.Surge;
import surge.control.Control;
import surge.control.Controller;
import surge.control.IController;
import surge.sched.IMasterTickComponent;
import surge.sched.TaskLater;
import surge.server.AsyncTick;
import surge.server.SuperSampler;
import surge.util.D;

@AsyncTick
public class SampleController extends Controller implements IMasterTickComponent
{
	private GMap<String, ISampler> samplers;
	private int cd;
	private int sct;
	public static GMap<String, Double> reports;
	private GList<IController> controllers;
	public static double msu = 0;
	public static double totalTime = 0;
	public static double totalTaskTime = 0;
	public static TimingsReport t = null;

	@Override
	public void dump(JSONObject object)
	{
		object.put("reports", reports.size());

		JSONObject js = new JSONObject();

		for(String i : samplers.k())
		{
			js.put(i, samplers.get(i).get());
		}

		object.put("samplers", js);
	}

	public SampleController()
	{
		controllers = new GList<IController>();
		reports = new GMap<String, Double>();
		sct = 0;
		samplers = new GMap<String, ISampler>();
		constructSamplers();
		cd = 4;
	}

	public void construct()
	{
		controllers = new GList<IController>();

		for(Field i : React.class.getDeclaredFields())
		{
			if(i.isAnnotationPresent(Control.class))
			{
				try
				{
					controllers.add((IController) i.get(React.instance));
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public void report(String key, double d)
	{
		if(!reports.containsKey(key))
		{
			reports.put(key, 0.0);
		}

		reports.put(key, reports.get(key) + d);
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
		if(SampledType.TICK.get().getValue() == 0)
		{
			sct++;
		}

		if(TICK.tick % 5 == 0)
		{
			sct -= 2;

			if(sct > 20)
			{
				D.w("Super Sampler did not start correctly. Resetting");
				Main.reload();
			}
		}

		reports.clear();
		if(controllers.isEmpty())
		{
			construct();
		}

		for(IController i : controllers)
		{
			report("Controller " + i.getClass().getSimpleName().replaceAll("Controller", ""), i.getTime());
		}

		report("Tasks", msu);
		msu = 0;
		double nsv = 0;
		for(String i : reports.k())
		{
			nsv += reports.get(i);
		}

		totalTime = nsv;
		totalTaskTime = msu;
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

	@EventHandler
	public void on(PlayerCommandPreprocessEvent e)
	{
		if(e.getMessage().equalsIgnoreCase("/timings on"))
		{
			if(t != null)
			{
				t.stop();
				t = null;
			}

			t = new TimingsReport();
			t.start();
			Gate.msgActing(e.getPlayer(), "Timings Started");
		}

		if(e.getMessage().equalsIgnoreCase("/timings off"))
		{
			if(t != null)
			{
				t.stop();
				t = null;
				Gate.msgSuccess(e.getPlayer(), "Timings Stopped");
			}
		}

		if(e.getMessage().equalsIgnoreCase("/timings reset"))
		{
			if(t != null)
			{
				t.stop();
				t = null;
			}

			t = new TimingsReport();
			t.start();
			Gate.msgSuccess(e.getPlayer(), "Timings Reset");
		}

		if(e.getMessage().equalsIgnoreCase("/timings paste"))
		{
			if(t != null)
			{
				t.stop();
				t.reportTo(e.getPlayer());
				t = null;
			}
		}

		if(e.getMessage().equalsIgnoreCase("/timings peek"))
		{
			if(t != null)
			{
				t.reportTo(e.getPlayer());
				Gate.msgActing(e.getPlayer(), "Timings Peeked. Timings will continue to sample.");
			}

			e.setCancelled(true);
		}

		if(e.getMessage().equalsIgnoreCase("/timings spam"))
		{
			if(t != null)
			{
				Gate.msgActing(e.getPlayer(), "Timings data will be sent 4 times a second.");
				Gate.msgActing(e.getPlayer(), "You can turn this off by using /timings spam");

				new TaskLater("tf", 45)
				{
					@Override
					public void run()
					{
						if(t != null)
						{
							t.spam(e.getPlayer());
						}
					}
				};
			}

			e.setCancelled(true);
		}
	}
}
