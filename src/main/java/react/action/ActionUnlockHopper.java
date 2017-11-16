package react.action;

import org.bukkit.Chunk;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.AccessCallback;
import org.cyberpwn.glang.FinalInteger;

import react.Info;
import react.React;
import react.api.Action;
import react.api.ActionType;
import react.api.IActionSource;
import react.api.ISelector;
import react.api.SelectorPosition;
import surge.util.Anchor;

@Anchor(1)
public class ActionUnlockHopper extends Action
{
	private int lcd;

	public ActionUnlockHopper()
	{
		super(ActionType.UNLOCK_HOPPER);

		setNodes(Info.ACTION_UNLOCK_HOPPER_TAGS);

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
						String s = Info.ACTION_LOCK_HOPPER_STATUS;
						setProgress((double) completed.get() / (double) total.get());
						s = s.replace("$c", F.f(completed.get()));
						s = s.replace("$t", F.f(total.get()));
						s = s.replace("$p", F.pc(getProgress(), 0));
						setStatus(s);
						totalCulled.add(lcd);

						if(lcd > 0)
						{
							totalChunked.add(1);
						}

						if(completed.get() == total.get())
						{
							completeAction();
							source.sendResponseSuccess("Unlocked Hoppers in " + F.f(completed.get()) + " chunk" + ((completed.get() > 1 || completed.get() == 0) ? "s" : ""));
						}
					}
				}
			}
		}
	}
}
