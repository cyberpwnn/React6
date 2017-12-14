package react.controller;

import org.cyberpwn.gconcurrent.A;

import react.rai.IGoal;
import react.rai.IRAI;
import react.rai.RAI;
import react.rai.goals.GoalReducedChunkLoad;
import react.rai.goals.GoalReducedEntityCounts;
import react.rai.goals.GoalStableChunkTime;
import react.rai.goals.GoalStableFluidTime;
import react.rai.goals.GoalStableHopperTime;
import react.rai.goals.GoalStableRedstoneTime;
import react.rai.goals.GoalStableTickTime;
import surge.Surge;
import surge.control.Controller;

public class RAIController extends Controller
{
	private IRAI rai;
	public boolean raiEnabled;

	@Override
	public void start()
	{
		Surge.register(this);
		rai = new RAI();
		raiEnabled = true;
		IGoal goalStable = new GoalStableTickTime();
		goalStable.addGoal(new GoalStableRedstoneTime());
		goalStable.addGoal(new GoalStableFluidTime());
		goalStable.addGoal(new GoalStableHopperTime());
		goalStable.addGoal(new GoalReducedEntityCounts());
		goalStable.addGoal(new GoalReducedChunkLoad());
		goalStable.addGoal(new GoalStableChunkTime());
		rai.addGoal(goalStable);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{
		new A()
		{
			@Override
			public void run()
			{
				rai.tick();
			}
		};
	}
}
