package com.volmit.react;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import com.volmit.react.api.Clip;
import com.volmit.react.api.Experimental;
import com.volmit.react.api.Gate;
import com.volmit.react.api.Injection;
import com.volmit.react.api.InjectionMethod;
import com.volmit.react.api.Key;
import com.volmit.react.api.WorldConfig;
import com.volmit.react.util.D;
import com.volmit.react.util.DataCluster;
import com.volmit.react.util.DynamicConfiguration;
import com.volmit.react.util.DynamicTracker;
import com.volmit.react.util.F;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.GSound;
import com.volmit.react.util.M;
import com.volmit.react.util.MSound;
import com.volmit.react.util.PoolCount;
import com.volmit.react.util.PoolDescriber;
import com.volmit.react.util.PoolNanoThrottle;
import com.volmit.react.util.RawEvent;
import com.volmit.react.util.YamlDataInput;
import com.volmit.react.util.YamlDataOutput;

@PoolDescriber
@DynamicConfiguration
public class Config
{
	private static final GMap<World, WorldConfig> worldConfigs = new GMap<World, WorldConfig>();

	@Key("tweaks.explosions.max-explosions-milliseconds")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 10000)
	public static double MAX_EXPLOSION_MS = 5;

	@Key("tweaks.redstone.dynamic-clocking")
	@Injection(InjectionMethod.SWAP)
	public static boolean REDSTONE_DYNAMIC_CLOCK = false;

	@Key("features.react.command-overrides.tps")
	@Injection(InjectionMethod.SWAP)
	public static boolean COMMANDOVERRIDES_TPS = true;

	@Key("features.react.sampler.sample-viewport")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 6000, max = 30000)
	public static int SAMPLE_VIEWPORT = 12000;

	@Key("features.react.rai.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI = true;

	@Key("features.entity-stacker.max-stack-size")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2, max = 256)
	public static int ENTITY_STACK_MAX_COUNT = 16;

	@Key("threads.pool-size")
	@Injection(InjectionMethod.RELOAD)
	@Clip(min = 1, max = 4)
	@PoolCount
	@Experimental
	public static int POOL_MAXTHREADS = 2;

	@Key("threads.nano-mitigation")
	@Injection(InjectionMethod.SUBSTRATE)
	@Clip(min = 1000000, max = 50000000)
	@PoolNanoThrottle
	@Experimental
	public static long POOL_SYNC_NANOS = 1500000;

	@Key("features.entity-culler.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean CULLING_ENABLED = true;

	@Key("tweaks.fast-leaf-decay.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_ENABLED = true;

	@Key("tweaks.fast-leaf-decay.trigger-on-decay")
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_ONDECAY = true;

	@Key("tweaks.fast-leaf-decay.instantaneous")
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_INSTANT = false;

	@Key("tweaks.fast-leaf-decay.decay-period")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2, max = 200)
	public static int FASTLEAF_DECAYPERIOD = 5;

	@Key("features.react.command-overrides.memory")
	@Injection(InjectionMethod.SWAP)
	public static boolean COMMANDOVERRIDES_MEMORY = true;

	@Key("features.entity-stacker.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITYSTACK_ENABLED = false;

	@Key("features.entity-stacker.minimum-group-size")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 16)
	public static int ENTITYSTACK_MINIMUM_GROUP = 6;

	@Key("features.entity-stacker.search-radius")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 4, max = 16)
	public static int ENTITYSTACK_GROUP_SEARCH_RADIUS = 6;

	@Key("features.entity-stacker.max-health")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 2000)
	@Experimental
	public static int ENTITYSTACK_MAXIMUM_HEALTH = 2000;

	@Key("features.glass.display-blocks")
	@Injection(InjectionMethod.SWAP)
	public static boolean GLASS_SHOW_BLOCKS = false;

	@Key("features.glass.display-particles")
	@Injection(InjectionMethod.SWAP)
	public static boolean GLASS_SHOW_PARTICLES = true;

	@Key("entity-types.allow-culling")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_CULL = getDefaultEntitiesForCulling();

	@Key("entity-types.allow-purging")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_PURGE = getDefaultEntitiesForRemoval();

	@Key("entity-types.allow-stacking")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_STACKING = getDefaultEntitiesForStacking();

	@Key("entity-types.culling-rules")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> CULL_RULES = getDefaultCullRules();

	@Key("rai.tps.high-tick")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 20.0, max = 70.0)
	public static double RAI_TPS_HIGH_TICK = 50.0;

	@Key("rai.redstone.time-floor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_REDSTONE_TIME_FLOOR = 2000000;

	@Key("rai.redstone.time-ceil")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_REDSTONE_TIME_CEIL = 30000000;

	@Key("rai.redstone.time-mudding")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_REDSTONE_TIME_MUDDING = 2360000;

	@Key("rai.redstone.time-function")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_REDSTONE_TIME_FUNCTION = 0.36;

	@Key("rai.redstone.time-overbleed")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_REDSTONE_TIME_OVERBLEED = 1.54;

	@Key("rai.redstone.time-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_REDSTONE_TIME_RADIUS = 1;

	@Key("rai.redstone.time-propagation")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_REDSTONE_TIME_PROPIGATION = 1000;

	@Key("rai.hopper.time-floor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_HOPPER_TIME_FLOOR = 2000000;

	@Key("rai.hopper.time-ceil")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_HOPPER_TIME_CEIL = 30000000;

	@Key("rai.hopper.time-mudding")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_HOPPER_TIME_MUDDING = 2360000;

	@Key("rai.hopper.time-function")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_HOPPER_TIME_FUNCTION = 0.16;

	@Key("rai.hopper.time-overbleed")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_HOPPER_TIME_OVERBLEED = 1.54;

	@Key("rai.hopper.time-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_HOPPER_TIME_RADIUS = 1;

	@Key("rai.hopper.time-propagation")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_HOPPER_TIME_PROPIGATION = 1000;

	@Key("rai.entity.chunk-multiplier")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 5)
	public static int RAI_ENTITY_CHUNK_MULTIPLIER = 2;

	@Key("rai.entity.chunk-clusterer")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 20, max = 100)
	public static int RAI_ENTITY_CHUNK_CLUSTERIZER = 30;

	@Key("rai.entity.chunk-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_ENTITY_CHUNK_RADIUS = 2;

	@Key("rai.fluid.time-floor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_FLUID_TIME_FLOOR = 2000000;

	@Key("rai.fluid.time-ceil")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_FLUID_TIME_CEIL = 30000000;

	@Key("rai.fluid.time-mudding")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_FLUID_TIME_MUDDING = 2360000;

	@Key("rai.fluid.time-function")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_FLUID_TIME_FUNCTION = 0.36;

	@Key("rai.fluid.time-overbleed")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_FLUID_TIME_OVERBLEED = 1.54;

	@Key("rai.fluid.time-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_FLUID_TIME_RADIUS = 2;

	@Key("rai.fluid.time-propagation")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_FLUID_TIME_PROPIGATION = 1000;

	@Key("features.tick-smearing.entities.max-time")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 100)
	public static double SMEAR_TICK_ENTITIES_MAX_TICK = 25;

	@Key("features.tick-smearing.tiles.max-time")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 100)
	public static double SMEAR_TICK_TILES_MAX_TICK = 35;

	@Key("features.tick-smearing.entities.seperation-bias")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0, max = 10)
	public static double SMEAR_TICK_ENTITIES_SEPERATION_BIAS = 0.65;

	@Key("features.tick-smearing.tiles.seperation-bias")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0, max = 10)
	public static double SMEAR_TICK_TILES_SEPERATION_BIAS = 0.07;

	@Key("features.tick-smearing.entities.smear-factor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 5, max = 100)
	public static double SMEAR_TICK_ENTITIES_AMOUNT = 50;

	@Key("features.tick-smearing.tiles.smear-factor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 5, max = 100)
	public static double SMEAR_TICK_TILES_AMOUNT = 50;

	@Key("features.tick-smearing.entities.enable")
	@Injection(InjectionMethod.SWAP)
	public static boolean SMEAR_TICK_ENTITIES_ENABLE = true;

	@Key("features.tick-smearing.tiles.enable")
	@Injection(InjectionMethod.SWAP)
	public static boolean SMEAR_TICK_TILES_ENABLE = true;

	@Key("tweaks.hoppers.reduce-overtick-hoppers")
	@Injection(InjectionMethod.SWAP)
	public static boolean HOPPER_OVERTICK_ENABLE = true;

	@Key("features.react.worlds.world-configs")
	@Injection(InjectionMethod.SWAP)
	public static boolean USE_WORLD_CONFIGS = true;

	@Key("features.entity-stacker.options.show-particles")
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITY_STACKER_SHOW_PARTICLES = true;

	@Key("features.entity-stacker.options.show-nametag")
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITY_STACKER_SHOW_NAME_TAG = false;

	@Key("features.react.language")
	@Injection(InjectionMethod.SWAP)
	public static String LANGUAGE = "enUS";

	@Key("rai.chunk.time-floor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_CHUNK_TIME_FLOOR = 2000000;

	@Key("rai.chunk.time-ceil")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_CHUNK_TIME_CEIL = 30000000;

	@Key("rai.chunk.time-mudding")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_CHUNK_TIME_MUDDING = 2360000;

	@Key("rai.chunk.time-function")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_CHUNK_TIME_FUNCTION = 0.36;

	@Key("rai.chunk.time-overbleed")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_CHUNK_TIME_OVERBLEED = 1.54;

	@Key("rai.chunk.time-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_CHUNK_TIME_RADIUS = 2;

	@Key("rai.chunk.time-propagation")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_CHUNK_TIME_PROPIGATION = 1000;

	@Key("rai.chunk.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_CHUNK_TIME_PROPIGATE = true;

	@Key("rai.fluid.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_FLUID_TIME_PROPIGATE = true;

	@Key("rai.entity.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_ENTITY_PROPIGATE = true;

	@Key("rai.hopper.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_HOPPER_TIME_PROPIGATE = true;

	@Key("rai.redstone.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_REDSTONE_TIME_PROPIGATE = true;

	@Key("features.entity-stacker.options.nametag-format")
	@Injection(InjectionMethod.SWAP)
	public static String ENTITY_STACKER_NAME_TAG_FORMAT = "&e%size%x &a%type% &c%hp%";

	@Key("tweaks.fast-leaf-decay.max-ms")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.1, max = 50.0)
	public static double FAST_LEAF_MAX_MS = 0.8;

	@Key("tweaks.nms.chunk-update-interval")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 20)
	public static int NMS_CHUNK_UPDATE_INTERVAL = 8;

	@Key("tweaks.explosions.throttle-explosions")
	@Injection(InjectionMethod.SWAP)
	public static boolean THROTTLE_EXPLOSIONS = true;

	@Key("tweaks.explosions.throttled-ratio")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.0, max = 0.9)
	public static double THROTTLED_RATIO = 0.65;

	@Key("tweaks.fast-growth.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_GROWTH = true;

	@Key("tweaks.explosions.fast-block-destruction")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_EXPLOSIONS = false;

	@Key("tweaks.drops.fast-drop-items")
	@Injection(InjectionMethod.SWAP)
	public static boolean DROPS_INSTADROP = false;

	@Key("tweaks.xp.fast-drop-xp")
	@Injection(InjectionMethod.SWAP)
	public static boolean SKIP_ORBS = true;

	@Key("tweaks.xp.fast-xp-pickup")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_ORB_PICKUP = false;

	@Key("tweaks.drops.teleport-to-source")
	@Injection(InjectionMethod.SWAP)
	public static boolean DROPS_TELEPORT = false;

	@Key("tweaks.drops.despawn-useless-arrows")
	@Injection(InjectionMethod.SWAP)
	public static boolean DESPAWN_USELESS_ARROWS = true;

	@Key("tweaks.factions-compat")
	@Injection(InjectionMethod.SWAP)
	public static boolean FACTIONS = true;

	@Key("tweaks.chunks.purge-interval")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 200, max = 12000)
	public static int PURGE_INTERVAL = 1200;

	@Key("tweaks.chunks.purge-enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean PURGE = true;

	@Key("features.react.interaction-sounds")
	@Injection(InjectionMethod.SWAP)
	public static boolean SOUNDS = true;

	@Key("features.react.allow-tempaccess")
	@Injection(InjectionMethod.SWAP)
	public static boolean ALLOW_TEMPACCESS = true;

	@Key("features.react.track-server-locks")
	@Injection(InjectionMethod.SWAP)
	public static boolean TRACK_SERVER_LOCKS = true;

	@Key("tweaks.fast-leaf-decay.fast-destroy")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_LEAF_NMS = true;

	@Key("features.react.monitor.double-sneak-lock")
	@Injection(InjectionMethod.SWAP)
	public static boolean DOUBLE_LOCK_SNEAK = true;

	@Key("features.react.monitor.fast-ping")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_PING = true;

	private static boolean hrld = false;
	private static boolean rns = false;
	private static boolean rrl = false;
	private static DataCluster defaultMain;
	private static DataCluster defaultExp;

	public static void setup() throws IllegalArgumentException, IllegalAccessException
	{
		defaultMain = defaultConfig(false);
		defaultExp = defaultConfig(true);
	}

	public static void resetConfigs() throws IllegalArgumentException, IllegalAccessException
	{
		read(defaultMain, false);
		read(defaultExp, true);
		doSave();
	}

	public static void doSave() throws IllegalArgumentException, IllegalAccessException
	{
		Plugin main = Surge.getAmp().getPluginInstance();
		onRead(main);
		File fConfig = new File(main.getDataFolder(), "config.yml"); //$NON-NLS-1$
		File fConfigExperimental = new File(main.getDataFolder(), "config-experimental.yml"); //$NON-NLS-1$
		new YamlDataOutput().write(defaultConfig(false), fConfig);
		new YamlDataOutput().write(defaultConfig(true), fConfigExperimental);
		onRead(main);
	}

	@DynamicTracker
	public static void doTrack(Plugin main)
	{
		File fConfig = new File(main.getDataFolder(), "config.yml"); //$NON-NLS-1$
		File fConfigExperimental = new File(main.getDataFolder(), "config-experimental.yml"); //$NON-NLS-1$

		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				Surge.getHotloadManager().untrack(fConfig);
				Surge.getHotloadManager().untrack(fConfigExperimental);
				onRead(main);
				doTrack(main);

				for(CommandSender i : Gate.broadcastReactUsers())
				{
					Gate.msgSuccess(i, "Configuration Reloaded (changes detected)");

					if(i instanceof Player)
					{
						new GSound(MSound.LAVA_POP.bukkitSound(), 0.5f, 1.9f).play((Player) i);
					}
				}
			}
		};

		Surge.getHotloadManager().track(fConfig, r);
		Surge.getHotloadManager().track(fConfigExperimental, r);
	}

	@RawEvent
	public static void onRead(Plugin main)
	{
		File fConfig = new File(main.getDataFolder(), "config.yml"); //$NON-NLS-1$
		File fConfigExperimental = new File(main.getDataFolder(), "config-experimental.yml"); //$NON-NLS-1$

		try
		{
			read(fConfig, false);
		}

		catch(Throwable e)
		{
			E.t(e);
		}

		try
		{
			read(fConfigExperimental, true);
		}

		catch(Throwable e)
		{
			E.t(e);
		}
	}

	private static void read(File in, boolean experimental) throws IllegalArgumentException, IllegalAccessException
	{
		if(!in.exists())
		{
			new YamlDataOutput().write(defaultConfig(experimental), in);
		}

		new YamlDataOutput().write(read(new YamlDataInput().read(in), experimental), in);

		try
		{
			if(hrld)
			{
				if(rrl)
				{
					Main.reload();
					hrld = false;
				}

				else if(rns)
				{
					Main.requestResetNanos();
				}
			}
		}

		catch(Throwable e)
		{
			E.t(e);
		}

		hrld = true;
	}

	public static WorldConfig getWorldConfig(World w)
	{
		if(!worldConfigs.containsKey(w))
		{
			WorldConfig wc = new WorldConfig();
			wc.load(w);
			worldConfigs.put(w, wc);
			wc.save(w);

			Surge.getHotloadManager().track(wc.getConfigFile(w), new Runnable()
			{
				@Override
				public void run()
				{
					wc.load(w);
				}
			});
		}

		return worldConfigs.get(w);
	}

	public static void closeWorldConfig(World w)
	{
		if(!worldConfigs.containsKey(w))
		{
			return;
		}

		Surge.getHotloadManager().untrack(worldConfigs.get(w).getConfigFile(w));
		worldConfigs.get(w).save(w);
		worldConfigs.remove(w);
	}

	@SuppressWarnings("unchecked")
	private static DataCluster read(DataCluster in, boolean experimental) throws IllegalArgumentException, IllegalAccessException
	{
		DataCluster cc = new DataCluster();

		for(Field i : Config.class.getDeclaredFields())
		{
			if((i.isAnnotationPresent(Experimental.class) && experimental) || (!i.isAnnotationPresent(Experimental.class) && !experimental))
			{
				if(!i.isAnnotationPresent(Key.class))
				{
					continue;
				}

				String key = i.getAnnotation(Key.class).value();

				if(key == null)
				{
					D.w(Lang.getString("messages.fail.find-key-for-field") + i.getName()); //$NON-NLS-1$
					continue;
				}

				boolean applied = false;

				for(String j : in.keys())
				{
					if(j.equals(key))
					{
						applied = true;

						if(i.isAnnotationPresent(Clip.class))
						{
							try
							{
								Clip c = i.getAnnotation(Clip.class);

								if(i.getType().equals(Integer.class) || i.getType().equals(int.class))
								{
									i.set(null, (int) M.clip(in.getInt(j), c.min(), c.max()));
									cc.set(key, (int) M.clip(in.getInt(j), c.min(), c.max()));
								}

								else if(i.getType().equals(Double.class) || i.getType().equals(double.class))
								{
									i.set(null, (double) M.clip(in.getDouble(j), c.min(), c.max()));
									cc.set(key, (double) M.clip(in.getDouble(j), c.min(), c.max()));
								}

								else if(i.getType().equals(Long.class) || i.getType().equals(long.class))
								{
									i.set(null, (long) M.clip(in.getLong(j), c.min(), c.max()));
									cc.set(key, (long) M.clip(in.getLong(j), c.min(), c.max()));
								}

								else
								{
									D.w(Lang.getString("messages.fail.cannot-clip") + key + " (" + i.getType().getSimpleName() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
									i.set(null, in.get(j));
									cc.trySet(key, in.get(j));
								}
							}

							catch(Throwable e)
							{
								E.t(e);
							}
						}

						else
						{
							if(in.get(j) instanceof List)
							{
								i.set(null, new GList<String>((List<String>) in.get(j)));
								cc.trySet(key, in.get(j));
							}

							else
							{
								i.set(null, in.get(j));
								cc.trySet(key, in.get(j));
							}
						}
					}
				}

				if(!applied)
				{
					D.w(Lang.getString("messages.status.adding-new.key") + key); //$NON-NLS-1$
					cc.trySet(key, i.get(null));
				}

				else
				{

				}
			}
		}

		if(Surge.hasAmp())
		{
			React.instance.entityCullController.repopulateRules();
		}

		return cc;
	}

	private static DataCluster defaultConfig(boolean experimental) throws IllegalArgumentException, IllegalAccessException
	{
		DataCluster cc = new DataCluster();

		for(Field i : Config.class.getDeclaredFields())
		{
			if((i.isAnnotationPresent(Experimental.class) && experimental) || (!i.isAnnotationPresent(Experimental.class) && !experimental))
			{
				if(!i.isAnnotationPresent(Key.class))
				{
					continue;
				}

				String key = i.getAnnotation(Key.class).value();
				Object o = i.get(null);

				if(key == null)
				{
					D.w(Lang.getString("messages.fail.find-key-for-field") + i.getName()); //$NON-NLS-1$
					continue;
				}

				cc.trySet(key, o);
			}
		}

		return cc;
	}

	private static GList<String> getDefaultEntitiesForStacking()
	{
		GList<String> ents = new GList<String>();
		GList<String> entx = new GList<String>();

		for(EntityType i : EntityType.values())
		{
			entx.add(i.name());
		}

		for(String i : entx)
		{
			switch(i)
			{
				case "PLAYER":
					continue;
				case "ARMOR_STAND":
					continue;
				case "AREA_EFFECT_CLOUD":
					continue;
				case "BOAT":
					continue;
				case "ARROW":
					continue;
				case "ITEM_FRAME":
					continue;
				case "DROPPED_ITEM":
					continue;
				case "COMPLEX_PART":
					continue;
				case "DRAGON_FIREBALL":
					continue;
				case "EGG":
					continue;
				case "ENDER_CRYSTAL":
					continue;
				case "WITHER_SKULL":
					continue;
				case "ENDER_PEARL":
					continue;
				case "ENDER_SIGNAL":
					continue;
				case "WEATHER":
					continue;
				case "UNKNOWN":
					continue;
				case "TIPPED_ARROW":
					continue;
				case "THROWN_EXP_BOTTLE":
					continue;
				case "SPLASH_POTION":
					continue;
				case "SPECTRAL_ARROW":
					continue;
				case "SHULKER_BULLET":
					continue;
				case "EVOKER_FANGS":
					continue;
				case "EXPERIENCE_ORB":
					continue;
				case "SNOWBALL":
					continue;
				case "FIREBALL":
					continue;
				case "SMALL_FIREBALL":
					continue;
				case "FIREWORK":
					continue;
				case "PRIMED_TNT":
					continue;
				case "LIGHTNING":
					continue;
				case "LINGERING_POTION":
					continue;
				case "LEASH_HITCH":
					continue;
				default:
					ents.add(i);
			}
		}

		return ents;
	}

	private static GList<String> getDefaultEntitiesForCulling()
	{
		GList<String> ents = new GList<String>();
		GList<String> entx = new GList<String>();

		for(EntityType i : EntityType.values())
		{
			entx.add(i.name());
		}

		for(String i : entx)
		{
			switch(i)
			{
				case "PLAYER":
					continue;
				default:
					ents.add(i);
			}
		}

		return ents;
	}

	private static GList<String> getDefaultEntitiesForRemoval()
	{
		GList<String> ents = new GList<String>();
		GList<String> entx = new GList<String>();

		for(EntityType i : EntityType.values())
		{
			entx.add(i.name());
		}

		for(String i : entx)
		{
			switch(i)
			{
				case "PLAYER":
					continue;
				case "ITEM_FRAME":
					continue;
				case "COMPLEX_PART":
					continue;
				case "WEATHER":
					continue;
				case "UNKNOWN":
					continue;
				case "EXPERIENCE_ORB":
					continue;
				case "PRIMED_TNT":
					continue;
				case "LIGHTNING":
					continue;
				case "LINGERING_POTION":
					continue;
				case "LEASH_HITCH":
					continue;
				default:
					ents.add(i);
			}
		}

		return ents;
	}

	private static GList<String> getDefaultCullRules()
	{
		GList<String> ents = getDefaultEntitiesForCulling();
		GList<String> scrs = new GList<String>();

		scrs.add("@Refuse Tamed"); //$NON-NLS-1$
		scrs.add("@Defer Named"); //$NON-NLS-1$
		scrs.add("@Defer Leashed"); //$NON-NLS-1$
		scrs.add("@Defer Stacked"); //$NON-NLS-1$
		scrs.add("@Defer Ridden"); //$NON-NLS-1$
		scrs.add("@Defer Young");
		scrs.add("@Defer Non-Living");
		scrs.add("@Defer Grounded");
		scrs.add("@Defer Passive");
		scrs.add("@Defer Lit");
		scrs.add("@Prefer Living");
		scrs.add("@Prefer Hostile");
		scrs.add("@Prefer Mature");
		scrs.add("@Prefer Underwater");
		scrs.add("@Prefer Airborne");
		scrs.add("@Prefer Projectiles");
		scrs.add("@Prefer Caves");
		scrs.add("@Restrict Pig,Cow,Sheep,Chicken = 14"); //$NON-NLS-1$
		scrs.add("@Restrict Zombie,Spider,Skeleton,Creeper = 14"); //$NON-NLS-1$
		scrs.add("@Restrict Wolf,Ocelot,Horse = 9"); //$NON-NLS-1$

		for(String i : ents)
		{
			int m = 28;

			if(i.toString().equals("VILLAGER")) //$NON-NLS-1$
			{
				m = 16;
			}

			if(i.toString().equals("DROPPED_ITEM")) //$NON-NLS-1$
			{
				m = 30;
			}

			scrs.add("@Restrict " + F.capitalizeWords(i.toLowerCase().replaceAll("_", " ")) + " = " + m); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		}

		return scrs;
	}

	static
	{
		try
		{
			setup();
		}

		catch(Throwable e)
		{
			E.t(e);
		}
	}
}
