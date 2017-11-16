package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleHopperPerSecond extends MSampler
{
	@Override
	public void construct()
	{
		setName("Hoppers Per Second");
		setDescription("Samples hopper updates per second");
		setID(SampledType.HOPPER_SECOND.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(5);
	}

	@Override
	public void sample()
	{
		setValue(React.instance.hopperController.getaHSS().getAverage());
	}

	@Override
	public String get()
	{
		return F.f(getValue(), 0) + "/s";
	}
}
