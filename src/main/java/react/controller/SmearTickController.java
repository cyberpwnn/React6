package react.controller;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import org.cyberpwn.glang.GMap;
import org.spigotmc.TickLimiter;

import react.Gate;
import react.api.SpecializedTickLimiter;
import surge.Surge;
import surge.control.Controller;
import surge.nms.NMSX;

public class SmearTickController extends Controller
{
	private GMap<World, SpecializedTickLimiter> etl;
	private GMap<World, SpecializedTickLimiter> ttl;

	@Override
	public void start()
	{
		Surge.register(this);
		etl = new GMap<World, SpecializedTickLimiter>();
		ttl = new GMap<World, SpecializedTickLimiter>();

		for(World i : Bukkit.getWorlds())
		{
			try
			{
				witholdWorld(i);
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
		for(World i : Bukkit.getWorlds())
		{
			try
			{
				releaseWorld(i);
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	@EventHandler
	public void on(WorldLoadEvent e)
	{
		try
		{
			witholdWorld(e.getWorld());
		}

		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

	@EventHandler
	public void on(WorldUnloadEvent e)
	{
		try
		{
			releaseWorld(e.getWorld());
		}

		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

	@Override
	public void tick()
	{

	}

	public void witholdWorld(World w) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		Class<?> cworldclass = NMSX.getCBClass("CraftWorld");
		Object theWorld = cworldclass.getMethod("getHandle").invoke(w);
		Field fe = deepFindField(theWorld, "entityLimiter");
		Field ft = deepFindField(theWorld, "tileLimiter");
		SpecializedTickLimiter ste = new SpecializedTickLimiter(50, true);
		SpecializedTickLimiter stt = new SpecializedTickLimiter(50, false);
		fe.setAccessible(true);
		ft.setAccessible(true);
		fe.set(theWorld, ste);
		ft.set(theWorld, stt);
		etl.put(w, ste);
		ttl.put(w, stt);
	}

	public void releaseWorld(World w) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		Class<?> cworldclass = NMSX.getCBClass("CraftWorld");
		Object theWorld = cworldclass.getMethod("getHandle").invoke(w);
		Field fe = deepFindField(theWorld, "entityLimiter");
		Field ft = deepFindField(theWorld, "tileLimiter");
		TickLimiter ste = new TickLimiter(Gate.getEntityTickMax(w));
		TickLimiter stt = new TickLimiter(Gate.getTileTickMax(w));
		fe.setAccessible(true);
		ft.setAccessible(true);
		fe.set(theWorld, ste);
		ft.set(theWorld, stt);
		etl.remove(w);
		ttl.remove(w);
	}

	public double getUniversalEntityTick()
	{
		double mt = 0;

		for(World i : etl.k())
		{
			if(getLastEntityTick(i) < 0)
			{
				continue;
			}

			mt += getLastEntityTick(i);
		}

		return mt;
	}

	public double getUniversalEntityLimit()
	{
		double mt = 0;

		for(World i : etl.k())
		{
			if(getEntityTickLimit(i) < 0)
			{
				continue;
			}

			mt += getEntityTickLimit(i);
		}

		return mt;
	}

	public double getUniversalTileLimit()
	{
		double mt = 0;

		for(World i : etl.k())
		{
			if(getTileTickLimit(i) < 0)
			{
				continue;
			}

			mt += getTileTickLimit(i);
		}

		return mt;
	}

	public double getUniversalTileTick()
	{
		double mt = 0;

		for(World i : ttl.k())
		{
			if(getLastTileTick(i) < 0)
			{
				continue;
			}

			mt += getLastTileTick(i);
		}

		return mt;
	}

	public double getUniversalEntityDroppedTicks()
	{
		double mt = 0;

		for(World i : ttl.k())
		{
			mt += getEntityDroppedTicks(i);
		}

		return mt;
	}

	public double getUniversalTileDroppedTicks()
	{
		double mt = 0;

		for(World i : ttl.k())
		{
			mt += getTileDroppedTicks(i);
		}

		return mt;
	}

	public void setEntityTickLimit(World w, double lim)
	{
		etl.get(w).rMaxTime = lim;
	}

	public void setTileTickLimit(World w, double lim)
	{
		ttl.get(w).rMaxTime = lim;
	}

	public double getEntityTickLimit(World w)
	{
		return etl.get(w).rMaxTime;
	}

	public double getTileTickLimit(World w)
	{
		return ttl.get(w).rMaxTime;
	}

	public double getLastEntityTick(World w)
	{
		return etl.get(w).atimes.getAverage();
	}

	public double getLastTileTick(World w)
	{
		return ttl.get(w).atimes.getAverage();
	}

	public double getEntityDroppedTicks(World w)
	{
		return etl.get(w).adropped.getAverage();
	}

	public double getTileDroppedTicks(World w)
	{
		return ttl.get(w).adropped.getAverage();
	}

	public static Field deepFindField(Object obj, String fieldName)
	{
		Class<?> cls = obj.getClass();

		for(Class<?> acls = cls; acls != null; acls = acls.getSuperclass())
		{
			try
			{
				Field field = acls.getDeclaredField(fieldName);

				return field;
			}

			catch(NoSuchFieldException ex)
			{

			}
		}

		return null;
	}
}
