package react.controller;

import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Hopper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.Inventory;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.Config;
import react.Gate;
import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactPlayer;
import surge.Surge;
import surge.control.Controller;
import surge.sched.Task;
import surge.util.MaterialBlock;
import surge.util.ParticleEffect;

public class GlassController extends Controller
{
	private GMap<Location, Color> q;
	private GList<Player> g;

	@Override
	public void start()
	{
		Surge.register(this);
		g = new GList<Player>();
		q = new GMap<Location, Color>();
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void tick()
	{
		GList<Player> glasses = new GList<Player>();

		for(ReactPlayer i : React.instance.playerController.getPlayers())
		{
			if(i.isGlasses())
			{
				glasses.add(i.getP());
			}
		}

		g = glasses;

		GMap<Location, Color> cc = q.copy();

		while(cc.size() > 200)
		{
			Location n = cc.k().popRandom();
			q.put(n, cc.get(n));
			cc.remove(n);
		}

		q.clear();

		new A()
		{
			@Override
			public void run()
			{
				for(Location i : cc.k())
				{
					if(Config.GLASS_SHOW_PARTICLES)
					{
						ParticleEffect.SPELL_MOB.display(new ParticleEffect.OrdinaryColor(cc.get(i)), i, g);
					}

					if(Config.GLASS_SHOW_BLOCKS)
					{
						DyeColor color = DyeColor.getByColor(cc.get(i));

						try
						{
							for(Player j : g)
							{
								j.sendBlockChange(i, Material.STAINED_GLASS, color.getWoolData());

								new Task("waiter-colorblock", 2, 88)
								{
									@Override
									public void run()
									{
										if(ticks == 1)
										{
											MaterialBlock mb = new MaterialBlock(i);
											j.sendBlockChange(i, mb.getMaterial(), mb.getData());
										}
									}
								};
							}
						}

						catch(Exception e)
						{

						}
					}
				}
			}
		};
	}

	public boolean isUsingGlasses(Player p)
	{
		return canUseGlasses(p) && React.instance.playerController.getPlayer(p).glasses;
	}

	public boolean canUseGlasses(Player p)
	{
		return Permissable.MONITOR_GLASSES.has(p);
	}

	public void toggleGlasses(Player p)
	{
		if(canUseGlasses(p))
		{
			React.instance.playerController.getPlayer(p).glasses = !React.instance.playerController.getPlayer(p).glasses;
			Gate.msgSuccess(p, React.instance.playerController.getPlayer(p).glasses ? Info.MSG_GLASS_STARTED : Info.MSG_GLASS_STOPPED);
		}

		else if(isUsingGlasses(p))
		{
			React.instance.playerController.getPlayer(p).glasses = false;
			Gate.msgSuccess(p, React.instance.playerController.getPlayer(p).glasses ? Info.MSG_GLASS_STARTED : Info.MSG_GLASS_STOPPED);
		}

		else
		{
			Gate.msgError(p, Info.MSG_PERMISSION);
		}
	}

	@EventHandler
	public void on(BlockPhysicsEvent e)
	{
		if(g.size() > 0)
		{
			Location a = e.getBlock().getLocation().clone().add(0.5, 0.5, 0.5);
			q.put(a, Info.COLOR_BLOCK_UPDATE);
		}
	}

	@EventHandler
	public void on(BlockFromToEvent e)
	{
		if(g.size() > 0)
		{
			Location a = e.getBlock().getLocation().clone().add(0.5, 0.5, 0.5);
			q.put(a, Info.COLOR_BLOCK_FROMTO);
		}
	}

	@EventHandler
	public void on(BlockBurnEvent e)
	{
		if(g.size() > 0)
		{
			Location a = e.getBlock().getLocation().clone().add(0.5, 0.5, 0.5);
			q.put(a, Info.COLOR_BLOCK_BURN);
		}
	}

	@EventHandler
	public void on(BlockFormEvent e)
	{
		if(g.size() > 0)
		{
			Location a = e.getBlock().getLocation().clone().add(0.5, 0.5, 0.5);
			q.put(a, Info.COLOR_BLOCK_FORM);
		}
	}

	@EventHandler
	public void on(BlockFadeEvent e)
	{
		if(g.size() > 0)
		{
			Location a = e.getBlock().getLocation().clone().add(0.5, 0.5, 0.5);
			q.put(a, Info.COLOR_BLOCK_DECAY);
		}
	}

	@EventHandler
	public void on(InventoryMoveItemEvent e)
	{
		if(g.size() > 0)
		{
			Inventory source = e.getSource();
			Inventory destination = e.getDestination();

			if(source.getHolder() instanceof Hopper && destination.getHolder() instanceof Hopper)
			{
				Hopper to = (Hopper) destination.getHolder();
				Location a = to.getBlock().getLocation().clone().add(0.5, 0.5, 0.5);
				q.put(a, Info.COLOR_HOPPER);
			}
		}
	}
}
