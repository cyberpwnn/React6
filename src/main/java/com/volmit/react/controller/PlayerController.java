package com.volmit.react.controller;

import org.bukkit.entity.Player;

import com.volmit.react.api.ReactPlayer;

import surge.collection.GList;
import surge.control.Controller;

public class PlayerController extends Controller
{
	private GList<ReactPlayer> players;

	@Override
	public void start()
	{
		players = new GList<ReactPlayer>();
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{

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
}
