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
public class SampleFluidTickUtilization extends MSampler
{
	private IFormatter formatter;

	public SampleFluidTickUtilization()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.pc(d, 1);
			}
		};
	}

	@Override
	public void construct()
	{
		setName(Lang.getString("sampler.fluid-tick-utilization.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.fluid-tick-utilization.description")); //$NON-NLS-1$
		setID(SampledType.FLUID_TICK_USAGE.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		try
		{
			setValue(React.instance.fluidController.getaFSMS().getAverage() / 50000000.0);
		}

		catch(Exception e)
		{
			setValue(0);
		}
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
