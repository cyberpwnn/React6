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
public class SampleFluidTickTime extends MSampler
{
	private IFormatter formatter;

	public SampleFluidTickTime()
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
		setName(Lang.getString("sampler.fluid-tick-time.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.fluid-tick-time.description")); //$NON-NLS-1$
		setID(SampledType.FLUID_TIME.toString());
		setValue(0);
		setColor(C.LIGHT_PURPLE, C.LIGHT_PURPLE);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(React.instance.fluidController.getaFSMS().getAverage());
	}

	@Override
	public String get()
	{
		return getFormatter().from(getValue()) + ""; //$NON-NLS-1$
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
