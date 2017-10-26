package react.api;

import react.React;
import surge.server.SuperSampler;

public abstract class MSampler extends Sampler
{
	protected SuperSampler ss()
	{
		return React.instance.sampleController.getSuperSampler();
	}
}
