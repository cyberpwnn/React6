package com.volmit.react.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.spigotmc.SpigotWorldConfig;
import org.spigotmc.TickLimiter;

import com.volmit.react.Config;
import com.volmit.react.E;
import com.volmit.react.Info;
import com.volmit.react.React;
import com.volmit.react.Surge;
import com.volmit.react.util.A;
import com.volmit.react.util.C;
import com.volmit.react.util.Callback;
import com.volmit.react.util.F;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.GSet;
import com.volmit.react.util.M;
import com.volmit.react.util.MSound;
import com.volmit.react.util.NMSX;
import com.volmit.react.util.P;
import com.volmit.react.util.Protocol;
import com.volmit.react.util.S;
import com.volmit.react.util.TICK;
import com.volmit.react.util.TXT;
import com.volmit.react.util.TaskLater;
import com.volmit.react.util.W;

public class Gate
{
	public static int snd = 3;
	private static GMap<String, Integer> defaultSettings = new GMap<String, Integer>();
	private static GSet<Chunk> refresh = new GSet<Chunk>();
	private static GSet<Location> destroy = new GSet<Location>();
	public static int cd = 0;

	public static boolean factions()
	{
		return Bukkit.getServer().getPluginManager().getPlugin("Factions") != null;
	}

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

						for(Object o : new GList<Object>(sel.getPossibilities()).shuffleCopy())
						{
							if(!sel.can(o))
							{
								continue;
							}

							if(M.r(0.1))
							{
								kv += 5;
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

									catch(Throwable e)
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

								catch(Throwable e)
								{

								}
							}
						};
					}

					catch(Throwable e)
					{
						E.t(e);
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

		catch(Throwable e)
		{
			E.t(e);
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

		if(!Surge.isMainThread())
		{
			new S("message")
			{
				@Override
				public void run()
				{
					p.sendMessage(s);
				}
			};
		}

		else
		{
			p.sendMessage(s);
		}

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

	public static GList<CommandSender> broadcastReactUsers()
	{
		GList<CommandSender> s = new GList<CommandSender>();

		for(Player i : Bukkit.getOnlinePlayers())
		{
			if(Permissable.ACCESS.has(i))
			{
				s.add(i);
			}
		}

		s.add(Bukkit.getConsoleSender());

		return s;
	}

	public static String msgSuccess(CommandSender p, String msg)
	{
		String s = msg(p, C.GREEN + "\u2714 " + C.GRAY + msg); //$NON-NLS-1$
		if(p instanceof Player)
		{
			if(snd > 0 && Config.SOUNDS)
			{
				((Player) p).playSound(((Player) p).getLocation(), MSound.SUCCESSFUL_HIT.bukkitSound(), 0.25f, 1.9f);
				snd--;
			}
		}
		return s;
	}

	public static String msgError(CommandSender p, String msg)
	{
		String s = msg(p, C.RED + "\u2718 " + C.GRAY + msg); //$NON-NLS-1$

		if(p instanceof Player)
		{
			if(snd > 0 && Config.SOUNDS)
			{
				((Player) p).playSound(((Player) p).getLocation(), MSound.ENDERDRAGON_HIT.bukkitSound(), 0.25f, 1.9f);
				snd--;
			}
		}

		return s;
	}

	public static String msgActing(CommandSender p, String msg)
	{
		String s = msg(p, C.GOLD + "\u26A0 " + C.GRAY + msg); //$NON-NLS-1$

		if(p instanceof Player)
		{
			if(snd > 0 && Config.SOUNDS)
			{
				((Player) p).playSound(((Player) p).getLocation(), MSound.CHICKEN_EGG_POP.bukkitSound(), 0.15f, 1.9f);
				snd--;
			}
		}

		return s;
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
				if(!P.isWithinViewDistance(c))
				{
					return c.unload();
				}
			}

			return false;
		}

		catch(Throwable e)
		{
			E.t(e);
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

		if(e.getType().equals(EntityType.ITEM_FRAME) && !b)
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

		if(e.getType().equals(EntityType.ITEM_FRAME))
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

	public static void updateBlock(Block block)
	{
		React.instance.featureController.updateBlock(block);
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
	}

	@SuppressWarnings("deprecation")
	public static void refreshChunks()
	{
		refresh.clear();

		for(Player j : Bukkit.getOnlinePlayers())
		{
			for(Location i : destroy)
			{
				if(j.getWorld().equals(i.getWorld()))
				{
					if(j.getLocation().distanceSquared(i) <= Math.pow(Bukkit.getViewDistance() * 16, 2))
					{
						j.sendBlockChange(i, 0, (byte) 0);
					}
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
