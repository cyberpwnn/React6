package react.action;

import org.bukkit.Chunk;
import org.bukkit.entity.EntityType;

import com.volmit.react.util.AccessCallback;
import com.volmit.react.util.Anchor;
import com.volmit.react.util.F;
import com.volmit.react.util.FinalInteger;
import com.volmit.react.util.M;
import com.volmit.react.util.S;
import com.volmit.react.util.Task;

import react.Info;
import react.Lang;
import react.React;
import react.action.source.IActionSource;
import react.api.Action;
import react.api.ActionState;
import react.api.ActionType;
import react.api.ISelector;
import react.api.SelectionMode;
import react.api.SelectorEntityType;
import react.api.SelectorPosition;

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

		source.sendResponseActing(Lang.getString("action.cull-entities.culling") + tent + Lang.getString("action.cull-entities.type") + ((tent == 0 || tent > 1) ? "s" : "") + Lang.getString("action.cull-entities.of-for-culling") + ((tent == 0 || tent > 1) ? Lang.getString("action.cull-entities.entities") : Lang.getString("action.cull-entities.entity")) + Lang.getString("action.cull-entities.across") + F.f(tchu) + Lang.getString("action.cull-entities.chunk") + ((tchu > 1 || tchu == 0) ? "s" : "")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$

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
								s = s.replace("$c", F.f(completed.get())); //$NON-NLS-1$
								s = s.replace("$t", F.f(total.get())); //$NON-NLS-1$
								s = s.replace("$p", F.pc(getProgress(), 0)); //$NON-NLS-1$
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
									source.sendResponseSuccess(Lang.getString("action.cull-entities.culled") + F.f(totalCulled.get()) + Lang.getString("action.cull-entities.entities-in") + F.f(totalChunked.get()) + Lang.getString("action.cull-entities.chunk") + ((totalChunked.get() > 1 || totalChunked.get() == 0) ? "s" : "")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
								}
							}
						}, source, selectors);
					}
				}
			}
		}

		new Task("culler-monitor-callback", 2) //$NON-NLS-1$
		{
			@Override
			public void run()
			{
				if(M.ms() - ms > 100 && getState().equals(ActionState.RUNNING))
				{
					cancel();
					completeAction();
					source.sendResponseSuccess(Lang.getString("action.cull-entities.culled") + F.f(totalCulled.get()) + Lang.getString("action.cull-entities.entities-in") + F.f(totalChunked.get()) + Lang.getString("action.cull-entities.chunk") + ((totalChunked.get() > 1 || totalChunked.get() == 0) ? "s" : "")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
				}
			}

		};
	}

	public void cull(Chunk chunk, Runnable cb, IActionSource source, ISelector... selectors)
	{
		new S("action.cull")
		{
			@Override
			public void run()
			{
				lcd = React.instance.entityCullController.cull(chunk);
				cb.run();
			}
		};
	}

	@Override
	public String getNode()
	{
		return "react.act.cull-entities";
	}
}
