package react.api;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Tameable;
import org.cyberpwn.glang.GSet;

public enum EntityFlag
{
	NAMED("named"),
	TAMED("tamed"),
	STACKED("stacked"),
	RIDDEN("ridden"),
	LEASHED("leashed");

	private String m;

	private EntityFlag(String m)
	{
		this.m = m;
	}

	public static GSet<EntityFlag> getFlags(Entity e)
	{
		GSet<EntityFlag> flags = new GSet<EntityFlag>();

		for(EntityFlag i : values())
		{
			if(i.is(e))
			{
				flags.add(i);
			}
		}

		return flags;
	}

	public boolean is(Entity e)
	{
		if(this.equals(EntityFlag.LEASHED))
		{
			return e instanceof LivingEntity && ((LivingEntity) e).isLeashed();
		}

		if(this.equals(EntityFlag.NAMED))
		{
			return e.isCustomNameVisible();
		}

		if(this.equals(EntityFlag.RIDDEN) || this.equals(EntityFlag.STACKED))
		{
			return !e.getPassengers().isEmpty();
		}

		if(this.equals(EntityFlag.TAMED))
		{
			return e instanceof Tameable && ((Tameable) e).isTamed();
		}

		return false;
	}

	@Override
	public String toString()
	{
		return m;
	}
}
