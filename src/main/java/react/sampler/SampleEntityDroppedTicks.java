package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleEntityDroppedTicks extends MSampler
{
	private IFormatter formatter;

	public SampleEntityDroppedTicks()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f(d, 1);
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Entity Dropped Ticks");
		setDescription("Samples Dropped Entity Ticks");
		setID(SampledType.ENTITY_DROPTICK.toString());
		setValue(0);
		setColor(C.LIGHT_PURPLE, C.LIGHT_PURPLE);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(React.instance.smearTickController.getUniversalEntityDroppedTicks());
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
