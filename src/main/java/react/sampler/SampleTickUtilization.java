package react.sampler;

import org.cyberpwn.gformat.F;
import org.cyberpwn.gmath.Average;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleTickUtilization extends MSampler
{
	private IFormatter formatter;
	private Average aa = new Average(50);

	public SampleTickUtilization()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.pc(d, 0);
			}
		};
	}

	@Override
	public void construct()
	{
		setName("Tick Utilization");
		setDescription("Tick usage via percent");
		setID(SampledType.TIU.toString());
		setValue(1);
		setColor(C.GREEN, C.GREEN);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		aa.put(ss().getTickUtilization());
		setValue(aa.getAverage());
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
