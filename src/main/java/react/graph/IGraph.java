package react.graph;

import react.papyrus.BufferedFrame;

public interface IGraph
{
	public String getName();

	public PlotBoard getPlotBoard();

	public long getTimeViewport();

	public void render(BufferedFrame frame);

	public double getMax();

	public void setMax(double max);
}
