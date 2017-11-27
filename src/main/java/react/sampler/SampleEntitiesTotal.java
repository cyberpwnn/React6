package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleEntitiesTotal extends MSampler
{
	private IFormatter formatter;

	public SampleEntitiesTotal()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f((int) d);
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Entities");
		setDescription("Total Entities");
		setID(SampledType.ENT.toString());
		setValue(0);
		setColor(C.AQUA, C.AQUA);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getTotalEntities());
	}

	@Override
	public String get()
	{
		return getFormatter().from(getValue()) + "\u2618";
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
