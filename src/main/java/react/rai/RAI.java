package react.rai;

import org.cyberpwn.glang.GList;

import surge.util.C;
import surge.util.D;

public class RAI implements IRAI
{
	private GList<IGoal> goals;

	public RAI()
	{
		goals = new GList<IGoal>();
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

		printStatus();
	}

	@Override
	public void printStatus()
	{
		for(IGoal i : getGoals())
		{
			if(i.isFailing())
			{
				D.l(i.getTag() + " -> " + C.RED + "FAILED GOAL");
			}

			else
			{
				D.l(i.getTag() + " -> " + C.GREEN + "ACHIEVED GOAL");
			}

			for(IGoal j : i.getSubgoals())
			{
				if(j.isFailing())
				{
					D.l("  " + j.getTag() + " -> " + C.RED + "FAILED GOAL");
				}

				else
				{
					D.l("  " + j.getTag() + " -> " + C.GREEN + "ACHIEVED GOAL");
				}
			}
		}
	}
}
