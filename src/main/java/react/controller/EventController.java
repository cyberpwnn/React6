package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.cyberpwn.glang.GMap;

import react.event.ReactScrollEvent;
import react.event.ScrollDirection;
import surge.Surge;
import surge.control.Controller;

public class EventController extends Controller
{
	private GMap<Player, Integer> slots;

	@Override
	public void start()
	{
		Surge.register(this);
		slots = new GMap<Player, Integer>();

		for(Player i : Bukkit.getOnlinePlayers())
		{
			slots.put(i, i.getInventory().getHeldItemSlot());
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{
		for(Player i : slots.k())
		{
			int from = slots.get(i);
			int to = i.getInventory().getHeldItemSlot();

			if(from != to)
			{
				ScrollDirection dir = null;

				if(from == 0 && to == 9)
				{
					dir = ScrollDirection.DOWN;
				}

				else if(to == 0 && from == 9)
				{
					dir = ScrollDirection.UP;
				}

				else if(from > to)
				{
					dir = ScrollDirection.UP;
				}

				else if(from < to)
				{
					dir = ScrollDirection.DOWN;
				}

				if(dir != null)
				{
					ReactScrollEvent r = new ReactScrollEvent(i, dir);
					Bukkit.getServer().getPluginManager().callEvent(r);

					if(r.isCancelled())
					{
						i.getInventory().setHeldItemSlot(from);
					}

					slots.put(i, i.getInventory().getHeldItemSlot());
				}
			}
		}
	}

	@EventHandler
	public void on(PlayerJoinEvent e)
	{
		slots.put(e.getPlayer(), e.getPlayer().getInventory().getHeldItemSlot());
	}

	@EventHandler
	public void on(PlayerQuitEvent e)
	{
		slots.remove(e.getPlayer());
	}
}
