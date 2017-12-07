package react.sampler;

import org.cyberpwn.gformat.F;

import react.Lang;
import react.React;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleHopperPerSecond extends MSampler
{
	private IFormatter formatter;

	public SampleHopperPerSecond()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f(d, 0) + Lang.getString("sampler.hopper-per-second.ps"); //$NON-NLS-1$
			}
		};
	}

	@Override
	public void construct()
	{
		setName(Lang.getString("sampler.hopper-per-second.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.hopper-per-second.description")); //$NON-NLS-1$
		setID(SampledType.HOPPER_SECOND.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(5);
	}

	@Override
	public void sample()
	{
		setValue(React.instance.hopperController.getaHSS().getAverage());
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
