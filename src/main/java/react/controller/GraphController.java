package react.controller;

import java.awt.Color;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.Lang;
import react.React;
import react.api.Capabilities;
import react.api.SampledType;
import react.graph.GraphSampleLine;
import react.graph.GraphSize;
import react.graph.GraphText;
import react.graph.GraphingInstance;
import react.graph.PointedGraph;
import react.papyrus.FrameColor;
import surge.Surge;
import surge.control.Controller;
import surge.sched.TaskLater;
import surge.util.C;

public class GraphController extends Controller
{
	private GMap<SampledType, GraphSampleLine> g;
	private GMap<Player, GraphingInstance> gr;

	@Override
	public void start()
	{
		Surge.register(this);
		gr = new GMap<Player, GraphingInstance>();
		g = new GMap<SampledType, GraphSampleLine>();

		for(SampledType i : SampledType.values())
		{
			GraphSampleLine graph = new GraphSampleLine(i.get(), i.get().getFormatter(), 20000);
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

	public void toggleMapping(Player player)
	{
		if(!Capabilities.DUAL_WIELD.isCapable())
		{
			Capabilities.DUAL_WIELD.sendNotCapable(player);
			return;
		}

		if(!gr.containsKey(player))
		{
			GList<PointedGraph> pg = new GList<PointedGraph>();
			gr.put(player, new GraphingInstance(player));
			pg.add(new PointedGraph(new GraphText(Lang.getString("map.graph-text.tick"), g.get(SampledType.TICK).getGraphColor()), GraphSize.WIDE)); //$NON-NLS-1$
			pg.add(new PointedGraph(g.get(SampledType.TICK), GraphSize.WIDE));
			pg.add(new PointedGraph(g.get(SampledType.TPS), GraphSize.SQUARE));
			pg.add(new PointedGraph(g.get(SampledType.TIU), GraphSize.SQUARE));
			pg.add(new PointedGraph(new GraphText(Lang.getString("map.graph-text.memory"), g.get(SampledType.MEM).getGraphColor()), GraphSize.WIDE)); //$NON-NLS-1$
			pg.add(new PointedGraph(g.get(SampledType.MEM), GraphSize.WIDE));
			pg.add(new PointedGraph(g.get(SampledType.MAHS), GraphSize.SQUARE));
			pg.add(new PointedGraph(g.get(SampledType.ALLOCMEM), GraphSize.SQUARE));
			pg.add(new PointedGraph(new GraphText(Lang.getString("map.graph-text.physics"), g.get(SampledType.REDSTONE_TIME).getGraphColor()), GraphSize.WIDE)); //$NON-NLS-1$
			pg.add(new PointedGraph(g.get(SampledType.REDSTONE_TIME), GraphSize.SQUARE));
			pg.add(new PointedGraph(g.get(SampledType.HOPPER_TIME), GraphSize.SQUARE));
			pg.add(new PointedGraph(g.get(SampledType.FLUID_TIME), GraphSize.SQUARE));
			pg.add(new PointedGraph(g.get(SampledType.CHK_TIME), GraphSize.SQUARE));
			pg.add(new PointedGraph(g.get(SampledType.ENTITY_TIME), GraphSize.SQUARE));
			pg.add(new PointedGraph(g.get(SampledType.EXPLOSION_TIME), GraphSize.SQUARE));
			pg.add(new PointedGraph(g.get(SampledType.TILE_TIME), GraphSize.SQUARE));
			pg.add(new PointedGraph(new GraphText(Lang.getString("map.graph-text.react"), g.get(SampledType.ATASK).getGraphColor()), GraphSize.WIDE)); //$NON-NLS-1$
			pg.add(new PointedGraph(g.get(SampledType.ATASK), GraphSize.WIDE));
			pg.add(new PointedGraph(g.get(SampledType.STASK), GraphSize.WIDE));

			gr.get(player).setGraphs(pg);
			gr.get(player).compile();
		}

		gr.get(player).toggle();
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
