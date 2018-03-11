package react.action;

import com.volmit.react.util.A;
import com.volmit.react.util.Anchor;
import com.volmit.react.util.F;
import com.volmit.react.util.S;

import react.Info;
import react.Lang;
import react.action.source.IActionSource;
import react.api.Action;
import react.api.ActionType;
import react.api.ISelector;

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

				new S("action.response.gc")
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

	@Override
	public String getNode()
	{
		return "react.act.gc";
	}
}
