package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleMemoryUse extends MSampler
{
	private IFormatter formatter;

	public SampleMemoryUse()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.memSize((long) d);
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Used Memory");
		setDescription("Memory currently used");
		setID(SampledType.MEM.toString());
		setValue(1);
		setColor(C.GOLD, C.GOLD);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getMemoryUse());
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
