package react.rai.goals;

import react.React;
import react.api.SampledType;
import react.rai.Goal;

public class GoalStableTickTime extends Goal
{
	public GoalStableTickTime()
	{
		super("Stabilize TPS");
	}

	@Override
	public void onPropigated()
	{

	}

	@Override
	public boolean onCheckFailing()
	{
		return React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() > 50.0;
	}
}
