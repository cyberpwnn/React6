package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;
import surge.util.Proto;

@Anchor(2)
public class SampleBandwidthUp extends MSampler
{
	private IFormatter formatter;

	public SampleBandwidthUp()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double dx)
			{
				return F.memSize((long) dx) + "/s \u296E";
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Bandwidth Upload"); //$NON-NLS-1$
		setDescription("Measures Server Bandwidth Up"); //$NON-NLS-1$
		setID(SampledType.BANDWIDTH_UP.toString());
		setValue(1);
		setColor(C.LIGHT_PURPLE, C.LIGHT_PURPLE);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(Proto.bpsOUT);
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
