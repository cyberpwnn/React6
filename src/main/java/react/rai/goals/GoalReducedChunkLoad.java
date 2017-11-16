package react.rai.goals;

import org.bukkit.Bukkit;
import org.cyberpwn.gconcurrent.TICK;

import react.React;
import react.api.ActionType;
import react.api.IAction;
import react.api.ReactActionSource;
import react.api.SampledType;
import react.rai.Goal;

public class GoalReducedChunkLoad extends Goal
{
	public GoalReducedChunkLoad()
	{
		super("Reduced Chunk Load");
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
		int chunksLoaded = (int) React.instance.sampleController.getSampler(SampledType.CHK.toString()).getValue();

		return chunksLoaded > getMaxChunksForView();
	}

	@Override
	public void onPropigated()
	{
		if(TICK.tick % 20 == 0)
		{
			IAction action = React.instance.actionController.getAction(ActionType.PURGE_CHUNKS);
			React.instance.actionController.fire(action.getType(), new ReactActionSource());
		}
	}
}
