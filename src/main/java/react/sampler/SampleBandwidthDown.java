package react.sampler;

import org.cyberpwn.gformat.F;
import org.cyberpwn.gmath.Average;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import react.protocol.ProtocolAdapter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleBandwidthDown extends MSampler
{
	private Average aa;
	private IFormatter formatter;

	public SampleBandwidthDown()
	{
		aa = new Average(5);

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
		aa.put(ProtocolAdapter.bpsIN);
		setValue(aa.getAverage());
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
