package react.controller;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import react.Gate;
import react.rai.IGoal;
import react.rai.IRAI;
import react.rai.RAI;
import react.rai.goals.GoalReducedChunkLoad;
import react.rai.goals.GoalReducedEntityCounts;
import react.rai.goals.GoalStableHopperTime;
import react.rai.goals.GoalStableRedstoneTime;
import react.rai.goals.GoalStableTickTime;
import surge.Surge;
import surge.control.Controller;

public class RAIController extends Controller
{
	private IRAI rai;
	public boolean raiEnabled;

	@Override
	public void start()
	{
		Surge.register(this);
		rai = new RAI();
		raiEnabled = true;
		IGoal goalStable = new GoalStableTickTime();
		goalStable.addGoal(new GoalStableRedstoneTime());
		goalStable.addGoal(new GoalStableHopperTime());
		goalStable.addGoal(new GoalReducedEntityCounts());
		goalStable.addGoal(new GoalReducedChunkLoad());
		rai.addGoal(goalStable);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@EventHandler
	public void on(PlayerCommandPreprocessEvent e)
	{
		if(e.getMessage().equalsIgnoreCase("/rai"))
		{
			raiEnabled = !raiEnabled;
			Gate.msgRAI(e.getPlayer(), raiEnabled ? "Im Back!" : "... I'll see myself out now...");
			e.setCancelled(true);
		}
	}

	@Override
	public void tick()
	{
		if(raiEnabled)
		{
			rai.tick();
		}
	}
}
