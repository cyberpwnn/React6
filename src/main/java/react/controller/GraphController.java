package react.controller;

import java.awt.Color;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;
import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.api.SampledType;
import react.event.ReactScrollEvent;
import react.event.ScrollDirection;
import react.graph.ColossalView;
import react.graph.ColossalView.Builder;
import react.graph.GraphSampler;
import react.graph.GraphSize;
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

		ColossalView.Builder builder = new Builder();

		for(SampledType i : SampledType.values())
		{
			builder.add(g.get(i), M.r(0.25) ? GraphSize.WIDE : GraphSize.SQUARE);
		}

		colossal = builder.compute();
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
			colossal.scroll(16 * e.getAmount());
		}

		else
		{
			colossal.scroll(-16 * e.getAmount());
		}
	}

	@EventHandler
	public void on(PlayerCommandPreprocessEvent e)
	{
		if(!e.getMessage().equals("/pap"))
		{
			return;
		}

		e.setCancelled(true);
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
