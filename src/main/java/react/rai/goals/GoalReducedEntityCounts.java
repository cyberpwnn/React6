package react.rai.goals;

import org.bukkit.Chunk;
import org.cyberpwn.gconcurrent.TICK;

import react.Config;
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
		super("Reduced Entity Counts");

		failing = false;
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f;

		int max = -1;

		for(Chunk i : Chunks.getLoadedChunks())
		{
			int s = i.getEntities().length;

			if(s > max)
			{
				max = s;
			}
		}

		int totalEntities = (int) (React.instance.sampleController.getSampler(SampledType.ENTDROP.toString()).getValue() + React.instance.sampleController.getSampler(SampledType.ENTLIV.toString()).getValue());
		int totalChunks = (int) React.instance.sampleController.getSampler(SampledType.CHK.toString()).getValue();

		f = totalChunks * Config.RAI_ENTITY_CHUNK_MULTIPLIER < totalEntities && max > Config.RAI_ENTITY_CHUNK_CLUSTERIZER;

		if(f != failing)
		{
			failing = f;

			if(failing)
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, "keep a stable entity count", "entity count"));
			}

			else
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, "keep a stable entity count", "entity count"));
			}
		}

		return f;
	}

	@Override
	public void onPropigated()
	{
		if(TICK.tick % 5 != 0)
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
			IAction action = React.instance.actionController.getAction(ActionType.CULL_ENTITIES);
			IActionSource source = new RAIActionSource();
			SelectorPosition pos = new SelectorPosition();
			pos.add(laggiest, Config.RAI_ENTITY_CHUNK_RADIUS);
			RAI.instance.callEvent(new RAIEvent(RAIEventType.FIRE_ACTION, action.getName(), "entity clustering"));
			React.instance.actionController.fire(action.getType(), source, pos);
		}
	}
}
