package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;
import surge.util.Proto;

@Anchor(2)
public class SampleBandwidth extends MSampler
{
	private IFormatter formatter;
	private long u = 0;
	private long d = 0;

	public SampleBandwidth()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double dx)
			{
				return F.memSize((long) dx) + "\u296E";
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
		u = Proto.bpsOUT;
		d = Proto.bpsIN;
		setValue(u + d);
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
