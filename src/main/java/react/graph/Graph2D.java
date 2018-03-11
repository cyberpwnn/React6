package react.graph;

import com.volmit.react.util.Anchor;

import react.papyrus.BufferedFrame;

@Anchor(127)
public abstract class Graph2D extends NormalGraph implements IGraph
{
	public Graph2D(String name, long timeViewport)
	{
		super(name, timeViewport);
	}

	@Override
	public abstract void onRender(BufferedFrame frame);
}
