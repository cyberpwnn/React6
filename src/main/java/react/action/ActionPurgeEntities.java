package react.action;

import react.api.Action;
import react.api.ActionHandle;
import react.api.IActionSource;
import surge.util.PositionalSelector;

public class ActionPurgeEntities extends Action
{
	public ActionPurgeEntities(String name, String description, ActionHandle handle)
	{
		super(name, description, handle);
	}

	@Override
	public void act(IActionSource source, PositionalSelector position)
	{
		// TODO Auto-generated method stub

	}
}
