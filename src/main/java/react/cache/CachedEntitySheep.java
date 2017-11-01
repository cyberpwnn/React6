package react.cache;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Sheep;

public class CachedEntitySheep extends CachedEntityColorable
{
	private boolean sheared;

	public CachedEntitySheep(Sheep e)
	{
		super(e);

		sheared = e.isSheared();
	}

	@Override
	public void apply(Entity ee)
	{
		super.apply(ee);

		Sheep s = (Sheep) ee;
		s.setSheared(sheared);
	}

	public boolean isSheared()
	{
		return sheared;
	}

	public void setSheared(boolean sheared)
	{
		this.sheared = sheared;
	}
}
