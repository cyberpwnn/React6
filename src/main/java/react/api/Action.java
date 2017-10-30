package react.api;

import surge.collection.GList;
import surge.collection.GMap;
import surge.util.Callback;

public abstract class Action implements IAction
{
	private String name;
	private String description;
	private String status;
	private String[] nodes;
	private ActionHandle handle;
	private ActionState state;
	private ActionTargetType target;
	private ActionType type;
	private IActionSource currentSource;
	private double progress;
	private GMap<Class<?>, Callback<ISelector>> defaultSelectors;

	public Action(ActionType type)
	{
		this(type.getName(), type.getDescription(), type.getHandle(), type.getTarget(), type);
	}

	public Action(String name, String description, ActionHandle handle, ActionTargetType target, ActionType type)
	{
		this.name = name;
		this.description = description;
		this.handle = handle;
		this.status = "";
		this.progress = 0;
		this.state = ActionState.IDLE;
		this.target = target;
		this.type = type;
		defaultSelectors = new GMap<Class<?>, Callback<ISelector>>();
		currentSource = null;
		nodes = new String[0];
	}

	@Override
	public ISelector[] biselect(ISelector... selectors)
	{
		GList<ISelector> set = new GList<ISelector>(selectors);

		checking: for(Class<?> i : getDefaultSelectors().k())
		{
			for(ISelector j : selectors)
			{
				if(j.getType().equals(i))
				{
					continue checking;
				}
			}

			set.add(getDefaultSelectors().get(i).get());
		}

		return set.toArray(new ISelector[set.size()]);
	}

	@Override
	public void setDefaultSelector(Class<?> clazz, Callback<ISelector> selector)
	{
		defaultSelectors.put(clazz, selector);
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

	@Override
	public ActionTargetType getTarget()
	{
		return target;
	}

	@Override
	public ActionType getType()
	{
		return type;
	}

	@Override
	public GMap<Class<?>, Callback<ISelector>> getDefaultSelectors()
	{
		return defaultSelectors;
	}

	@Override
	public void act(IActionSource source, ISelector... selectors) throws ActionAlreadyRunningException
	{
		if(getState().equals(ActionState.RUNNING))
		{
			throw new ActionAlreadyRunningException();
		}

		state = ActionState.RUNNING;
		currentSource = source;

		enact(source, biselect(selectors));
	}

	@Override
	public void completeAction()
	{
		state = ActionState.IDLE;
	}

	@Override
	public IActionSource getCurrentSource()
	{
		return currentSource;
	}

	@Override
	public String[] getNodes()
	{
		return nodes;
	}

	@Override
	public void setNodes(String... nodes)
	{
		this.nodes = nodes;
	}

	@Override
	public abstract void enact(IActionSource source, ISelector... selectors);
}
