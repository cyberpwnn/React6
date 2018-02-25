package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;
import surge.util.Proto;

@Anchor(2)
public class SampleBandwidthDown extends MSampler
{
	private IFormatter formatter;

	public SampleBandwidthDown()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double dx)
			{
				return F.memSize((long) dx) + "/s";
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Bandwidth Download"); //$NON-NLS-1$
		setDescription("Measures Server Bandwidth Down"); //$NON-NLS-1$
		setID(SampledType.BANDWIDTH_DOWN.toString());
		setValue(1);
		setColor(C.LIGHT_PURPLE, C.LIGHT_PURPLE);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(Proto.bpsIN);
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
