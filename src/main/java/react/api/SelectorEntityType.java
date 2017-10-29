package react.api;

import org.bukkit.entity.EntityType;

public class SelectorEntityType extends Selector
{
	public SelectorEntityType(SelectionMode mode)
	{
		super(EntityType.class, mode);

		for(EntityType i : EntityType.values())
		{
			getPossibilities().add(i);
		}
	}

	public void add(EntityType type)
	{
		getList().add(type);
	}
}
