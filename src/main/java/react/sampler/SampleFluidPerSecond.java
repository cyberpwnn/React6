package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleFluidPerSecond extends MSampler
{
	@Override
	public void construct()
	{
		setName("Fluid Per Second");
		setDescription("Samples fluid updates per second");
		setID(SampledType.FLUID_SECOND.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(5);
	}

	@Override
	public void sample()
	{
		setValue(React.instance.fluidController.getaFSS().getAverage());
	}

	@Override
	public String get()
	{
		return F.f(getValue(), 0) + "/s";
	}
}
