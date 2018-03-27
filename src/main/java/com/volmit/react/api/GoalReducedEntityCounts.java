package com.volmit.react.api;

import org.bukkit.Chunk;

import com.volmit.react.Config;
import com.volmit.react.Lang;
import com.volmit.react.React;
import com.volmit.react.util.Chunks;
import com.volmit.react.util.Ex;
import com.volmit.react.util.S;

public class GoalReducedEntityCounts extends Goal
{
	public static int spawned = 0;
	private boolean failing;
	private double cd;
	private double ad;

	public GoalReducedEntityCounts()
	{
		super(Lang.getString("rai.goal.entity-count.reduced-entity-count")); //$NON-NLS-1$
		cd = 1;
		ad = 1;
		failing = false;
	}

	@Override
	public boolean onCheckFailing()
	{
		if(cd > 80)
		{
			cd = 10;
			ad = 1;
		}

		boolean f;
		cd++;
		int max = -1;

		try
		{
			for(Chunk i : Chunks.getLoadedChunks())
			{
				int s = 0;

				try
				{
					s = i.getEntities().length;
				}

				catch(Throwable e)
				{

				}

				if(s > max)
				{
					max = s;
				}
			}
		}

		catch(Throwable e)
		{
			Ex.t(e);
			return false;
		}

		int totalEntities = (int) (React.instance.sampleController.getSampler(SampledType.ENTDROP.toString()).getValue() + React.instance.sampleController.getSampler(SampledType.ENTLIV.toString()).getValue());
		int totalChunks = (int) React.instance.sampleController.getSampler(SampledType.CHK.toString()).getValue();

		f = totalChunks * Config.RAI_ENTITY_CHUNK_MULTIPLIER < (totalEntities * 4) && max > Config.RAI_ENTITY_CHUNK_CLUSTERIZER;

		if(f != failing)
		{
			failing = f;

			new S("goal-entity")
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
		ad++;
		if(!Config.RAI_ENTITY_PROPIGATE)
		{
			return;
		}

		if(spawned < 10)
		{
			return;
		}

		if(ad / cd > 0.25)
		{
			return;
		}

		Chunk laggiest = null;
		int max = -1;

		for(Chunk i : Chunks.getLoadedChunks())
		{
			try
			{
				int s = i.getEntities().length;

				if(s > max)
				{
					max = s;
					laggiest = i;
				}
			}

			catch(Throwable e)
			{
				Ex.t(e);
			}
		}

		if(laggiest != null)
		{
			Chunk lx = laggiest;

			new S("goal-entity.prop")
			{
				@Override
				public void run()
				{
					spawned = 0;
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
