package react.controller;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.Chunk;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GTriset;

import react.Config;
import react.Gate;
import react.action.source.IActionSource;
import react.api.ActionAlreadyRunningException;
import react.api.ActionException;
import react.api.ActionState;
import react.api.ActionType;
import react.api.IAction;
import react.api.ISelector;
import react.api.SelectorPosition;
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

	private boolean fireAction(ActionType type, IActionSource source, ISelector... selectors) throws ActionException
	{
		IAction a = getAction(type);
		boolean failed = false;

		if(a.getState().equals(ActionState.IDLE))
		{
			try
			{
				int d = 0;

				for(ISelector i : selectors)
				{
					if(i.getType().equals(Chunk.class))
					{
						SelectorPosition sel = (SelectorPosition) i;

						for(Object j : new GList<Object>(sel.getPossibilities()))
						{
							Chunk cc = (Chunk) j;

							if(!Config.getWorldConfig(cc.getWorld()).allowActions)
							{
								d++;
								sel.getPossibilities().remove(cc);
							}
						}

						if(i.getPossibilities().isEmpty())
						{
							source.sendResponseError("Action failed. No chunks selected.");
							throw new ActionException();
						}
					}
				}

				if(d > 0)
				{
					source.sendResponseActing("Removed " + d + " chunk(s) from selection (blocked)");
				}

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
		Gate.snd = 3;
		GMap<ActionType, Integer> pendingStatus = new GMap<ActionType, Integer>();
		GMap<ActionType, String> runningStatus = new GMap<ActionType, String>();

		for(int d : pending.k())
		{
			GTriset<ActionType, IActionSource, GList<ISelector>> i = pending.get(d);
			IAction action = getAction(i.getA());
			IActionSource source = i.getB();
			ISelector[] selectors = i.getC().toArray(new ISelector[i.getC().size()]);
			boolean running = action.getState().equals(ActionState.IDLE);

			try
			{
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

			catch(ActionException e)
			{
				pending.remove(d);
			}
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

	public GList<String> getActionNames()
	{
		GList<String> acts = new GList<String>();

		for(IAction i : getActions())
		{
			acts.add(i.getName());
		}

		return acts;
	}
}
