package react.action;

import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import react.Info;
import react.api.Action;
import react.api.ActionState;
import react.api.ActionType;
import react.api.Gate;
import react.api.IActionSource;
import react.api.ISelector;
import react.api.SelectionMode;
import react.api.SelectorEntityType;
import react.api.SelectorPosition;
import surge.math.M;
import surge.pool.S;
import surge.sched.Task;
import surge.util.Anchor;
import surge.util.Callback;
import surge.util.F;
import surge.util.FinalInteger;

@Anchor(1)
public class ActionPurgeEntities extends Action
{
	private long ms;

	public ActionPurgeEntities()
	{
		super(ActionType.PURGE_ENTITIES);

		setDefaultSelector(Chunk.class, new Callback<ISelector>()
		{
			@Override
			public ISelector get()
			{
				SelectorPosition sel = new SelectorPosition();
				sel.addAll();

				return sel;
			}
		});

		setDefaultSelector(EntityType.class, new Callback<ISelector>()
		{
			@Override
			public ISelector get()
			{
				SelectorEntityType sel = new SelectorEntityType(SelectionMode.BLACKLIST);
				sel.add(EntityType.DROPPED_ITEM);
				sel.add(EntityType.PLAYER);

				return sel;
			}
		});
	}

	@Override
	public void enact(IActionSource source, ISelector... selectors)
	{
		FinalInteger total = new FinalInteger(0);
		FinalInteger completed = new FinalInteger(0);
		ms = M.ms();

		for(ISelector i : selectors)
		{
			if(i.getType().equals(Chunk.class))
			{
				total.add(i.getPossibilities().size());

				for(Object j : i.getPossibilities())
				{
					if(i.can(j))
					{
						purge((Chunk) j, new Runnable()
						{
							@Override
							public void run()
							{
								completed.add(1);
								String s = Info.ACTION_PURGE_ENTITIES_STATUS;
								setProgress((double) completed.get() / (double) total.get());
								s = s.replace("$c", F.f(completed.get()));
								s = s.replace("$t", F.f(total.get()));
								s = s.replace("$p", F.pc(getProgress(), 0));
								setStatus(s);
								ms = M.ms();

								if(completed.get() == total.get())
								{
									completeAction();
								}
							}
						}, source, selectors);
					}
				}
			}
		}

		new Task("purger-monitor-callback", 10)
		{
			@Override
			public void run()
			{
				if(M.ms() - ms > 1000 && getState().equals(ActionState.RUNNING))
				{
					cancel();
					completeAction();
				}
			}
		};
	}

	public void purge(Chunk chunk, Runnable cb, IActionSource source, ISelector... selectors)
	{
		boolean nc = false;

		seeking: for(int f = 0; f < chunk.getEntities().length; f++)
		{
			final int k = f;
			Entity i = chunk.getEntities()[f];

			for(ISelector j : selectors)
			{
				if(j.getType().equals(EntityType.class))
				{
					if(!j.can(i.getType()))
					{
						continue seeking;
					}
				}
			}

			nc = true;

			new S()
			{
				@Override
				public void run()
				{
					Gate.removeEntity(i);

					if(k == chunk.getEntities().length - 1)
					{
						cb.run();
					}
				}
			};
		}

		if(!nc)
		{
			cb.run();
		}
	}
}
