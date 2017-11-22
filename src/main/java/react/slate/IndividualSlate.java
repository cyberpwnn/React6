package react.slate;

import org.bukkit.entity.Player;
import org.cyberpwn.glang.GList;

public class IndividualSlate extends PhantomSlate
{
	public IndividualSlate(String name, Player viewer)
	{
		super(name);

		addViewer(viewer);
	}

	/**
	 * This sets a new viewer (only supports one viewer)
	 */
	@Override
	public void addViewer(Player p)
	{
		viewers = new GList<Player>().qadd(p);
	}
}