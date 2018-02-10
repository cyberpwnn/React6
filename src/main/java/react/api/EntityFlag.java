package react.api;

import org.bukkit.entity.Ageable;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Tameable;
import org.cyberpwn.glang.GSet;

public enum EntityFlag
{
	NAMED("named"),
	TAMED("tamed"),
	STACKED("stacked"),
	RIDDEN("ridden"),
	LIVING("living"),
	NON_LIVING("non-living"),
	PASSIVE("passive"),
	HOSTILE("hostile"),
	MATURE("mature"),
	YOUNG("young"),
	UNDERWATER("underwater"),
	GROUNDED("grounded"),
	AIRBORNE("airborne"),
	PROJECTILES("projectiles"),
	CAVES("caves"),
	NEARBY("nearby"),
	LIT("lit"),
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
		if(this.equals(EntityFlag.UNDERWATER))
		{
			return e.getLocation().getBlock().isLiquid();
		}

		if(!e.getType().equals(EntityType.ARMOR_STAND))
		{
			if(this.equals(EntityFlag.CAVES))
			{
				return e.getLocation().getBlock().getLightFromSky() < 9;
			}

			if(this.equals(EntityFlag.LIT))
			{
				return e.getLocation().getBlock().getLightFromSky() >= 9;
			}
		}

		if(this.equals(EntityFlag.GROUNDED))
		{
			return e.isOnGround();
		}

		if(this.equals(EntityFlag.AIRBORNE))
		{
			return !e.isOnGround() && !e.getLocation().getBlock().isLiquid();
		}

		if(this.equals(EntityFlag.MATURE))
		{
			return e instanceof Ageable && ((Ageable) e).isAdult();
		}

		if(this.equals(EntityFlag.YOUNG))
		{
			return e instanceof Ageable && !((Ageable) e).isAdult();
		}

		if(this.equals(EntityFlag.LIVING))
		{
			return e instanceof LivingEntity;
		}

		if(this.equals(EntityFlag.PASSIVE))
		{
			return e instanceof Animals;
		}

		if(this.equals(EntityFlag.HOSTILE))
		{
			return e instanceof Monster;
		}

		if(this.equals(EntityFlag.HOSTILE))
		{
			return e instanceof Monster;
		}

		if(this.equals(EntityFlag.NON_LIVING))
		{
			return !(e instanceof LivingEntity);
		}

		if(this.equals(EntityFlag.PROJECTILES))
		{
			return e instanceof Projectile;
		}

		if(this.equals(EntityFlag.LEASHED))
		{
			return e instanceof LivingEntity && ((LivingEntity) e).isLeashed();
		}

		if(this.equals(EntityFlag.NAMED))
		{
			if(!Capability.ENTITY_NAMES.isCapable())
			{
				return false;
			}

			return e.isCustomNameVisible();
		}

		if(this.equals(EntityFlag.RIDDEN) || this.equals(EntityFlag.STACKED))
		{
			if(!Capability.PASSENGERS.isCapable())
			{
				return false;
			}

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
