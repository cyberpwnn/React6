package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleMemoryAllocationPerSecond extends MSampler
{
	private IFormatter formatter;

	public SampleMemoryAllocationPerSecond()
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
		setName("Memory allocated per second");
		setDescription("Memory allocated per second");
		setID(SampledType.MAHS.toString());
		setValue(1);
		setColor(C.GOLD, C.GOLD);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getMahs());
	}

	@Override
	public String get()
	{
		return "\u21AF " + getFormatter().from(getValue());
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
