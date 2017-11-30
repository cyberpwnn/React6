package react.rai;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.cyberpwn.glang.GList;
import org.cyberpwn.gmath.M;

import react.Gate;

public class RAI implements IRAI
{
	private GList<IGoal> goals;
	private GList<RAIEvent> events;
	private GList<RAIEvent> logEvents;
	private GList<CommandSender> listeners;
	public long since;

	public static RAI instance;

	public RAI()
	{
		goals = new GList<IGoal>();
		events = new GList<RAIEvent>();
		logEvents = new GList<RAIEvent>();
		listeners = new GList<CommandSender>();
		instance = this;
		getListeners().add(Bukkit.getConsoleSender());
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
		for(IGoal i : getGoals())
		{
			i.update();
		}

		for(RAIEvent i : logEvents)
		{
			for(CommandSender j : getListeners())
			{
				Gate.msgRAI(j, i.toString());
			}
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
	}

	@Override
	public GList<CommandSender> getListeners()
	{
		return listeners;
	}
}