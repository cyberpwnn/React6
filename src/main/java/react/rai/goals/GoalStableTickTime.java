package react.rai.goals;

import react.Config;
import react.React;
import react.api.SampledType;
import react.rai.Goal;
import react.rai.RAI;
import react.rai.RAIEvent;
import react.rai.RAIEventType;

public class GoalStableTickTime extends Goal
{
	private boolean failing;

	public GoalStableTickTime()
	{
		super("Stabilize TPS");

		failing = false;
	}

	@Override
	public void onPropigated()
	{

	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f = React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() > Config.RAI_TPS_HIGH_TICK;

		if(f != failing)
		{
			failing = f;

			if(failing)
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, "keep a stable tps", "tps"));
			}

			else
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, "keeping a stable tps", "tps"));
			}
		}

		return f;
	}
}
