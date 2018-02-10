package react;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Hopper;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.Callback;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;
import org.cyberpwn.gmath.M;
import org.spigotmc.SpigotWorldConfig;
import org.spigotmc.TickLimiter;

import react.api.ActivationRangeType;
import react.api.Flavor;
import react.api.ReactPlayer;
import react.api.SelectorPosition;
import react.notification.Notification;
import surge.nms.NMSX;
import surge.sched.TaskLater;
import surge.util.C;
import surge.util.D;
import surge.util.Protocol;
import surge.util.TXT;
import surge.util.W;

public class Gate
{
	private static GMap<String, Integer> defaultSettings = new GMap<String, Integer>();
	private static GSet<Chunk> refresh = new GSet<Chunk>();
	private static GSet<Location> destroy = new GSet<Location>();

	public static void fixLighting(SelectorPosition sel, Callback<Integer> cb, Callback<Double> prog)
	{
		new A()
		{
			@Override
			public void run()
			{
				if(hasFawe())
				{
					try
					{
						Class<?> vectorClass = Class.forName("com.sk89q.worldedit.Vector"); //$NON-NLS-1$
						Class<?> cuboidClass = Class.forName("com.sk89q.worldedit.regions.CuboidRegion"); //$NON-NLS-1$
						Class<?> regionClass = Class.forName("com.sk89q.worldedit.regions.Region"); //$NON-NLS-1$
						Class<?> faweapClass = Class.forName("com.boydti.fawe.FaweAPI"); //$NON-NLS-1$
						Constructor<?> cuboidConstruct = cuboidClass.getConstructor(vectorClass, vectorClass);
						Constructor<?> vectorConstruct = vectorClass.getConstructor(int.class, int.class, int.class);
						Method faweFixMethod = faweapClass.getMethod("fixLighting", String.class, regionClass); //$NON-NLS-1$
						Integer[] total = {0};
						Integer[] sof = {0};
						Integer tot = sel.getPossibilities().size();
						int kv = 0;
						for(Object o : sel.getPossibilities())
						{
							if(!sel.can(o))
							{
								continue;
							}

							if(M.r(0.05))
							{
								kv += 2;
							}

							new TaskLater("fq-chunkwait", kv)
							{
								@Override
								public void run()
								{
									try
									{
										Chunk c = (Chunk) o;

										if(Config.getWorldConfig(c.getWorld()).allowRelighting)
										{
											Object vector1 = vectorConstruct.newInstance(c.getX() << 4, 0, c.getZ() << 4);
											Object vector2 = vectorConstruct.newInstance(16 + (c.getX() << 4), 256, 16 + (c.getZ() << 4));
											Object cuboid = cuboidConstruct.newInstance(vector1, vector2);
											Object ret = faweFixMethod.invoke(null, c.getWorld().getName(), cuboid);
											total[0] += (int) ret;
											sof[0]++;
											prog.run(sof[0].doubleValue() / tot.doubleValue());
										}
									}

									catch(Exception e)
									{

									}
								}
							};
						}

						new TaskLater("fq-chunkwait-finish", kv)
						{
							@Override
							public void run()
							{
								try
								{
									prog.run(1.0);
									cb.run(total[0]);
								}

								catch(Exception e)
								{

								}
							}
						};
					}

					catch(Exception e)
					{
						e.printStackTrace();
						prog.run(1.0);
						cb.run(-1);
						return;
					}
				}
			}
		};
	}

	public static Player whoLoaded(Chunk c)
	{
		try
		{
			if(c.isLoaded())
			{
				for(Entity i : c.getEntities())
				{
					if(i instanceof Player)
					{
						return (Player) i;
					}
				}

				for(int i = 1; i < Bukkit.getViewDistance() + 1; i++)
				{
					for(Chunk j : W.chunkRadius(c, i + 1))
					{
						for(Entity k : j.getEntities())
						{
							if(k instanceof Player)
							{
								return (Player) k;
							}
						}
					}
				}
			}
		}

		catch(Exception e)
		{

		}

		return null;
	}

	public static int getChunkCountForView()
	{
		return (int) Math.pow((Bukkit.getViewDistance() * 2) + 1, 2);
	}

	public static int getMaxChunksForView()
	{
		return (getChunkCountForView()) * (Bukkit.getOnlinePlayers().size() + 1);
	}

	public static boolean hasFawe()
	{
		return Bukkit.getPluginManager().getPlugin("FastAsyncWorldEdit") != null; //$NON-NLS-1$
	}

	public static void tickEntityNextTickListTick(World world) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		Class<?> cworldclass = NMSX.getCBClass("CraftWorld"); //$NON-NLS-1$
		Object theWorld = cworldclass.getMethod("getHandle").invoke(world); //$NON-NLS-1$
		Field f = deepFindField(theWorld, "entityLimiter"); //$NON-NLS-1$
		f.setAccessible(true);
		TickLimiter tl = (TickLimiter) f.get(theWorld);
		Field ff = tl.getClass().getDeclaredField("maxTime"); //$NON-NLS-1$
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
		if(defaultSettings.containsKey(world.getName() + "-entitymaxtick")) //$NON-NLS-1$
		{
			tweakEntityTickMax(world, defaultSettings.get(world.getName() + "-entitymaxtick")); //$NON-NLS-1$
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

		if(!defaultSettings.containsKey(world.getName() + "-entitymaxtick")) //$NON-NLS-1$
		{
			defaultSettings.put(world.getName() + "-entitymaxtick", getEntityTickMax(world)); //$NON-NLS-1$
		}

		wc.entityMaxTickTime = tt;
		forceSet(wc, "max-tick-time.entity", tt); //$NON-NLS-1$
		Class<?> cworldclass = NMSX.getCBClass("CraftWorld"); //$NON-NLS-1$
		Object theWorld = cworldclass.getMethod("getHandle").invoke(world); //$NON-NLS-1$
		Field f = deepFindField(theWorld, "entityLimiter"); //$NON-NLS-1$

		if(f != null)
		{
			f.setAccessible(true);
			f.set(theWorld, new TickLimiter(tt));
		}
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
		Field f = v.getClass().getDeclaredField("config"); //$NON-NLS-1$
		f.setAccessible(true);
		YamlConfiguration fc = (YamlConfiguration) f.get(v);
		fc.set("world-settings.default." + key, value); //$NON-NLS-1$
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
		if(defaultSettings.containsKey(world.getName() + "-" + type.toString())) //$NON-NLS-1$
		{
			tweakActivationRange(world, type, defaultSettings.get(world.getName() + "-" + type.toString())); //$NON-NLS-1$
		}
	}

	public static void tweakActivationRange(World world, ActivationRangeType type, int distance) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException
	{
		SpigotWorldConfig conf = getSpigotConfig(world);

		if(!defaultSettings.containsKey(world.getName() + "-" + type.toString())) //$NON-NLS-1$
		{
			defaultSettings.put(world.getName() + "-" + type.toString(), getActivationRange(world, type)); //$NON-NLS-1$
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
		Class<?> cworldclass = NMSX.getCBClass("CraftWorld"); //$NON-NLS-1$
		Object theWorld = cworldclass.getMethod("getHandle").invoke(world); //$NON-NLS-1$
		SpigotWorldConfig wc = (SpigotWorldConfig) theWorld.getClass().getField("spigotConfig").get(theWorld); //$NON-NLS-1$

		return wc;
	}

	public static String msg(CommandSender p, String msg)
	{
		String s = TXT.makeTag(C.AQUA, C.DARK_GRAY, C.GRAY, Info.CORE_NAME) + msg;
		p.sendMessage(s);

		return s;
	}

	public static String msg(ReactPlayer p, Notification n)
	{
		String s = TXT.makeTag(C.AQUA, C.DARK_GRAY, C.GRAY, Info.CORE_NAME + " - " + C.WHITE + F.capitalizeWords(n.getType().toString().toLowerCase())) + n.getMessage();
		p.getP().sendMessage(s);

		return s;
	}

	public static String msgRAI(CommandSender p, String msg)
	{
		String s = TXT.makeTag(C.AQUA, C.DARK_GRAY, C.GRAY, "RAI") + msg; //$NON-NLS-1$
		p.sendMessage(s);

		return s;
	}

	public static String msgSuccess(CommandSender p, String msg)
	{
		return msg(p, C.GREEN + "\u2714 " + C.GRAY + msg); //$NON-NLS-1$
	}

	public static String msgError(CommandSender p, String msg)
	{
		return msg(p, C.RED + "\u2718 " + C.GRAY + msg); //$NON-NLS-1$
	}

	public static String msgActing(CommandSender p, String msg)
	{
		return msg(p, C.GOLD + "\u26A0 " + C.GRAY + msg); //$NON-NLS-1$
	}

	public static boolean isBadForUnloading()
	{
		return Flavor.getHostFlavor().equals(Flavor.PAPER_SPIGOT) && Protocol.EARLIEST.to(Protocol.R1_8_9).contains(Protocol.getProtocolVersion());
	}

	public static boolean canUnload(World w, int x, int z)
	{
		return !isBadForUnloading();
	}

	public static boolean unloadChunk(Chunk c)
	{
		try
		{
			if(!Config.getWorldConfig(c.getWorld()).allowActions)
			{
				return false;
			}

			if(canUnload(c.getWorld(), c.getX(), c.getZ()))
			{
				return c.unload();
			}

			return false;
		}

		catch(Exception e)
		{
			D.f(Lang.getString("message.fail.unload-chunk") + e.getMessage()); //$NON-NLS-1$
			return false;
		}
	}

	public static void unloadChunk(World w, int x, int z)
	{
		if(!canUnload(w, x, z))
		{
			return;
		}

		if(!Config.getWorldConfig(w).allowActions)
		{
			return;
		}

		w.unloadChunk(x, z);
	}

	private static void removeEntity(Entity e)
	{
		if(e.getType().equals(EntityType.ARMOR_STAND))
		{
			return;
		}

		if(e instanceof Player)
		{
			return;
		}

		if(Config.getWorldConfig(e.getWorld()).assumeNoSideEffectsEntities.contains(e.getType().toString()))
		{
			return;
		}

		e.remove();
	}

	public static void purgeEntity(Entity e)
	{
		purgeEntity(e, false);
	}

	public static void purgeEntity(Entity e, boolean b)
	{
		if(e.getType().equals(EntityType.ARMOR_STAND) && !b)
		{
			return;
		}

		if(Config.getWorldConfig(e.getWorld()).assumeNoSideEffectsEntities.contains(e.getType().toString()) && !b)
		{
			return;
		}

		if(!Config.ALLOW_PURGE.contains(e.getType().toString()) && !b)
		{
			return;
		}

		if(e.getType().equals(EntityType.PLAYER))
		{
			return;
		}

		if(b)
		{
			e.remove();
		}

		else
		{
			removeEntity(e);
		}
	}

	public static void cullEntity(Entity e)
	{
		if(!Config.CULLING_ENABLED)
		{
			return;
		}

		if(e.getType().equals(EntityType.ARMOR_STAND))
		{
			return;
		}

		if(Config.getWorldConfig(e.getWorld()).assumeNoSideEffectsEntities.contains(e.getType().toString()))
		{
			return;
		}

		if(!Config.ALLOW_CULL.contains(e.getType().toString()))
		{
			return;
		}

		removeEntity(e);
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

		return TXT.line(color, of) + C.RESET + " " + string + " " + C.RESET + TXT.line(color, of); //$NON-NLS-1$ //$NON-NLS-2$
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

	public static void refresh(Chunk chunk)
	{
		refresh.add(chunk);
	}

	@SuppressWarnings("deprecation")
	public static void refreshChunks()
	{
		for(Chunk i : refresh)
		{
			i.getWorld().refreshChunk(i.getX(), i.getZ());
		}

		refresh.clear();

		for(Player j : Bukkit.getOnlinePlayers())
		{
			for(Location i : destroy)
			{
				if(j.getWorld().equals(i.getWorld()))
				{
					j.sendBlockChange(i, 0, (byte) 0);
				}
			}
		}

		destroy.clear();
	}

	public static void sendBlockChange(Location l)
	{
		destroy.add(l);
	}
}
