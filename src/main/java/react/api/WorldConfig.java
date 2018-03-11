package react.api;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.World;

import com.volmit.react.surge.Surge;
import com.volmit.react.util.GList;

import react.Config;
import react.Info;
import surge.cluster.ConfigurationDataInput;
import surge.cluster.ConfigurationDataOutput;
import surge.cluster.IConfigurable;
import surge.cluster.Key;

public class WorldConfig implements IConfigurable
{
	@Key("allow.rai")
	public boolean allowRai = true;

	@Key("allow.actions")
	public boolean allowActions = true;

	@Key("allow.relighting")
	public boolean allowRelighting = true;

	@Key("allow.tile-throttling")
	public boolean allowTileThrottling = true;

	@Key("allow.entity-throttling")
	public boolean allowEntityThrottling = true;

	@Key("allow.fast-leaf-decay")
	public boolean allowFastLeafDecay = true;

	@Key("entities.assume-no-side-effects")
	public List<String> assumeNoSideEffectsEntities = new ArrayList<String>(new GList<String>().qadd("ARMOR_STAND"));

	public File getConfigFile(World world)
	{
		return new File(Surge.folder(Info.WORLD_CONFIGS), world.getName() + "-" + world.getSeed() + Info.CORE_DOTYML);
	}

	public void save(World world)
	{
		if(!Config.USE_WORLD_CONFIGS)
		{
			return;
		}

		try
		{
			new ConfigurationDataOutput().write(this, getConfigFile(world));
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void load(World world)
	{
		if(!Config.USE_WORLD_CONFIGS)
		{
			return;
		}

		try
		{
			new ConfigurationDataInput().read(this, getConfigFile(world));
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
