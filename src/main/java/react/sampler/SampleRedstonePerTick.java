package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleRedstonePerTick extends MSampler
{
	@Override
	public void construct()
	{
		setName("Redstone Per Tick");
		setDescription("Samples redstone updates per tick");
		setID(SampledType.REDSTONE_TICK.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		try
		{
			setValue(React.instance.redstoneController.getaRST().getAverage());
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
