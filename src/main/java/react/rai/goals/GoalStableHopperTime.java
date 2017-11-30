package react.rai.goals;

import org.bukkit.Chunk;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.Config;
import react.React;
import react.api.ActionType;
import react.api.ChunkIssue;
import react.api.IAction;
import react.api.IActionSource;
import react.api.RAIActionSource;
import react.api.SampledType;
import react.api.SelectorPosition;
import react.api.SelectorTime;
import react.rai.Goal;
import react.rai.RAI;
import react.rai.RAIEvent;
import react.rai.RAIEventType;

public class GoalStableHopperTime extends Goal
{
	private boolean failing;
	private GMap<Chunk, Integer> reocc;

	public GoalStableHopperTime()
	{
		super("Stabilize Hopper Tick");

		failing = false;
		reocc = new GMap<Chunk, Integer>();
	}

	@Override
	public void onPropigated()
	{
		Chunk laggiest = null;
		int max = -1;

		for(Chunk i : React.instance.physicsController.getSamples().k())
		{
			if(React.instance.physicsController.getSamples().get(i).getCounts().containsKey(ChunkIssue.HOPPER))
			{
				int s = React.instance.physicsController.getSamples().get(i).getCounts().get(ChunkIssue.HOPPER);

				if(s > max)
				{
					max = s;
					laggiest = i;
				}
			}
		}

		if(laggiest != null)
		{
			IAction action = React.instance.actionController.getAction(ActionType.LOCK_HOPPER);
			IActionSource source = new RAIActionSource();
			SelectorPosition pos = new SelectorPosition();
			pos.add(laggiest, Config.RAI_HOPPER_TIME_RADIUS);
			SelectorTime time = new SelectorTime();
			time.set((long) ((long) (reocc.containsKey(laggiest) ? reocc.get(laggiest) : 1) * (Config.RAI_HOPPER_TIME_PROPIGATION * Math.random())));
			reocc.put(laggiest, reocc.containsKey(laggiest) ? reocc.get(laggiest) + 4 : 1);
			RAI.instance.callEvent(new RAIEvent(RAIEventType.FIRE_ACTION, action.getName(), "hopper lag"));
			React.instance.actionController.fire(action.getType(), source, pos, time);
		}
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f = false;
		double nsms = 1000000;
		double tickTime = React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() * nsms;
		double redTime = React.instance.sampleController.getSampler(SampledType.HOPPER_TIME.toString()).getValue();
		double maxRedTime = M.clip((tickTime * Config.RAI_HOPPER_TIME_FUNCTION) + Config.RAI_HOPPER_TIME_MUDDING, Config.RAI_HOPPER_TIME_FLOOR, Config.RAI_HOPPER_TIME_CEIL);

		if(redTime > maxRedTime)
		{
			if((redTime / nsms) - (maxRedTime / nsms) > Config.RAI_HOPPER_TIME_OVERBLEED)
			{
				f = true;
			}
		}

		if(f != failing)
		{
			failing = f;

			if(failing)
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, "keep a stable hopper tick", "hopper tick"));
			}

			else
			{
				RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, "keeping a stable hopper tick", "hopper tick"));
			}
		}

		return f;
	}
}