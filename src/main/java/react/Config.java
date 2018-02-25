package react;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.Plugin;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.api.Address;
import react.api.Clip;
import react.api.Experimental;
import react.api.Injection;
import react.api.InjectionMethod;
import react.api.Sector;
import react.api.WorldConfig;
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
	private static final GMap<World, WorldConfig> worldConfigs = new GMap<World, WorldConfig>();

	@Address(0)
	public static final String A_MAX_EXPLOSIONS_MAXMS = "tweaks.explosions.max-explosions-milliseconds";

	@Address(1)
	public static final String A_REDSTONE_DYNAMIC_CLOCK = "tweaks.redstone.dynamic-clocking"; //$NON-NLS-1$

	@Address(2)
	public static final String A_COMMANDOVERRIDE_TPS = "features.react.command-overrides.tps";

	@Address(3)
	public static final String A_SAMPLE_VIEWPORT = "features.react.sampler.sample-viewport";

	@Address(4)
	public static final String A_RAI = "features.react.rai.enabled";

	@Address(5)
	public static final String A_ENTITY_STACK_MAX_COUNT = "features.entity-stacker.max-stack-size";

	@Address(6)
	public static final String A_POOL_MAXTHREADS = "threads.pool-size"; //$NON-NLS-1$

	@Address(7)
	public static final String A_POOL_SYNC_NANOS = "threads.nano-mitigation"; //$NON-NLS-1$

	@Address(8)
	public static final String A_CULLING_ENABLED = "features.entity-culler.enabled"; //$NON-NLS-1$

	@Address(9)
	public static final String A_FASTLEAF_ENABLED = "tweaks.fast-leaf-decay.enabled"; //$NON-NLS-1$

	@Address(10)
	public static final String A_FASTLEAF_ONDECAY = "tweaks.fast-leaf-decay.trigger-on-decay"; //$NON-NLS-1$

	@Address(11)
	public static final String A_FASTLEAF_INSTANT = "tweaks.fast-leaf-decay.instantaneous"; //$NON-NLS-1$

	@Address(12)
	public static final String A_FASTLEAF_DECAYPERIOD = "tweaks.fast-leaf-decay.decay-period"; //$NON-NLS-1$

	@Address(13)
	public static final String A_COMMANDOVERRIDE_MEMORY = "features.react.command-overrides.memory";

	@Address(14)
	public static final String A_ENTITYSTACK_ENABLED = "features.entity-stacker.enabled"; //$NON-NLS-1$

	@Address(15)
	public static final String A_ENTITYSTACK_MINIMUM_GROUP = "features.entity-stacker.minimum-group-size"; //$NON-NLS-1$

	@Address(16)
	public static final String A_ENTITYSTACK_GROUP_SEARCH_RADIUS = "features.entity-stacker.search-radius"; //$NON-NLS-1$

	@Address(17)
	public static final String A_ENTITYSTACK_MAXIMUM_HEALTH = "features.entity-stacker.max-health"; //$NON-NLS-1$

	@Address(18)
	public static final String A_GLASS_SHOW_BLOCKS = "features.glass.display-blocks"; //$NON-NLS-1$

	@Address(19)
	public static final String A_GLASS_SHOW_PARTICLES = "features.glass.display-particles"; //$NON-NLS-1$

	@Address(20)
	public static final String A_ALLOW_CULL = "entity-types.allow-culling"; //$NON-NLS-1$

	@Address(21)
	public static final String A_ALLOW_PURGE = "entity-types.allow-purging"; //$NON-NLS-1$

	@Address(22)
	public static final String A_ALLOW_STACKING = "entity-types.allow-stacking"; //$NON-NLS-1$

	@Address(23)
	public static final String A_CULL_RULES = "entity-types.culling-rules"; //$NON-NLS-1$

	@Address(24)
	public static final String A_RAI_TPS_HIGH_TICK = "rai.tps.high-tick"; //$NON-NLS-1$

	@Address(25)
	public static final String A_RAI_REDSTONE_TIME_FLOOR = "rai.redstone.time-floor"; //$NON-NLS-1$

	@Address(26)
	public static final String A_RAI_REDSTONE_TIME_CEIL = "rai.redstone.time-ceil"; //$NON-NLS-1$

	@Address(27)
	public static final String A_RAI_REDSTONE_TIME_MUDDING = "rai.redstone.time-mudding"; //$NON-NLS-1$

	@Address(28)
	public static final String A_RAI_REDSTONE_TIME_FUNCTION = "rai.redstone.time-function"; //$NON-NLS-1$

	@Address(29)
	public static final String A_RAI_REDSTONE_TIME_OVERBLEED = "rai.redstone.time-overbleed"; //$NON-NLS-1$

	@Address(30)
	public static final String A_RAI_REDSTONE_TIME_RADIUS = "rai.redstone.time-radius"; //$NON-NLS-1$

	@Address(31)
	public static final String A_RAI_REDSTONE_TIME_PROPIGATION = "rai.redstone.time-propagation"; //$NON-NLS-1$

	@Address(32)
	public static final String A_RAI_HOPPER_TIME_FLOOR = "rai.hopper.time-floor"; //$NON-NLS-1$

	@Address(33)
	public static final String A_RAI_HOPPER_TIME_CEIL = "rai.hopper.time-ceil"; //$NON-NLS-1$

	@Address(34)
	public static final String A_RAI_HOPPER_TIME_MUDDING = "rai.hopper.time-mudding"; //$NON-NLS-1$

	@Address(35)
	public static final String A_RAI_HOPPER_TIME_FUNCTION = "rai.hopper.time-function"; //$NON-NLS-1$

	@Address(36)
	public static final String A_RAI_HOPPER_TIME_OVERBLEED = "rai.hopper.time-overbleed"; //$NON-NLS-1$

	@Address(37)
	public static final String A_RAI_HOPPER_TIME_RADIUS = "rai.hopper.time-radius"; //$NON-NLS-1$

	@Address(38)
	public static final String A_RAI_HOPPER_TIME_PROPIGATION = "rai.hopper.time-propagation"; //$NON-NLS-1$

	@Address(39)
	public static final String A_RAI_ENTITY_CHUNK_MULTIPLIER = "rai.entity.chunk-multiplier"; //$NON-NLS-1$

	@Address(40)
	public static final String A_RAI_ENTITY_CHUNK_CLUSTERIZER = "rai.entity.chunk-clusterer"; //$NON-NLS-1$

	@Address(41)
	public static final String A_RAI_ENTITY_CHUNK_RADIUS = "rai.entity.chunk-radius"; //$NON-NLS-1$

	@Address(42)
	public static final String A_RAI_FLUID_TIME_FLOOR = "rai.fluid.time-floor"; //$NON-NLS-1$

	@Address(43)
	public static final String A_RAI_FLUID_TIME_CEIL = "rai.fluid.time-ceil"; //$NON-NLS-1$

	@Address(44)
	public static final String A_RAI_FLUID_TIME_MUDDING = "rai.fluid.time-mudding"; //$NON-NLS-1$

	@Address(45)
	public static final String A_RAI_FLUID_TIME_FUNCTION = "rai.fluid.time-function"; //$NON-NLS-1$

	@Address(46)
	public static final String A_RAI_FLUID_TIME_OVERBLEED = "rai.fluid.time-overbleed"; //$NON-NLS-1$

	@Address(47)
	public static final String A_RAI_FLUID_TIME_RADIUS = "rai.fluid.time-radius"; //$NON-NLS-1$

	@Address(48)
	public static final String A_RAI_FLUID_TIME_PROPIGATION = "rai.fluid.time-propagation"; //$NON-NLS-1$

	@Address(49)
	public static final String A_SMEAR_TICK_ENTITIES_MAX_TICK = "features.tick-smearing.entities.max-time"; //$NON-NLS-1$

	@Address(50)
	public static final String A_SMEAR_TICK_TILES_MAX_TICK = "features.tick-smearing.tiles.max-time"; //$NON-NLS-1$

	@Address(51)
	public static final String A_SMEAR_TICK_ENTITIES_SEPERATION_BIAS = "features.tick-smearing.entities.seperation-bias"; //$NON-NLS-1$

	@Address(52)
	public static final String A_SMEAR_TICK_TILES_SEPERATION_BIAS = "features.tick-smearing.tiles.seperation-bias"; //$NON-NLS-1$

	@Address(53)
	public static final String A_SMEAR_TICK_ENTITIES_AMOUNT = "features.tick-smearing.entities.smear-factor"; //$NON-NLS-1$

	@Address(54)
	public static final String A_SMEAR_TICK_TILES_AMOUNT = "features.tick-smearing.tiles.smear-factor"; //$NON-NLS-1$

	@Address(55)
	public static final String A_SMEAR_TICK_ENTITIES_ENABLE = "features.tick-smearing.entities.enable"; //$NON-NLS-1$

	@Address(56)
	public static final String A_SMEAR_TICK_TILES_ENABLE = "features.tick-smearing.tiles.enable"; //$NON-NLS-1$

	@Address(57)
	public static final String A_HOPPER_OVERTICK_ENABLE = "tweaks.hoppers.reduce-overtick-hoppers"; //$NON-NLS-1$

	@Address(58)
	public static final String A_USE_WORLD_CONFIGS = "features.react.worlds.world-configs";

	@Address(59)
	public static final String A_ENTITY_STACKER_SHOW_PARTICLES = "features.entity-stacker.options.show-particles";

	@Address(60)
	public static final String A_ENTITY_STACKER_SHOW_NAMETAG = "features.entity-stacker.options.show-nametag";

	@Address(61)
	public static final String A_LANGUAGE = "features.react.language"; //$NON-NLS-1$

	@Address(62)
	public static final String A_RAI_CHUNK_TIME_FLOOR = "rai.chunk.time-floor"; //$NON-NLS-1$

	@Address(63)
	public static final String A_RAI_CHUNK_TIME_CEIL = "rai.chunk.time-ceil"; //$NON-NLS-1$

	@Address(64)
	public static final String A_RAI_CHUNK_TIME_MUDDING = "rai.chunk.time-mudding"; //$NON-NLS-1$

	@Address(65)
	public static final String A_RAI_CHUNK_TIME_FUNCTION = "rai.chunk.time-function"; //$NON-NLS-1$

	@Address(66)
	public static final String A_RAI_CHUNK_TIME_OVERBLEED = "rai.chunk.time-overbleed"; //$NON-NLS-1$

	@Address(67)
	public static final String A_RAI_CHUNK_TIME_RADIUS = "rai.chunk.time-radius"; //$NON-NLS-1$

	@Address(68)
	public static final String A_RAI_CHUNK_TIME_PROPIGATION = "rai.chunk.time-propagation"; //$NON-NLS-1$

	@Address(69)
	public static final String A_RAI_CHUNK_TIME_PROPIGATE = "rai.chunk.propagate";

	@Address(70)
	public static final String A_RAI_FLUID_TIME_PROPIGATE = "rai.fluid.propagate";

	@Address(71)
	public static final String A_RAI_ENTITY_PROPIGATE = "rai.entity.propagate";

	@Address(72)
	public static final String A_RAI_HOPPER_TIME_PROPIGATE = "rai.hopper.propagate";

	@Address(73)
	public static final String A_RAI_REDSTONE_TIME_PROPIGATE = "rai.redstone.propagate";

	@Address(74)
	public static final String A_ENTITY_STACKER_NAME_TAG_FORMAT = "features.entity-stacker.options.nametag-format";

	@Address(75)
	public static final String A_FAST_LEAF_MAX_MS = "tweaks.fast-leaf-decay.max-ms";

	@Address(76)
	public static final String A_NMS_CHUNK_UPDATE_INTERVAL = "tweaks.nms.chunk-update-interval";

	@Address(77)
	public static final String A_THROTTLE_EXPLOSIONS = "tweaks.explosions.throttle-explosions";

	@Address(78)
	public static final String A_THROTTLED_RATIO = "tweaks.explosions.throttled-ratio";

	@Address(79)
	public static final String A_FAST_GROWTH = "tweaks.fast-growth.enabled";

	@Address(80)
	public static final String A_FAST_EXPLOSIONS = "tweaks.explosions.fast-block-destruction";

	@Address(81)
	public static final String A_DROPS_INSTADROP = "tweaks.drops.fast-drop-items";

	@Address(82)
	public static final String A_SKIP_ORBS = "tweaks.xp.fast-drop-xp";

	@Address(83)
	public static final String A_FAST_ORB_PICKUP = "tweaks.xp.fast-xp-pickup";

	@Address(84)
	public static final String A_DROPS_TELEPORT = "tweaks.drops.teleport-to-source";

	@Address(85)
	public static final String A_DESPAWN_USELESS_ARROWS = "tweaks.drops.despawn-useless-arrows";

	@Address(86)
	public static final String A_FACTIONS = "tweaks.factions-compat";

	@Address(87)
	public static final String A_PURGE_INTERVAL = "tweaks.chunks.purge-interval";

	@Address(88)
	public static final String A_PURGE = "tweaks.chunks.purge-enabled";

	@Address(89)
	public static final String A_SOUNDS = "features.react.interaction-sounds";

	@Address(90)
	public static final String A_ALLOW_TEMPACCESS = "features.react.allow-tempaccess";

	@Address(91)
	public static final String A_FAST_LEAF_FAST_UPDATE = "tweaks.fast-leaf-decay.fast-destroy";

	@Sector(0)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 10000)
	public static double MAX_EXPLOSION_MS = 5;

	@Sector(1)
	@Injection(InjectionMethod.SWAP)
	public static boolean REDSTONE_DYNAMIC_CLOCK = false;

	@Sector(2)
	@Injection(InjectionMethod.SWAP)
	public static boolean COMMANDOVERRIDES_TPS = true;

	@Sector(3)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 6000, max = 30000)
	public static int SAMPLE_VIEWPORT = 12000;

	@Sector(4)
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI = true;

	@Sector(5)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2, max = 256)
	public static int ENTITY_STACK_MAX_COUNT = 16;

	@Sector(6)
	@Injection(InjectionMethod.RELOAD)
	@Clip(min = 1, max = 4)
	@PoolCount
	@Experimental
	public static int POOL_MAXTHREADS = 2;

	@Sector(7)
	@Injection(InjectionMethod.SUBSTRATE)
	@Clip(min = 1000000, max = 50000000)
	@PoolNanoThrottle
	@Experimental
	public static long POOL_SYNC_NANOS = 1500000;

	@Sector(8)
	@Injection(InjectionMethod.SWAP)
	public static boolean CULLING_ENABLED = true;

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
	public static int FASTLEAF_DECAYPERIOD = 5;

	@Sector(13)
	@Injection(InjectionMethod.SWAP)
	public static boolean COMMANDOVERRIDES_MEMORY = true;

	@Sector(14)
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITYSTACK_ENABLED = false;

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
	public static boolean GLASS_SHOW_BLOCKS = false;

	@Sector(19)
	@Injection(InjectionMethod.SWAP)
	public static boolean GLASS_SHOW_PARTICLES = true;

	@Sector(20)
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_CULL = getDefaultEntitiesForCulling();

	@Sector(21)
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_PURGE = getDefaultEntitiesForRemoval();

	@Sector(22)
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_STACKING = getDefaultEntitiesForStacking();

	@Sector(23)
	@Injection(InjectionMethod.SWAP)
	public static GList<String> CULL_RULES = getDefaultCullRules();

	@Sector(24)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 20.0, max = 70.0)
	public static double RAI_TPS_HIGH_TICK = 50.0;

	@Sector(25)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_REDSTONE_TIME_FLOOR = 2000000;

	@Sector(26)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_REDSTONE_TIME_CEIL = 30000000;

	@Sector(27)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_REDSTONE_TIME_MUDDING = 2360000;

	@Sector(28)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_REDSTONE_TIME_FUNCTION = 0.36;

	@Sector(29)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_REDSTONE_TIME_OVERBLEED = 1.54;

	@Sector(30)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_REDSTONE_TIME_RADIUS = 1;

	@Sector(31)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_REDSTONE_TIME_PROPIGATION = 1000;

	@Sector(32)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_HOPPER_TIME_FLOOR = 2000000;

	@Sector(33)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_HOPPER_TIME_CEIL = 30000000;

	@Sector(34)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_HOPPER_TIME_MUDDING = 2360000;

	@Sector(35)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_HOPPER_TIME_FUNCTION = 0.16;

	@Sector(36)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_HOPPER_TIME_OVERBLEED = 1.54;

	@Sector(37)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_HOPPER_TIME_RADIUS = 1;

	@Sector(38)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_HOPPER_TIME_PROPIGATION = 1000;

	@Sector(39)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 5)
	public static int RAI_ENTITY_CHUNK_MULTIPLIER = 2;

	@Sector(40)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 20, max = 100)
	public static int RAI_ENTITY_CHUNK_CLUSTERIZER = 30;

	@Sector(41)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_ENTITY_CHUNK_RADIUS = 2;

	@Sector(42)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_FLUID_TIME_FLOOR = 2000000;

	@Sector(43)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_FLUID_TIME_CEIL = 30000000;

	@Sector(44)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_FLUID_TIME_MUDDING = 2360000;

	@Sector(45)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_FLUID_TIME_FUNCTION = 0.36;

	@Sector(46)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_FLUID_TIME_OVERBLEED = 1.54;

	@Sector(47)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_FLUID_TIME_RADIUS = 2;

	@Sector(48)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_FLUID_TIME_PROPIGATION = 1000;

	@Sector(49)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 100)
	public static double SMEAR_TICK_ENTITIES_MAX_TICK = 25;

	@Sector(50)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 100)
	public static double SMEAR_TICK_TILES_MAX_TICK = 35;

	@Sector(51)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0, max = 10)
	public static double SMEAR_TICK_ENTITIES_SEPERATION_BIAS = 0.65;

	@Sector(52)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0, max = 10)
	public static double SMEAR_TICK_TILES_SEPERATION_BIAS = 0.07;

	@Sector(53)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 5, max = 100)
	public static double SMEAR_TICK_ENTITIES_AMOUNT = 50;

	@Sector(54)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 5, max = 100)
	public static double SMEAR_TICK_TILES_AMOUNT = 50;

	@Sector(55)
	@Injection(InjectionMethod.SWAP)
	public static boolean SMEAR_TICK_ENTITIES_ENABLE = true;

	@Sector(56)
	@Injection(InjectionMethod.SWAP)
	public static boolean SMEAR_TICK_TILES_ENABLE = true;

	@Sector(57)
	@Injection(InjectionMethod.SWAP)
	public static boolean HOPPER_OVERTICK_ENABLE = true;

	@Sector(58)
	@Injection(InjectionMethod.SWAP)
	public static boolean USE_WORLD_CONFIGS = true;

	@Sector(59)
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITY_STACKER_SHOW_PARTICLES = true;

	@Sector(60)
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITY_STACKER_SHOW_NAME_TAG = false;

	@Sector(61)
	@Injection(InjectionMethod.SWAP)
	public static String LANGUAGE = "enUS";

	@Sector(62)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_CHUNK_TIME_FLOOR = 2000000;

	@Sector(63)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_CHUNK_TIME_CEIL = 30000000;

	@Sector(64)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_CHUNK_TIME_MUDDING = 2360000;

	@Sector(65)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_CHUNK_TIME_FUNCTION = 0.36;

	@Sector(66)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_CHUNK_TIME_OVERBLEED = 1.54;

	@Sector(67)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_CHUNK_TIME_RADIUS = 2;

	@Sector(68)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_CHUNK_TIME_PROPIGATION = 1000;

	@Sector(69)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_CHUNK_TIME_PROPIGATE = true;

	@Sector(70)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_FLUID_TIME_PROPIGATE = true;

	@Sector(71)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_ENTITY_PROPIGATE = true;

	@Sector(72)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_HOPPER_TIME_PROPIGATE = true;

	@Sector(73)
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_REDSTONE_TIME_PROPIGATE = false;

	@Sector(74)
	@Injection(InjectionMethod.SWAP)
	public static String ENTITY_STACKER_NAME_TAG_FORMAT = "&e%size%x &a%type% &c%hp%";

	@Sector(75)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.1, max = 50.0)
	public static double FAST_LEAF_MAX_MS = 0.8;

	@Sector(76)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 20)
	public static int NMS_CHUNK_UPDATE_INTERVAL = 8;

	@Sector(77)
	@Injection(InjectionMethod.SWAP)
	public static boolean THROTTLE_EXPLOSIONS = true;

	@Sector(78)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.0, max = 0.9)
	public static double THROTTLED_RATIO = 0.65;

	@Sector(79)
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_GROWTH = true;

	@Sector(80)
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_EXPLOSIONS = false;

	@Sector(81)
	@Injection(InjectionMethod.SWAP)
	public static boolean DROPS_INSTADROP = false;

	@Sector(82)
	@Injection(InjectionMethod.SWAP)
	public static boolean SKIP_ORBS = true;

	@Sector(83)
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_ORB_PICKUP = true;

	@Sector(84)
	@Injection(InjectionMethod.SWAP)
	public static boolean DROPS_TELEPORT = false;

	@Sector(85)
	@Injection(InjectionMethod.SWAP)
	public static boolean DESPAWN_USELESS_ARROWS = true;

	@Sector(86)
	@Injection(InjectionMethod.SWAP)
	public static boolean FACTIONS = true;

	@Sector(87)
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 200, max = 12000)
	public static int PURGE_INTERVAL = 1200;

	@Sector(88)
	@Injection(InjectionMethod.SWAP)
	public static boolean PURGE = true;

	@Sector(89)
	@Injection(InjectionMethod.SWAP)
	public static boolean SOUNDS = true;

	@Sector(90)
	@Injection(InjectionMethod.SWAP)
	public static boolean ALLOW_TEMPACCESS = true;

	@Sector(91)
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_LEAF_NMS = true;

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
					Main.reload();
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

							catch(Exception e)
							{

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

		catch(IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}
}
