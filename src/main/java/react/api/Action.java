package react.api;

public abstract class Action implements IAction
{
	private String name;
	private String description;
	private String status;
	private ActionHandle handle;
	private ActionState state;
	private double progress;

	public Action(String name, String description, ActionHandle handle)
	{
		this.name = name;
		this.description = description;
		this.handle = handle;
		this.status = "";
		this.progress = 0;
		this.state = ActionState.IDLE;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	@Override
	public ActionHandle getHandleType()
	{
		return handle;
	}

	@Override
	public ActionState getState()
	{
		return state;
	}

	@Override
	public String getStatus()
	{
		return status;
	}

	@Override
	public void setStatus(String status)
	{
		this.status = status;
	}

	@Override
	public double getProgress()
	{
		return progress;
	}

	@Override
	public void setProgress(double progress)
	{
		this.progress = progress;
	}
}
