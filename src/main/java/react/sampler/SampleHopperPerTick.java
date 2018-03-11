package react.sampler;

import com.volmit.react.util.Anchor;
import com.volmit.react.util.C;
import com.volmit.react.util.F;

import react.Lang;
import react.React;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;

@Anchor(2)
public class SampleHopperPerTick extends MSampler
{
	private IFormatter formatter;

	public SampleHopperPerTick()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f(d, 0) + Lang.getString("sampler.hopper-per-tick.pt"); //$NON-NLS-1$
			}
		};

	}

	@Override
	public void construct()
	{
		setName(Lang.getString("sampler.hopper-per-tick.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.hopper-per-tick.description")); //$NON-NLS-1$
		setID(SampledType.HOPPER_TICK.toString());
		setValue(0);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		try
		{
			setValue(React.instance.hopperController.getaHST().getAverage());
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
