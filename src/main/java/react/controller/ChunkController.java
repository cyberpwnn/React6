package react.controller;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.plugin.Plugin;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.Callback;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import react.Gate;
import react.React;
import react.api.Unused;
import surge.Surge;
import surge.control.Controller;

public class ChunkController extends Controller
{
	private boolean firstTickList;
	private long firstTick;
	private long lastTick;
	private Average aCSMS;
	private GMap<Plugin, Integer> pluginLoads;
	private GMap<Player, Integer> playerLoads;
	private int serverLoads;

	@Override
	public void start()
	{
		Surge.register(this);
		firstTickList = false;
		firstTick = M.ns();
		lastTick = M.ns();
		aCSMS = new Average(30);
		playerLoads = new GMap<Player, Integer>();
		pluginLoads = new GMap<Plugin, Integer>();
		serverLoads = 0;
	}

	private void flushTickList()
	{
		if(firstTickList == false)
		{
			aCSMS.put(0);
			return;
		}

		if(lastTick < firstTick)
		{
			firstTick = lastTick;
		}

		aCSMS.put(lastTick - firstTick);
		firstTickList = false;
	}

	private void tickNextTickList()
	{
		if(!firstTickList)
		{
			firstTickList = true;
			firstTick = M.ns();
		}

		else
		{
			lastTick = M.ns();
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Unused
	@Override
	public void tick()
	{
		flushTickList();

		if(TICK.tick % 20 == 0)
		{
			for(Player i : playerLoads.k())
			{
				playerLoads.put(i, (int) (playerLoads.get(i) / 2));

				if(playerLoads.get(i) < 2)
				{
					playerLoads.remove(i);
				}
			}

			for(Plugin i : pluginLoads.k())
			{
				pluginLoads.put(i, (int) (pluginLoads.get(i) / 2));

				if(pluginLoads.get(i) < 2)
				{
					pluginLoads.remove(i);
				}
			}

			serverLoads = (int) (serverLoads / 2);

			if(serverLoads < 2)
			{
				serverLoads = 2;
			}
		}
	}

	public void on(PlayerQuitEvent e)
	{
		playerLoads.remove(e.getPlayer());
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onLoad(ChunkLoadEvent e)
	{
		tickNextTickList();

		if(M.r(0.1))
		{
			React.instance.spikeController.whoFuckingDidThis(new Callback<Plugin>()
			{
				@Override
				public void run(Plugin p)
				{
					if(p == null)
					{
						Player plr = Gate.whoLoaded(e.getChunk());

						if(plr != null)
						{
							if(!playerLoads.containsKey(plr))
							{
								playerLoads.put(plr, 0);
							}

							playerLoads.put(plr, playerLoads.get(plr) + 1);
						}

						else
						{
							serverLoads++;
						}
					}

					else
					{
						if(!pluginLoads.containsKey(p))
						{
							pluginLoads.put(p, 0);
						}

						pluginLoads.put(p, pluginLoads.get(p) + 1);
					}
				}
			});
		}
	}

	public boolean isFirstTickList()
	{
		return firstTickList;
	}

	public long getFirstTick()
	{
		return firstTick;
	}

	public long getLastTick()
	{
		return lastTick;
	}

	public Average getaCSMS()
	{
		return aCSMS;
	}

	public GMap<Plugin, Integer> getPluginLoads()
	{
		return pluginLoads;
	}

	public GMap<Player, Integer> getPlayerLoads()
	{
		return playerLoads;
	}

	public int getServerLoads()
	{
		return serverLoads;
	}
}
