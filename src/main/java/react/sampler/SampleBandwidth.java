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
public class SampleBandwidth extends MSampler
{
	private IFormatter formatter;
	private long u = 0;
	private long d = 0;
	private Average aa;

	public SampleBandwidth()
	{
		aa = new Average(5);

		formatter = new IFormatter()
		{
			@Override
			public String from(double dx)
			{
				return F.memSize((long) dx) + "/s";// + "\u296E";
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Bandwidth"); //$NON-NLS-1$
		setDescription("Measures Server Bandwidth Usage (uncompressed)"); //$NON-NLS-1$
		setID(SampledType.BANDWIDTH.toString());
		setValue(1);
		setColor(C.LIGHT_PURPLE, C.LIGHT_PURPLE);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		u = ProtocolAdapter.bpsOUT;
		d = ProtocolAdapter.bpsIN;
		aa.put(u + d);
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
