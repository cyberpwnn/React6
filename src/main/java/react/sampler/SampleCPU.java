package react.sampler;

import org.cyberpwn.gconcurrent.A;
import org.cyberpwn.gformat.F;
import org.cyberpwn.gmath.Average;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;
import surge.util.Platform;

@Anchor(2)
public class SampleCPU extends MSampler
{
	private IFormatter formatter;
	private Average aa = new Average(20);

	public SampleCPU()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.pc(d, 0) + " CPU"; //$NON-NLS-1$
			}
		};
	}

	@Override
	public void construct()
	{
		setName("CPU"); //$NON-NLS-1$
		setDescription("Java Process Usage"); //$NON-NLS-1$
		setID(SampledType.CPU.toString());
		setValue(0);
		setColor(C.GREEN, C.GREEN);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		new A()
		{
			@Override
			public void run()
			{
				aa.put(Platform.CPU.getLiveProcessCPULoad());
				setValue(aa.getAverage());
			}
		};
	}

	@Override
	public String get()
	{
		return getFormatter().from(getValue()); // $NON-NLS-1$
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
