package react.graph;

import org.cyberpwn.glang.GMap;

import react.papyrus.BufferedFrame;
import surge.util.D;

public class ColossalView
{
	private BufferedFrame view;
	private GMap<Point, BufferedFrame> buffers;
	private GMap<Point, IGraph> graphs;
	private double level;
	private double targetLevel;
	private int maxX = 0;
	private int maxY = 0;

	public ColossalView()
	{
		buffers = new GMap<Point, BufferedFrame>();
		graphs = new GMap<Point, IGraph>();
		view = new BufferedFrame(128, 128);
		level = 0;
		targetLevel = 0;
	}

	public void render()
	{
		if(Math.abs(level - targetLevel) > 0.01)
		{
			if(level > targetLevel)
			{
				level -= Math.abs(level - targetLevel) / 3.0;
			}

			if(level < targetLevel)
			{
				level += Math.abs(level - targetLevel) / 3.0;
			}
		}

		D.v(": " + targetLevel);

		for(Point i : buffers.k())
		{
			graphs.get(i).render(buffers.get(i));
			view.write(buffers.get(i), i.x, (int) (i.y - level));
		}
	}

	public void scroll(int amt)
	{
		targetLevel -= amt;
		targetLevel = targetLevel > maxY ? maxY : targetLevel;
		targetLevel = targetLevel < 0 ? 0 : targetLevel;
	}

	public void recompile()
	{
		maxX = 0;
		maxY = 0;

		for(Point i : buffers.k())
		{
			maxX = i.x + buffers.get(i).getWidth() > maxX ? i.x + buffers.get(i).getWidth() : maxX;
			maxY = i.y + buffers.get(i).getHeight() > maxY ? i.y + buffers.get(i).getHeight() : maxY;
		}

		level = 0;
	}

	public void addGraph(Point point, Point size, IGraph graph)
	{
		buffers.put(point, new BufferedFrame(size.x, size.y));
		graphs.put(point, graph);
	}

	public BufferedFrame getView()
	{
		return view;
	}

	public GMap<Point, BufferedFrame> getBuffers()
	{
		return buffers;
	}

	public GMap<Point, IGraph> getGraphs()
	{
		return graphs;
	}

	public double getLevel()
	{
		return level;
	}

	public double getTargetLevel()
	{
		return targetLevel;
	}

	public int getMaxX()
	{
		return maxX;
	}

	public int getMaxY()
	{
		return maxY;
	}
}
