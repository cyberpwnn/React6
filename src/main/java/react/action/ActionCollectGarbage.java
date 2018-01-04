package react.action;

import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gformat.F;

import react.Info;
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
		source.sendResponseActing("Collecting Garbage");

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
							source.sendResponseSuccess("Collected " + F.memSize(freed) + " of garbage.");
						}

						else
						{
							source.sendResponseError("Could not free a measurable amount of memory.");
						}

						completeAction();
					}
				};
			}
		};
	}
}
