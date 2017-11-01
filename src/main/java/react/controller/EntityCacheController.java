package react.controller;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import org.bukkit.inventory.ItemStack;

import react.Info;
import react.api.Gate;
import react.api.ICache;
import react.api.SelectorPosition;
import react.cache.CachedEntity;
import react.cache.CachedEntityAgeable;
import react.cache.CachedEntityLiving;
import react.cache.CachedEntitySheep;
import react.cache.CachedItemDrop;
import react.cache.EntityCache;
import surge.Surge;
import surge.collection.GMap;
import surge.collection.GSet;
import surge.control.Controller;
import surge.util.W;

public class EntityCacheController extends Controller
{
	private GMap<World, ICache<Chunk, CachedEntity>> caches;
	private int cachedEntities = -1;
	private int cachedDrops = -1;

	public EntityCacheController()
	{
		caches = new GMap<World, ICache<Chunk, CachedEntity>>();
	}

	public void push(World w)
	{
		if(caches.containsKey(w))
		{
			for(Chunk i : caches.get(w).k())
			{
				push(i);
			}
		}

		caches.remove(w);
	}

	public void pop(Chunk c)
	{
		if(caches.containsKey(c.getWorld()))
		{
			for(Entity i : c.getEntities())
			{
				pop(i);
			}
		}
	}

	public void pop(Entity i)
	{
		CachedEntity ce;
		cachedEntities++;

		if(i instanceof Player)
		{
			return;
		}

		if(i instanceof Item)
		{
			ce = new CachedItemDrop((Item) i);
			cachedDrops++;
			cachedEntities--;
		}

		else if(i instanceof Sheep)
		{
			ce = new CachedEntitySheep((Sheep) i);
		}

		else if(i instanceof Ageable)
		{
			ce = new CachedEntityAgeable((Ageable) i);
		}

		else if(i instanceof LivingEntity)
		{
			ce = new CachedEntityLiving((LivingEntity) i);
		}

		else
		{
			ce = new CachedEntity(i);
		}

		if(!caches.containsKey(i.getWorld()))
		{
			caches.put(i.getWorld(), new EntityCache());
		}

		caches.get(i.getWorld()).put(i.getLocation().getChunk(), ce);
	}

	public boolean hasUid(UUID uid, Chunk c)
	{
		for(Entity i : c.getEntities())
		{
			if(i.getUniqueId().equals(uid))
			{
				return true;
			}
		}

		return false;
	}

	public int push(Chunk c)
	{
		int k = 0;

		if(caches.containsKey(c.getWorld()))
		{
			if(caches.get(c.getWorld()).has(c))
			{
				GSet<CachedEntity> kk = caches.get(c.getWorld()).get(c);
				GSet<UUID> had = new GSet<UUID>();
				caches.get(c.getWorld()).clear(c);

				for(CachedEntity i : kk)
				{
					if(had.contains(i.getUid()))
					{
						continue;
					}

					EntityType type = EntityType.values()[i.getType()];
					Location l = c.getBlock(0, 0, 0).getLocation();
					Entity e = type.equals(EntityType.DROPPED_ITEM) ? c.getWorld().dropItem(l, new ItemStack(Material.STONE)) : c.getWorld().spawnEntity(l, type);
					i.apply(e);
					had.add(i.getUid());
					k++;

					if(type.equals(EntityType.DROPPED_ITEM))
					{
						cachedDrops--;
					}

					else
					{
						cachedEntities--;
					}
				}

			}
		}

		return k;
	}

	@EventHandler
	public void on(WorldLoadEvent e)
	{
		caches.put(e.getWorld(), new EntityCache());
	}

	@EventHandler
	public void on(ChunkUnloadEvent e)
	{
		push(e.getChunk());
	}

	@EventHandler
	public void on(WorldUnloadEvent e)
	{
		push(e.getWorld());
		caches.remove(e.getWorld());
	}

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

	public boolean isCached(Chunk c)
	{
		return caches.containsKey(c.getWorld()) && caches.get(c.getWorld()).has(c);
	}

	public void on(EntitySpawnEvent e)
	{
		if(isCached(e.getLocation().getChunk()))
		{
			e.setCancelled(true);
		}
	}

	@Override
	public void tick()
	{
		SelectorPosition posCache = new SelectorPosition();
		posCache.addAll();

		for(Player i : Bukkit.getOnlinePlayers())
		{
			for(Chunk j : W.chunkRadius(i.getLocation().getChunk(), Info.CORE_ENTITY_CACHE_RADIUS))
			{
				Gate.restoreEntities(j);
				posCache.getPossibilities().remove(j);
			}
		}

		for(Object i : posCache.getPossibilities())
		{
			for(Entity j : ((Chunk) i).getEntities())
			{
				Gate.cacheEntity(j);
				Gate.removeEntity(j);
			}
		}

		if(cachedDrops < 0 || cachedEntities < 0)
		{
			cachedDrops = 0;
			cachedEntities = 0;

			for(World i : Bukkit.getWorlds())
			{
				if(caches.containsKey(i))
				{
					for(Chunk j : caches.get(i).k())
					{
						for(CachedEntity k : caches.get(i).get(j))
						{
							if(k instanceof CachedItemDrop)
							{
								cachedDrops++;
							}

							else
							{
								cachedEntities++;
							}
						}
					}
				}
			}
		}
	}

	public GMap<World, ICache<Chunk, CachedEntity>> getCaches()
	{
		return caches;
	}

	public int getCachedEntities()
	{
		return cachedEntities;
	}

	public int getCachedDrops()
	{
		return cachedDrops;
	}

	public int getCachedTotals()
	{
		return Math.abs(cachedEntities + cachedDrops);
	}
}
