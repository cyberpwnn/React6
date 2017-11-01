package react.api;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;

import react.React;

public class Gate
{
	public static void removeEntity(Entity e)
	{
		e.remove();
	}

	public static void cacheEntity(Entity i)
	{
		React.instance.entityCacheController.pop(i);
	}

	public static int restoreEntities(Chunk chunk)
	{
		return React.instance.entityCacheController.push(chunk);
	}
}
