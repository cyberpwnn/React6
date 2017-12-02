package react;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Hopper;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GMap;
import org.spigotmc.SpigotWorldConfig;
import org.spigotmc.TickLimiter;

import react.api.ActivationRangeType;
import surge.nms.NMSX;
import surge.util.C;
import surge.util.D;
import surge.util.TXT;

public class Gate
{
	private static GMap<String, Integer> defaultSettings = new GMap<String, Integer>();

	public static void tickEntityNextTickListTick(World world) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		Class<?> cworldclass = NMSX.getCBClass("CraftWorld");
		Object theWorld = cworldclass.getMethod("getHandle").invoke(world);
		Field f = deepFindField(theWorld, "entityLimiter");
		f.setAccessible(true);
		TickLimiter tl = (TickLimiter) f.get(theWorld);
		Field ff = tl.getClass().getDeclaredField("maxTime");
		ff.setAccessible(true);
		int maxTime = (int) ff.get(tl);

		if(maxTime > 1 && tl.shouldContinue())
		{
			tweakEntityTickMax(world, maxTime - 1);
		}

		if(TICK.tick % 40 == 0)
		{
			if(maxTime < 50 && !tl.shouldContinue())
			{
				tweakEntityTickMax(world, maxTime + 1);
			}
		}
	}

	public static void resetEntityMaxTick(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		if(defaultSettings.containsKey(world.getName() + "-entitymaxtick"))
		{
			tweakEntityTickMax(world, defaultSettings.get(world.getName() + "-entitymaxtick"));
		}
	}

	public static int getEntityTickMax(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		return getSpigotConfig(world).entityMaxTickTime;
	}

	public static int getTileTickMax(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		return getSpigotConfig(world).tileMaxTickTime;
	}

	public static void tweakEntityTickMax(World world, int tt) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		SpigotWorldConfig wc = getSpigotConfig(world);

		if(!defaultSettings.containsKey(world.getName() + "-entitymaxtick"))
		{
			defaultSettings.put(world.getName() + "-entitymaxtick", getEntityTickMax(world));
		}

		wc.entityMaxTickTime = tt;
		forceSet(wc, "max-tick-time.entity", tt);
		Class<?> cworldclass = NMSX.getCBClass("CraftWorld");
		Object theWorld = cworldclass.getMethod("getHandle").invoke(world);
		Field f = deepFindField(theWorld, "entityLimiter");

		if(f != null)
		{
			f.setAccessible(true);
			f.set(theWorld, new TickLimiter(tt));
		}

		D.v("Entity Cap: " + tt);
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

	public static void forceSet(SpigotWorldConfig v, String key, Object value) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException
	{
		Field f = v.getClass().getDeclaredField("config");
		f.setAccessible(true);
		YamlConfiguration fc = (YamlConfiguration) f.get(v);
		fc.set("world-settings.default." + key, value);
	}

	public static int getActivationRange(World world, ActivationRangeType type) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		switch(type)
		{
			case ANIMALS:
				return getSpigotConfig(world).animalActivationRange;
			case MISC:
				return getSpigotConfig(world).miscActivationRange;
			case MONSTERS:
				return getSpigotConfig(world).monsterActivationRange;
			default:
				break;
		}

		return -1;
	}

	public static void resetActivationRange(World world, ActivationRangeType type) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		if(defaultSettings.containsKey(world.getName() + "-" + type.toString()))
		{
			tweakActivationRange(world, type, defaultSettings.get(world.getName() + "-" + type.toString()));
		}
	}

	public static void tweakActivationRange(World world, ActivationRangeType type, int distance) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		SpigotWorldConfig conf = getSpigotConfig(world);

		if(!defaultSettings.containsKey(world.getName() + "-" + type.toString()))
		{
			defaultSettings.put(world.getName() + "-" + type.toString(), getActivationRange(world, type));
		}

		switch(type)
		{
			case ANIMALS:
				conf.animalActivationRange = distance;
			case MISC:
				conf.miscActivationRange = distance;
			case MONSTERS:
				conf.monsterActivationRange = distance;
			default:
				break;
		}
	}

	public static SpigotWorldConfig getSpigotConfig(World world) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		Class<?> cworldclass = NMSX.getCBClass("CraftWorld");
		Object theWorld = cworldclass.getMethod("getHandle").invoke(world);
		SpigotWorldConfig wc = (SpigotWorldConfig) theWorld.getClass().getField("spigotConfig").get(theWorld);

		return wc;
	}

	public static String msg(CommandSender p, String msg)
	{
		String s = TXT.makeTag(C.AQUA, C.DARK_GRAY, C.GRAY, Info.CORE_NAME) + msg;
		p.sendMessage(s);

		return s;
	}

	public static String msgRAI(CommandSender p, String msg)
	{
		String s = TXT.makeTag(C.AQUA, C.DARK_GRAY, C.GRAY, "RAI") + msg;
		p.sendMessage(s);

		return s;
	}

	public static String msgSuccess(CommandSender p, String msg)
	{
		return msg(p, C.GREEN + "\u2714 " + C.GRAY + msg);
	}

	public static String msgError(CommandSender p, String msg)
	{
		return msg(p, C.RED + "\u2718 " + C.GRAY + msg);
	}

	public static String msgActing(CommandSender p, String msg)
	{
		return msg(p, C.GOLD + "\u26A0 " + C.GRAY + msg);
	}

	public static boolean unloadChunk(Chunk c)
	{
		try
		{
			return c.unload();
		}

		catch(Exception e)
		{
			D.f("Failed to unload a chunk " + e.getMessage());
			return false;
		}
	}

	public static void unloadChunk(World w, int x, int z)
	{
		w.unloadChunk(x, z);
	}

	private static void removeEntity(Entity e)
	{
		if(e instanceof Player)
		{
			return;
		}

		e.remove();
	}

	public static void purgeEntity(Entity e)
	{
		if(!Config.ALLOW_PURGE.contains(e.getType().toString()))
		{
			return;
		}

		removeEntity(e);
	}

	public static void cullEntity(Entity e)
	{
		if(!Config.ALLOW_CULL.contains(e.getType().toString()))
		{
			return;
		}

		removeEntity(e);
	}

	public static void cachedEntity(Entity e)
	{
		if(!Config.ALLOW_CACHE.contains(e.getType().toString()))
		{
			return;
		}

		removeEntity(e);
	}

	public static void cacheEntity(Entity e)
	{
		if(e instanceof Player)
		{
			return;
		}

		if(!Config.ALLOW_CACHE.contains(e.getType().toString()))
		{
			return;
		}

		React.instance.entityCacheController.pop(e);
	}

	public static int restoreEntities(Chunk chunk)
	{
		return React.instance.entityCacheController.push(chunk);
	}

	@SuppressWarnings("deprecation")
	public static void updateBlock(Block block)
	{
		ItemStack[] cont = null;

		if(block.getState() instanceof Hopper)
		{
			cont = ((Hopper) block.getState()).getInventory().getContents();
			((Hopper) block.getState()).getInventory().clear();
		}

		int id = block.getTypeId();
		byte byt = block.getData();
		block.setTypeIdAndData(1, (byte) 0, false);
		block.setTypeIdAndData(id, byt, true);

		if(block.getState() instanceof Hopper)
		{
			((Hopper) block.getState()).getInventory().setContents(cont);
		}
	}

	public static String header(String string, C color)
	{
		int maxLength = 48;
		int left = string.length() + 2;
		int of = (maxLength - left) / 2;

		return TXT.line(color, of) + C.RESET + " " + string + " " + C.RESET + TXT.line(color, of);
	}

	public static String header(C color)
	{
		return TXT.line(color, 48);
	}

	@SuppressWarnings("deprecation")
	public static void updateFluid(Block block)
	{
		int id = block.getTypeId();
		byte byt = block.getData();
		block.setTypeIdAndData(block.getTypeId(), (byte) 0, false);
		block.setTypeIdAndData(id, byt, true);

	}
}
