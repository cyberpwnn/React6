package com.volmit.react.api;

import java.util.Collections;

import org.bukkit.Chunk;

import com.volmit.react.Config;
import com.volmit.react.Lang;
import com.volmit.react.React;
import com.volmit.react.controller.EventController;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.M;
import com.volmit.react.util.S;

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
			new S("goal-red.prop")
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
		if(SampledType.TPS.get().getValue() >= 20.0)
		{
			return false;
		}

		if(SampledType.REDSTONE_TICK.get().getValue() <= 10)
		{
			return false;
		}

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

			new S("goal-red")
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
