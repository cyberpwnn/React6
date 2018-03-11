package com.volmit.react.api;

import com.volmit.react.Config;
import com.volmit.react.Lang;
import com.volmit.react.React;
import com.volmit.react.util.M;
import com.volmit.react.util.S;

public class GoalStableChunkTime extends Goal
{
	boolean failing;

	public GoalStableChunkTime()
	{
		super(Lang.getString("rai.goal.stable-chunk-time.stable")); //$NON-NLS-1$

		failing = false;
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f = false;

		double nsms = 1000000;
		double tickTime = React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() * nsms;
		double redTime = React.instance.sampleController.getSampler(SampledType.CHK_TIME.toString()).getValue();
		double maxRedTime = M.clip((tickTime * Config.RAI_CHUNK_TIME_FUNCTION) + Config.RAI_CHUNK_TIME_MUDDING, Config.RAI_CHUNK_TIME_FLOOR, Config.RAI_CHUNK_TIME_CEIL);

		if(redTime > maxRedTime)
		{
			if((redTime / nsms) - (maxRedTime / nsms) > Config.RAI_CHUNK_TIME_OVERBLEED)
			{
				f = true;
			}
		}

		if(f != failing)
		{
			failing = f;

			new S("goal-chunktime")
			{
				@Override
				public void run()
				{
					if(failing)
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, Lang.getString("rai.goal.stable-chunk-time.keep"), Lang.getString("rai.goal.stable-chunk-time.chunk-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
					}

					else
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, Lang.getString("rai.goal.stable-chunk-time.keeping"), Lang.getString("rai.goal.stable-chunk-time.chunk-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			};
		}

		return f;
	}

	@Override
	public void onPropigated()
	{
		if(!Config.RAI_CHUNK_TIME_PROPIGATE)
		{
			return;
		}
	}
}
