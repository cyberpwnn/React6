package react.graph;

import org.bukkit.Chunk;
import org.bukkit.entity.Player;

import react.papyrus.BufferedFrame;
import surge.util.Anchor;
import surge.util.W;

@Anchor(127)
public class GraphLagMap extends Graph2D
{
	private Player viewer;

	public GraphLagMap(Player viewer, String name, long timeViewport)
	{
		super(name, timeViewport);

		this.viewer = viewer;
	}

	@Override
	public void onRender(BufferedFrame frame)
	{
		for(Chunk i : W.chunkRadius(viewer.getLocation().getChunk(), 10))
		{

		}
	}
}
