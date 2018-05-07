package com.volmit.react.api;

import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

import com.volmit.react.Config;
import com.volmit.react.util.M;
import com.volmit.react.util.ParticleEffect;

public class DeadEntity
{
	private Entity e;
	private int ticks;

	public DeadEntity(Entity e, int ticks)
	{
		this.e = e;
		this.ticks = ticks;
	}

	public boolean c()
	{
		if(e == null || e.isDead())
		{
			return true;
		}

		ticks--;

		if(ticks <= 0)
		{
			if(Config.ENTITY_MARK_PARTICLES)
			{
				ParticleEffect.EXPLOSION_LARGE.display(0.1f, 1, e.getLocation(), 32);
			}

			e.remove();
			e = null;
			return true;
		}

		else
		{
			if(Config.ENTITY_MARK_PARTICLES && M.r(0.05))
			{
				ParticleEffect.VILLAGER_ANGRY.display(0.1f, 1, e.getLocation().clone().add(Vector.getRandom().subtract(Vector.getRandom().clone().multiply(1.89))), 32);
			}
		}

		return false;
	}

	public Entity getE()
	{
		return e;
	}

	public void setE(Entity e)
	{
		this.e = e;
	}

	public int getTicks()
	{
		return ticks;
	}

	public void setTicks(int ticks)
	{
		this.ticks = ticks;
	}
}
