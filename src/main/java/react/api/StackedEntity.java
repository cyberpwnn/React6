package react.api;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.LivingEntity;
import org.bukkit.material.Colorable;

public class StackedEntity
{
	private LivingEntity entity;
	private int count;
	private double rmx;

	public StackedEntity(LivingEntity entity, int count)
	{
		this.rmx = entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();

		if(count > getAbsoluteMaxCount())
		{
			count = getAbsoluteMaxCount();
		}

		this.entity = entity;
		this.count = count;
	}

	public int getAbsoluteMaxCount()
	{
		return getEffectiveCount(2000);
	}

	public static int getMaxCount(LivingEntity exf)
	{
		return (int) Math.ceil(((double) 2000 / (double) exf.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()));
	}

	public void update()
	{
		updateHealth();
	}

	private void updateHealth()
	{
		if(count > getEffectiveCount())
		{
			int grow = count - getEffectiveCount();
			double heal = getEffectiveMaxHealth(grow);
			setMaxHealth(getEffectiveMaxHealth(count));
			heal(heal);
		}

		if(getEffectiveCount() > getEffectiveCount(getHealth()) && count > 1)
		{
			int oc = count;
			count = getEffectiveCount(getHealth());
			int diff = oc - count;

			for(int i = 0; i < diff; i++)
			{
				LivingEntity ex = (LivingEntity) entity.getWorld().spawnEntity(entity.getLocation(), entity.getType());
				ex.setAI(false);
				ex.setFireTicks(entity.getFireTicks());

				if(entity instanceof Ageable)
				{
					((Ageable) ex).setAge(((Ageable) entity).getAge());
				}

				if(entity instanceof Colorable)
				{
					((Colorable) ex).setColor(((Colorable) entity).getColor());
				}

				ex.damage(ex.getHealth() + 1000);
				ex.remove();
			}

			setMaxHealth(getEffectiveMaxHealth(count));
		}

		entity.setCustomNameVisible(true);
		entity.setCustomName((int) getHealth() + "hp (" + getEffectiveCount() + "x)");
	}

	public void heal(double amt)
	{
		setHealth(getHealth() + amt);
	}

	public void setHealth(double hp)
	{
		entity.setHealth(getMaxHealth() < hp ? getMaxHealth() : hp);
	}

	public int getEffectiveCount()
	{
		return getEffectiveCount(getMaxHealth());
	}

	public int getEffectiveCount(double hp)
	{
		return (int) Math.ceil(((double) hp / (double) getRealMaxHealth()));
	}

	public double getEffectiveMaxHealth(int count)
	{
		return getRealMaxHealth() * count;
	}

	public double getRealMaxHealth()
	{
		return rmx;
	}

	public double getHealth()
	{
		return entity.getHealth();
	}

	public void setMaxHealth(double max)
	{
		if(getHealth() > max)
		{
			setHealth(max);
		}

		entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(max);
	}

	public double getMaxHealth()
	{
		return entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
	}

	public LivingEntity getEntity()
	{
		return entity;
	}

	public int getCount()
	{
		return count;
	}
}
