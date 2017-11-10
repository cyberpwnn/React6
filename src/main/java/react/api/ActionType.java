package react.api;

import react.Info;

public enum ActionType
{
	CULL_ENTITIES(ActionHandle.MUTEX, ActionTargetType.POSITIONAL, Info.ACTION_CULL_ENTITIES_NAME, Info.ACTION_CULL_ENTITIES_DESCRIPTION),
	PURGE_ENTITIES(ActionHandle.MUTEX, ActionTargetType.POSITIONAL, Info.ACTION_PURGE_ENTITIES_NAME, Info.ACTION_PURGE_ENTITIES_DESCRIPTION),
	PURGE_CHUNKS(ActionHandle.MUTEX, ActionTargetType.POSITIONAL, Info.ACTION_PURGE_CHUNKS_NAME, Info.ACTION_PURGE_CHUNKS_DESCRIPTION);

	private String name;
	private String description;
	private ActionHandle handle;
	private ActionTargetType target;

	private ActionType(ActionHandle handle, ActionTargetType target, String name, String description)
	{
		this.name = name;
		this.description = description;
		this.handle = handle;
		this.target = target;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public ActionHandle getHandle()
	{
		return handle;
	}

	public ActionTargetType getTarget()
	{
		return target;
	}
}
