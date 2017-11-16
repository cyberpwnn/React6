package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleHopperPerTick extends MSampler
{
	@Override
	public void construct()
	{
		setName("Hopper Per Tick");
		setDescription("Samples hopper updates per tick");
		setID(SampledType.HOPPER_TICK.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		try
		{
			setValue(React.instance.hopperController.getaHST().getAverage());
		}

		catch(Exception e)
		{
			setValue(0);
		}
	}

	@Override
	public String get()
	{
		return F.f(getValue(), 0) + "/t";
	}
}
