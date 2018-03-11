package react.action;

import org.bukkit.Chunk;

import com.volmit.react.util.AccessCallback;
import com.volmit.react.util.Anchor;
import com.volmit.react.util.F;
import com.volmit.react.util.FinalInteger;

import react.Info;
import react.Lang;
import react.React;
import react.action.source.IActionSource;
import react.api.Action;
import react.api.ActionType;
import react.api.ISelector;
import react.api.SelectorPosition;

@Anchor(1)
public class ActionUnlockRedstone extends Action
{
	private int lcd;

	public ActionUnlockRedstone()
	{
		super(ActionType.UNLOCK_REDSTONE);

		setNodes(Info.ACTION_UNLOCK_REDSTONE_TAGS);

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
						React.instance.redstoneController.unfreeze(((Chunk) j));
						completed.add(1);
						String s = Info.ACTION_LOCK_REDSTONE_STATUS;
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
							source.sendResponseSuccess(Lang.getString("action.unlock-redstone.unlocked-in") + F.f(completed.get()) + Lang.getString("action.unlock-redstone.chunk") + ((completed.get() > 1 || completed.get() == 0) ? "s" : "")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
						}
					}
				}
			}
		}
	}

	@Override
	public String getNode()
	{
		return "react.act.unlock-redstone";
	}
}
