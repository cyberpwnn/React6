package react.graph;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.gmath.M;

import react.Gate;
import react.event.ReactScrollEvent;
import react.event.ScrollDirection;
import react.papyrus.BufferedFrame;
import react.papyrus.IRenderer;
import react.papyrus.Papyrus;
import surge.Surge;
import surge.sched.Task;
import surge.util.C;

public class GraphingInstance implements Listener
{
	private Player player;
	private ItemStack item;
	private GList<PointedGraph> graphs;
	private ColossalView view;
	private Papyrus papyrus;
	private IRenderer renderer;
	private boolean mapping;
	private GList<String> msgs;
	private Task waiter;
	private Task waiter2;
	private int shift;
	private boolean notif;

	public GraphingInstance(Player player)
	{
		notif = false;
		shift = 0;
		waiter = new Task("Chat waiter", 199)
		{
			@Override
			public void run()
			{
				if(mapping)
				{
					if(!msgs.isEmpty() && notif)
					{
						notif = false;
						if(msgs.size() > 1)
						{
							Gate.msgActing(player, msgs.size() + " chat messages. Double shift to view.");
						}

						else
						{
							Gate.msgActing(player, "1 message witheld. Double shift to view.");
						}

					}
				}
			}
		};

		waiter2 = new Task("Chat waiter2", 0)
		{
			@Override
			public void run()
			{
				if(mapping)
				{
					if(shift > 0)
					{
						shift--;

						if(shift >= 13)
						{
							shift = 0;

							for(String i : msgs)
							{
								send(i);
							}

							msgs.clear();
						}
					}
				}
			}
		};
		msgs = new GList<String>();
		mapping = false;
		Surge.register(this);
		this.player = player;
		renderer = new IRenderer()
		{
			@Override
			public void draw(BufferedFrame frame, MapCanvas c, MapView v)
			{
				view.render();
				frame.write(view.getView());
			}
		};
	}

	@EventHandler
	public void on(PlayerToggleSneakEvent e)
	{
		if(mapping && e.getPlayer().equals(player))
		{
			view.triggerGraphsInView();
			shift += 5;
		}
	}

	@EventHandler
	public void on(PlayerQuitEvent e)
	{
		if(e.getPlayer().equals(e.getPlayer()))
		{
			destroy();
		}
	}

	public void send(String s)
	{
		String f = C.stripColor(s.split(":REACTSPLITTERFFF:")[0]);
		Long g = Long.valueOf(f);
		String msg = C.YELLOW + "[" + F.time((double) (M.ms() - g), 0) + " ago] " + s.split(":REACTSPLITTERFFF:")[1];
		player.sendMessage(msg);
	}

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void on(AsyncPlayerChatEvent e)
	{
		if(e.isCancelled())
		{
			return;
		}

		if(mapping)
		{
			if(e.getRecipients().contains(player))
			{
				e.getRecipients().remove(player);
			}

			notif = true;
			msgs.add(C.YELLOW + "" + M.ms() + ":REACTSPLITTERFFF:" + C.RESET + e.getFormat().replaceAll("%1", e.getPlayer().getDisplayName()).replaceAll("%2", e.getMessage()).replace("$s", C.RESET.toString()).replace("$s", C.RESET.toString()));
		}
	}

	@EventHandler
	public void on(ReactScrollEvent e)
	{
		if(mapping && e.getPlayer().equals(player))
		{
			if(e.getDirection().equals(ScrollDirection.UP))
			{
				view.scroll(32 * e.getAmount());
			}

			else
			{
				view.scroll(-32 * e.getAmount());
			}
		}
	}

	@EventHandler
	public void on(PlayerSwapHandItemsEvent e)
	{
		if(mapping && e.getPlayer().equals(player))
		{
			disable();
			e.setCancelled(true);
		}
	}

	public void destroy()
	{
		if(mapping)
		{
			disable();
		}

		waiter.cancel();
		waiter2.cancel();
		Surge.unregister(this);
	}

	public void toggle()
	{
		if(mapping)
		{
			disable();
		}

		else
		{
			enable();
		}
	}

	public void setGraphs(GList<PointedGraph> g)
	{
		graphs = g;
	}

	public void enable()
	{
		if(player.getInventory().getItemInOffHand() == null || player.getInventory().getItemInOffHand().getType().equals(Material.AIR))
		{
			mapping = true;
			player.getInventory().setItemInOffHand(item);
			Gate.msgSuccess(player, "Mapping Enabled");
			Gate.msgSuccess(player, "Messages have been slowed while you use the map.");
		}

		else
		{
			Gate.msgError(player, "Cannot enable mapping. Clear your offhand.");
		}
	}

	public void disable()
	{
		mapping = false;
		player.getInventory().setItemInOffHand(null);

		for(String i : msgs)
		{
			send(i);
		}

		msgs.clear();
		Gate.msgSuccess(player, "Mapping Disabled");
	}

	public void compile()
	{
		ColossalView.Builder b = new ColossalView.Builder();

		for(PointedGraph i : graphs)
		{
			b.add(i.getGraph(), i.getSize());
		}

		view = b.compute();
		papyrus = new Papyrus(player.getWorld());
		papyrus.addRenderer(renderer);
		item = papyrus.makeMapItem();
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(C.AQUA + "React " + C.LIGHT_PURPLE + "Map");
		meta.setLore(new GList<String>().qadd(C.GREEN + "Scroll up and down with your mouse wheel."));
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(Enchantment.DURABILITY, 1338);
	}
}
