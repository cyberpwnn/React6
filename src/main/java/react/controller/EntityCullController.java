package react.controller;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.cyberpwn.glang.GList;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.glang.GSet;

import react.Config;
import react.Gate;
import react.api.EntityFlag;
import react.api.EntityGroup;
import react.api.EntitySample;
import surge.control.Controller;
import surge.util.D;

public class EntityCullController extends Controller
{
	private GSet<EntityFlag> flags;
	private GSet<EntityFlag> defer;
	private GMap<EntityGroup, Integer> maxs;

	@Override
	public void start()
	{
		flags = new GSet<EntityFlag>();
		defer = new GSet<EntityFlag>();
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
		defer.clear();

		searching: for(String i : Config.CULL_RULES)
		{
			if(i.startsWith("@Refuse "))
			{
				String ref = i.replace("@Refuse ", "").trim();

				for(EntityFlag j : EntityFlag.values())
				{
					if(j.toString().equalsIgnoreCase(ref))
					{
						if(flags.contains(j))
						{
							D.w("Duplicate Refuse Flag (" + i + ")");
						}

						flags.add(j);
					}
				}
			}

			else if(i.startsWith("@Defer "))
			{
				String ref = i.replace("@Defer ", "").trim();

				for(EntityFlag j : EntityFlag.values())
				{
					if(j.toString().equalsIgnoreCase(ref))
					{
						if(defer.contains(j))
						{
							D.w("Duplicate Defer Flag (" + i + ")");
						}

						if(flags.contains(j))
						{
							D.w("Cannot defer a REFUSED flag (" + i + ")");
							continue;
						}

						defer.add(j);
					}
				}
			}

			else if(i.startsWith("@Restrict ") && i.contains("="))
			{
				String ref = i.replace("@Restrict ", "").trim();
				String key = ref.split("=")[0].trim();
				String val = ref.split("=")[1].trim();

				try
				{
					int limit = Integer.valueOf(val);
					GList<String> srs = new GList<String>();

					if(key.contains(","))
					{
						for(String j : key.split(","))
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
							if(k.replaceAll("_", " ").equalsIgnoreCase(j))
							{
								for(EntityType l : EntityType.values())
								{
									if(l.name().equals(k))
									{
										g.getEntityTypes().add(l);
										break parsing;
									}
								}

								D.w("Could not find entity of type: " + j + " (" + i + ")");
								continue parsing;
							}
						}
					}

					if(g.getEntityTypes().isEmpty())
					{
						D.w("Could not parse any entity types for " + i);
						continue searching;
					}

					maxs.put(g, limit);
				}

				catch(NumberFormatException e)
				{
					D.w("Unable to parse integer at " + i);
				}
			}

			else
			{
				D.w("Unable to parse: " + i);
				D.w("Must start with @Restrict <A,B,C,...> OR @Refuse <TYPE>");
			}
		}

		D.v("Built " + flags.size() + " Refusals");
		D.v("Built " + defer.size() + " Defers");
		D.v("Built " + maxs.size() + " Filters");
	}

	public int cull(Chunk c)
	{
		int culled = 0;
		int culledSegment;

		while((culledSegment = partialCull(c)) > 0)
		{
			culled += culledSegment;
		}

		return culled;
	}

	private int partialCull(Chunk c)
	{
		EntitySample sample = new EntitySample();
		EntitySample fullSample = new EntitySample();
		EntitySample deferedSample = new EntitySample();
		GMap<EntityGroup, Integer> cullGrid = new GMap<EntityGroup, Integer>();
		GSet<EntityFlag> eflags = new GSet<EntityFlag>();
		int culled = 0;

		flagging: for(Entity i : c.getEntities())
		{
			if(i.isDead())
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
