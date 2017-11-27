package react.graph;

import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;

import react.papyrus.BufferedFrame;

public abstract class NormalGraph implements IGraph
{
	private String name;
	private PlotBoard plotBoard;
	private long timeViewport;
	private double max;

	public NormalGraph(String name, long timeViewport)
	{
		this.name = name;
		this.timeViewport = timeViewport;
		plotBoard = new PlotBoard();
		max = 0;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public PlotBoard getPlotBoard()
	{
		return plotBoard;
	}

	@Override
	public long getTimeViewport()
	{
		return timeViewport;
	}

	@Override
	public void render(BufferedFrame frame, MapCanvas c, MapView view)
	{
		onRender(frame, c, view);
	}

	@Override
	public double getMax()
	{
		return max;
	}

	@Override
	public void setMax(double max)
	{
		this.max = max;
	}

	public abstract void onRender(BufferedFrame frame, MapCanvas c, MapView view);
}
