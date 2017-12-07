package react.rai.goals;

import org.cyberpwn.gmath.M;

import react.Config;
import react.Lang;
import react.React;
import react.api.SampledType;
import react.rai.Goal;
import react.rai.RAI;
import react.rai.RAIEvent;
import react.rai.RAIEventType;

public class GoalStableEntityTime extends Goal
{
	private boolean failing;

	public GoalStableEntityTime()
	{
		super(Lang.getString("rai.goal.stable-entity-tick.stabilize-entity-tick")); //$NON-NLS-1$

		failing = false;
	}

	@Override
	public void onPropigated()
	{

	}

	public void letUp()
	{

	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f = false;

		double nsms = 1000000;
		double tickTime = React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() * nsms;
		double redTime = React.instance.sampleController.getSampler(SampledType.REDSTONE_TIME.toString()).getValue();
		double maxRedTime = M.clip((tickTime * Config.RAI_REDSTONE_TIME_FUNCTION) + Config.RAI_REDSTONE_TIME_MUDDING, Config.RAI_REDSTONE_TIME_FLOOR, Config.RAI_REDSTONE_TIME_CEIL);

		if(redTime > maxRedTime)
		{
			if((redTime / nsms) - (maxRedTime / nsms) > Config.RAI_REDSTONE_TIME_OVERBLEED)
			{
				f = true;
			}
		}

		if(f != failing)
		{
			failing = f;

			if(failing)
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, Lang.getString("rai.goal.stable-entity-tick.keep-stable"), Lang.getString("rai.goal.stable-entity-tick.entity-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
			}

			else
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, Lang.getString("rai.goal.stable-entity-tick.keeping-stable"), Lang.getString("rai.goal.stable-entity-tick.entity-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}

		return f;
	}
}
