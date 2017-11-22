package react.controller;

import java.lang.reflect.InvocationTargetException;

import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GTriset;

import react.api.ActionAlreadyRunningException;
import react.api.ActionState;
import react.api.ActionType;
import react.api.IAction;
import react.api.IActionSource;
import react.api.ISelector;
import surge.Main;
import surge.control.Controller;

public class ActionController extends Controller
{
	private static int kiv = 0;
	private GMap<ActionType, IAction> actions;
	public GMap<Integer, GTriset<ActionType, IActionSource, GList<ISelector>>> pending;
	public GList<String> tasks;

	@Override
	public void start()
	{
		tasks = new GList<String>();
		pending = new GMap<Integer, GTriset<ActionType, IActionSource, GList<ISelector>>>();
		actions = new GMap<ActionType, IAction>();

		for(Class<?> i : Main.anchors.get(1))
		{
			try
			{
				registerAction((IAction) i.getConstructor().newInstance());
			}

			catch(InstantiationException e)
			{
				e.printStackTrace();
			}

			catch(IllegalAccessException e)
			{
				e.printStackTrace();
			}

			catch(IllegalArgumentException e)
			{
				e.printStackTrace();
			}

			catch(InvocationTargetException e)
			{
				e.printStackTrace();
			}

			catch(NoSuchMethodException e)
			{
				e.printStackTrace();
			}

			catch(SecurityException e)
			{
				e.printStackTrace();
			}
		}
	}

	public void fire(ActionType type, IActionSource source, ISelector... selectors)
	{
		pending.put(kiv++, new GTriset<ActionType, IActionSource, GList<ISelector>>(type, source, new GList<ISelector>(selectors)));
	}

	private boolean fireAction(ActionType type, IActionSource source, ISelector... selectors)
	{
		IAction a = getAction(type);
		boolean failed = false;

		if(a.getState().equals(ActionState.IDLE))
		{
			try
			{
				a.act(source, selectors);
			}

			catch(ActionAlreadyRunningException e)
			{
				failed = true;
			}
		}

		else
		{
			failed = true;
		}

		return !failed;
	}

	public IAction getAction(ActionType type)
	{
		return actions.get(type);
	}

	public void registerAction(IAction action)
	{
		actions.put(action.getType(), action);
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{
		GMap<ActionType, Integer> pendingStatus = new GMap<ActionType, Integer>();
		GMap<ActionType, String> runningStatus = new GMap<ActionType, String>();

		for(int d : pending.k())
		{
			GTriset<ActionType, IActionSource, GList<ISelector>> i = pending.get(d);
			IAction action = getAction(i.getA());
			IActionSource source = i.getB();
			ISelector[] selectors = i.getC().toArray(new ISelector[i.getC().size()]);
			boolean running = action.getState().equals(ActionState.IDLE);
			boolean ran = running ? fireAction(i.getA(), source, selectors) : false;

			if(ran)
			{
				pending.remove(d);
			}

			if(!pendingStatus.containsKey(i.getA()))
			{
				pendingStatus.put(i.getA(), 0);
			}

			pendingStatus.put((i.getA()), pendingStatus.get((i.getA())) + 1);
		}

		for(ActionType i : ActionType.values())
		{
			try
			{
				if(getAction(i).getState().equals(ActionState.RUNNING))
				{
					if(!pendingStatus.containsKey(i))
					{
						pendingStatus.put(i, 0);
					}

					pendingStatus.put((i), pendingStatus.get((i)) + 1);
					runningStatus.put(i, getAction(i).getStatus());
				}
			}

			catch(Exception e)
			{

			}
		}

		tasks.clear();

		for(ActionType i : pendingStatus.k())
		{
			String pre = pendingStatus.get(i) > 1 ? pendingStatus.get(i) + "x " : "";

			if(getAction(i).getState().equals(ActionState.RUNNING))
			{
				pre += getAction(i).getStatus();
			}

			else
			{
				pre += i.getName();
			}

			tasks.add(pre);
		}
	}

	public GList<IAction> getActions()
	{
		return actions.v();
	}
}
