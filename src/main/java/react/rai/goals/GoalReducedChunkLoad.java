package react.rai.goals;

import org.bukkit.Bukkit;
import org.cyberpwn.gconcurrent.TICK;

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
		super("Reduced Chunk Load");

		failing = false;
	}

	private int getChunkCountForView()
	{
		return (int) Math.pow((Bukkit.getViewDistance() * 2) + 1, 2);
	}

	private int getMaxChunksForView()
	{
		return (getChunkCountForView()) * (Bukkit.getOnlinePlayers().size() + 1);
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f;

		int chunksLoaded = (int) React.instance.sampleController.getSampler(SampledType.CHK.toString()).getValue();

		f = chunksLoaded > getMaxChunksForView();

		if(failing != f)
		{
			failing = f;

			if(failing)
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, "keep a stable chunk count", "chunk count"));
			}

			else
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, "keep a stable chunk count", "chunk count"));
			}
		}

		return f;
	}

	@Override
	public void onPropigated()
	{
		if(TICK.tick % 20 == 0)
		{
			IAction action = React.instance.actionController.getAction(ActionType.PURGE_CHUNKS);
			RAI.instance.callEvent(new RAIEvent(RAIEventType.FIRE_ACTION, action.getName(), "chunk mass"));
			React.instance.actionController.fire(action.getType(), new RAIActionSource());
		}
	}
}
