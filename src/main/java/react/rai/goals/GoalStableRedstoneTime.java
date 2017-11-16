package react.rai.goals;

import org.bukkit.Chunk;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.React;
import react.api.ActionType;
import react.api.ChunkIssue;
import react.api.IAction;
import react.api.IActionSource;
import react.api.ReactActionSource;
import react.api.SampledType;
import react.api.SelectorPosition;
import react.api.SelectorTime;
import react.rai.Goal;

public class GoalStableRedstoneTime extends Goal
{
	private GMap<Chunk, Integer> reocc;

	public GoalStableRedstoneTime()
	{
		super("Stabilize Redstone Tick");

		reocc = new GMap<Chunk, Integer>();
	}

	@Override
	public void onPropigated()
	{
		Chunk laggiest = null;
		int max = -1;

		for(Chunk i : React.instance.physicsController.getSamples().k())
		{
			if(React.instance.physicsController.getSamples().get(i).getCounts().containsKey(ChunkIssue.REDSTONE))
			{
				int s = React.instance.physicsController.getSamples().get(i).getCounts().get(ChunkIssue.REDSTONE);

				if(s > max)
				{
					max = s;
					laggiest = i;
				}
			}
		}

		if(laggiest != null)
		{
			IAction action = React.instance.actionController.getAction(ActionType.LOCK_REDSTONE);
			IActionSource source = new ReactActionSource();
			SelectorPosition pos = new SelectorPosition();
			pos.add(laggiest, 2);
			SelectorTime time = new SelectorTime();
			time.set((long) ((long) (reocc.containsKey(laggiest) ? reocc.get(laggiest) : 1) * (10000 * Math.random())));
			reocc.put(laggiest, reocc.containsKey(laggiest) ? reocc.get(laggiest) + 4 : 1);
			React.instance.actionController.fire(action.getType(), source, pos, time);
		}
	}

	@Override
	public boolean onCheckFailing()
	{
		double nsms = 1000000;
		double tickTime = React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() * nsms;
		double redTime = React.instance.sampleController.getSampler(SampledType.REDSTONE_TIME.toString()).getValue();
		double maxRedTime = M.clip((tickTime * 0.36) + 2360000, 2000000, 30000000);

		if(redTime > maxRedTime)
		{
			if((redTime / nsms) - (maxRedTime / nsms) > 1.5)
			{
				return true;
			}
		}

		return false;
	}
}
