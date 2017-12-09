package react.api;

import org.cyberpwn.glang.GMap;
import org.cyberpwn.reactlink.ComputedFrame;
import org.cyberpwn.reactlink.ComputedFrameSet;
import org.cyberpwn.reactlink.IFrameComputer;

import react.React;
import react.graph.PlotBoard;

public class ReactFrameComputer implements IFrameComputer
{
	public GMap<String, PlotBoard> getPlotBoards()
	{
		GMap<String, PlotBoard> plots = new GMap<String, PlotBoard>();

		for(SampledType i : React.instance.graphController.getG().k())
		{
			plots.put(i.get().getID(), React.instance.graphController.getG().get(i).getPlotBoard());
		}

		return plots;
	}

	@Override
	public long getEarliestFrame()
	{
		long min = Long.MAX_VALUE;

		for(PlotBoard i : getPlotBoards().v())
		{
			long e = i.earilestRecording();

			if(e < min)
			{
				min = e;
			}
		}

		return min;
	}

	@Override
	public long getLatestFrame()
	{
		long max = Long.MIN_VALUE;

		for(PlotBoard i : getPlotBoards().v())
		{
			long e = i.latestRecording();

			if(e > max)
			{
				max = e;
			}
		}

		return max;
	}

	@Override
	public ComputedFrameSet getFrames(long from, long to)
	{
		GMap<String, PlotBoard> boards = getPlotBoards();
		ComputedFrameSet set = new ComputedFrameSet();

		if(from >= to)
		{
			return set;
		}

		for(String i : boards.k())
		{
			PlotBoard board = boards.get(i);

			if(board == null)
			{
				continue;
			}

			GMap<Long, Double> data = board.getBetween(from, to);

			for(long j : data.k())
			{
				long tickTime = 20 * Math.round(j / (20.0));

				if(!set.getFrames().containsKey(tickTime))
				{
					set.getFrames().put(tickTime, new ComputedFrame());
				}

				set.getFrames().get(tickTime).put(i, data.get(j));
			}
		}

		return set;
	}

	@Override
	public ComputedFrameSet getFramesBefore(long before)
	{
		return getFrames(getEarliestFrame(), before);
	}

	@Override
	public ComputedFrameSet getFramesAfter(long after)
	{
		return getFrames(after, getLatestFrame());
	}

}
