package react.rai.goals;

import java.util.Collections;

import org.bukkit.Chunk;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.Config;
import react.Lang;
import react.React;
import react.action.source.IActionSource;
import react.action.source.RAIActionSource;
import react.api.ActionType;
import react.api.ChunkIssue;
import react.api.IAction;
import react.api.SampledType;
import react.api.SelectorPosition;
import react.api.SelectorTime;
import react.controller.EventController;
import react.lagmap.LagMap;
import react.lagmap.LagMapChunk;
import react.rai.Goal;
import react.rai.RAI;
import react.rai.RAIEvent;
import react.rai.RAIEventType;

public class GoalStableRedstoneTime extends Goal
{
	private int d;
	private boolean failing;
	private GMap<Chunk, Integer> reocc;

	public GoalStableRedstoneTime()
	{
		super(Lang.getString("rai.goal.redstone-time.stablilize")); //$NON-NLS-1$

		d = 20;
		failing = false;
		reocc = new GMap<Chunk, Integer>();
	}

	@Override
	public void onPropigated()
	{
		if(!Config.RAI_REDSTONE_TIME_PROPIGATE)
		{
			return;
		}

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

		if(laggiest != null && d <= 0)
		{
			Chunk lx = laggiest;
			d = 10;
			new S()
			{
				@Override
				public void run()
				{
					Chunk laggiest = lx;
					IAction action = React.instance.actionController.getAction(ActionType.LOCK_REDSTONE);
					IActionSource source = new RAIActionSource();
					SelectorPosition pos = new SelectorPosition();
					pos.add(laggiest, Config.RAI_REDSTONE_TIME_RADIUS);
					SelectorTime time = new SelectorTime();
					time.set(Math.max(500, Math.min((long) ((long) (reocc.containsKey(laggiest) ? reocc.get(laggiest) : 1) * (Config.RAI_REDSTONE_TIME_PROPIGATION * 0.5)), 1800)));
					reocc.put(laggiest, reocc.containsKey(laggiest) ? reocc.get(laggiest) + 4 : 1);
					React.instance.actionController.fire(action.getType(), source, pos, time);
					RAI.instance.callEvent(new RAIEvent(RAIEventType.FIRE_ACTION, action.getName(), Lang.getString("rai.goal.redstone-time.redstone-lag"))); //$NON-NLS-1$
				}
			};
		}
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f = false;
		d--;

		double nsms = 1000000;
		double tickTime = React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() * nsms;
		double redTime = React.instance.sampleController.getSampler(SampledType.REDSTONE_TIME.toString()).getValue();
		double maxRedTime = M.clip((tickTime * Config.RAI_REDSTONE_TIME_FUNCTION) + Config.RAI_REDSTONE_TIME_MUDDING, Config.RAI_REDSTONE_TIME_FLOOR, Config.RAI_REDSTONE_TIME_CEIL);

		if(redTime > maxRedTime)
		{
			if((redTime / nsms) - (maxRedTime / nsms) > Config.RAI_REDSTONE_TIME_OVERBLEED)
			{
				f = true;
			}
		}

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
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, Lang.getString("rai.goal.redstone-time.keep-stable"), Lang.getString("rai.goal.redstone-time.redstone-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
					}

					else
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, Lang.getString("rai.goal.redstone-time.keeping-stable"), Lang.getString("rai.goal.redstone-time.redstone-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			};
		}

		LagMap map = EventController.map;
		GList<LagMapChunk> htl = new GList<LagMapChunk>(map.getChunks().v());
		Collections.sort(htl);
		Collections.reverse(htl);

		if(htl.isEmpty())
		{
			return f;
		}

		for(LagMapChunk i : htl)
		{
			if(i.getMS().containsKey(ChunkIssue.REDSTONE) && i.getMS().get(ChunkIssue.REDSTONE) > Math.PI)
			{
				return true;
			}
		}

		return f;
	}
}
