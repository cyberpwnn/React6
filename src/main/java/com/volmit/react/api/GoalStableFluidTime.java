package com.volmit.react.api;

import org.bukkit.Chunk;

import com.volmit.react.Config;
import com.volmit.react.Lang;
import com.volmit.react.React;
import com.volmit.react.util.Ex;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.M;
import com.volmit.react.util.S;

public class GoalStableFluidTime extends Goal
{
	private boolean failing;
	private GMap<Chunk, Integer> reocc;

	public GoalStableFluidTime()
	{
		super(Lang.getString("rai.goal.fluid-tick.stable-fluid-tick")); //$NON-NLS-1$

		failing = false;
		reocc = new GMap<Chunk, Integer>();
	}

	@Override
	public void onPropigated()
	{
		if(!Config.RAI_FLUID_TIME_PROPIGATE)
		{
			return;
		}

		Chunk laggiest = null;
		GList<Chunk> otherLaggiest = new GList<Chunk>();
		int max = -1;
		int fuf = 0;

		for(Chunk i : React.instance.physicsController.getSamples().k())
		{
			try
			{
				if(React.instance.physicsController.getSamples().get(i).getCounts().containsKey(ChunkIssue.FLUID))
				{
					fuf += React.instance.physicsController.getSamples().get(i).getCounts().get(ChunkIssue.FLUID);
				}
			}

			catch(Throwable e)
			{
				Ex.t(e);
			}
		}

		for(Chunk i : React.instance.physicsController.getSamples().k())
		{
			try
			{
				if(React.instance.physicsController.getSamples().get(i).getCounts().containsKey(ChunkIssue.FLUID))
				{
					int s = React.instance.physicsController.getSamples().get(i).getCounts().get(ChunkIssue.FLUID);

					if(s > max)
					{
						max = s;
						laggiest = i;
					}

					if((double) s / (double) fuf > 0.2)
					{
						otherLaggiest.add(i);
					}
				}
			}

			catch(Throwable e)
			{
				Ex.t(e);
			}
		}

		otherLaggiest.remove(laggiest);

		if(laggiest != null)
		{
			Chunk lx = laggiest;

			new S("goal-fluid.prop")
			{
				@Override
				public void run()
				{
					IAction action = React.instance.actionController.getAction(ActionType.LOCK_FLUID);
					IActionSource source = new RAIActionSource();
					SelectorPosition pos = new SelectorPosition();
					pos.add(lx, Config.RAI_FLUID_TIME_RADIUS);

					for(Chunk i : otherLaggiest.shuffleCopy())
					{
						pos.add(i);
					}

					SelectorTime time = new SelectorTime();
					time.set((long) ((long) (reocc.containsKey(lx) ? reocc.get(lx) : 4) * (Config.RAI_FLUID_TIME_PROPIGATION * Math.random())));
					reocc.put(lx, reocc.containsKey(lx) ? reocc.get(lx) + 4 : 1);
					React.instance.actionController.fire(action.getType(), source, pos, time);
					RAI.instance.callEvent(new RAIEvent(RAIEventType.FIRE_ACTION, action.getName(), Lang.getString("rai.goal.fluid-tick.fluid-lag"))); //$NON-NLS-1$
				}
			};
		}
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f = false;

		double nsms = 1000000;
		double tickTime = React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() * nsms;
		double redTime = React.instance.sampleController.getSampler(SampledType.FLUID_TIME.toString()).getValue();
		double maxRedTime = M.clip((tickTime * Config.RAI_FLUID_TIME_FUNCTION) + Config.RAI_FLUID_TIME_MUDDING, Config.RAI_FLUID_TIME_FLOOR, Config.RAI_FLUID_TIME_CEIL);

		if(redTime > maxRedTime)
		{
			if((redTime / nsms) - (maxRedTime / nsms) > Config.RAI_FLUID_TIME_OVERBLEED)
			{
				f = true;
			}
		}

		if(f != failing)
		{
			failing = f;

			new S("goal-fluid")
			{
				@Override
				public void run()
				{
					if(failing)
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, Lang.getString("rai.goal.fluid-tick.keep-stable"), Lang.getString("rai.goal.fluid-tick.fluid-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
					}

					else
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, Lang.getString("rai.goal.fluid-tick.keeping-stable"), Lang.getString("rai.goal.fluid-tick.fluid-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			};
		}

		return f;
	}
}
