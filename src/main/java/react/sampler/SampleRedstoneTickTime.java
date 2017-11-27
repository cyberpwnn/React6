package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleRedstoneTickTime extends MSampler
{
	private IFormatter formatter;

	public SampleRedstoneTickTime()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.time(d / 1000000.0, 1);
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Redstone Tick Time");
		setDescription("Samples Redstone Tick Time");
		setID(SampledType.REDSTONE_TIME.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(React.instance.redstoneController.getaRSMS().getAverage());
	}

	@Override
	public String get()
	{
		return getFormatter().from(getValue());
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
