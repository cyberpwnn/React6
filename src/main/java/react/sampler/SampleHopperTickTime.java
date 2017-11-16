package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleHopperTickTime extends MSampler
{
	@Override
	public void construct()
	{
		setName("Hopper Tick Time");
		setDescription("Samples Hopper Tick Time");
		setID(SampledType.HOPPER_TIME.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(React.instance.hopperController.getaHSMS().getAverage());
	}

	@Override
	public String get()
	{
		return F.time(getValue() / 1000000.0, 1) + "";
	}
}
