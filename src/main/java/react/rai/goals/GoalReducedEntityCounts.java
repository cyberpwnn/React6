package react.rai.goals;

import org.bukkit.Chunk;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gconcurrent.TICK;

import react.Config;
import react.Lang;
import react.React;
import react.api.ActionType;
import react.api.IAction;
import react.api.IActionSource;
import react.api.RAIActionSource;
import react.api.SampledType;
import react.api.SelectorPosition;
import react.rai.Goal;
import react.rai.RAI;
import react.rai.RAIEvent;
import react.rai.RAIEventType;
import surge.util.Chunks;

public class GoalReducedEntityCounts extends Goal
{
	private boolean failing;

	public GoalReducedEntityCounts()
	{
		super(Lang.getString("rai.goal.entity-count.reduced-entity-count")); //$NON-NLS-1$

		failing = false;
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f;

		int max = -1;

		try
		{
			for(Chunk i : Chunks.getLoadedChunks())
			{
				int s = i.getEntities().length;

				if(s > max)
				{
					max = s;
				}
			}
		}

		catch(Exception e)
		{
			return false;
		}

		int totalEntities = (int) (React.instance.sampleController.getSampler(SampledType.ENTDROP.toString()).getValue() + React.instance.sampleController.getSampler(SampledType.ENTLIV.toString()).getValue());
		int totalChunks = (int) React.instance.sampleController.getSampler(SampledType.CHK.toString()).getValue();

		f = totalChunks * Config.RAI_ENTITY_CHUNK_MULTIPLIER < totalEntities && max > Config.RAI_ENTITY_CHUNK_CLUSTERIZER;

		if(f != failing)
		{
			failing = f;

			new S()
			{
				@Override
				public void run()
				{
					if(failing)
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, Lang.getString("rai.goal.entity-count.keep-stable"), Lang.getString("rai.goal.entity-count.entity-count"))); //$NON-NLS-1$ //$NON-NLS-2$
					}

					else
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, Lang.getString("rai.goal.entity-count.keep-stable"), Lang.getString("rai.goal.entity-count.entity-count"))); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			};
		}

		return f;
	}

	@Override
	public void onPropigated()
	{
		if(TICK.tick % 2 != 0)
		{
			return;
		}

		Chunk laggiest = null;
		int max = -1;

		for(Chunk i : Chunks.getLoadedChunks())
		{
			int s = i.getEntities().length;

			if(s > max)
			{
				max = s;
				laggiest = i;
			}
		}

		if(laggiest != null)
		{
			Chunk lx = laggiest;

			new S()
			{
				@Override
				public void run()
				{
					Chunk laggiest = lx;
					IAction action = React.instance.actionController.getAction(ActionType.CULL_ENTITIES);
					IActionSource source = new RAIActionSource();
					SelectorPosition pos = new SelectorPosition();
					pos.add(laggiest, Config.RAI_ENTITY_CHUNK_RADIUS);
					RAI.instance.callEvent(new RAIEvent(RAIEventType.FIRE_ACTION, action.getName(), Lang.getString("rai.goal.entity-count.entity-clustering"))); //$NON-NLS-1$
					React.instance.actionController.fire(action.getType(), source, pos);
				}
			};
		}
	}
}
