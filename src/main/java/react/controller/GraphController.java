package react.controller;

import java.awt.Color;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.glang.GMap;

import react.api.SampledType;
import react.event.ReactScrollEvent;
import react.event.ScrollDirection;
import react.graph.ColossalView;
import react.graph.GraphSampler;
import react.graph.Point;
import react.papyrus.BufferedFrame;
import react.papyrus.FrameColor;
import react.papyrus.IPapyrus;
import react.papyrus.IRenderer;
import react.papyrus.Papyrus;
import surge.Surge;
import surge.control.Controller;
import surge.util.C;

public class GraphController extends Controller
{
	private GMap<SampledType, GraphSampler> g;
	private ColossalView colossal;

	@Override
	public void start()
	{
		Surge.register(this);
		g = new GMap<SampledType, GraphSampler>();

		for(SampledType i : SampledType.values())
		{
			GraphSampler graph = new GraphSampler(i.get(), i.get().getFormatter(), 20000);
			int r = C.chatToDye(i.get().getColor().chatColor()).getColor().asRGB();
			graph.setGraphColor(FrameColor.matchColor(new Color(r)));
			g.put(i, graph);
		}

		colossal = new ColossalView();
		colossal.addGraph(new Point(0, 0), new Point(128, 64), g.get(SampledType.TICK));
		colossal.addGraph(new Point(0, 64), new Point(64, 64), g.get(SampledType.MAHS));
		colossal.addGraph(new Point(64, 64), new Point(64, 64), g.get(SampledType.CHK_TIME));
		colossal.addGraph(new Point(0, 128), new Point(64, 64), g.get(SampledType.MEM));
		colossal.addGraph(new Point(0, 128 + 64), new Point(64, 64), g.get(SampledType.ENTDROP));
		colossal.addGraph(new Point(64, 128), new Point(64, 128), g.get(SampledType.ENTLIV));
		colossal.addGraph(new Point(0, 256), new Point(128, 128), g.get(SampledType.TICK));
		colossal.recompile();
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
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

	@SuppressWarnings("deprecation")
	@EventHandler
	public void on(ReactScrollEvent e)
	{
		if(e.getDirection().equals(ScrollDirection.UP))
		{
			colossal.scroll(16);
		}

		else
		{
			colossal.scroll(-16);
		}
	}

	@EventHandler
	public void on(PlayerCommandPreprocessEvent e)
	{
		IPapyrus pap = new Papyrus(e.getPlayer().getWorld());

		pap.addRenderer(new IRenderer()
		{
			@Override
			public void draw(BufferedFrame frame, MapCanvas c, MapView v)
			{
				colossal.getView().write(FrameColor.matchColor(0, 0, 0));
				colossal.render();
				frame.write(colossal.getView());
			}
		});

		e.getPlayer().getInventory().addItem(pap.makeMapItem());
	}
}
