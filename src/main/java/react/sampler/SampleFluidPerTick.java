package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleFluidPerTick extends MSampler
{
	private IFormatter formatter;

	public SampleFluidPerTick()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f(d, 0) + "/t";
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Fluid Per Tick");
		setDescription("Samples fluid updates per tick");
		setID(SampledType.FLUID_TICK.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		try
		{
			setValue(React.instance.fluidController.getaFST().getAverage());
		}

		catch(Exception e)
		{
			setValue(0);
		}
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