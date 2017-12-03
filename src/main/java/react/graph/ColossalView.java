package react.graph;

import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;

import react.papyrus.BufferedFrame;
import react.papyrus.FrameColor;

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
		clear();
	}

	public void clear()
	{
		buffers = new GMap<Point, BufferedFrame>();
		graphs = new GMap<Point, IGraph>();
		view = new BufferedFrame(128, 128);
		level = 0;
		targetLevel = 0;
	}

	public void triggerGraphsInView()
	{
		for(Point i : buffers.k())
		{
			if((level >= i.y && level < i.y + buffers.get(i).getHeight()) || (level + 128 > i.y && level < i.y + buffers.get(i).getHeight()))
			{
				if(graphs.get(i) instanceof GraphSampleLine)
				{
					((GraphSampleLine) graphs.get(i)).ticksLeftTitle = 20;
					((GraphSampleLine) graphs.get(i)).ticksOutTitle = 0;
				}
			}
		}
	}

	public void render()
	{
		view.write(FrameColor.DARK_GRAY);

		if(Math.abs(level - targetLevel) > 0.01)
		{
			if(level > targetLevel)
			{
				level -= Math.abs(level - targetLevel) / 2.2;
			}

			if(level < targetLevel)
			{
				level += Math.abs(level - targetLevel) / 2.2;
			}
		}

		for(Point i : buffers.k())
		{
			if((level >= i.y && level < i.y + buffers.get(i).getHeight()) || (level + 128 > i.y && level < i.y + buffers.get(i).getHeight()))
			{
				graphs.get(i).render(buffers.get(i));
				view.write(buffers.get(i), i.x, (int) (i.y - level));
			}
		}
	}

	public void scroll(int amt)
	{
		double pretarg = targetLevel;
		targetLevel -= amt;
		targetLevel = targetLevel > maxY ? maxY : targetLevel;
		targetLevel = targetLevel < 0 ? 0 : targetLevel;

		for(Point i : buffers.k())
		{
			if(!((pretarg >= i.y && pretarg < i.y + buffers.get(i).getHeight()) || (pretarg + 128 > i.y && pretarg < i.y + buffers.get(i).getHeight())) && ((targetLevel >= i.y && targetLevel < i.y + buffers.get(i).getHeight()) || (targetLevel + 128 > i.y && targetLevel < i.y + buffers.get(i).getHeight())))
			{
				IGraph g = graphs.get(i);

				if(g instanceof GraphSampleLine)
				{
					((GraphSampleLine) g).ticksLeftTitle = 20;
				}
			}
		}
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

	public static class Builder
	{
		private GList<PointedGraph> graphs;

		public Builder()
		{
			graphs = new GList<PointedGraph>();
		}

		public void add(IGraph graph, GraphSize size)
		{
			graphs.add(new PointedGraph(graph, size));
		}

		public ColossalView compute()
		{
			int sid = 1000;
			ColossalView view = new ColossalView();
			CubicleIterator it = new CubicleIterator();
			GMap<PointedGraph, Integer> gg = new GMap<PointedGraph, Integer>();

			for(PointedGraph i : graphs.copy())
			{
				gg.put(i, sid);
				it.insert(i.getSize(), sid);
				sid += 1;
			}

			for(PointedGraph i : gg.k())
			{
				Point pos = it.positionFor(gg.get(i));
				Point siz = i.getSize().toPoint();
				view.addGraph(pos, siz, i.getGraph());
			}

			it.print();
			view.recompile();
			return view;
		}
	}
}
