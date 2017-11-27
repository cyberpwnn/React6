package react.graph;

import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;

import react.papyrus.BufferedFrame;

public interface IGraph
{
	public String getName();

	public PlotBoard getPlotBoard();

	public long getTimeViewport();

	public void render(BufferedFrame frame, MapCanvas c, MapView view);

	public double getMax();

	public void setMax(double max);
}
