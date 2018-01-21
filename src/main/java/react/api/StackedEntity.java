package react.api;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.material.Colorable;
import org.bukkit.util.Vector;
import org.cyberpwn.gmath.M;

import react.Config;
import surge.util.PE;
import surge.util.ParticleEffect;

public class StackedEntity
{
	private LivingEntity entity;
	private int count;
	private double rmx;
	private Entity damager;

	public StackedEntity(LivingEntity entity, int count)
	{
		this.rmx = getMaxHealth(entity);
		damager = null;

		if(count > getAbsoluteMaxCount())
		{
			count = getAbsoluteMaxCount();
		}

		this.entity = entity;
		this.count = count;
	}

	@SuppressWarnings("deprecation")
	public static double getMaxHealth(LivingEntity e)
	{
		if(!Capability.ENTITY_ATTRIBUTES.isCapable())
		{
			return e.getMaxHealth();
		}

		return e.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
	}

	public int getAbsoluteMaxCount()
	{
		return getEffectiveCount(Config.ENTITYSTACK_MAXIMUM_HEALTH);
	}

	public static int getMaxCount(LivingEntity exf)
	{
		return (int) Math.ceil(((double) 2000 / (double) getMaxHealth(exf)));
	}

	public void update()
	{
		updateHealth();
		signalSize();
	}

	private void signalSize()
	{
		double rat = (double) getCount() / (double) getAbsoluteMaxCount();

		if(M.r(rat))
		{
			ParticleEffect.VILLAGER_HAPPY.display(0.2f * getCount(), 1, entity.getLocation().clone().add(0, 0.5, 0).clone().add(Vector.getRandom().subtract(Vector.getRandom())), 16);
		}
	}

	public void setDamager(Entity e)
	{
		damager = e;
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

		if(getEffectiveCount() > getEffectiveCount(getHealth()) && getCount() > 1)
		{
			int oc = count;
			count = getEffectiveCount(getHealth());
			int diff = oc - count;

			if(diff > 1)
			{
				diff--;
			}

			for(int i = 0; i < diff; i++)
			{
				LivingEntity ex = (LivingEntity) entity.getWorld().spawnEntity(entity.getLocation(), entity.getType());

				if(Capability.ENTITY_AI.isCapable())
				{
					ex.setAI(false);
				}

				else
				{
					PE.SLOW.a(10).d(100).apply(ex);
				}

				ex.setFireTicks(entity.getFireTicks());

				if(entity instanceof Ageable)
				{
					((Ageable) ex).setAge(((Ageable) entity).getAge());
				}

				if(entity instanceof Colorable)
				{
					((Colorable) ex).setColor(((Colorable) entity).getColor());
				}

				if(damager == null)
				{
					ex.damage(ex.getHealth() + 1000);
				}

				else
				{
					ex.damage(ex.getHealth() + 1000, damager);
				}

				ex.remove();
			}

			setMaxHealth(getEffectiveMaxHealth(count));
		}
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

		setMaxHealth(entity, max);
	}

	@SuppressWarnings("deprecation")
	public static void setMaxHealth(LivingEntity e, double v)
	{
		if(!Capability.ENTITY_ATTRIBUTES.isCapable())
		{
			e.setMaxHealth(v + 0.1);
		}

		else
		{
			e.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(v);
		}
	}

	public double getMaxHealth()
	{
		return getMaxHealth(entity);
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
