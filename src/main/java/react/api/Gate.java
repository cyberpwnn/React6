package react.api;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import react.React;

public class Gate
{
	public static void removeEntity(Entity e)
	{
		if(e instanceof Player)
		{
			return;
		}

		e.remove();
	}

	public static void cacheEntity(Entity e)
	{
		if(e instanceof Player)
		{
			return;
		}

		React.instance.entityCacheController.pop(e);
	}

	public static int restoreEntities(Chunk chunk)
	{
		return React.instance.entityCacheController.push(chunk);
	}
}
