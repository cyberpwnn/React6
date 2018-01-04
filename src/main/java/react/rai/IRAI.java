package react.rai;

import org.cyberpwn.glang.GList;

import react.action.source.IActionSource;

public interface IRAI
{
	public GList<IGoal> getGoals();

	public void tick();

	public void addGoal(IGoal goal);

	public GList<RAIEvent> getEvents();

	public void callEvent(RAIEvent e);

	public GList<IActionSource> getListeners();
}
