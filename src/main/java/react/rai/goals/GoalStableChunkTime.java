package react.rai.goals;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.Config;
import react.Lang;
import react.React;
import react.api.SampledType;
import react.rai.Goal;
import react.rai.RAI;
import react.rai.RAIEvent;
import react.rai.RAIEventType;
import surge.util.C;

public class GoalStableChunkTime extends Goal
{
	boolean failing;

	public GoalStableChunkTime()
	{
		super(Lang.getString("rai.goal.stable-chunk-time.stable")); //$NON-NLS-1$

		failing = false;
	}

	@Override
	public boolean onCheckFailing()
	{
		boolean f = false;

		double nsms = 1000000;
		double tickTime = React.instance.sampleController.getSampler(SampledType.TICK.toString()).getValue() * nsms;
		double redTime = React.instance.sampleController.getSampler(SampledType.CHK_TIME.toString()).getValue();
		double maxRedTime = M.clip((tickTime * Config.RAI_CHUNK_TIME_FUNCTION) + Config.RAI_CHUNK_TIME_MUDDING, Config.RAI_CHUNK_TIME_FLOOR, Config.RAI_CHUNK_TIME_CEIL);

		if(redTime > maxRedTime)
		{
			if((redTime / nsms) - (maxRedTime / nsms) > Config.RAI_CHUNK_TIME_OVERBLEED)
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
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FAILING, Lang.getString("rai.goal.stable-chunk-time.keep"), Lang.getString("rai.goal.stable-chunk-time.chunk-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
					}

					else
					{
						RAI.instance.callEvent(new RAIEvent(RAIEventType.NOTE_GOAL_FIXED, Lang.getString("rai.goal.stable-chunk-time.keeping"), Lang.getString("rai.goal.stable-chunk-time.chunk-tick"))); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			};
		}

		return f;
	}

	@Override
	public void onPropigated()
	{
		if(!Config.RAI_CHUNK_TIME_PROPIGATE)
		{
			return;
		}

		if(TICK.tick % 5 == 0)
		{
			GMap<Player, Integer> player = React.instance.chunkController.getPlayerLoads();
			GMap<Plugin, Integer> plugin = React.instance.chunkController.getPluginLoads();
			GMap<Object, Integer> top = new GMap<Object, Integer>();
			int total = 0;

			for(Player i : player.k())
			{
				top.put(i, player.get(i));
				total += player.get(i);
			}

			for(Plugin i : plugin.k())
			{
				top.put(i, plugin.get(i));
				total += plugin.get(i);
			}

			total += React.instance.chunkController.getServerLoads();
			top.put(C.YELLOW + "Server", React.instance.chunkController.getServerLoads());

			int totalx = total;

			for(Object i : top.sortK())
			{
				if(i instanceof Player && ((double) top.get(i) / (double) totalx) > 0.56)
				{
					new S()
					{
						@Override
						public void run()
						{
							Player px = (Player) i;
							if(px.isFlying())
							{
								px.setVelocity(new Vector(px.getVelocity().getX(), px.getVelocity().getY(), px.getVelocity().getZ()));
							}
						}
					};

					break;
				}
			}
		}
	}
}
