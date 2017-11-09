package react.core.v1_12R1;

import react.core.FeatureSet;
import react.core.FeatureType;
import react.core.IFeatureWorld;
import react.core.Support;
import surge.sched.Task;

public class V1_12R1 extends FeatureSet
{
	@Support(FeatureType.WORLD)
	public FeatureWorld featureWorld;

	public V1_12R1()
	{
		new Task("refresh-interval", 2)
		{
			@Override
			public void run()
			{
				if(!getWorldFeature().getDirtyChunks().isEmpty())
				{
					getWorldFeature().refreshChunk(getWorldFeature().getDirtyChunks().pop());
				}
			}
		};
	}

	@Override
	public IFeatureWorld getWorldFeature()
	{
		return featureWorld;
	}
}
