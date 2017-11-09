package react.controller;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.cyberpwn.glang.GList;

import react.Config;
import react.api.StackedEntity;
import surge.Surge;
import surge.control.Controller;
import surge.sched.Task;
import surge.util.Area;

public class EntityStackController extends Controller
{
	private GList<StackedEntity> stacks = new GList<StackedEntity>();

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

	@Override
	public void tick()
	{
		if(!Config.ENTITYSTACK_ENABLED)
		{
			stacks.clear();
			return;
		}

		for(StackedEntity i : stacks.copy())
		{
			i.update();

			if(i.getEntity().isDead())
			{
				stacks.remove(i);
			}
		}
	}

	public void stack(GList<LivingEntity> e)
	{
		if(!Config.ENTITYSTACK_ENABLED)
		{
			return;
		}

		while(e.pickRandom().getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue() * (e.size()) > Config.ENTITYSTACK_MAXIMUM_HEALTH)
		{
			e.pop();
		}

		if(e.size() < Config.ENTITYSTACK_MINIMUM_GROUP)
		{
			return;
		}

		LivingEntity le = e.pickRandom();

		for(LivingEntity i : e.copy())
		{
			if(!i.equals(le))
			{
				i.remove();
			}
		}

		StackedEntity se = new StackedEntity(le, e.size());
		stacks.add(se);
	}

	public boolean isStacked(LivingEntity e)
	{
		if(!Config.ENTITYSTACK_ENABLED)
		{
			return false;
		}

		return getStack(e) != null;
	}

	public StackedEntity getStack(LivingEntity e)
	{
		if(!Config.ENTITYSTACK_ENABLED)
		{
			return null;
		}

		for(StackedEntity i : stacks)
		{
			if(i.getEntity().getEntityId() == e.getEntityId())
			{
				return i;
			}
		}

		return null;
	}

	@EventHandler
	public void on(EntityDamageEvent e)
	{
		if(!Config.ENTITYSTACK_ENABLED)
		{
			return;
		}

		if(e.getEntity() instanceof LivingEntity)
		{
			if(isStacked((LivingEntity) e.getEntity()))
			{
				StackedEntity se = getStack((LivingEntity) e.getEntity());
				se.update();

				if(se.getCount() <= 1)
				{
					stacks.remove(se);
				}
			}
		}
	}

	public void merge(StackedEntity a, StackedEntity b)
	{
		double max = a.getRealMaxHealth();

		if(max * (a.getCount() + b.getCount()) > Config.ENTITYSTACK_MAXIMUM_HEALTH)
		{
			return;
		}

		stacks.remove(a);
		stacks.remove(b);
		StackedEntity se = new StackedEntity(a.getEntity(), a.getCount() + b.getCount());
		se.update();
		se.setHealth(a.getEntity().getHealth() + b.getEntity().getHealth());
		b.getEntity().remove();
		se.update();
		stacks.add(se);
	}

	public void checkNear(LivingEntity e)
	{
		if(!Config.ENTITYSTACK_ENABLED)
		{
			return;
		}

		Area a = new Area(e.getLocation(), Config.ENTITYSTACK_GROUP_SEARCH_RADIUS);
		GList<LivingEntity> le = new GList<LivingEntity>();
		GList<StackedEntity> fullStacks = new GList<StackedEntity>();

		if(!e.isDead() && !isStacked(e))
		{
			le.add(e);
		}

		if(!e.isDead() && isStacked(e))
		{
			fullStacks.add(getStack(e));
		}

		for(Entity i : a.getNearbyEntities(e.getType()))
		{
			if(i.equals(e))
			{
				continue;
			}

			if(!i.isDead() && !isStacked((LivingEntity) i))
			{
				le.add((LivingEntity) i);
			}

			if(!i.isDead() && isStacked((LivingEntity) i))
			{
				fullStacks.add(getStack((LivingEntity) i));
			}
		}

		while(fullStacks.size() >= 2)
		{
			merge(fullStacks.pop(), fullStacks.pop());
		}

		if(le.size() >= Config.ENTITYSTACK_MINIMUM_GROUP)
		{
			stack(le);
		}
	}

	@EventHandler
	public void on(EntitySpawnEvent e)
	{
		if(!Config.ENTITYSTACK_ENABLED)
		{
			return;
		}

		if(e.getEntity() instanceof LivingEntity)
		{
			new Task("entity-check", 1, 5)
			{
				@Override
				public void run()
				{
					if(e.getEntity().isDead())
					{
						cancel();
						return;
					}

					checkNear((LivingEntity) e.getEntity());
				}
			};
		}
	}
}