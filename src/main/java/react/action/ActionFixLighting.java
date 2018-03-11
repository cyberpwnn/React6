package react.action;

import org.bukkit.Chunk;

import com.volmit.react.util.AccessCallback;
import com.volmit.react.util.Anchor;
import com.volmit.react.util.Callback;
import com.volmit.react.util.F;

import react.Gate;
import react.Info;
import react.Lang;
import react.action.source.IActionSource;
import react.api.Action;
import react.api.ActionState;
import react.api.ActionType;
import react.api.Capability;
import react.api.ISelector;
import react.api.SelectorPosition;

@Anchor(1)
public class ActionFixLighting extends Action
{
	public ActionFixLighting()
	{
		super(ActionType.FIX_LIGHTING);
		setNodes(Info.ACTION_FIX_LIGHTING_TAGS);

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
		int tchu = 0;

		if(!Capability.CHUNK_RELIGHTING.isCapable())
		{
			Capability.CHUNK_RELIGHTING.sendNotCapable(source);
			completeAction();
			return;
		}

		for(ISelector i : selectors)
		{
			if(i.getType().equals(Chunk.class))
			{
				tchu += i.getPossibilities().size();
			}
		}

		int ch = tchu;

		if(!Gate.hasFawe())
		{
			source.sendResponseError(Lang.getString("action.fix-lighting.fail-relight-no-fawe")); //$NON-NLS-1$
			completeAction();
		}

		source.sendResponseActing(Lang.getString("action.fix-lighting.relighting") + F.f(tchu) + Lang.getString("action.fix-lighting.chunk") + ((tchu > 1 || tchu == 0) ? "s" : "")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

		for(ISelector i : selectors)
		{
			if(i.getType().equals(Chunk.class))
			{
				if(Gate.hasFawe())
				{
					Gate.fixLighting((SelectorPosition) i, new Callback<Integer>()
					{
						@Override
						public void run(Integer t)
						{
							if(getState().equals(ActionState.RUNNING))
							{
								source.sendResponseSuccess(Lang.getString("action.fix-lighting.relit") + F.f(ch) + Lang.getString("action.fix-lighting.chunk") + ((ch > 1 || ch == 0) ? "s" : "")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
								completeAction();
							}
						}
					}, new Callback<Double>()
					{
						@Override
						public void run(Double t)
						{
							double progress = t;
							String s = Info.ACTION_FIX_LIGHTING_STATUS;
							setProgress(progress);
							s = s.replace("$p", F.pc(getProgress(), 0)); //$NON-NLS-1$
							setStatus(s);
						}
					});
				}
			}
		}
	}

	@Override
	public String getNode()
	{
		return "react.act.fix-lighting";
	}
}
