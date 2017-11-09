package react.action;

import org.bukkit.Chunk;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.AccessCallback;
import org.cyberpwn.glang.FinalInteger;
import org.cyberpwn.gmath.M;

import react.Info;
import react.api.Action;
import react.api.ActionState;
import react.api.ActionType;
import react.api.IActionSource;
import react.api.ISelector;
import react.api.SelectorPosition;
import surge.sched.Task;
import surge.util.Anchor;

@Anchor(1)
public class ActionPurgeChunks extends Action
{
	private long ms;
	private int lcd;

	public ActionPurgeChunks()
	{
		super(ActionType.PURGE_CHUNKS);

		setNodes(Info.ACTION_PURGE_CHUNKS_TAGS);

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

		for(ISelector i : selectors)
		{
			if(i.getType().equals(Chunk.class))
			{
				tchu += i.getPossibilities().size();
			}
		}

		source.sendResponseActing("Purging " + F.f(tchu) + " chunk" + ((tchu > 1 || tchu == 0) ? "s" : ""));

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
								String s = Info.ACTION_PURGE_CHUNKS_STATUS;
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
									source.sendResponseSuccess("Purged " + F.f(completed.get()) + " chunk" + ((completed.get() > 1 || completed.get() == 0) ? "s" : ""));
								}
							}
						}, source, selectors);
					}
				}
			}
		}

		new Task("purger-monitor-callback", 30)
		{
			@Override
			public void run()
			{
				if(M.ms() - ms > 1000 && getState().equals(ActionState.RUNNING))
				{
					cancel();
					completeAction();
					source.sendResponseSuccess("Purged " + F.f(completed.get()) + " chunk" + ((completed.get() > 1 || completed.get() == 0) ? "s" : ""));
				}
			}

		};
	}

	public void purge(Chunk chunk, Runnable cb, IActionSource source, ISelector... selectors)
	{
		new S()
		{
			@Override
			public void run()
			{
				if(chunk.unload())
				{
					ms = M.ms();
					cb.run();
				}
			}
		};
	}
}