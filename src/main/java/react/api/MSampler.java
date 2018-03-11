package react.api;

import com.volmit.react.util.SuperSampler;

import react.React;

public abstract class MSampler extends Sampler
{
	protected SuperSampler ss()
	{
		return React.instance.sampleController.getSuperSampler();
	}
}
