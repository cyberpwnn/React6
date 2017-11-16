package react.controller;

import java.lang.reflect.InvocationTargetException;

import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GTriset;

import react.api.ActionAlreadyRunningException;
import react.api.ActionState;
import react.api.ActionType;
import react.api.IAction;
import react.api.IActionSource;
import react.api.ISelector;
import react.api.ReactActionSource;
import surge.Main;
import surge.control.Controller;

public class ActionController extends Controller
{
	private static int kiv = 0;
	private GMap<ActionType, IAction> actions;
	public GMap<Integer, GTriset<ActionType, IActionSource, GList<ISelector>>> pending;

	@Override
	public void start()
	{
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
		}

		if(TICK.tick % 600 == 0)
		{
			try
			{
				getAction(ActionType.PURGE_CHUNKS).act(new ReactActionSource());
			}

			catch(ActionAlreadyRunningException e)
			{

			}
		}
	}

	public GList<IAction> getActions()
	{
		return actions.v();
	}
}
