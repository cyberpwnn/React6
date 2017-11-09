package react.api;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

public class EntitySample
{
	private GMap<EntityType, Integer> counts;

	public EntitySample()
	{
		counts = new GMap<EntityType, Integer>();
	}

	public EntitySample(Chunk c)
	{
		for(Entity i : c.getEntities())
		{
			add(i.getType());
		}
	}

	public GList<EntityType> getTypes()
	{
		return counts.k();
	}

	public int total()
	{
		int t = 0;

		for(EntityType i : getTypes())
		{
			t += get(i);
		}

		return t;
	}

	public int get(EntityType i)
	{
		if(counts.containsKey(i))
		{
			return counts.get(i);
		}

		return 0;
	}

	public void add(EntityType i)
	{
		if(!counts.containsKey(i))
		{
			counts.put(i, 0);
		}

		counts.put(i, counts.get(i) + 1);
	}
}
