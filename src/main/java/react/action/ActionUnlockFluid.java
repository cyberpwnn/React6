package react.action;

import org.bukkit.Chunk;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.AccessCallback;
import org.cyberpwn.glang.FinalInteger;

import react.Info;
import react.Lang;
import react.React;
import react.action.source.IActionSource;
import react.api.Action;
import react.api.ActionType;
import react.api.ISelector;
import react.api.SelectorPosition;
import surge.util.Anchor;

@Anchor(1)
public class ActionUnlockFluid extends Action
{
	private int lcd;

	public ActionUnlockFluid()
	{
		super(ActionType.UNLOCK_FLUID);

		setNodes(Info.ACTION_UNLOCK_FLUID_TAGS);

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

		for(ISelector i : selectors)
		{
			if(i.getType().equals(Chunk.class))
			{
				total.add(i.getPossibilities().size());

				for(Object j : i.getPossibilities())
				{
					if(i.can(j))
					{
						React.instance.fluidController.unfreeze(((Chunk) j));
						completed.add(1);
						String s = Info.ACTION_LOCK_FLUID_STATUS;
						setProgress((double) completed.get() / (double) total.get());
						s = s.replace("$c", F.f(completed.get())); //$NON-NLS-1$
						s = s.replace("$t", F.f(total.get())); //$NON-NLS-1$
						s = s.replace("$p", F.pc(getProgress(), 0)); //$NON-NLS-1$
						setStatus(s);
						totalCulled.add(lcd);

						if(lcd > 0)
						{
							totalChunked.add(1);
						}

						if(completed.get() == total.get())
						{
							completeAction();
							source.sendResponseSuccess(Lang.getString("unlock-fluid.unlocked-in") + F.f(completed.get()) + Lang.getString("unlock-fluid.chunk") + ((completed.get() > 1 || completed.get() == 0) ? "s" : "")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
						}
					}
				}
			}
		}
	}

	@Override
	public String getNode()
	{
		return "react.act.unlock-fluid";
	}
}
