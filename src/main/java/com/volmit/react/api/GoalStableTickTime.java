package com.volmit.react.api;

import com.volmit.react.Config;
import com.volmit.react.Lang;
import com.volmit.react.React;
import com.volmit.react.util.S;

public class GoalStableTickTime extends Goal
{
	private boolean failing;

	public GoalStableTickTime()
	{
		super(Lang.getString("rai.goal.stable-tick.stable-tps")); //$NON-NLS-1$

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

			new S("goal.tps")
			{
				@Override
				public void run()
				{
					if(failing)
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, Lang.getString("rai.goal.stable-tick.keep-stable-tps"), Lang.getString("rai.goal.stable-tick.tps"))); //$NON-NLS-1$ //$NON-NLS-2$
					}

					else
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, Lang.getString("rai.goal.stable-tick.keeping-stable"), Lang.getString("rai.goal.stable-tick.tps"))); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			};
		}

		return f;
	}
}
