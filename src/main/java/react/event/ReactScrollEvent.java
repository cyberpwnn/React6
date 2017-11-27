package react.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class ReactScrollEvent extends ReactPlayerEvent implements Cancellable
{
	private ScrollDirection direction;
	private boolean cancellled;

	public ReactScrollEvent(Player player, ScrollDirection direction)
	{
		super(player);
		this.direction = direction;
		cancellled = false;
	}

	public ScrollDirection getDirection()
	{
		return direction;
	}

	@Override
	public boolean isCancelled()
	{
		return cancellled;
	}

	@Override
	public void setCancelled(boolean cancellled)
	{
		this.cancellled = cancellled;
	}
}
