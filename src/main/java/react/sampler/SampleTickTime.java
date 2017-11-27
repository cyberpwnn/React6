package react.sampler;

import org.cyberpwn.gformat.F;
import org.cyberpwn.gmath.Average;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleTickTime extends MSampler
{
	private IFormatter formatter;
	private Average aa = new Average(50);

	public SampleTickTime()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f(d, 0) + "ms";
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Tick Time");
		setDescription("Tick time in milliseconds");
		setID(SampledType.TICK.toString());
		setValue(1);
		setColor(C.GREEN, C.GREEN);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		aa.put(ss().getTickTime());
		setValue(ss().getTickTime());
	}

	@Override
	public String get()
	{
		return getFormatter().from(getValue()) + " \u27A4";
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
