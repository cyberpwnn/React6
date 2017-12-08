package react.controller;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.TICK;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GSet;

import react.api.ReactPlayer;
import surge.Surge;
import surge.control.Controller;

public class PlayerController extends Controller
{
	private GList<ReactPlayer> players;
	private GSet<ReactPlayer> save;

	@Override
	public void start()
	{
		players = new GList<ReactPlayer>();
		save = new GSet<ReactPlayer>();
		Surge.register(this);
	}

	@Override
	public void stop()
	{
		save.addAll(players);

		for(ReactPlayer i : save)
		{
			requestSave(i.getP(), true);
		}

		save.clear();

		Surge.unregister(this);
	}

	@Override
	public void tick()
	{
		if(TICK.tick % 20 == 0)
		{
			GList<ReactPlayer> toSave = new GList<ReactPlayer>(save);
			save.clear();

			new A()
			{
				@Override
				public void run()
				{
					for(ReactPlayer i : toSave)
					{
						requestSave(i.getP(), true);
					}
				}
			};
		}
	}

	public boolean has(Player p)
	{
		for(ReactPlayer i : players)
		{
			if(i.getP().equals(p))
			{
				return true;
			}
		}

		return false;
	}

	public void requestSave(Player p, boolean thisFuckingInstant)
	{
		if(has(p))
		{
			if(thisFuckingInstant)
			{
				save.remove(getPlayer(p));
				getPlayer(p).save();
			}

			else
			{
				save.add(getPlayer(p));
			}
		}
	}

	public ReactPlayer getPlayer(Player p)
	{
		for(ReactPlayer i : players)
		{
			if(i.getP().equals(p))
			{
				return i;
			}
		}

		ReactPlayer rp = new ReactPlayer(p);
		players.add(rp);

		return rp;
	}

	public GList<ReactPlayer> getPlayers()
	{
		return players;
	}

	@EventHandler
	public void on(PlayerQuitEvent e)
	{
		if(has(e.getPlayer()))
		{
			getPlayer(e.getPlayer()).save();
			players.remove(getPlayer(e.getPlayer()));
		}
	}
}
