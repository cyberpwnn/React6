package react;

import org.bukkit.Color;
import org.bukkit.DyeColor;

public class Info
{
	public static String SECRET_IS_GENUINE = "$84912b67aff14cd1ac334d18a8c68ee8";
	public static String SECRET_IS_GENUINE_VERBOSE = "$f859f89324af4072b2cf54218c1c792e";
	public static String SECRET_RESCAN = "$02d0bac6de704c4481c19cb52a273742";
	public static String SECRET_DELETE = "$e06b7545631344469a461408092dfc4b";

	public static String CORE_REACT_DOT = "react.";
	public static String CORE_NAME = "React";
	public static String CORE_CACHE = "cache";
	public static String CORE_DOTYML = ".yml";

	public static String COMMAND_REACT = "react";
	public static String COMMAND_RAI = "rai";
	public static String COMMAND_ACT_DESCRIPTION = "Runs an action";
	public static String COMMAND_ACT = "action";
	public static String COMMAND_ACT_ALIAS_1 = "act";
	public static String COMMAND_ACT_ALIAS_2 = "a";
	public static String COMMAND_ACT_USAGE = "/react action <action> [options]";

	public static String COMMAND_HELP_DESCRIPTION = "Shows a list of commands to use";
	public static String COMMAND_HELP = "help";
	public static String COMMAND_HELP_ALIAS_1 = "h";
	public static String COMMAND_HELP_ALIAS_2 = "?";
	public static String COMMAND_HELP_USAGE = "/react help";

	public static String COMMAND_STATUS_DESCRIPTION = "Give a book of status information";
	public static String COMMAND_STATUS = "status";
	public static String COMMAND_STATUS_ALIAS_1 = "stat";
	public static String COMMAND_STATUS_ALIAS_2 = "book";
	public static String COMMAND_STATUS_USAGE = "/react status";

	public static String COMMAND_CPUSCORE_DESCRIPTION = "Benchmarks the cpu to a score";
	public static String COMMAND_CPUSCORE = "cpu-score";
	public static String COMMAND_CPUSCORE_ALIAS_1 = "cpus";
	public static String COMMAND_CPUSCORE_ALIAS_2 = "cs";
	public static String COMMAND_CPUSCORE_USAGE = "/react cpu-score";

	public static String COMMAND_RELOAD_DESCRIPTION = "Reloads React";
	public static String COMMAND_RELOAD = "reload";
	public static String COMMAND_RELOAD_ALIAS_1 = "rld";
	public static String COMMAND_RELOAD_ALIAS_2 = "rl";
	public static String COMMAND_RELOAD_USAGE = "/react reload";

	public static String COMMAND_MONITOR_DESCRIPTION = "Toggles the monitor";
	public static String COMMAND_MONITOR = "monitor";
	public static String COMMAND_MONITOR_ALIAS_1 = "mon";
	public static String COMMAND_MONITOR_ALIAS_2 = "m";
	public static String COMMAND_MONITOR_USAGE = "/react monitor";

	public static String COMMAND_MAP_DESCRIPTION = "Toggles the map";
	public static String COMMAND_MAP = "map";
	public static String COMMAND_MAP_ALIAS_1 = "mp";
	public static String COMMAND_MAP_ALIAS_2 = "pap";
	public static String COMMAND_MAP_USAGE = "/react map";

	public static String COMMAND_GLASS_DESCRIPTION = "Toggles React Glass";
	public static String COMMAND_GLASS = "glass";
	public static String COMMAND_GLASS_ALIAS_1 = "glasses";
	public static String COMMAND_GLASS_ALIAS_2 = "gg";
	public static String COMMAND_GLASS_USAGE = "/react glass";

	public static String COMMAND_ACTIONLOG_DESCRIPTION = "Toggles React Action Log";
	public static String COMMAND_ACTIONLOG = "actionlog";
	public static String COMMAND_ACTIONLOG_ALIAS_1 = "alog";
	public static String COMMAND_ACTIONLOG_ALIAS_2 = "al";
	public static String COMMAND_ACTIONLOG_USAGE = "/react actionlog";

	public static String MSG_PERMISSION = "Insufficient Permission";
	public static String MSG_MONITORING_STARTED = "Monitoring Enabled";
	public static String MSG_MONITORING_STOPPED = "Monitoring Disabled";
	public static String MSG_ACTIONLOGGING_STARTED = "Action Logging Enabled";
	public static String MSG_ACTIONLOGGING_STOPPED = "Action Logging Disabled";
	public static String MSG_GLASS_STARTED = "Glass Enabled";
	public static String MSG_GLASS_STOPPED = "Glass Disabled";

	public static Color COLOR_HOPPER = DyeColor.CYAN.getColor();
	public static Color COLOR_BLOCK_UPDATE = DyeColor.RED.getColor();
	public static Color COLOR_BLOCK_FROMTO = DyeColor.GREEN.getColor();
	public static Color COLOR_BLOCK_BURN = DyeColor.PURPLE.getColor();
	public static Color COLOR_BLOCK_DECAY = DyeColor.PURPLE.getColor();
	public static Color COLOR_BLOCK_FORM = DyeColor.PURPLE.getColor();

	public static String NAME_TICK = "Tick";
	public static String NAME_MEMORY = "Memory";
	public static String NAME_CHUNKS = "Chunks";
	public static String NAME_ENTITIES = "Entities";

	public static String STATE_MONITORING_TAB = "monitor.tab";
	public static String STATE_MONITORING_ENABLED = "monitor.enabled";
	public static String STATE_ACTIONLOGGING_ENABLED = "actionlogging.enabled";
	public static String STATE_MAPPING_ENABLED = "map.enabled";
	public static String STATE_SOUND_PLAYS = "player.sound-buffer";
	public static String STATE_MONITORING_POSTED = "monitor.posted";
	public static String STATE_MONITORING_LASTTAB = "monitor.last-tab";
	public static String STATE_GLASSES_ENABLED = "glasses.enabled";
	public static String STATE_MONITORING_SWITCHNOTIFICATION = "monitor.switch-notification";
	public static String STATE_PLAYER_HOTBAR = "player.hotbar";
	public static String STATE_PLAYER_SHIFT = "player.shift";
	public static String STATE_PLAYER_SCROLL = "player.scroll";
	public static String STATE_PLAYER_HEIGHT_CURRENT = "player.height-current";
	public static String STATE_PLAYER_HEIGHT_CHANGING = "player.height-delta";

	public static String PERM_ACCESS = "access";
	public static String PERM_MONITOR = "monitor";
	public static String PERM_MONITOR_TITLE = PERM_MONITOR + ".title";
	public static String PERM_MONITOR_ACTIONLOG = PERM_MONITOR + ".actionlog";
	public static String PERM_MONITOR_MAP = PERM_MONITOR + ".map";
	public static String PERM_MONITOR_ENVIRONMENT = PERM_MONITOR + ".environment";
	public static String PERM_MONITOR_GLASSES = PERM_MONITOR + ".glasses";
	public static String PERM_ACT = "act";
	public static String PERM_RAI = "rai";
	public static String PERM_RAI_CONTROL = PERM_RAI + ".control";
	public static String PERM_RAI_ACCESS = PERM_RAI + ".access";
	public static String PERM_RAI_MONITOR = PERM_RAI + ".monitor";
	public static String PERM_RELOAD = "reload";

	public static String SAMPLER_REDSTONE_TICK_USAGE = "RSTU";
	public static String SAMPLER_REDSTONE_TICK = "RST";
	public static String SAMPLER_ENTITY_TIME = "ENTITY TIME";
	public static String SAMPLER_ENTITY_TIME_LOCK = "ENTITY LOCK";
	public static String SAMPLER_TILE_TIME_LOCK = "TILE LOCK";
	public static String SAMPLER_TILE_TIME = "TILE TIME";
	public static String SAMPLER_TILE_DROPTICK = "TILE DROPTICK";
	public static String SAMPLER_ENTITY_DROPTICK = "ENTITY DROPTICK";
	public static String SAMPLER_REDSTONE_SECOND = "RSS";
	public static String SAMPLER_REDSTONE_TIME = "RSMS";
	public static String SAMPLER_HOPPER_TICK_USAGE = "HTU";
	public static String SAMPLER_HOPPER_TICK = "HT";
	public static String SAMPLER_HOPPER_SECOND = "HS";
	public static String SAMPLER_HOPPER_TIME = "HMS";
	public static String SAMPLER_FLUID_TICK_USAGE = "FTU";
	public static String SAMPLER_FLUID_TICK = "FT";
	public static String SAMPLER_FLUID_SECOND = "FS";
	public static String SAMPLER_FLUID_TIME = "FMS";
	public static String SAMPLER_TPS = "TPS";
	public static String SAMPLER_TICK = "TICK";
	public static String SAMPLER_TIU = "TIU";
	public static String SAMPLER_MEM = "MEM";
	public static String SAMPLER_FREEMEM = "FREEMEM";
	public static String SAMPLER_MAXMEM = "MAXMEM";
	public static String SAMPLER_ALLOCMEM = "ALLOCMEM";
	public static String SAMPLER_MAHS = "MAHS";
	public static String SAMPLER_CHK = "CHK";
	public static String SAMPLER_ATASK = "STASK";
	public static String SAMPLER_STASK = "ATASK";
	public static String SAMPLER_CHK_TIME = "CHK TIME";
	public static String SAMPLER_CHKS = "CHKS";
	public static String SAMPLER_ENT = "ENT";
	public static String SAMPLER_ENTLIV = "ENTLIV";
	public static String SAMPLER_ENTDROP = "ENTCDROP";
	public static String SAMPLER_ENTTILE = "ENTTILE";

	public static String[] ACTION_CULL_ENTITIES_TAGS = new String[] {"cull-entities", "ce"};
	public static String ACTION_CULL_ENTITIES_STATUS = "Culling $c / $t ($p)";
	public static String ACTION_CULL_ENTITIES_NAME = "Cull Entities";
	public static String ACTION_CULL_ENTITIES_DESCRIPTION = "Culls entities in the specified locations and entity types.";

	public static String[] ACTION_UPDATE_FLUID_TAGS = new String[] {"update-fluid", "upf"};
	public static String ACTION_UPDATE_FLUID_STATUS = "Updating Fluid $c / $t ($p)";
	public static String ACTION_UPDATE_FLUID_NAME = "Update Fluid";
	public static String ACTION_UPDATE_FLUID_DESCRIPTION = "Updates (restarts) ALL fluids in various chunks.";

	public static String[] ACTION_LOCK_FLUID_TAGS = new String[] {"lock-fluid", "lf"};
	public static String ACTION_LOCK_FLUID_STATUS = "Locking Fluid $c / $t ($p)";
	public static String ACTION_LOCK_FLUID_NAME = "Lock Fluid";
	public static String ACTION_LOCK_FLUID_DESCRIPTION = "Locks (stops) fluids in various chunks for a time period.";

	public static String[] ACTION_UNLOCK_FLUID_TAGS = new String[] {"unlock-fluid", "ulf"};
	public static String ACTION_UNLOCK_FLUID_STATUS = "Unlocking Fluid $c / $t ($p)";
	public static String ACTION_UNLOCK_FLUID_NAME = "Unlock Fluid";
	public static String ACTION_UNLOCK_FLUID_DESCRIPTION = "Unlocks (restarts) fluids in various chunks.";

	public static String[] ACTION_LOCK_HOPPER_TAGS = new String[] {"lock-hopper", "lh"};
	public static String ACTION_LOCK_HOPPER_STATUS = "Locking Hopper $c / $t ($p)";
	public static String ACTION_LOCK_HOPPER_NAME = "Lock Hopper";
	public static String ACTION_LOCK_HOPPER_DESCRIPTION = "Locks (stops) hoppers in various chunks for a time period.";

	public static String[] ACTION_UNLOCK_HOPPER_TAGS = new String[] {"unlock-hopper", "ulh"};
	public static String ACTION_UNLOCK_HOPPER_STATUS = "Unlocking Hopper $c / $t ($p)";
	public static String ACTION_UNLOCK_HOPPER_NAME = "Unlock Hopper";
	public static String ACTION_UNLOCK_HOPPER_DESCRIPTION = "Unlocks (restarts) hoppers in various chunks.";

	public static String[] ACTION_LOCK_REDSTONE_TAGS = new String[] {"lock-redstone", "lr"};
	public static String ACTION_LOCK_REDSTONE_STATUS = "Locking Redstone $c / $t ($p)";
	public static String ACTION_LOCK_REDSTONE_NAME = "Lock Redstone";
	public static String ACTION_LOCK_REDSTONE_DESCRIPTION = "Locks (stops) redstone in various chunks for a time period.";

	public static String[] ACTION_UNLOCK_REDSTONE_TAGS = new String[] {"unlock-redstone", "ulr"};
	public static String ACTION_UNLOCK_REDSTONE_STATUS = "Unlocking Redstone $c / $t ($p)";
	public static String ACTION_UNLOCK_REDSTONE_NAME = "Unlock Redstone";
	public static String ACTION_UNLOCK_REDSTONE_DESCRIPTION = "Unlocks (restarts) redstone in various chunks.";

	public static String[] ACTION_PURGE_ENTITIES_TAGS = new String[] {"purge-entities", "pe"};
	public static String ACTION_PURGE_ENTITIES_STATUS = "Purging $c / $t ($p)";
	public static String ACTION_PURGE_ENTITIES_NAME = "Purge Entities";
	public static String ACTION_PURGE_ENTITIES_DESCRIPTION = "Removes entities in the specified locations and entity types.";

	public static String[] ACTION_PURGE_CHUNKS_TAGS = new String[] {"purge-chunks", "pc"};
	public static String ACTION_PURGE_CHUNKS_STATUS = "Purging $c / $t ($p)";
	public static String ACTION_PURGE_CHUNKS_NAME = "Purge Chunks";
	public static String ACTION_PURGE_CHUNKS_DESCRIPTION = "Unloads chunks in the specified locations.";
}
