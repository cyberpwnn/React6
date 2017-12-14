package react.controller;

import org.cyberpwn.glang.GMap;
import org.cyberpwn.gnet.streams.writable.Streamable;
import org.cyberpwn.reactlink.server.IFrameComputer;
import org.cyberpwn.reactlink.server.packet.ComputedFrame;

import react.React;
import react.api.SampledType;
import react.graph.GraphSampleLine;
import react.graph.IGraph;
import react.graph.PlotBoard;

public class ReactFremComputer implements IFrameComputer
{
	@Override
	public GMap<Long, Streamable> compute(long from, long to)
	{
		GMap<Long, Streamable> frems = new GMap<Long, Streamable>();
		GMap<SampledType, GraphSampleLine> data = React.instance.graphController.getG();

		for(SampledType i : data.k())
		{
			String id = i.get().getID();
			IGraph graph = data.get(i);
			PlotBoard board = graph.getPlotBoard();
			GMap<Long, Double> raw = board.getBetween(from, to);

			for(Long j : raw.k())
			{
				long dopplerTime = 35 * (j.longValue() / 35);

				if(!frems.containsKey(dopplerTime))
				{
					frems.put(dopplerTime, new ComputedFrame());
				}

				((ComputedFrame) frems.get(dopplerTime)).getValues().put(id, raw.get(j));
			}
		}

		return frems;
	}
}
