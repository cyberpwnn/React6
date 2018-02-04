package react.action;

import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gformat.F;

import react.Info;
import react.Lang;
import react.action.source.IActionSource;
import react.api.Action;
import react.api.ActionType;
import react.api.ISelector;
import surge.util.Anchor;

@Anchor(1)
public class ActionCollectGarbage extends Action
{
	public ActionCollectGarbage()
	{
		super(ActionType.COLLECT_GARBAGE);

		setNodes(Info.ACTION_COLLECT_GARBAGE_TAGS);
	}

	@Override
	public void enact(IActionSource source, ISelector... selectors)
	{
		source.sendResponseActing(Lang.getString("react.action.collect-garbagecollecting-garbage")); //$NON-NLS-1$

		new A()
		{

			@Override
			public void run()
			{
				long mbmem = Runtime.getRuntime().freeMemory();
				System.gc();
				long mbnex = Runtime.getRuntime().freeMemory();

				new S()
				{
					@Override
					public void run()
					{
						long freed = mbnex - mbmem;

						if(freed > 0)
						{
							source.sendResponseSuccess(Lang.getString("react.action.collect-garbagecollected") + F.memSize(freed) + Lang.getString("react.action.collect-garbageof-garbage")); //$NON-NLS-1$ //$NON-NLS-2$
						}

						else
						{
							source.sendResponseError(Lang.getString("react.action.collect-garbageno-free")); //$NON-NLS-1$
						}

						completeAction();
					}
				};
			}
		};
	}
}
