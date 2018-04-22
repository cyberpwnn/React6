package com.volmit.react;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.Plugin;

import com.volmit.react.api.Clip;
import com.volmit.react.api.Comment;
import com.volmit.react.api.Experimental;
import com.volmit.react.api.Injection;
import com.volmit.react.api.InjectionMethod;
import com.volmit.react.api.Key;
import com.volmit.react.api.Note;
import com.volmit.react.api.WorldConfig;
import com.volmit.react.util.D;
import com.volmit.react.util.DataCluster;
import com.volmit.react.util.DynamicConfiguration;
import com.volmit.react.util.Ex;
import com.volmit.react.util.F;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.M;
import com.volmit.react.util.PoolDescriber;
import com.volmit.react.util.RawEvent;
import com.volmit.react.util.TaskLater;
import com.volmit.react.util.YamlDataInput;
import com.volmit.react.util.YamlDataOutput;

@PoolDescriber
@DynamicConfiguration
public class Config
{
	private static final GMap<World, WorldConfig> worldConfigs = new GMap<World, WorldConfig>();

	@Comment("Use the legacy remote server (for react remote)")
	@Key("features.react.legacy.remote-server.enable-react-remote-server")
	@Injection(InjectionMethod.SWAP)
	public static boolean LEGACY_SERVER = false;

	@Comment("Use console coloring and formatting")
	@Key("features.console.color")
	@Injection(InjectionMethod.SWAP)
	public static boolean CONSOLE_COLOR = true;

	@Comment("Messaging channels to listen to and print to the console.")
	@Key("features.console.listen-channels")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> VERBOSE_CHANNELS = getDefaultChannels();

	@Comment("Uses the listen-channels to print to the console. Channels:\n-rai\n-spikes\n-verbose\n-action\n-gc ")
	@Key("features.console.listen-channels-enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean VERBOSE_CHANNEL_ENABLE = false;

	@Comment("The port to bind to when the remote server is enabled. This cannot be your server port or an already used port.")
	@Key("features.react.legacy.remote-server.remote-port")
	@Injection(InjectionMethod.SWAP)
	public static int LEGACY_SERVER_PORT = 8147;

	@Comment("Use Fast Async World Edit if it is installed.")
	@Key("features.react.use-fawe")
	@Injection(InjectionMethod.SWAP)
	public static boolean USE_FAWE = true;

	@Comment("Cap the framerate of the map. Bukkit hard caps at 60, anything higher than 60 will do nothing. Keep in mind that the higher the frame rate, the more bukkit will spawn craft scheduler threads. Keeping this low reduces memory, cpu usage and allows more people to use the map at the same time.")
	@Key("features.react.map.max-framerate")
	@Injection(InjectionMethod.SWAP)
	public static int MAP_FPS = 15;

	@Comment("Cap the framerate of the individual graphs in the react map. Keep this value low as there are many graphs to map.")
	@Key("features.react.map.max-graph-framerate")
	@Injection(InjectionMethod.SWAP)
	public static int GRAPH_FPS = 10;

	@Comment("Disable all automatic actions, including RAI. Will still purge chunks if enabled.")
	@Key("features.react.monitoring-only")
	@Injection(InjectionMethod.SWAP)
	public static boolean MONITOR_ONLY = false;

	@Comment("Actions such as lock-redstone, lock-hoppers, and lock-fluids. Should they ever be un-frozen (using the time field)")
	@Key("features.react.actions.unlock-locked-actions")
	@Injection(InjectionMethod.SWAP)
	public static boolean UNLOCKING = true;

	@Comment("Throttle explosions to a maximum tick time per tick")
	@Key("tweaks.explosions.max-explosions-milliseconds")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 10000)
	public static double MAX_EXPLOSION_MS = 5;

	@Comment("Dynamically change the redstone tick speed depending on redstone tick time (may cause issues with large contraptions)")
	@Key("tweaks.redstone.dynamic-clocking")
	@Injection(InjectionMethod.SWAP)
	public static boolean REDSTONE_DYNAMIC_CLOCK = false;

	@Comment("Override the /tps and /lag commands to add additional information")
	@Key("features.react.command-overrides.tps")
	@Injection(InjectionMethod.SWAP)
	public static boolean COMMANDOVERRIDES_TPS = true;

	@Comment("Override the '/killall all' command to instead use react to remove entities.")
	@Key("features.react.command-overrides.killall")
	@Injection(InjectionMethod.SWAP)
	public static boolean COMMANDOVERRIDES_KILLALL = false;

	@Comment("Interpret '/killall all -f' as /re a pe -f (force kill everything but players)")
	@Key("features.react.command-overrides.killall-force")
	@Injection(InjectionMethod.SWAP)
	public static boolean COMMANDOVERRIDES_KILLALL_EVERYTHING = false;

	@Comment("Sample time viewport. Higher means more visible data in graphs over time. Due to lossy compression however, data may look weird near the beginning of a large graph.")
	@Key("features.react.sampler.sample-viewport")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 6000, max = 30000)
	public static int SAMPLE_VIEWPORT = 12000;

	@Comment("Sample points per sampler type")
	@Key("features.react.sampler.sample-points")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 50, max = 4000)
	public static int SAMPLE_POINTS = 250;

	@Comment("Enable or disable React AI")
	@Key("features.react.rai.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI = true;

	@Comment("RAI will do nothing unless the tps drops below this value for more than 20 ticks. It does, rai will look for issues to fix.")
	@Key("features.react.rai.activation-threshold")
	@Injection(InjectionMethod.SWAP)
	public static double RAI_ACTIVATION = 18.5;

	@Comment("The maximum size an entity stack can have")
	@Key("features.entity-stacker.max-stack-size")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2, max = 256)
	public static int ENTITY_STACK_MAX_COUNT = 16;

	@Comment("Should react cull entities (reduces entity counts but doesnt kill everything) based on culling rules below.")
	@Key("features.entity-culler.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean CULLING_ENABLED = true;

	@Comment("Enable fast leaf decay, uses nms adapters to skip most block updates.")
	@Key("tweaks.fast-leaf-decay.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_ENABLED = true;

	@Comment("Trigger fast leaf decay when leaves decay normally")
	@Key("tweaks.fast-leaf-decay.trigger-on-decay")
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_ONDECAY = true;

	@Comment("Saturate the destruction queue as fast as possible, ignoring tick limits.")
	@Key("tweaks.fast-leaf-decay.instantaneous")
	@Injection(InjectionMethod.SWAP)
	public static boolean FASTLEAF_INSTANT = false;

	@Comment("The period of time (in ticks) which a leaf block that is marked for decay will actually decay. If 10 blocks are set to be destroyed, they will be destroyed randomly within 5 ticks (by default)")
	@Key("tweaks.fast-leaf-decay.decay-period")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2, max = 200)
	public static int FASTLEAF_DECAYPERIOD = 5;

	@Comment("Override /mem with additional information")
	@Key("features.react.command-overrides.memory")
	@Injection(InjectionMethod.SWAP)
	public static boolean COMMANDOVERRIDES_MEMORY = true;

	@Comment("Enable entity stacking. Stacks entities of the same type to reduce entity counts. Adjusts their max health. Every time they loose a modulo of their full health a dead copy of the entity is spawned to die. Damage bleeds into the next stack.")
	@Key("features.entity-stacker.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITYSTACK_ENABLED = false;

	@Comment("The minimum number of entities required in a search radius to actually create a stack. Setting this lower will create frequent small-stacks, higher will make larger stacks less often.")
	@Key("features.entity-stacker.minimum-group-size")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 16)
	public static int ENTITYSTACK_MINIMUM_GROUP = 6;

	@Comment("The radius (in blocks) to search for entities to stack together.")
	@Key("features.entity-stacker.search-radius")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 4, max = 16)
	public static int ENTITYSTACK_GROUP_SEARCH_RADIUS = 6;

	@Comment("The maximum health a stacked entity can have. (make sure this is below spigots limits if you changed them)")
	@Key("features.entity-stacker.max-health")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 2000)
	@Experimental
	public static int ENTITYSTACK_MAXIMUM_HEALTH = 1600;

	@Comment("The maximum amount of events to capture per tick before ignoring the rest to prevent lag from glass.")
	@Key("features.glass.max-queue")
	@Injection(InjectionMethod.SWAP)
	public static int GLASS_MAX_QUEUE = 256;

	@Comment("Display glass-block packets to visualize physics")
	@Key("features.glass.display-blocks")
	@Injection(InjectionMethod.SWAP)
	public static boolean GLASS_SHOW_BLOCKS = false;

	@Comment("Display particles instead of block packets to visualize physics (better framerates than block packets)")
	@Key("features.glass.display-particles")
	@Injection(InjectionMethod.SWAP)
	public static boolean GLASS_SHOW_PARTICLES = true;

	@Comment("This list represents the list of entities react is ALLOWED to cull. Remove entities from this list if you do not want them being culled.")
	@Key("entity-types.allow-culling")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_CULL = getDefaultEntitiesForCulling();

	@Comment("This list represents the list of entities the purge command will purge if no selector is specified in the command. NOTE: React never automatically purges entities. Additionally, /re a purge-entities -f will ignore this list (force)")
	@Key("entity-types.allow-purging")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_PURGE = getDefaultEntitiesForRemoval();

	@Comment("This list represents the list of entities react is ALLOWED to stack together. Remove entities from this list if you do not want them being stacked.")
	@Key("entity-types.allow-stacking")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> ALLOW_STACKING = getDefaultEntitiesForStacking();

	@Comment("Rules for culling entities.")
	@Key("entity-types.culling-rules")
	@Injection(InjectionMethod.SWAP)
	public static GList<String> CULL_RULES = getDefaultCullRules();

	@Comment("DThe server is considered lagging if the tick time exeeds this value")
	@Key("rai.tps.high-tick")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 20.0, max = 70.0)
	public static double RAI_TPS_HIGH_TICK = 50.0;

	@Comment("Dynamic relative value to determine the minimum redstone tick for the current server tick time. Lower this to detect less intense redstone lag.")
	@Key("rai.redstone.time-floor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_REDSTONE_TIME_FLOOR = 2000000;

	@Comment("Dynamic relative value to determine the maximum redstone tick threshold for the current server tick time.")
	@Key("rai.redstone.time-ceil")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_REDSTONE_TIME_CEIL = 30000000;

	@Comment("Time Multiplier for mudding the floor and ceil")
	@Key("rai.redstone.time-mudding")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_REDSTONE_TIME_MUDDING = 2360000;

	@Comment("The function (linear) at which the ceil meets the floor")
	@Key("rai.redstone.time-function")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_REDSTONE_TIME_FUNCTION = 0.36;

	@Comment("The threshold the final function must meet to be considered lagging")
	@Key("rai.redstone.time-overbleed")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_REDSTONE_TIME_OVERBLEED = 1.54;

	@Comment("Radius multiplier for overbleed")
	@Key("rai.redstone.time-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_REDSTONE_TIME_RADIUS = 1;

	@Comment("How much time to randomly add to the chunk list if a specific chunk keeps causing lag.")
	@Key("rai.redstone.time-propagation")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_REDSTONE_TIME_PROPIGATION = 1000;

	@Comment("Minimum hopper nanos")
	@Key("rai.hopper.time-floor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_HOPPER_TIME_FLOOR = 2000000;

	@Comment("Max hopper nanos")
	@Key("rai.hopper.time-ceil")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_HOPPER_TIME_CEIL = 30000000;

	@Comment("Hopper mudding for floor to ceil")
	@Key("rai.hopper.time-mudding")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_HOPPER_TIME_MUDDING = 2360000;

	@Comment("Floor ceil function")
	@Key("rai.hopper.time-function")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_HOPPER_TIME_FUNCTION = 0.16;

	@Comment("Threshold for function to meet to be considered lagging")
	@Key("rai.hopper.time-overbleed")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_HOPPER_TIME_OVERBLEED = 1.54;

	@Comment("Function multiplier")
	@Key("rai.hopper.time-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_HOPPER_TIME_RADIUS = 1;

	@Comment("Time punishment for repeat lags per chunk")
	@Key("rai.hopper.time-propagation")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_HOPPER_TIME_PROPIGATION = 1000;

	@Comment("Chunk multiplier for entity mass checking")
	@Key("rai.entity.chunk-multiplier")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 5)
	public static int RAI_ENTITY_CHUNK_MULTIPLIER = 2;

	@Comment("Chunk clusterer (entities+multiplier*radius per chunk averaged)")
	@Key("rai.entity.chunk-clusterer")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 20, max = 100)
	public static int RAI_ENTITY_CHUNK_CLUSTERIZER = 30;

	@Comment("Radius to check around for entity mass")
	@Key("rai.entity.chunk-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_ENTITY_CHUNK_RADIUS = 2;

	@Comment("Min nanos")
	@Key("rai.fluid.time-floor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_FLUID_TIME_FLOOR = 2000000;

	@Comment("Max nanos for fluid")
	@Key("rai.fluid.time-ceil")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_FLUID_TIME_CEIL = 30000000;

	@Comment("Mudding for floor and ceil")
	@Key("rai.fluid.time-mudding")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_FLUID_TIME_MUDDING = 2360000;

	@Comment("Floor ceil function fluids")
	@Key("rai.fluid.time-function")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_FLUID_TIME_FUNCTION = 1.36;

	@Comment("Fluids function must reach this threshold to be considered lagging")
	@Key("rai.fluid.time-overbleed")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_FLUID_TIME_OVERBLEED = 1.54;

	@Comment("Time radius for fluids")
	@Key("rai.fluid.time-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_FLUID_TIME_RADIUS = 2;

	@Comment("Added punishment for repeat fluid chunks")
	@Key("rai.fluid.time-propagation")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_FLUID_TIME_PROPIGATION = 800;

	@Comment("The maximum entity tick time before throttling")
	@Key("features.tick-smearing.entities.max-time")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 100)
	public static double SMEAR_TICK_ENTITIES_MAX_TICK = 25;

	@Comment("The maximum tile tick time before throttling")
	@Key("features.tick-smearing.tiles.max-time")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 100)
	public static double SMEAR_TICK_TILES_MAX_TICK = 35;

	@Comment("Allow the entity tick throttle to be X higher than the current time to prevent odd skipping of entities, and to allow room for error.")
	@Key("features.tick-smearing.entities.seperation-bias")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0, max = 10)
	public static double SMEAR_TICK_ENTITIES_SEPERATION_BIAS = 0.65;

	@Comment("Allow the tile tick throttle to be X higher than the current time to prevent odd skipping of entities, and to allow room for error.")
	@Key("features.tick-smearing.tiles.seperation-bias")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0, max = 10)
	public static double SMEAR_TICK_TILES_SEPERATION_BIAS = 0.07;

	@Comment("How many ticks should the tick time be averaged across to compute biases")
	@Key("features.tick-smearing.entities.smear-factor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 5, max = 100)
	public static double SMEAR_TICK_ENTITIES_AMOUNT = 50;

	@Comment("How many ticks should the tick time be averaged across to compute biases")
	@Key("features.tick-smearing.tiles.smear-factor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 5, max = 100)
	public static double SMEAR_TICK_TILES_AMOUNT = 50;

	@Comment("Enable entity tick throttling")
	@Key("features.tick-smearing.entities.enable")
	@Injection(InjectionMethod.SWAP)
	public static boolean SMEAR_TICK_ENTITIES_ENABLE = true;

	@Comment("Enable tile tick throttling")
	@Key("features.tick-smearing.tiles.enable")
	@Injection(InjectionMethod.SWAP)
	public static boolean SMEAR_TICK_TILES_ENABLE = true;

	@Comment("Full hoppers for some reason spamtick and cause a ton of lag. React helps by preventing this from happening.")
	@Key("tweaks.hoppers.reduce-overtick-hoppers")
	@Injection(InjectionMethod.SWAP)
	public static boolean HOPPER_OVERTICK_ENABLE = true;

	@Comment("Generate configurations for each world (disable this if you have over 100 worlds)")
	@Key("features.react.worlds.world-configs")
	@Injection(InjectionMethod.SWAP)
	public static boolean USE_WORLD_CONFIGS = true;

	@Comment("Show particles on stacked entities. More particles = bigger stack. This is if you don't want to directly show players the stack size.")
	@Key("features.entity-stacker.options.show-particles")
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITY_STACKER_SHOW_PARTICLES = true;

	@Comment("Show a nametag of the stacked entity")
	@Key("features.entity-stacker.options.show-nametag")
	@Injection(InjectionMethod.SWAP)
	public static boolean ENTITY_STACKER_SHOW_NAME_TAG = false;

	@Comment("Language to use. Languages are downloaded from https://github.com/VolmitSoftware/React/tree/master/language")
	@Key("features.react.language")
	@Injection(InjectionMethod.SWAP)
	public static String LANGUAGE = "enUS";

	@Comment("Floor nanos")
	@Key("rai.chunk.time-floor")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 9000000)
	public static long RAI_CHUNK_TIME_FLOOR = 2000000;

	@Comment("Ceil nanos")
	@Key("rai.chunk.time-ceil")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 10000000, max = 50000000)
	public static long RAI_CHUNK_TIME_CEIL = 30000000;

	@Comment("Floor mudding")
	@Key("rai.chunk.time-mudding")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 2000000, max = 10000000)
	public static long RAI_CHUNK_TIME_MUDDING = 2360000;

	@Comment("Floor ceil function")
	@Key("rai.chunk.time-function")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.01, max = 1.5)
	public static double RAI_CHUNK_TIME_FUNCTION = 0.96;

	@Comment("Threshold chunk time needs to reach before considered lagging")
	@Key("rai.chunk.time-overbleed")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.05, max = 5.5)
	public static double RAI_CHUNK_TIME_OVERBLEED = 1.54;

	@Comment("Time radius for chunks")
	@Key("rai.chunk.time-radius")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 1, max = 3)
	public static int RAI_CHUNK_TIME_RADIUS = 2;

	@Comment("Time punishment for repeats")
	@Key("rai.chunk.time-propagation")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 500, max = 2000)
	public static int RAI_CHUNK_TIME_PROPIGATION = 10;

	@Comment("Handle this problem by firing off actions if this goal fails")
	@Key("rai.chunk.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_CHUNK_TIME_PROPIGATE = true;

	@Comment("Automatically freeze fluids for small amounts of time to reduce liquid physics load.")
	@Key("rai.fluid.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_FLUID_TIME_PROPIGATE = false;

	@Comment("Remove (some) entities in areas where density is high AND the global average of entities is considered high for the amount of chunks loaded, following the cull rules.")
	@Key("rai.entity.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_ENTITY_PROPIGATE = true;

	@Comment("Lock hoppers in regions where they are dense for periods of time.")
	@Key("rai.hopper.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_HOPPER_TIME_PROPIGATE = true;

	@Comment("Lock redstone in regions where they are dense for periods of time.")
	@Key("rai.redstone.propagate")
	@Experimental
	@Injection(InjectionMethod.SWAP)
	public static boolean RAI_REDSTONE_TIME_PROPIGATE = true;

	@Comment("Format for nametags\n%size% = Number of entities in stack\n%type% = Entity type i.e. Pig\n%hp% = Health\nColor codes and formatting supported.")
	@Key("features.entity-stacker.options.nametag-format")
	@Injection(InjectionMethod.SWAP)
	public static String ENTITY_STACKER_NAME_TAG_FORMAT = "&e%size%x &a%type% &c%hp%";

	@Comment("The maximum milliseconds react is allowed to use to fast-leaf decay")
	@Key("tweaks.fast-leaf-decay.max-ms")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.1, max = 50.0)
	public static double FAST_LEAF_MAX_MS = 0.8;

	@Comment("Throttle explosions by removing a percentage of tnt entities after it has exceeded the max ms set. This obviously breaks cannons.")
	@Key("tweaks.explosions.throttle-explosions")
	@Injection(InjectionMethod.SWAP)
	public static boolean THROTTLE_EXPLOSIONS = true;

	@Comment("The percent of tnt to be removed when tnt is over the max ms limit")
	@Key("tweaks.explosions.throttled-ratio")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 0.0, max = 0.9)
	public static double THROTTLED_RATIO = 0.65;

	@Comment("Use fast block changes (skipping updates and physics) for growth")
	@Key("tweaks.fast-growth.enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_GROWTH = true;

	@Comment("Skip block physics for explosion block damage. Breaks cannons obviously.")
	@Key("tweaks.explosions.fast-block-destruction")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_EXPLOSIONS = false;

	@Comment("Drops spawned from entities or blocks will not have a pickup cooldown. This reduces left behind drops while mining.")
	@Key("tweaks.drops.fast-drop-items")
	@Injection(InjectionMethod.SWAP)
	public static boolean DROPS_INSTADROP = false;

	@Comment("Skip spawning xp orbs if the player who caused the xp to drop is known (just give them the xp). Reduces entities.")
	@Key("tweaks.xp.fast-drop-xp")
	@Injection(InjectionMethod.SWAP)
	public static boolean SKIP_ORBS = true;

	@Comment("Fast pickup xp (all at once not sequentially)")
	@Key("tweaks.xp.fast-xp-pickup")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_ORB_PICKUP = false;

	@Comment("Instant teleport drops to the nearest player (only from entities and block drops)")
	@Key("tweaks.drops.teleport-to-source")
	@Injection(InjectionMethod.SWAP)
	public static boolean DROPS_TELEPORT = false;

	@Comment("Despawn arrows that cannot be picked up by players anyways. Think skeleton arrow landed entities.")
	@Key("tweaks.drops.despawn-useless-arrows")
	@Injection(InjectionMethod.SWAP)
	public static boolean DESPAWN_USELESS_ARROWS = true;

	@Comment("If factions is installed, this option will configure react to be more compatible with a factions server (cannon stuff etc)")
	@Key("tweaks.factions-compat")
	@Injection(InjectionMethod.SWAP)
	public static boolean FACTIONS = true;

	@Comment("The interval at which chunks are purged. Only chunks OUTSIDE of every player's view distance combined are purged.")
	@Key("tweaks.chunks.purge-interval")
	@Injection(InjectionMethod.SWAP)
	@Clip(min = 200, max = 720000)
	public static int PURGE_INTERVAL = 1200;

	@Comment("Should chunk purging be enabled? Only chunks OUTSIDE of every player's view distance combined are purged.")
	@Key("tweaks.chunks.purge-enabled")
	@Injection(InjectionMethod.SWAP)
	public static boolean PURGE = true;

	@Comment("Play sounds during react's usage (chat, monitor, map, etc)")
	@Key("features.react.interaction-sounds")
	@Injection(InjectionMethod.SWAP)
	public static boolean SOUNDS = true;

	@Comment("Enable the ability for players to request temporary access to react. Admins must accept the request. Admins are always able to revoke access too.")
	@Key("features.react.allow-tempaccess")
	@Injection(InjectionMethod.SWAP)
	public static boolean ALLOW_TEMPACCESS = true;

	@Comment("Monitor the main thread and warn the chat AND console if the server is locked. Please note that there is no way of knowing if the server is during a garbage collection. This means there WILL BE false positives. Especially with react.")
	@Key("features.react.track-server-locks")
	@Injection(InjectionMethod.SWAP)
	public static boolean TRACK_SERVER_LOCKS = true;

	@Comment("Use fast block destruction for fast leaf decay. Turn this on if you dont like snow floating above leaves, though you loose most of the performance benefits of fast decay.")
	@Key("tweaks.fast-leaf-decay.fast-destroy")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_LEAF_NMS = true;

	@Comment("Double crouching quickly locks and unlocks the monitor. Turn this off if you have a plugin such as vanish that uses this kind of mechanic. (/re mon -lock still works)")
	@Key("features.react.monitor.double-sneak-lock")
	@Injection(InjectionMethod.SWAP)
	public static boolean DOUBLE_LOCK_SNEAK = true;

	@Comment("Use protocollib to monitor keep alive packets to get super accurate (non averaged) ping values. Most ping plugins just grab the value from bukkit, but that value is usually inaccurate due to intense averaging paired with the slow ping update speed.")
	@Key("features.react.monitor.fast-ping")
	@Injection(InjectionMethod.SWAP)
	public static boolean FAST_PING = true;

	@Comment("Use NMS Adapters. Disabling this will basically make any nms or fast options do nothing either way. This may fix issues with FAWE and chunks on 1.8.8 though")
	@Key("features.react.nms-adapters")
	@Injection(InjectionMethod.SWAP)
	public static boolean USE_NMS = true;

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
		Plugin main = ReactPlugin.i;
		onRead(main);
		File fConfig = new File(main.getDataFolder(), "config.yml"); //$NON-NLS-1$
		File fConfigExperimental = new File(main.getDataFolder(), "config-experimental.yml"); //$NON-NLS-1$
		new YamlDataOutput().write(defaultConfig(false), fConfig);
		new YamlDataOutput().write(defaultConfig(true), fConfigExperimental);
		onRead(main);
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
			Ex.t(e);
		}

		try
		{
			read(fConfigExperimental, true);
		}

		catch(Throwable e)
		{
			Ex.t(e);
		}
	}

	private static void read(File in, boolean experimental) throws IllegalArgumentException, IllegalAccessException
	{
		if(!in.exists())
		{
			new YamlDataOutput().write(defaultConfig(experimental), in);
		}

		new YamlDataOutput().write(read(new YamlDataInput().read(in), experimental), in);
	}

	public static WorldConfig getWorldConfig(World w)
	{
		if(!worldConfigs.containsKey(w))
		{
			WorldConfig wc = new WorldConfig();
			wc.load(w);
			worldConfigs.put(w, wc);
			wc.save(w);
		}

		return worldConfigs.get(w);
	}

	public static void closeWorldConfig(World w)
	{
		if(!worldConfigs.containsKey(w))
		{
			return;
		}

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

				String comment = i.isAnnotationPresent(Comment.class) ? i.getAnnotation(Comment.class).value() : null;
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
								Ex.t(e);
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

				if(comment != null)
				{
					cc.comment(key, comment);
				}
			}
		}

		new TaskLater("", 2)
		{
			@Override
			public void run()
			{
				React.instance.entityCullController.repopulateRules();
			}
		};

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

				if(!i.isAnnotationPresent(Comment.class))
				{
					continue;
				}

				String comment = i.getAnnotation(Comment.class).value();
				cc.comment(key, comment);
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

	public static GList<Note> getSelectedChannels()
	{
		GList<Note> n = new GList<Note>();

		for(String i : VERBOSE_CHANNELS)
		{
			Note no = Note.valueOf(i.toUpperCase());

			if(no != null)
			{
				n.add(no);
			}
		}

		return n;
	}

	private static GList<String> getDefaultChannels()
	{
		GList<String> s = new GList<String>();

		for(Note i : Note.values())
		{
			s.add(i.name().toLowerCase());
		}

		return s;
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
			Ex.t(e);
		}
	}
}
