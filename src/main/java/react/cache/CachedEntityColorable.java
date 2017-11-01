package react.cache;

import org.bukkit.DyeColor;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.material.Colorable;

public class CachedEntityColorable extends CachedEntityAgeable
{
	private DyeColor dye;

	public CachedEntityColorable(Colorable e)
	{
		super((Ageable) e);

		dye = e.getColor();
	}

	@Override
	public void apply(Entity ee)
	{
		super.apply(ee);

		Colorable c = (Colorable) ee;
		c.setColor(dye);
	}

	public DyeColor getDye()
	{
		return dye;
	}

	public void setDye(DyeColor dye)
	{
		this.dye = dye;
	}
}
