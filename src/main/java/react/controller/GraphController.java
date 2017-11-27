package react.controller;

import java.awt.Color;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;
import org.cyberpwn.gformat.F;

import react.React;
import react.api.SampledType;
import react.graph.IFormatter;
import react.graphs.GraphSampler;
import react.papyrus.BufferedFrame;
import react.papyrus.FrameColor;
import react.papyrus.IRenderer;
import react.papyrus.Papyrus;
import surge.Surge;
import surge.control.Controller;

public class GraphController extends Controller
{
	private GraphSampler chk;
	private GraphSampler mah;
	private GraphSampler tick;

	@Override
	public void start()
	{
		Surge.register(this);
		mah = new GraphSampler(React.instance.sampleController.getSampler(SampledType.MAHS.toString()), new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.memSize((long) d);
			}
		}, 20000);
		mah.setGraphColor(FrameColor.matchColor(Color.YELLOW));

		tick = new GraphSampler(React.instance.sampleController.getSampler(SampledType.TICK.toString()), new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f(d, 0);
			}
		}, 20000);
		tick.setGraphColor(FrameColor.LIGHT_GREEN);

		chk = new GraphSampler(React.instance.sampleController.getSampler(SampledType.CHK_TIME.toString()), new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.time(d / 1000000.0, 1);
			}
		}, 20000);
		chk.setGraphColor(FrameColor.RED);

	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{
		tick.sample();
		mah.sample();
		chk.sample();
	}

	@EventHandler
	public void on(PlayerCommandPreprocessEvent e)
	{
		BufferedFrame ba = new BufferedFrame(64, 64);
		BufferedFrame bb = new BufferedFrame(64, 64);
		BufferedFrame bc = new BufferedFrame(128, 64);

		if(e.getMessage().equals("/pap"))
		{
			Papyrus p = new Papyrus(e.getPlayer().getWorld());
			p.addRenderer(new IRenderer()
			{
				@Override
				public void draw(BufferedFrame frame, MapCanvas c, MapView v)
				{
					tick.render(bc, c, v);
					chk.render(bb, c, v);
					mah.render(ba, c, v);

					frame.write(ba, 0, 0);
					frame.write(bb, 64, 0);
					frame.write(bc, 0, 64);
				}
			});

			e.getPlayer().getInventory().addItem(p.makeMapItem());
		}
	}
}
