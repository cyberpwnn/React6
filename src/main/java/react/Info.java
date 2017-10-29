package react;

import react.api.Lang;

public class Info
{
	public static String CORE_REACT_DOT = "react.";
	public static String CORE_NAME = "React";
	public static String CORE_CACHE = "cache";
	public static String CORE_DOTYML = ".yml";

	public static String COMMAND_HELP = "help";
	public static String COMMAND_HELP_ALIAS_1 = "h";
	public static String COMMAND_HELP_ALIAS_2 = "?";
	public static String COMMAND_HELP_USAGE = "/react help";

	@Lang("command-description.help")
	public static String COMMAND_HELP_DESCRIPTION = "Shows a list of commands to use";
	public static String COMMAND_MONITOR = "monitor";
	public static String COMMAND_MONITOR_ALIAS_1 = "mon";
	public static String COMMAND_MONITOR_ALIAS_2 = "m";
	public static String COMMAND_MONITOR_USAGE = "/react monitor";

	@Lang("command-description.monitor")
	public static String COMMAND_MONITOR_DESCRIPTION = "Toggles the monitor";
	public static String COMMAND_REACT = "react";

	public static String MSG_PERMISSION = "Insufficient Permission";
	public static String MSG_MONITORING_STARTED = "Monitoring Enabled";
	public static String MSG_MONITORING_STOPPED = "Monitoring Disabled";

	@Lang("monitor-title.tick")
	public static String NAME_TICK = "Tick";

	@Lang("monitor-title.memory")
	public static String NAME_MEMORY = "Memory";

	@Lang("monitor-title.chunks")
	public static String NAME_CHUNKS = "Chunks";

	@Lang("monitor-title.entities")
	public static String NAME_ENTITIES = "Entities";

	public static String STATE_MONITORING_TAB = "monitor.tab";
	public static String STATE_MONITORING_ENABLED = "monitor.enabled";
	public static String STATE_MAPPING_ENABLED = "map.enabled";
	public static String STATE_SOUND_PLAYS = "player.sound-buffer";
	public static String STATE_MONITORING_POSTED = "monitor.posted";
	public static String STATE_MONITORING_LASTTAB = "monitor.last-tab";
	public static String STATE_MONITORING_SWITCHNOTIFICATION = "monitor.switch-notification";
	public static String STATE_PLAYER_HOTBAR = "player.hotbar";
	public static String STATE_PLAYER_SHIFT = "player.shift";
	public static String STATE_PLAYER_SCROLL = "player.scroll";
	public static String STATE_PLAYER_HEIGHT_CURRENT = "player.height-current";
	public static String STATE_PLAYER_HEIGHT_CHANGING = "player.height-delta";

	public static String PERM_ACCESS = "access";
	public static String PERM_MONITOR = "monitor";
	public static String PERM_MONITOR_TITLE = PERM_MONITOR + ".title";
	public static String PERM_MONITOR_MAP = PERM_MONITOR + ".map";
	public static String PERM_MONITOR_ENVIRONMENT = PERM_MONITOR + ".environment";
	public static String PERM_ACT = "act";
	public static String PERM_RELOAD = "reload";

	public static String SAMPLER_TPS = "TPS";
	public static String SAMPLER_TICK = "TICK";
	public static String SAMPLER_TIU = "TIU";
	public static String SAMPLER_MEM = "MEM";
	public static String SAMPLER_FREEMEM = "FREEMEM";
	public static String SAMPLER_MAXMEM = "MAXMEM";
	public static String SAMPLER_ALLOCMEM = "ALLOCMEM";
	public static String SAMPLER_MAHS = "MAHS";
	public static String SAMPLER_CHK = "CHK";
	public static String SAMPLER_CHKS = "CHKS";
	public static String SAMPLER_ENT = "ENT";
	public static String SAMPLER_ENTLIV = "ENTLIV";
	public static String SAMPLER_ENTDROP = "ENTCDROP";
	public static String SAMPLER_ENTTILE = "ENTTILE";

	@Lang("action.purge-entities.name")
	public static String ACTION_PURGE_ENTITIES_NAME = "Purge Entities";

	@Lang("action.purge-entities.description")
	public static String ACTION_PURGE_ENTITIES_DESCRIPTION = "Removes entities in the specified locations and entity types.";
}
