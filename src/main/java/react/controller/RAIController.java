package react.controller;

import react.rai.IGoal;
import react.rai.IRAI;
import react.rai.RAI;
import react.rai.goals.GoalReducedChunkLoad;
import react.rai.goals.GoalStableRedstoneTime;
import react.rai.goals.GoalStableTickTime;
import surge.control.Controller;

public class RAIController extends Controller
{
	private IRAI rai;

	@Override
	public void start()
	{
		rai = new RAI();
		IGoal goalStable = new GoalStableTickTime();
		goalStable.addGoal(new GoalStableRedstoneTime());
		goalStable.addGoal(new GoalReducedChunkLoad());
		rai.addGoal(goalStable);
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{
		rai.tick();
	}
}
