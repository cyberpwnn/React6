package react.controller;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockRedstoneEvent;

import react.physics.RedstoneUpdate;
import surge.Surge;
import surge.collection.GList;
import surge.control.Controller;
import surge.sched.TICK;

public class RedstoneController extends Controller
{
	private boolean frozen;

	private GList<RedstoneUpdate> updates = new GList<RedstoneUpdate>();

	@Override
	public void start()
	{
		Surge.register(this);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@EventHandler
	public void on(BlockRedstoneEvent e)
	{
		if(frozen)
		{
			if(e.getBlock().getType().equals(Material.REDSTONE_WIRE))
			{
				e.setNewCurrent(e.getOldCurrent());
				updates.add(new RedstoneUpdate(e.getBlock().getLocation(), e.getOldCurrent(), e.getNewCurrent()));
			}
		}
	}

	@Override
	public void tick()
	{
		if(TICK.tick % 200 == 0)
		{
			frozen = !frozen;
			System.out.println("Frozen: " + frozen);
		}

		if(!frozen)
		{
			while(!updates.isEmpty())
			{
				updates.pop().fire();
			}
		}
	}
}
