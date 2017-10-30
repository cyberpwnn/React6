package react.api;

import org.bukkit.command.CommandSender;
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

	@Override
	public int parse(CommandSender sender, String input) throws SelectorParseException
	{
		return 0;
	}

	@Override
	public String getName()
	{
		return "entity type";
	}
}
