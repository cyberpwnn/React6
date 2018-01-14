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
import react.React;
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
	private int iv;
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
			disableNoSave();
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
			React.instance.playerController.getPlayer(player).setMapping(true);
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

	public ItemStack getItem()
	{
		return item;
	}

	public void disable()
	{
		mapping = false;
		player.getInventory().setItemInOffHand(null);
		React.instance.playerController.getPlayer(player).setMapping(false);
		msgs.clear();
		Gate.msgSuccess(player, "Mapping Disabled");
	}

	public void disableNoSave()
	{
		mapping = false;
		player.getInventory().setItemInOffHand(null);
		msgs.clear();
		Gate.msgSuccess(player, "Mapping Disabled");
	}

	public Player getPlayer()
	{
		return player;
	}

	public GList<PointedGraph> getGraphs()
	{
		return graphs;
	}

	public ColossalView getView()
	{
		return view;
	}

	public Papyrus getPapyrus()
	{
		return papyrus;
	}

	public void setPlayer(Player player)
	{
		this.player = player;
	}

	public void setItem(ItemStack item)
	{
		this.item = item;
	}

	public void setView(ColossalView view)
	{
		this.view = view;
	}

	public void setPapyrus(Papyrus papyrus)
	{
		this.papyrus = papyrus;
	}

	public void setRenderer(IRenderer renderer)
	{
		this.renderer = renderer;
	}

	public void setMapping(boolean mapping)
	{
		this.mapping = mapping;
	}

	public void setMsgs(GList<String> msgs)
	{
		this.msgs = msgs;
	}

	public void setWaiter(Task waiter)
	{
		this.waiter = waiter;
	}

	public void setWaiter2(Task waiter2)
	{
		this.waiter2 = waiter2;
	}

	public void setShift(int shift)
	{
		this.shift = shift;
	}

	public void setNotif(boolean notif)
	{
		this.notif = notif;
	}

	public IRenderer getRenderer()
	{
		return renderer;
	}

	public boolean isMapping()
	{
		return mapping;
	}

	public GList<String> getMsgs()
	{
		return msgs;
	}

	public Task getWaiter()
	{
		return waiter;
	}

	public Task getWaiter2()
	{
		return waiter2;
	}

	public int getShift()
	{
		return shift;
	}

	public boolean isNotif()
	{
		return notif;
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

	public void enableSly()
	{
		if(mapping)
		{
			return;
		}

		for(int i = 12; i < 33; i--)
		{
			if(player.getInventory().getItem(i) == null || player.getInventory().getItem(i).getType().equals(Material.AIR))
			{
				iv = i;
				mapping = true;
				player.getInventory().setItem(iv, item);
				break;
			}
		}
	}

	public void disableSly()
	{
		if(!mapping)
		{
			return;
		}

		mapping = false;
		player.getInventory().setItem(iv, new ItemStack(Material.AIR));
		msgs.clear();
	}
}
