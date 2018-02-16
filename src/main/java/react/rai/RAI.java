package react.rai;

import java.util.Arrays;

import org.cyberpwn.glang.GList;
import org.cyberpwn.gmath.M;

import react.Config;
import react.action.source.IActionSource;
import react.action.source.RAIActionSource;
import react.notification.Note;

public class RAI implements IRAI
{
	private GList<IGoal> goals;
	private GList<RAIEvent> events;
	private GList<RAIEvent> logEvents;
	private GList<IActionSource> listeners;
	public long since;

	public static RAI instance;

	public RAI()
	{
		goals = new GList<IGoal>();
		events = new GList<RAIEvent>();
		logEvents = new GList<RAIEvent>();
		listeners = new GList<IActionSource>();
		instance = this;
		getListeners().add(new RAIActionSource());
		since = M.ms();
	}

	@Override
	public GList<IGoal> getGoals()
	{
		return goals;
	}

	@Override
	public void addGoal(IGoal goal)
	{
		getGoals().add(goal);
	}

	@Override
	public void tick()
	{
		if(!Config.RAI)
		{
			return;
		}

		for(IGoal i : getGoals())
		{
			try
			{
				i.update();
			}

			catch(Exception e)
			{

			}
		}

		try
		{
			for(RAIEvent i : logEvents.copy())
			{
				for(IActionSource j : getListeners())
				{
					j.sendResponseActing(i.toString());
				}

				if(RAIEventType.FIRE_ACTION.equals(i.getType()))
				{
					Note.RAI.bake(i.getOvt());
				}
			}
		}

		catch(Exception e)
		{

		}

		logEvents.clear();
	}

	@Override
	public GList<RAIEvent> getEvents()
	{
		return events;
	}

	@Override
	public void callEvent(RAIEvent e)
	{
		if(events.size() > 1 && (events.get(events.size() - 1).getType().equals(e.getType()) && Arrays.equals(events.get(events.size() - 1).getPars(), e.getPars())))
		{
			return;
		}

		events.add(e);
		logEvents.add(e);

		while(events.size() > 100)
		{
			events.remove(0);
		}

		while(logEvents.size() > 100)
		{
			logEvents.remove(0);
		}
	}

	@Override
	public GList<IActionSource> getListeners()
	{
		return listeners;
	}
}
