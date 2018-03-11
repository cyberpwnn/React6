package react.controller;

import java.awt.Color;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import com.volmit.react.surge.Surge;
import com.volmit.react.util.A;
import com.volmit.react.util.C;
import com.volmit.react.util.Controller;
import com.volmit.react.util.F;
import com.volmit.react.util.GList;
import com.volmit.react.util.GMap;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.P;
import com.volmit.react.util.TaskLater;

import react.Config;
import react.Gate;
import react.Lang;
import react.React;
import react.api.Capability;
import react.api.Permissable;
import react.api.SampledType;
import react.event.ReactScrollEvent;
import react.graph.GraphCPUArc;
import react.graph.GraphLagMap;
import react.graph.GraphMemoryArc;
import react.graph.GraphMode;
import react.graph.GraphSampleLine;
import react.graph.GraphSize;
import react.graph.GraphText;
import react.graph.GraphingInstance;
import react.graph.PointedGraph;
import react.papyrus.FrameColor;

public class GraphController extends Controller
{
	private GMap<SampledType, GraphSampleLine> g;
	private GMap<Player, GraphingInstance> gr;
	private GMap<ItemFrame, GraphingInstance> gra;

	@Override
	public void dump(JSONObject object)
	{
		object.put("graphs-loaded", g.size());
		object.put("renderers-active", gr.size() + gra.size());

		JSONObject sampled = new JSONObject();
		int ff = 0;

		for(SampledType i : g.k())
		{
			sampled.put(i.name(), F.f(g.get(i).getPlotBoard().getSize()) + " Indices @" + F.time(g.get(i).getPlotBoard().latestRecording() - g.get(i).getPlotBoard().earilestRecording(), 1) + " Time Span");
			ff += g.get(i).getPlotBoard().getSize();
		}

		object.put("total-indices", F.f(ff) + " (" + F.fileSize(ff * 8).toUpperCase() + "b)");
		object.put("sample-indices", sampled);
	}

	@Override
	public void start()
	{
		Surge.register(this);
		gr = new GMap<Player, GraphingInstance>();
		g = new GMap<SampledType, GraphSampleLine>();
		gra = new GMap<ItemFrame, GraphingInstance>();

		for(SampledType i : SampledType.values())
		{
			int v = Config.SAMPLE_VIEWPORT;

			GraphSampleLine graph = new GraphSampleLine(i.get(), i.get().getFormatter(), v);
			int r = C.chatToDye(i.get().getColor().chatColor()).getColor().asRGB();
			graph.setGraphColor(FrameColor.matchColor(new Color(r)));
			g.put(i, graph);
		}

		new TaskLater("waiter2")
		{
			@Override
			public void run()
			{
				for(Player i : Bukkit.getOnlinePlayers())
				{
					if(React.instance.playerController.has(i))
					{
						if(React.instance.playerController.getPlayer(i).isMapping())
						{
							if(!gr.containsKey(i))
							{
								toggleMapping(i);
							}
						}
					}
				}
			}
		};
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);

		for(Player i : gr.k())
		{
			gr.get(i).destroy();
		}
	}

	@Override
	public void tick()
	{
		new A()
		{
			@Override
			public void run()
			{
				for(SampledType i : g.k())
				{
					g.get(i).sample();
				}
			}
		};

		for(ItemFrame i : gra.k())
		{
			if(i == null || !gra.get(i).getItem().getType().equals(Material.MAP))
			{
				gra.remove(i);
			}
		}

		for(Player i : gr.k())
		{
			if(!gr.get(i).isMapping())
			{
				gr.remove(i);
			}
		}
	}

	@EventHandler
	public void on(PlayerJoinEvent e)
	{
		new TaskLater("waiter2")
		{
			@Override
			public void run()
			{
				if(React.instance.playerController.has(e.getPlayer()))
				{
					if(React.instance.playerController.getPlayer(e.getPlayer()).isMapping())
					{
						if(!gr.containsKey(e.getPlayer()))
						{
							toggleMapping(e.getPlayer());
						}
					}
				}
			}
		};
	}

	public void createGraphs(GraphMode mode, Player p, GList<PointedGraph> pg)
	{
		if(mode.equals(GraphMode.EOD))
		{
			addEod(p, pg);
		}

		else if(mode.equals(GraphMode.ITEMFRAME))
		{
			addSystem(p, pg);
			addTick(p, pg);
			addMemory(p, pg);
			addPhysics(p, pg);
			addReact(p, pg);
		}

		else if(mode.equals(GraphMode.NORMAL))
		{
			addSystem(p, pg);
			addTick(p, pg);
			addMemory(p, pg);
			addPhysics(p, pg);
			addReact(p, pg);
		}
	}

	public void addSystem(Player p, GList<PointedGraph> pg)
	{
		pg.add(new PointedGraph(new GraphText("System", FrameColor.matchColor(Color.yellow)), GraphSize.WIDE)); //$NON-NLS-1$
		pg.add(new PointedGraph(new GraphCPUArc(FrameColor.matchColor(Color.yellow)), GraphSize.SQUARE));
		pg.add(new PointedGraph(new GraphMemoryArc(FrameColor.matchColor(Color.yellow)), GraphSize.SQUARE));
	}

	public void addTick(Player p, GList<PointedGraph> pg)
	{
		pg.add(new PointedGraph(new GraphText(Lang.getString("map.graph-text.tick"), g.get(SampledType.TICK).getGraphColor()), GraphSize.WIDE)); //$NON-NLS-1$
		pg.add(new PointedGraph(g.get(SampledType.TICK), GraphSize.WIDE));
		pg.add(new PointedGraph(g.get(SampledType.TPS), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.TIU), GraphSize.SQUARE));
	}

	public void addMemory(Player p, GList<PointedGraph> pg)
	{
		pg.add(new PointedGraph(new GraphText(Lang.getString("map.graph-text.memory"), g.get(SampledType.MEM).getGraphColor()), GraphSize.WIDE)); //$NON-NLS-1$
		pg.add(new PointedGraph(g.get(SampledType.MEM), GraphSize.WIDE));
		pg.add(new PointedGraph(g.get(SampledType.MAHS), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.ALLOCMEM), GraphSize.SQUARE));
	}

	public void addEod(Player p, GList<PointedGraph> pg)
	{
		pg.add(new PointedGraph(new GraphLagMap(p, 4), GraphSize.FULL));
	}

	public void addPhysics(Player p, GList<PointedGraph> pg)
	{
		pg.add(new PointedGraph(new GraphText(Lang.getString("map.graph-text.physics"), g.get(SampledType.REDSTONE_TIME).getGraphColor()), GraphSize.WIDE)); //$NON-NLS-1$
		pg.add(new PointedGraph(g.get(SampledType.PHYSICS_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.REDSTONE_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.HOPPER_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.FLUID_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.CHK_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.ENTITY_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.EXPLOSION_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.GROWTH_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.TILE_TIME), GraphSize.WIDE));
	}

	public void addReact(Player p, GList<PointedGraph> pg)
	{
		pg.add(new PointedGraph(new GraphText(Lang.getString("map.graph-text.react"), g.get(SampledType.ATASK).getGraphColor()), GraphSize.WIDE)); //$NON-NLS-1$
		pg.add(new PointedGraph(g.get(SampledType.ATASK), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.STASK), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.REACT_TIME), GraphSize.SQUARE));
		pg.add(new PointedGraph(g.get(SampledType.REACT_TASK_TIME), GraphSize.SQUARE));
	}

	public void toggleMapping(Player player, String[] args)
	{
		if(!Capability.FAST_MAPPING.isCapable())
		{
			Capability.FAST_MAPPING.sendNotCapable(player);
			Capability.DUAL_WEILD.sendNotCapable(player);
			return;
		}

		if(!Capability.DUAL_WEILD.isCapable())
		{
			Capability.DUAL_WEILD.sendNotCapable(player);
			return;
		}

		if(args.length == 0)
		{
			toggleMapping(player);
			return;
		}

		if(args[0].equalsIgnoreCase("-e"))
		{
			toggleMappingEod(player);
			return;
		}

		if(args[0].equalsIgnoreCase("-i"))
		{
			Entity e = P.targetEntity(player, 7);

			if(e != null && e instanceof ItemFrame)
			{
				if(!gra.containsKey(e))
				{
					GList<PointedGraph> pg = new GList<PointedGraph>();
					gra.put((ItemFrame) e, new GraphingInstance(player));
					createGraphs(GraphMode.ITEMFRAME, player, pg);
					gra.get(e).setGraphs(pg);
					gra.get(e).compile();
					((ItemFrame) e).setItem(gra.get(e).getItem());
				}

				else
				{
					((ItemFrame) e).setItem(new ItemStack(Material.AIR));
					gra.remove(e);
				}
			}

			else
			{
				Gate.msgError(player, "You must be looking at an item frame to apply a map to it.");
			}
		}
	}

	@EventHandler
	public void on(PlayerMoveEvent e)
	{
		if(Permissable.MONITOR_MAP.has(e.getPlayer()))
		{
			if(gr.containsKey(e.getPlayer()))
			{
				return;
			}

			for(ItemFrame i : gra.k())
			{
				if(i.getWorld().equals(e.getPlayer().getWorld()))
				{
					if(i.getLocation().distanceSquared(e.getPlayer().getLocation()) < 7 * 7)
					{
						Entity ex = P.targetEntity(e.getPlayer(), 7);

						if(ex != null && ex.equals(i))
						{
							if((!gra.get(i).getPlayer().equals(e.getPlayer()) && !gra.get(i).isMapping()) || (gra.get(i).getPlayer().equals(e.getPlayer()) && !gra.get(i).isMapping()))
							{
								gra.get(i).setPlayer(e.getPlayer());
								gra.get(i).enableSly();
							}
						}

						else
						{
							if(gra.get(i).getPlayer().equals(e.getPlayer()) && gra.get(i).isMapping())
							{
								gra.get(i).disableSly();
							}
						}
					}

					else if(gra.get(i).getPlayer().equals(e.getPlayer()) && gra.get(i).isMapping())
					{
						gra.get(i).disableSly();
					}
				}
			}
		}
	}

	@EventHandler
	public void on(ReactScrollEvent e)
	{

	}

	public void stopMapping(Player p)
	{
		if(gr.containsKey(p))
		{
			gr.get(p).toggle();
			gr.remove(p);
		}
	}

	public void toggleMapping(Player player)
	{
		if(!Capability.DUAL_WEILD.isCapable())
		{
			Capability.DUAL_WEILD.sendNotCapable(player);
			return;
		}

		for(ItemFrame i : gra.k())
		{
			if(gra.get(i).getPlayer().equals(player) && gra.get(i).isMapping())
			{
				Gate.msgError(player, "You are currently hosting the item frame graph.");
				Gate.msgError(player, "Please look away from the item frame to turn on personal mapping.");
				return;
			}
		}

		if(!gr.containsKey(player))
		{
			GList<PointedGraph> pg = new GList<PointedGraph>();
			gr.put(player, new GraphingInstance(player));
			createGraphs(GraphMode.NORMAL, player, pg);
			gr.get(player).setGraphs(pg);
			gr.get(player).compile();
			gr.get(player).toggle();
		}

		else
		{
			gr.get(player).toggle();
			gr.remove(player);
		}
	}

	public void toggleMappingEod(Player player)
	{
		if(!Capability.DUAL_WEILD.isCapable())
		{
			Capability.DUAL_WEILD.sendNotCapable(player);
			return;
		}

		for(ItemFrame i : gra.k())
		{
			if(gra.get(i).getPlayer().equals(player) && gra.get(i).isMapping())
			{
				Gate.msgError(player, "You are currently hosting the item frame graph.");
				Gate.msgError(player, "Please look away from the item frame to turn on personal mapping.");
				return;
			}
		}

		if(!gr.containsKey(player))
		{
			GList<PointedGraph> pg = new GList<PointedGraph>();
			gr.put(player, new GraphingInstance(player));
			gr.get(player).setDoScrolling(false);
			createGraphs(GraphMode.EOD, player, pg);
			gr.get(player).setGraphs(pg);
			gr.get(player).compile();
			gr.get(player).toggle();
		}

		else
		{
			gr.get(player).toggle();
			gr.remove(player);
		}
	}

	public GMap<SampledType, GraphSampleLine> getG()
	{
		return g;
	}

	public GMap<Player, GraphingInstance> getGr()
	{
		return gr;
	}
}
