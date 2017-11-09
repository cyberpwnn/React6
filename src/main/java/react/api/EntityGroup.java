package react.api;

import org.bukkit.entity.EntityType;
import org.cyberpwn.glang.GSet;

public class EntityGroup
{
	private GSet<EntityType> entityTypes;

	public EntityGroup()
	{
		entityTypes = new GSet<EntityType>();
	}

	public GSet<EntityType> getEntityTypes()
	{
		return entityTypes;
	}
}