package react.action;

import org.bukkit.Chunk;
import org.bukkit.entity.EntityType;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.AccessCallback;
import org.cyberpwn.glang.FinalInteger;
import org.cyberpwn.gmath.M;

import react.Info;
import react.React;
import react.api.Action;
import react.api.ActionState;
import react.api.ActionType;
import react.api.IActionSource;
import react.api.ISelector;
import react.api.SelectionMode;
import react.api.SelectorEntityType;
import react.api.SelectorPosition;
import surge.sched.Task;
import surge.util.Anchor;

@Anchor(1)
public class ActionCullEntities extends Action
{
	private long ms;
	private int lcd;

	public ActionCullEntities()
	{
		super(ActionType.CULL_ENTITIES);

		setNodes(Info.ACTION_CULL_ENTITIES_TAGS);

		setDefaultSelector(Chunk.class, new AccessCallback<ISelector>()
		{
			@Override
			public ISelector get()
			{
				SelectorPosition sel = new SelectorPosition();
				sel.addAll();

				return sel;
			}
		});

		setDefaultSelector(EntityType.class, new AccessCallback<ISelector>()
		{
			@Override
			public ISelector get()
			{
				SelectorEntityType sel = new SelectorEntityType(SelectionMode.BLACKLIST);
				sel.add(EntityType.PLAYER);

				return sel;
			}
		});
	}

	@Override
	public void enact(IActionSource source, ISelector... selectors)
	{
		FinalInteger total = new FinalInteger(0);
		FinalInteger totalCulled = new FinalInteger(0);
		FinalInteger totalChunked = new FinalInteger(0);
		FinalInteger completed = new FinalInteger(0);
		ms = M.ms();

		int tchu = 0;
		int tent = 0;

		for(ISelector i : selectors)
		{
			if(i.getType().equals(Chunk.class))
			{
				tchu += i.getPossibilities().size();
			}

			if(i.getType().equals(EntityType.class))
			{
				for(Object j : i.getPossibilities())
				{
					if(i.can(j))
					{
						tent++;
					}
				}
			}
		}

		source.sendResponseActing("Culling " + tent + " type" + ((tent == 0 || tent > 1) ? "s" : "") + " of " + ((tent == 0 || tent > 1) ? "entities" : "entity") + " across " + F.f(tchu) + " chunk" + ((tchu > 1 || tchu == 0) ? "s" : ""));

		for(ISelector i : selectors)
		{
			if(i.getType().equals(Chunk.class))
			{
				total.add(i.getPossibilities().size());

				for(Object j : i.getPossibilities())
				{
					if(i.can(j))
					{
						cull((Chunk) j, new Runnable()
						{
							@Override
							public void run()
							{
								completed.add(1);
								String s = Info.ACTION_CULL_ENTITIES_STATUS;
								setProgress((double) completed.get() / (double) total.get());
								s = s.replace("$c", F.f(completed.get()));
								s = s.replace("$t", F.f(total.get()));
								s = s.replace("$p", F.pc(getProgress(), 0));
								setStatus(s);
								ms = M.ms();
								totalCulled.add(lcd);

								if(lcd > 0)
								{
									totalChunked.add(1);
								}

								if(completed.get() == total.get())
								{
									completeAction();
									source.sendResponseSuccess("Culled " + F.f(totalCulled.get()) + " entities in " + F.f(totalChunked.get()) + " chunk" + ((totalChunked.get() > 1 || totalChunked.get() == 0) ? "s" : ""));
								}
							}
						}, source, selectors);
					}
				}
			}
		}

		new Task("culler-monitor-callback", 2)
		{
			@Override
			public void run()
			{
				if(M.ms() - ms > 100 && getState().equals(ActionState.RUNNING))
				{
					cancel();
					completeAction();
					source.sendResponseSuccess("Culled " + F.f(totalCulled.get()) + " entities in " + F.f(totalChunked.get()) + " chunk" + ((totalChunked.get() > 1 || totalChunked.get() == 0) ? "s" : ""));
				}
			}

		};
	}

	public void cull(Chunk chunk, Runnable cb, IActionSource source, ISelector... selectors)
	{
		lcd = React.instance.entityCullController.cull(chunk);
		cb.run();
	}
}
