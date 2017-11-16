package react;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import surge.util.C;
import surge.util.TXT;

public class Gate
{
	public static String msg(CommandSender p, String msg)
	{
		String s = TXT.makeTag(C.AQUA, C.DARK_GRAY, C.GRAY, Info.CORE_NAME) + msg;
		p.sendMessage(s);

		return s;
	}

	public static String msgRAI(CommandSender p, String msg)
	{
		String s = TXT.makeTag(C.AQUA, C.DARK_GRAY, C.GRAY, "RAI") + msg;
		p.sendMessage(s);

		return s;
	}

	public static String msgSuccess(CommandSender p, String msg)
	{
		return msg(p, C.GREEN + "\u2714 " + C.GRAY + msg);
	}

	public static String msgError(CommandSender p, String msg)
	{
		return msg(p, C.RED + "\u2718 " + C.GRAY + msg);
	}

	public static String msgActing(CommandSender p, String msg)
	{
		return msg(p, C.GOLD + "\u26A0 " + C.GRAY + msg);
	}

	public static void unloadChunk(Chunk c)
	{
		c.unload();
	}

	public static void unloadChunk(World w, int x, int z)
	{
		w.unloadChunk(x, z);
	}

	private static void removeEntity(Entity e)
	{
		if(e instanceof Player)
		{
			return;
		}

		e.remove();
	}

	public static void purgeEntity(Entity e)
	{
		if(!Config.ALLOW_PURGE.contains(e.getType().toString()))
		{
			return;
		}

		removeEntity(e);
	}

	public static void cullEntity(Entity e)
	{
		if(!Config.ALLOW_CULL.contains(e.getType().toString()))
		{
			return;
		}

		removeEntity(e);
	}

	public static void cachedEntity(Entity e)
	{
		if(!Config.ALLOW_CACHE.contains(e.getType().toString()))
		{
			return;
		}

		removeEntity(e);
	}

	public static void cacheEntity(Entity e)
	{
		if(e instanceof Player)
		{
			return;
		}

		if(!Config.ALLOW_CACHE.contains(e.getType().toString()))
		{
			return;
		}

		React.instance.entityCacheController.pop(e);
	}

	public static int restoreEntities(Chunk chunk)
	{
		return React.instance.entityCacheController.push(chunk);
	}

	@SuppressWarnings("deprecation")
	public static void updateBlock(Block block)
	{
		int id = block.getTypeId();
		byte byt = block.getData();
		block.setTypeIdAndData(1, (byte) 0, false);
		block.setTypeIdAndData(id, byt, true);
	}
}
