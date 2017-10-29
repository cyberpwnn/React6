package react.action;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import react.api.Action;
import react.api.ActionHandle;
import react.api.Gate;
import react.api.IActionSource;
import react.api.ISelector;
import surge.pool.S;

public class ActionPurgeEntities extends Action
{
	public ActionPurgeEntities()
	{
		super("tbd", "tbd", ActionHandle.MUTEX);
	}

	@Override
	public void act(IActionSource source, ISelector... selectors)
	{
		for(ISelector i : selectors)
		{
			if(i.getType().equals(Chunk.class))
			{
				for(Object j : i.getPossibilities())
				{
					if(i.can(j))
					{
						purge((Chunk) j, source, selectors);
					}
				}
			}
		}
	}

	public void purge(Chunk chunk, IActionSource source, ISelector... selectors)
	{
		seeking: for(Entity i : chunk.getEntities())
		{
			for(ISelector j : selectors)
			{
				if(j.getType().equals(EntityType.class))
				{
					if(!j.can(i.getType()))
					{
						continue seeking;
					}
				}
			}

			new S()
			{
				@Override
				public void run()
				{
					Gate.removeEntity(i);
				}
			};
		}
	}
}
