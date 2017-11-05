package react;

import java.io.File;
import java.lang.reflect.Field;

import org.bukkit.plugin.Plugin;
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
	public static final String A_DROPSTACK_RADIUS = "drop-control.stack-radius";

	@Address(3)
	public static final String A_DROPSTACK_STACKDROPS = "drop-control.stack-drops";

	@Address(4)
	public static final String A_DROPSTACK_USEDEFAULT = "drop-control.use-default";

	@Address(5)
	public static final String A_DROPSTACK_SMOOTHSTACK = "drop-control.smooth-stack";

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
	public static final String A_DROPSTACK_MINAGE = "drop-control.minimum-age-ticks";

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
	public static boolean ENTITYCACHE_ENABLED = true;

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
							i.set(null, in.get(j));
							cc.trySet(key, in.get(j));
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
					// TODO detect what was changed.
					// if(i.isAnnotationPresent(Injection.class))
					// {
					// Injection ii = i.getAnnotation(Injection.class);
					//
					// if(ii.value().equals(InjectionMethod.RELOAD))
					// {
					// rrl = true;
					// }
					//
					// if(ii.value().equals(InjectionMethod.SUBSTRATE))
					// {
					// rns = true;
					// }
					// }
				}
			}
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
}
