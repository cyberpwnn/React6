package surge;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.bukkit.Bukkit;
import org.cyberpwn.gbench.Profiler;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import surge.control.AmpedPlugin;
import surge.control.Control;
import surge.control.Controller;
import surge.control.Disable;
import surge.control.Enable;
import surge.control.IController;
import surge.control.Instance;
import surge.control.Plugin;
import surge.server.SuperSampler;
import surge.util.D;
import surge.util.DynamicConfiguration;
import surge.util.DynamicTracker;
import surge.util.I;
import surge.util.PluginUtil;
import surge.util.PoolCount;
import surge.util.PoolDescriber;
import surge.util.PoolNanoThrottle;
import surge.util.Protocol;
import surge.util.RawEvent;

public class Main extends AmpedPlugin
{
	private GList<Class<?>> plugins;
	private GMap<Object, Method> pluginInstances;
	private GList<Controller> controllerSet;
	public static final GList<Class<?>> classes = new GList<Class<?>>();
	private static Field nsField = null;
	private static Field thField = null;
	private static final GList<Method> tracks = new GList<Method>();
	public static long nsf = -1;
	private static SuperSampler ssx;

	@Override
	public void onControllerRegistry()
	{

	}

	public static void reload()
	{
		Main m = (Main) Bukkit.getPluginManager().getPlugin("React");
		File f = Surge.getPluginJarFile();
		PluginUtil.unloadForce(m);
		PluginUtil.load(f);
	}

	@Override
	public long getNanoSync()
	{
		if(nsField == null)
		{
			return 100000;
		}

		if(nsf < 0)
		{
			try
			{
				nsf = (long) nsField.get(null);
			}

			catch(Exception e)
			{
				e.printStackTrace();
				nsf = 100000;
			}
		}

		return nsf;
	}

	public static void requestResetNanos()
	{
		Main.nsf = -1;
	}

	@Override
	public int getThreadCount()
	{
		if(thField == null)
		{
			return 1;
		}

		try
		{
			return (int) thField.get(null);
		}

		catch(Exception e)
		{
			e.printStackTrace();

			return 1;
		}
	}

	@Override
	public void onStart(Protocol serverProtocol)
	{
		I.a("main.start", 1);
		try
		{
			try
			{
				controllerSet = new GList<Controller>();
				plugins = new GList<Class<?>>();
				scanForAmps();
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}

			ssx = new SuperSampler();
			ssx.start();
			initializeAmps();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		I.b("main.start");
	}

	@Override
	public void onStop()
	{
		try
		{
			shutDownAmps();
			ssx.stop();
			controllerSet.clear();
			pluginInstances.clear();
			plugins.clear();
			classes.clear();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onPostInit()
	{

	}

	@Override
	public void onPreInit()
	{

	}

	private void shutDownAmps() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(Controller i : controllerSet)
		{
			i.stop();
		}

		controllerSet.clear();

		for(Object i : pluginInstances.k())
		{
			pluginInstances.get(i).invoke(i);
		}
	}

	private void initializeAmps() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		I.a("main.amps", 1);
		pluginInstances = new GMap<Object, Method>();

		for(Class<?> i : plugins)
		{
			Field instanceField = null;
			Method enableMethod = null;
			Method disableMethod = null;
			GList<Field> controllerFields = new GList<Field>();

			for(Field j : i.getDeclaredFields())
			{
				int m = j.getModifiers();

				if(j.isAnnotationPresent(Instance.class))
				{
					if(Modifier.isFinal(m))
					{
						D.w("Field @Instance " + j.getType().getSimpleName() + " " + j.getName() + " cannot be final");
						continue;
					}

					if(!Modifier.isStatic(m))
					{
						D.w("Field @Instance " + j.getType().getSimpleName() + " " + j.getName() + " must be static");
						continue;
					}

					if(!Modifier.isPublic(m))
					{
						D.w("Field @Instance " + j.getType().getSimpleName() + " " + j.getName() + " must be public");
						continue;
					}

					if(!j.getType().isAssignableFrom(i))
					{
						D.w("Field @Instance " + j.getType().getSimpleName() + " " + j.getName() + " is not assignable from " + i.getSimpleName());
						continue;
					}

					instanceField = j;
					break;
				}
			}

			for(Field j : i.getDeclaredFields())
			{
				int m = j.getModifiers();

				if(j.isAnnotationPresent(Control.class))
				{
					if(Modifier.isFinal(m))
					{
						D.w("Field @Control " + j.getType().getSimpleName() + " " + j.getName() + " cannot be final");
						continue;
					}

					if(Modifier.isStatic(m))
					{
						D.w("Field @Control " + j.getType().getSimpleName() + " " + j.getName() + " cannot be static");
						continue;
					}

					if(!Modifier.isPublic(m))
					{
						D.w("Field @Control " + j.getType().getSimpleName() + " " + j.getName() + " must be public");
						continue;
					}

					if(!IController.class.isAssignableFrom(j.getType()))
					{
						D.w("Field @Control " + j.getType().getSimpleName() + " " + j.getName() + " must be a controller (extends surge.control.Controller)");
						continue;
					}

					controllerFields.add(j);
				}
			}

			for(Method j : i.getDeclaredMethods())
			{
				int m = j.getModifiers();

				if(j.isAnnotationPresent(Enable.class))
				{
					if(Modifier.isFinal(m))
					{
						D.w("Field @Enable " + j.getName() + "() cannot be final");
						continue;
					}

					if(Modifier.isStatic(m))
					{
						D.w("Field @Enable " + j.getName() + "() cannot be static");
						continue;
					}

					if(!Modifier.isPublic(m))
					{
						D.w("Field @Enable " + j.getName() + "() must be public");
						continue;
					}

					if(!j.getReturnType().equals(Void.TYPE))
					{
						D.w("Field @Enable " + j.getName() + "() must return void");
						continue;
					}

					if(j.getParameterCount() != 0)
					{
						D.w("Field @Enable " + j.getName() + "() cannot have any parameters");
						continue;
					}

					enableMethod = j;
				}
			}

			for(Method j : i.getDeclaredMethods())
			{
				int m = j.getModifiers();

				if(j.isAnnotationPresent(Disable.class))
				{
					if(Modifier.isFinal(m))
					{
						D.w("Field @Disable " + j.getName() + "() cannot be final");
						continue;
					}

					if(Modifier.isStatic(m))
					{
						D.w("Field @Disable " + j.getName() + "() cannot be static");
						continue;
					}

					if(!Modifier.isPublic(m))
					{
						D.w("Field @Disable " + j.getName() + "() must be public");
						continue;
					}

					if(!j.getReturnType().equals(Void.TYPE))
					{
						D.w("Field @Disable " + j.getName() + "() must return void");
						continue;
					}

					if(j.getParameterCount() != 0)
					{
						D.w("Field @Disable " + j.getName() + "() cannot have any parameters");
						continue;
					}

					disableMethod = j;
				}
			}

			Constructor<?> constructor = i.getConstructor();

			if(constructor == null)
			{
				D.w(i.getSimpleName() + " must contain a constructor without any parameters");
				continue;
			}

			Object plugin = constructor.newInstance();

			if(instanceField != null)
			{
				instanceField.set(plugin, plugin);
				D.v("@Instance " + plugin.getClass().getSimpleName());
			}

			for(Field j : controllerFields)
			{
				Constructor<?> conCon = j.getType().getConstructor();

				if(conCon == null)
				{
					D.w("Controller " + j.getType().getSimpleName() + " must contain a constructor without any parameters");
					continue;
				}

				Object controller = conCon.newInstance();
				j.set(plugin, controller);
				controllerSet.add((Controller) controller);
				D.v("@Control " + controller.getClass().getSimpleName());
			}

			if(enableMethod != null)
			{
				D.v("@Enable " + enableMethod.getName() + "()");

				for(Controller k : controllerSet)
				{
					k.start();
				}

				enableMethod.invoke(plugin);
			}

			pluginInstances.put(plugin, disableMethod);
		}

		for(Method i : tracks)
		{
			i.invoke(null, this);
		}
		I.b("main.amps");
	}

	@Override
	public void doScan() throws IOException, ClassNotFoundException
	{
		I.a("main.scan", 1);
		File jar = Surge.getPluginJarFileUnsafe(this);
		FileInputStream fin = new FileInputStream(jar);
		ZipInputStream zip = new ZipInputStream(fin);

		for(ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry())
		{
			if(!entry.isDirectory() && entry.getName().endsWith(".class"))
			{
				if(entry.getName().contains("$"))
				{
					continue;
				}

				try
				{
					String c = entry.getName().replaceAll("/", ".").replace(".class", "");
					Class<?> clazz = Class.forName(c);
					classes.add(clazz);
				}

				catch(Throwable e)
				{

				}
			}
		}

		zip.close();

		try
		{
			scanForRawEvents();
			scanForDynamicTrack();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		scanForPoolDefiners();
	}

	private void scanForPoolDefiners()
	{
		for(Class<?> i : classes)
		{
			if(i.isAnnotationPresent(PoolDescriber.class))
			{
				D.v("@PoolDescriber " + i.getSimpleName());

				for(Field j : i.getDeclaredFields())
				{
					if(j.isAnnotationPresent(PoolNanoThrottle.class))
					{
						D.v("@PoolNanoThrottle " + j.getName());
						nsField = j;
					}

					if(j.isAnnotationPresent(PoolCount.class))
					{
						D.v("@PoolCount " + j.getName());
						thField = j;
					}
				}
			}
		}

		I.b("main.scan");
	}

	private void scanForRawEvents() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(Class<?> i : classes)
		{
			if(i.isAnnotationPresent(DynamicConfiguration.class))
			{
				D.v("@DynamicConfiguration " + i.getSimpleName());

				for(Method j : i.getDeclaredMethods())
				{
					if(j.isAnnotationPresent(RawEvent.class))
					{
						D.v("@RawEvent " + j.getName());
						j.invoke(null, this);
					}
				}
			}
		}
	}

	private void scanForDynamicTrack() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(Class<?> i : classes)
		{
			if(i.isAnnotationPresent(DynamicConfiguration.class))
			{
				D.v("@DynamicConfiguration " + i.getSimpleName());

				for(Method j : i.getDeclaredMethods())
				{
					if(j.isAnnotationPresent(DynamicTracker.class))
					{
						D.v("@DynamicTracker " + j.getName());
						tracks.add(j);
					}
				}
			}
		}
	}

	private void scanForAmps() throws IOException, ClassNotFoundException
	{
		for(Class<?> clazz : classes)
		{
			if(clazz.isAnnotationPresent(Plugin.class))
			{
				plugins.add(clazz);
				D.v("@Plugin " + clazz.getSimpleName());
			}
		}
	}

	@Override
	public void onTick()
	{
		I.a("main.tick", 20);
		if(!Surge.hasAmp())
		{
			return;
		}

		try
		{
			for(IController i : controllerSet)
			{
				try
				{
					Profiler p = new Profiler();
					p.begin();
					I.a("main.tick." + i.getClass().getSimpleName(), 20);
					i.tick();
					I.b("main.tick." + i.getClass().getSimpleName());
					p.end();
					i.setTime(p.getMilliseconds());
				}

				catch(Throwable e)
				{
					D.f("Failed to tick " + i.getClass().getSimpleName());
				}
			}
		}

		catch(Throwable e)
		{
			D.v("CTick Shut Down");
		}

		I.a("main.tp.sync", 20);
		getThreadPool().tickSyncQueue();
		I.b("main.tp.sync");
		I.b("main.tick");
	}

	public static SuperSampler getSuperSampler()
	{
		return ssx;
	}
}
