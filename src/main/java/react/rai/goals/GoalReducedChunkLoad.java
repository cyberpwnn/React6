package react.rai.goals;

import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gconcurrent.TICK;

import react.Gate;
import react.Lang;
import react.React;
import react.api.ActionType;
import react.api.IAction;
import react.api.RAIActionSource;
import react.api.SampledType;
import react.rai.Goal;
import react.rai.RAI;
import react.rai.RAIEvent;
import react.rai.RAIEventType;

public class GoalReducedChunkLoad extends Goal
{
	boolean failing;

	public GoalReducedChunkLoad()
	{
		super(Lang.getString("rai.goal.chunk-load.reduced-chunk-load")); //$NON-NLS-1$

		failing = false;
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f;

		int chunksLoaded = (int) React.instance.sampleController.getSampler(SampledType.CHK.toString()).getValue();

		f = chunksLoaded > Gate.getMaxChunksForView();

		if(failing != f)
		{
			failing = f;

			new S()
			{
				@Override
				public void run()
				{
					if(failing)
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, Lang.getString("rai.goal.chunk-load.keep-chunk-count"), Lang.getString("rai.goal.chunk-load.chunk-count"))); //$NON-NLS-1$ //$NON-NLS-2$
					}

					else
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, Lang.getString("rai.goal.chunk-load.keep-chunk-count"), Lang.getString("rai.goal.chunk-load.chunk-count"))); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			};
		}

		return f;
	}

	@Override
	public void onPropigated()
	{
		if(TICK.tick % 100 == 0)
		{
			new S()
			{
				@Override
				public void run()
				{
					IAction action = React.instance.actionController.getAction(ActionType.PURGE_CHUNKS);
					RAI.instance.callEvent(new RAIEvent(RAIEventType.FIRE_ACTION, action.getName(), Lang.getString("rai.goal.chunk-load.chunk-mass"))); //$NON-NLS-1$
					React.instance.actionController.fire(action.getType(), new RAIActionSource());
				}
			};
		}
	}
}
