package react.controller;

import java.lang.reflect.InvocationTargetException;

import react.api.ActionType;
import react.api.IAction;
import surge.Main;
import surge.collection.GMap;
import surge.control.Controller;

public class ActionController extends Controller
{
	private GMap<ActionType, IAction> actions;

	@Override
	public void start()
	{
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

	}
}
