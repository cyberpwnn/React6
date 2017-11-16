package react.rai;

import org.cyberpwn.glang.GList;

public interface IRAI
{
	public GList<IGoal> getGoals();

	public void tick();

	public void addGoal(IGoal goal);

	public void printStatus();
}
