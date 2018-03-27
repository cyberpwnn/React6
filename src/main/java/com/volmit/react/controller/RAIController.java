package com.volmit.react.controller;

import com.volmit.react.Config;
import com.volmit.react.Surge;
import com.volmit.react.api.GoalReducedEntityCounts;
import com.volmit.react.api.GoalStableChunkTime;
import com.volmit.react.api.GoalStableFluidTime;
import com.volmit.react.api.GoalStableHopperTime;
import com.volmit.react.api.GoalStableRedstoneTime;
import com.volmit.react.api.GoalStableTickTime;
import com.volmit.react.api.IGoal;
import com.volmit.react.api.IRAI;
import com.volmit.react.api.RAI;
import com.volmit.react.api.SampledType;
import com.volmit.react.util.A;
import com.volmit.react.util.Controller;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.TICK;

public class RAIController extends Controller
{
	private IRAI rai;
	public boolean raiEnabled;

	@Override
	public void dump(JSONObject object)
	{
		object.put("active", raiEnabled);
	}

	@Override
	public void start()
	{
		Surge.register(this);
		rai = new RAI();
		raiEnabled = true;
		IGoal goalStable = new GoalStableTickTime();
		goalStable.addGoal(new GoalStableRedstoneTime());
		goalStable.addGoal(new GoalStableFluidTime());
		goalStable.addGoal(new GoalStableHopperTime());
		goalStable.addGoal(new GoalReducedEntityCounts());
		goalStable.addGoal(new GoalStableChunkTime());
		rai.addGoal(goalStable);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{
		if(TICK.tick < 20)
		{
			return;
		}

		if(SampledType.TPS.get().getValue() > 0 && SampledType.TPS.get().getValue() > Config.RAI_ACTIVATION)
		{
			return;
		}

		if(!Config.RAI)
		{
			return;
		}

		if(Config.MONITOR_ONLY)
		{
			return;
		}

		new A()
		{
			@Override
			public void run()
			{
				rai.tick();
			}
		};
	}

	public IRAI getRai()
	{
		return rai;
	}
}
