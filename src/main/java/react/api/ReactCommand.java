package react.api;

public abstract class ReactCommand implements ICommand
{
	protected String command;
	protected String[] aliases;
	protected String[] permissions;
	protected String usage;
	protected String description;
	protected SideGate sideGate;

	public ReactCommand()
	{

	}

	@Override
	public String getCommand()
	{
		return command;
	}

	@Override
	public String[] getAliases()
	{
		return aliases;
	}

	@Override
	public String[] getPermissions()
	{
		return permissions;
	}

	@Override
	public String getUsage()
	{
		return usage;
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	@Override
	public SideGate getSideGate()
	{
		return sideGate;
	}
}
