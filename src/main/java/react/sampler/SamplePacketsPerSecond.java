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
public class SamplePacketsPerSecond extends MSampler
{
	private Average aa;
	private IFormatter formatter;
	private long u = 0;
	private long d = 0;

	public SamplePacketsPerSecond()
	{
		aa = new Average(5);

		formatter = new IFormatter()
		{
			@Override
			public String from(double dx)
			{
				return F.f((int) dx) + " PPS";// "\u27F4 " + ;
			}
		};
	}

	@Override
	public void construct()
	{
		setName("PPS"); //$NON-NLS-1$
		setDescription("Packets per second"); //$NON-NLS-1$
		setID(SampledType.PPS.toString());
		setValue(1);
		setColor(C.LIGHT_PURPLE, C.LIGHT_PURPLE);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		u = ProtocolAdapter.ppsOUT;
		d = ProtocolAdapter.ppsIN;
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
