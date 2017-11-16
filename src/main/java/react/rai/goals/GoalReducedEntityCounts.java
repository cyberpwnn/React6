package react.rai.goals;

import org.bukkit.Chunk;
import org.cyberpwn.gconcurrent.TICK;

import react.React;
import react.api.ActionType;
import react.api.IAction;
import react.api.IActionSource;
import react.api.ReactActionSource;
import react.api.SampledType;
import react.api.SelectorPosition;
import react.rai.Goal;
import surge.util.Chunks;

public class GoalReducedEntityCounts extends Goal
{
	public GoalReducedEntityCounts()
	{
		super("Reduced Entity Counts");
	}

	@Override
	public boolean onCheckFailing()
	{
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

		return totalChunks * 3 < totalEntities && max > 40;
	}

	@Override
	public void onPropigated()
	{
		if(TICK.tick % 6 != 0)
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
			IActionSource source = new ReactActionSource();
			SelectorPosition pos = new SelectorPosition();
			pos.add(laggiest, 2);
			React.instance.actionController.fire(action.getType(), source, pos);
		}
	}
}
