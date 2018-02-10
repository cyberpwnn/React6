package react.controller;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;

import react.Config;
import react.Gate;
import react.Lang;
import react.api.EntityFlag;
import react.api.EntityGroup;
import react.api.EntitySample;
import surge.control.Controller;
import surge.util.D;

public class EntityCullController extends Controller
{
	private GSet<EntityFlag> flags;
	private GSet<EntityFlag> defer;
	private GSet<EntityFlag> prefer;
	private GMap<EntityGroup, Integer> maxs;

	@Override
	public void start()
	{
		flags = new GSet<EntityFlag>();
		defer = new GSet<EntityFlag>();
		prefer = new GSet<EntityFlag>();
		maxs = new GMap<EntityGroup, Integer>();
		repopulateRules();
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{

	}

	public void repopulateRules()
	{
		maxs.clear();
		flags.clear();
		prefer.clear();
		defer.clear();

		searching: for(String i : Config.CULL_RULES)
		{
			if(i.startsWith("@Refuse ")) //$NON-NLS-1$
			{
				String ref = i.replace("@Refuse ", "").trim(); //$NON-NLS-1$ //$NON-NLS-2$

				for(EntityFlag j : EntityFlag.values())
				{
					if(j.toString().equalsIgnoreCase(ref))
					{
						if(flags.contains(j))
						{
							D.w(Lang.getString("controller.entity-culler.duplicate-refuse") + i + ")"); //$NON-NLS-1$ //$NON-NLS-2$
						}

						flags.add(j);
					}
				}
			}

			else if(i.startsWith("@Defer ")) //$NON-NLS-1$
			{
				String ref = i.replace("@Defer ", "").trim(); //$NON-NLS-1$ //$NON-NLS-2$

				for(EntityFlag j : EntityFlag.values())
				{
					if(j.toString().equalsIgnoreCase(ref))
					{
						if(defer.contains(j))
						{
							D.w(Lang.getString("controller.entity-culler.duplicate-defer") + i + ")"); //$NON-NLS-1$ //$NON-NLS-2$
						}

						if(flags.contains(j))
						{
							D.w(Lang.getString("controller.entity-culler.cannot-defer-refused") + i + ")"); //$NON-NLS-1$ //$NON-NLS-2$
							continue;
						}

						defer.add(j);
					}
				}
			}

			else if(i.startsWith("@Prefer ")) //$NON-NLS-1$
			{
				String ref = i.replace("@Prefer ", "").trim(); //$NON-NLS-1$ //$NON-NLS-2$

				for(EntityFlag j : EntityFlag.values())
				{
					if(j.toString().equalsIgnoreCase(ref))
					{
						if(prefer.contains(j))
						{
							D.w("Duplicate Prefer (" + i + ")"); //$NON-NLS-1$ //$NON-NLS-2$
						}

						if(defer.contains(j))
						{
							D.w("Cannot prefer a deferred object (" + i + ")"); //$NON-NLS-1$ //$NON-NLS-2$
						}

						if(flags.contains(j))
						{
							D.w("Cannot prefer refued (" + i + ")"); //$NON-NLS-1$ //$NON-NLS-2$
							continue;
						}

						prefer.add(j);
					}
				}
			}

			else if(i.startsWith("@Restrict ") && i.contains("=")) //$NON-NLS-1$ //$NON-NLS-2$
			{
				String ref = i.replace("@Restrict ", "").trim(); //$NON-NLS-1$ //$NON-NLS-2$
				String key = ref.split("=")[0].trim(); //$NON-NLS-1$
				String val = ref.split("=")[1].trim(); //$NON-NLS-1$

				try
				{
					int limit = Integer.valueOf(val);
					GList<String> srs = new GList<String>();

					if(key.contains(",")) //$NON-NLS-1$
					{
						for(String j : key.split(",")) //$NON-NLS-1$
						{
							srs.add(j.trim());
						}
					}

					else
					{
						srs.add(key);
					}

					EntityGroup g = new EntityGroup();

					for(String j : srs)
					{
						parsing: for(String k : Config.ALLOW_CULL)
						{
							if(k.replaceAll("_", " ").equalsIgnoreCase(j)) //$NON-NLS-1$ //$NON-NLS-2$
							{
								for(EntityType l : EntityType.values())
								{
									if(l.name().equals(k))
									{
										g.getEntityTypes().add(l);
										break parsing;
									}
								}

								D.w(Lang.getString("controller.entity-culler.cannot-find-entity-type") + j + " (" + i + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
								continue parsing;
							}
						}
					}

					if(g.getEntityTypes().isEmpty())
					{
						D.w(Lang.getString("controller.entity-culler.could-not-parse-any") + i); //$NON-NLS-1$
						continue searching;
					}

					maxs.put(g, limit);
				}

				catch(NumberFormatException e)
				{
					D.w(Lang.getString("controller.entity-culler.unable-to-parse-int") + i); //$NON-NLS-1$
				}
			}

			else
			{
				D.w(Lang.getString("controller.entity-culler.unable-to-parse") + i); //$NON-NLS-1$
				D.w(Lang.getString("controller.entity-culler.must-start-with-restrict")); //$NON-NLS-1$
			}
		}

		D.v(Lang.getString("controller.entity-culler.built") + flags.size() + Lang.getString("controller.entity-culler.refusals")); //$NON-NLS-1$ //$NON-NLS-2$
		D.v(Lang.getString("controller.entity-culler.built") + defer.size() + Lang.getString("controller.entity-culler.defers")); //$NON-NLS-1$ //$NON-NLS-2$
		D.v(Lang.getString("controller.entity-culler.built") + maxs.size() + Lang.getString("controller.entity-culler.filters")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public int cull(Chunk c)
	{
		if(!Config.CULLING_ENABLED)
		{
			return 0;
		}

		return partialCull(c);
	}

	private int partialCull(Chunk c)
	{
		if(!Config.CULLING_ENABLED)
		{
			return 0;
		}

		EntitySample sample = new EntitySample();
		EntitySample fullSample = new EntitySample();
		EntitySample deferedSample = new EntitySample();
		GMap<EntityGroup, Integer> cullGrid = new GMap<EntityGroup, Integer>();
		GSet<EntityFlag> eflags = new GSet<EntityFlag>();
		int culled = 0;

		if(c == null || c.getEntities() == null)
		{
			return culled;
		}

		flagging: for(Entity i : c.getEntities())
		{
			if(i == null)
			{
				continue;
			}

			if(i.isDead())
			{
				continue;
			}

			if(!Config.ALLOW_CULL.contains(i.getType().toString().toUpperCase()))
			{
				continue;
			}

			eflags = EntityFlag.getFlags(i);

			for(EntityFlag j : eflags)
			{
				if(flags.contains(j))
				{
					continue flagging;
				}
			}

			for(EntityFlag j : eflags)
			{
				if(defer.contains(j))
				{
					fullSample.add(i);
					deferedSample.add(i);
					continue flagging;
				}
			}

			for(EntityFlag j : eflags)
			{
				if(prefer.contains(j))
				{
					fullSample.add(i);
					continue flagging;
				}
			}

			fullSample.add(i);
			sample.add(i);
		}

		for(EntityGroup i : maxs.k())
		{
			int total = 0;

			for(EntityType j : i.getEntityTypes())
			{
				total += fullSample.get(j);
			}

			if(total > maxs.get(i))
			{
				cullGrid.put(i, total - maxs.get(i));
			}
		}

		if(cullGrid.k().isEmpty())
		{
			return 0;
		}

		EntityGroup i = cullGrid.k().pickRandom();
		int toCull = cullGrid.get(i);
		int totalOf = 0;
		int toCullNormal = 0;
		int toCullDefered = 0;

		for(EntityType j : i.getEntityTypes())
		{
			totalOf += sample.get(j);
		}

		toCullNormal = totalOf >= toCull ? toCull : totalOf;
		toCullDefered = toCullNormal < toCull ? toCull - toCullNormal : 0;

		GList<Entity> totals = new GList<Entity>();
		GList<Entity> totalsDef = new GList<Entity>();

		for(EntityType j : i.getEntityTypes())
		{
			totals.addAll(sample.getSet(j));
		}

		for(EntityType j : i.getEntityTypes())
		{
			totalsDef.addAll(deferedSample.getSet(j));
		}

		toCullDefered = totalsDef.size() < toCullDefered ? totalsDef.size() : toCullDefered;
		toCullNormal = totals.size() < toCullNormal ? totals.size() : toCullNormal;

		for(int j = 0; j < toCullNormal; j++)
		{
			Gate.cullEntity(totals.popRandom());
			culled++;
		}

		for(int j = 0; j < toCullDefered; j++)
		{
			Gate.cullEntity(totalsDef.popRandom());
			culled++;
		}

		return culled;
	}
}
