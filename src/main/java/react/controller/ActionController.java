package react.controller;

import org.bukkit.Chunk;

import com.volmit.react.util.C;
import com.volmit.react.util.Controller;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.GTriset;
import com.volmit.react.util.JSONArray;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.TICK;

import react.Config;
import react.Gate;
import react.action.ActionCollectGarbage;
import react.action.ActionCullEntities;
import react.action.ActionFixLighting;
import react.action.ActionLockFluid;
import react.action.ActionLockHopper;
import react.action.ActionLockRedstone;
import react.action.ActionPurgeChunks;
import react.action.ActionPurgeEntities;
import react.action.ActionUnlockFluid;
import react.action.ActionUnlockHopper;
import react.action.ActionUnlockRedstone;
import react.action.source.IActionSource;
import react.api.ActionAlreadyRunningException;
import react.api.ActionException;
import react.api.ActionState;
import react.api.ActionType;
import react.api.IAction;
import react.api.ISelector;
import react.api.SelectorPosition;
import react.notification.Note;

public class ActionController extends Controller
{
	private static int kiv = 0;
	private GMap<ActionType, IAction> actions;
	public GMap<Integer, GTriset<ActionType, IActionSource, GList<ISelector>>> pending;
	public GList<String> tasks;
	private GMap<String, GList<ActionType>> rans;

	@Override
	public void dump(JSONObject object)
	{
		JSONArray acts = new JSONArray();
		JSONArray queue = new JSONArray();

		for(ActionType i : actions.k())
		{
			JSONObject a = new JSONObject();
			a.put("name", i.name());
			a.put("description", i.getDescription());
			a.put("handle", i.getHandle().name());
			a.put("target", i.getTarget().name());
			acts.put(i);
		}

		for(Integer i : pending.k())
		{
			JSONObject pend = new JSONObject();
			ActionType t = pending.get(i).getA();
			IActionSource s = pending.get(i).getB();
			GList<ISelector> e = pending.get(i).getC();
			JSONArray sels = new JSONArray();

			for(ISelector j : e)
			{
				JSONObject ss = new JSONObject();
				ss.put("type", j.getClass().getSimpleName());
				ss.put("selected", j.getList().size());
				ss.put("possibility", j.getPossibilities().size());
				ss.put("mode", j.getMode().name());
				sels.put(ss);
			}

			pend.put("id", i);
			pend.put("type", t.name());
			pend.put("source", s.toString());
			pend.put("selectors", sels);
			queue.put(pend);
		}

		object.put("queue", queue);
		object.put("loaded-actions", acts);
	}

	@Override
	public void start()
	{
		tasks = new GList<String>();
		pending = new GMap<Integer, GTriset<ActionType, IActionSource, GList<ISelector>>>();
		actions = new GMap<ActionType, IAction>();
		rans = new GMap<String, GList<ActionType>>();

		registerAction(new ActionCollectGarbage());
		registerAction(new ActionCullEntities());
		registerAction(new ActionFixLighting());
		registerAction(new ActionLockFluid());
		registerAction(new ActionLockHopper());
		registerAction(new ActionLockRedstone());
		registerAction(new ActionPurgeChunks());
		registerAction(new ActionPurgeEntities());
		registerAction(new ActionUnlockFluid());
		registerAction(new ActionUnlockHopper());
		registerAction(new ActionUnlockRedstone());
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
		if(TICK.tick % 100 == 0)
		{
			for(String i : rans.k())
			{
				GMap<ActionType, Integer> cts = new GMap<ActionType, Integer>();

				for(ActionType j : rans.get(i))
				{
					if(!cts.containsKey(j))
					{
						cts.put(j, 0);
					}

					cts.put(j, cts.get(j) + 1);
				}

				String s = C.WHITE + i + C.GRAY + " ran";

				for(ActionType j : cts.k())
				{
					s += " " + (cts.get(j) > 1 ? (C.GRAY.toString() + cts.get(j) + "x " + C.WHITE) : C.WHITE + "") + j.getName() + C.GRAY;
				}

				Note.ACTION.bake(s);
			}

			rans.clear();
		}

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
					String src = source.toString();

					if(!rans.containsKey(src))
					{
						rans.put(src, new GList<ActionType>());
					}

					rans.get(src).add(i.getA());
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
