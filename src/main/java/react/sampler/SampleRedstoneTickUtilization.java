package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleRedstoneTickUtilization extends MSampler
{
	@Override
	public void construct()
	{
		setName("Redstone Tick Time Utilization");
		setDescription("Samples Redstone Tick Time Utilization");
		setID(SampledType.REDSTONE_TICK_USAGE.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		try
		{
			setValue(React.instance.redstoneController.getaRSMS().getAverage() / 50000000.0);
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
