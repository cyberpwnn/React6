package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleHopperTickUtilization extends MSampler
{
	@Override
	public void construct()
	{
		setName("Hopper Tick Time Utilization");
		setDescription("Samples Hopper Tick Time Utilization");
		setID(SampledType.HOPPER_TICK_USAGE.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		try
		{
			setValue(React.instance.hopperController.getaHSMS().getAverage() / 50000000.0);
		}

		catch(Exception e)
		{
			setValue(0);
		}
	}

	@Override
	public String get()
	{
		return F.pc(getValue(), 1) + "";
	}
}
