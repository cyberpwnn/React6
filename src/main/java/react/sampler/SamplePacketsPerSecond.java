package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;
import surge.util.Proto;

@Anchor(2)
public class SamplePacketsPerSecond extends MSampler
{
	private IFormatter formatter;
	private long u = 0;
	private long d = 0;

	public SamplePacketsPerSecond()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double dx)
			{
				return "\u27F4 " + F.f(dx) + " PPS";
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
		u = Proto.ppsOUT;
		d = Proto.ppsIN;
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
