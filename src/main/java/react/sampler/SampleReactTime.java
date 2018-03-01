package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.controller.SampleController;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleReactTime extends MSampler
{
	private IFormatter formatter;

	public SampleReactTime()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.time(d, 2);
			}
		};
	}

	@Override
	public void construct()
	{
		setName("React Time"); //$NON-NLS-1$
		setDescription("Samples react total tick time"); //$NON-NLS-1$
		setID(SampledType.REACT_TIME.toString());
		setValue(0);
		setColor(C.AQUA, C.AQUA);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(SampleController.totalTime);
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
