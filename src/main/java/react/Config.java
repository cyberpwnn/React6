package react;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.plugin.Plugin;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.gmath.M;

import react.api.Address;
import react.api.Clip;
import react.api.Experimental;
import react.api.Injection;
import react.api.InjectionMethod;
import react.api.Sector;
import surge.Main;
import surge.Surge;
import surge.cluster.DataCluster;
import surge.cluster.YamlDataInput;
import surge.cluster.YamlDataOutput;
import surge.util.D;
import surge.util.DynamicConfiguration;
import surge.util.DynamicTracker;
import surge.util.PoolCount;
import surge.util.PoolDescriber;
import surge.util.PoolNanoThrottle;
import surge.util.RawEvent;

@PoolDescriber
@DynamicConfiguration
public class Config
{
	@Address(0)
	public static final String A_ENTITYCACHE_CHUNK_RADIUS = "entity-cache.chunk-radius";

	@Address(1)
	public static final String A_ENTITYCACHE_INTERVAL = "entity-cache.swap-interval";

	@Address(2)
	public static final String A_DROPSTACK_RADIUS = "drop-stacker.stack-radius";

	@Address(3)
	public static final String A_DROPSTACK_STACKDROPS = "drop-stacker.stack-drops";

	@Address(4)
	public static final String A_DROPSTACK_USEDEFAULT = "drop-stacker.use-default";

	@Address(5)
	public static final String A_DROPSTACK_SMOOTHSTACK = "drop-stacker.smooth-stack";

	@Address(6)
	public static final String A_POOL_MAXTHREADS = "threads.pool-size";

	@Address(7)
	public static final String A_POOL_SYNC_NANOS = "threads.nano-mitigation";

	@Address(8)
	public static final String A_ENTITYCACHE_ENABLED = "entity-cache.enable-caching";

	@Address(9)
	public static final String A_FASTLEAF_ENABLED = "fast-leaf-decay.enabled";

	@Address(10)
	public static final String A_FASTLEAF_ONDECAY = "fast-leaf-decay.trigger-on-decay";

	@Address(11)
	public static final String A_FASTLEAF_INSTANT = "fast-leaf-decay.instantaneous";

	@Address(12)
	public static final String A_FASTLEAF_DECAYPERIOD = "fast-leaf-decay.decay-period";

	@Address(13)
	public static final String A_DROPSTACK_MINAGE = "drop-stacker.minimum-age-ticks";

	@Address(14)
	public static final String A_ENTITYSTACK_ENABLED = "entity-stacker.enabled";

	@Address(15)
	public static final String A_ENTITYSTACK_MINIMUM_GROUP = "entity-stacker.minimum-group-size";

	@Address(16)
	public static final String A_ENTITYSTACK_GROUP_SEARCH_RADIUS = "entity-stacker.search-radius";

	@Address(17)
	public static final String A_ENTITYSTACK_MAXIMUM_HEALTH = "entity-stacker.max-health";

	@Address(18)
	public static final String A_GLASS_SHOW_BLOCKS = "glass.display-blocks";

	@Address(19)
	public static final String A_GLASS_SHOW_PARTICLES = "glass.display-particles";

	@Address(20)
	public static final String A_ALLOW_CULL = "entity-types.allow-culling";

	@Address(21)
	public static final String A_ALLOW_PURGE = "entity-types.allow-purging";

	@Address(22)
	public static final String A_ALLOW_CACHE = "entity-types.allow-caching";

	@Address(23)
	public static final String A_CULL_RULES = "entity-culler.rules";

	@Sector(0)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 7)
	public static int ENTITYCACHE_CHUNK_RADIUS = 3;

	@Sector(1)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2, max = 20)
	@Experimental
	public static int ENTITYCACHE_INTERVAL = 2;

	@Sector(2)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.5, max = 1.998)
	public static double DROPSTACK_RADIUS = 1.5;

	@Sector(3)
	@Injection(InjectionMethod.SWAP)
	public static boolean DROPSTACK_STACKDROPS = true;

	@Sector(4)
	@Injection(InjectionMethod.SWAP)
	public static boolean DROPSTACK_USEDEFAULT = false;

	@Sector(5)
	@Injection(InjectionMethod.SWAP)
	@Experimental
	public static boolean DROPSTACK_SMOOTHSTACK = false;

	@Sector(6)
	@Injection(InjectionMethod.RELOAD)
	@Clip(min = 2, max = 4)
	@PoolCount
	@Experimental
	public static int POOL_MAXTHREADS = 2;

	@Sector(7)
	@Injection(InjectionMethod.SUBSTRATE)
	@Clip(min = 100000, max = 5000000)
	@PoolNanoThrottle
	@Experimental
	public static long POOL_SYNC_NANOS = 500000;

	@Sector(8)
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITYCACHE_ENABLED = false;

	@Sector(9)
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_ENABLED = true;

	@Sector(10)
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_ONDECAY = true;

	@Sector(11)
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_INSTANT = false;

	@Sector(12)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2, max = 200)
	public static int FASTLEAF_DECAYPERIOD = 20;

	@Sector(13)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10, max = 200)
	public static int DROPSTACK_MINAGE = 70;

	@Sector(14)
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITYSTACK_ENABLED = true;

	@Sector(15)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 16)
	public static int ENTITYSTACK_MINIMUM_GROUP = 6;

	@Sector(16)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 4, max = 16)
	public static int ENTITYSTACK_GROUP_SEARCH_RADIUS = 6;

	@Sector(17)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 2000)
	@Experimental
	public static int ENTITYSTACK_MAXIMUM_HEALTH = 2000;

	@Sector(18)
	@Injection(InjectionMethod.SWAP)
	@Experimental
	public static boolean GLASS_SHOW_BLOCKS = true;

	@Sector(19)
	@Injection(InjectionMethod.SWAP)
	@Experimental
	public static boolean GLASS_SHOW_PARTICLES = false;

	@Sector(20)
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_CULL = getDefaultEntitiesForCulling();

	@Sector(21)
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_PURGE = getDefaultEntitiesForRemoval();

	@Sector(22)
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_CACHE = getDefaultEntitiesForCaching();

	@Sector(23)
	@Injection(InjectionMethod.SWAP)
	public static GList<String> CULL_RULES = getDefaultCullRules();

	private static boolean hrld = false;
	private static boolean rns = false;
	private static boolean rrl = false;

	@DynamicTracker
	public static void doTrack(Plugin main)
	{
		File fConfig = new File(main.getDataFolder(), "config.yml");
		File fConfigExperimental = new File(main.getDataFolder(), "config-experimental.yml");

		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				Surge.getHotloadManager().untrack(fConfig);
				Surge.getHotloadManager().untrack(fConfigExperimental);
				onRead(main);
				doTrack(main);
			}
		};

		Surge.getHotloadManager().track(fConfig, r);
		Surge.getHotloadManager().track(fConfigExperimental, r);
	}

	@RawEvent
	public static void onRead(Plugin main)
	{
		File fConfig = new File(main.getDataFolder(), "config.yml");
		File fConfigExperimental = new File(main.getDataFolder(), "config-experimental.yml");

		try
		{
			read(fConfig, false);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			read(fConfigExperimental, true);
		}

		catch(Exception e)
		{
			e.printStackTrace();
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
					Main.requestReload();
					hrld = false;
				}

				else if(rns)
				{
					Main.requestResetNanos();
				}
			}
		}

		catch(Exception e)
		{

		}

		hrld = true;
	}

	@SuppressWarnings("unchecked")
	private static DataCluster read(DataCluster in, boolean experimental) throws IllegalArgumentException, IllegalAccessException
	{
		DataCluster cc = new DataCluster();

		for(Field i : Config.class.getDeclaredFields())
		{
			if((i.isAnnotationPresent(Experimental.class) && experimental) || (!i.isAnnotationPresent(Experimental.class) && !experimental))
			{
				if(!i.isAnnotationPresent(Sector.class))
				{
					continue;
				}

				int sector = i.getAnnotation(Sector.class).value();
				String key = null;

				for(Field j : Config.class.getDeclaredFields())
				{
					if(j.isAnnotationPresent(Address.class))
					{
						if(sector == j.getAnnotation(Address.class).value())
						{
							key = (String) j.get(null);
							break;
						}
					}
				}

				if(key == null)
				{
					D.w("Failed to find key for field " + i.getName());
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
								D.w("Cannot clip " + key + " (" + i.getType().getSimpleName() + ")");
								i.set(null, in.get(j));
								cc.trySet(key, in.get(j));
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
					D.w("Adding new key: " + key);
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
				if(!i.isAnnotationPresent(Sector.class))
				{
					continue;
				}

				int sector = i.getAnnotation(Sector.class).value();
				Object o = i.get(null);
				String key = null;

				for(Field j : Config.class.getDeclaredFields())
				{
					if(j.isAnnotationPresent(Address.class))
					{
						if(sector == j.getAnnotation(Address.class).value())
						{
							key = (String) j.get(null);
							break;
						}
					}
				}

				if(key == null)
				{
					D.w("Failed to find key for field " + i.getName());
					continue;
				}

				cc.trySet(key, o);
			}
		}

		return cc;
	}

	private static GList<String> getDefaultEntitiesForCaching()
	{
		GList<String> ents = new GList<String>();

		for(EntityType i : EntityType.values())
		{
			switch(i)
			{
				case PLAYER:
					continue;
				case AREA_EFFECT_CLOUD:
					continue;
				case BOAT:
					continue;
				case ARROW:
					continue;
				case ITEM_FRAME:
					continue;
				case COMPLEX_PART:
					continue;
				case DRAGON_FIREBALL:
					continue;
				case EGG:
					continue;
				case ENDER_CRYSTAL:
					continue;
				case WITHER_SKULL:
					continue;
				case ENDER_PEARL:
					continue;
				case ENDER_SIGNAL:
					continue;
				case WEATHER:
					continue;
				case UNKNOWN:
					continue;
				case TIPPED_ARROW:
					continue;
				case THROWN_EXP_BOTTLE:
					continue;
				case SPLASH_POTION:
					continue;
				case SPECTRAL_ARROW:
					continue;
				case SHULKER_BULLET:
					continue;
				case EVOKER_FANGS:
					continue;
				case EXPERIENCE_ORB:
					continue;
				case SNOWBALL:
					continue;
				case FIREBALL:
					continue;
				case SMALL_FIREBALL:
					continue;
				case FIREWORK:
					continue;
				case PRIMED_TNT:
					continue;
				case LIGHTNING:
					continue;
				case LINGERING_POTION:
					continue;
				case LEASH_HITCH:
					continue;
				default:
					ents.add(i.name());
			}
		}

		return ents;
	}

	private static GList<String> getDefaultEntitiesForCulling()
	{
		GList<String> ents = new GList<String>();

		for(EntityType i : EntityType.values())
		{
			switch(i)
			{
				case PLAYER:
					continue;
				case AREA_EFFECT_CLOUD:
					continue;
				case BOAT:
					continue;
				case ARROW:
					continue;
				case DROPPED_ITEM:
					continue;
				case ITEM_FRAME:
					continue;
				case COMPLEX_PART:
					continue;
				case DRAGON_FIREBALL:
					continue;
				case EGG:
					continue;
				case ENDER_CRYSTAL:
					continue;
				case WITHER_SKULL:
					continue;
				case ENDER_PEARL:
					continue;
				case ENDER_SIGNAL:
					continue;
				case WEATHER:
					continue;
				case UNKNOWN:
					continue;
				case TIPPED_ARROW:
					continue;
				case THROWN_EXP_BOTTLE:
					continue;
				case SPLASH_POTION:
					continue;
				case SPECTRAL_ARROW:
					continue;
				case SHULKER_BULLET:
					continue;
				case EVOKER_FANGS:
					continue;
				case EXPERIENCE_ORB:
					continue;
				case SNOWBALL:
					continue;
				case FIREBALL:
					continue;
				case SMALL_FIREBALL:
					continue;
				case FIREWORK:
					continue;
				case PRIMED_TNT:
					continue;
				case LIGHTNING:
					continue;
				case LINGERING_POTION:
					continue;
				case LEASH_HITCH:
					continue;
				default:
					ents.add(i.name());
			}
		}

		return ents;
	}

	private static GList<String> getDefaultEntitiesForRemoval()
	{
		GList<String> ents = new GList<String>();

		for(EntityType i : EntityType.values())
		{
			switch(i)
			{
				case PLAYER:
					continue;
				case DROPPED_ITEM:
					continue;
				case ITEM_FRAME:
					continue;
				case COMPLEX_PART:
					continue;
				case WEATHER:
					continue;
				case UNKNOWN:
					continue;
				case EXPERIENCE_ORB:
					continue;
				case PRIMED_TNT:
					continue;
				case LIGHTNING:
					continue;
				case LINGERING_POTION:
					continue;
				case LEASH_HITCH:
					continue;
				default:
					ents.add(i.name());
			}
		}

		return ents;
	}

	private static GList<String> getDefaultCullRules()
	{
		GList<String> ents = getDefaultEntitiesForCulling();
		GList<String> scrs = new GList<String>();

		scrs.add("@Refuse Tamed");
		scrs.add("@Defer Named");
		scrs.add("@Defer Leashed");
		scrs.add("@Defer Stacked");
		scrs.add("@Defer Ridden");
		scrs.add("@Restrict Pig,Cow,Sheep,Chicken = 12");
		scrs.add("@Restrict Zombie,Spider,Skeleton,Creeper = 12");
		scrs.add("@Restrict Wolf,Ocelot,Horse = 7");

		for(String i : ents)
		{
			int m = 7;

			if(i.toString().equals("VILLAGER"))
			{
				m = 10;
			}

			scrs.add("@Restrict " + F.capitalizeWords(i.toLowerCase().replaceAll("_", " ")) + " = " + m);
		}

		return scrs;
	}
}
