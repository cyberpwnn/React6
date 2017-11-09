package react.controller;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.api.EntityGroup;
import react.api.EntitySample;
import react.api.Gate;
import surge.control.Controller;

public class EntityCullController extends Controller
{
	private GMap<EntityGroup, Integer> maxs;

	@Override
	public void start()
	{
		maxs = new GMap<EntityGroup, Integer>();
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{

	}

	public void cull(Chunk c)
	{
		EntitySample sample = new EntitySample(c);
		EntityType toKill = null;

		for(EntityGroup i : maxs.k())
		{
			int total = maxs.get(i);
			int ktotal = 0;
			GList<EntityType> al = new GList<EntityType>();

			for(EntityType j : sample.getTypes())
			{
				if(i.getEntityTypes().contains(j))
				{
					ktotal += sample.get(j);
					al.add(j);
				}
			}

			if(ktotal > total)
			{
				toKill = al.pickRandom();
			}
		}

		if(toKill != null)
		{
			for(Entity i : c.getEntities())
			{
				if(i.getType().equals(toKill))
				{
					Gate.cullEntity(i);
					break;
				}
			}

			cull(c);
		}
	}
}
