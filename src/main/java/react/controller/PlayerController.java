package react.controller;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

import react.api.ReactPlayer;
import surge.Surge;
import surge.collection.GList;
import surge.control.Controller;

public class PlayerController extends Controller
{
	private GList<ReactPlayer> players;

	@Override
	public void start()
	{
		players = new GList<ReactPlayer>();
		Surge.register(this);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{

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
