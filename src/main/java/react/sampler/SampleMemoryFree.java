package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.C;
import surge.util.F;

public class SampleMemoryFree extends MSampler
{
	@Override
	public void construct()
	{
		setName("Free Memory");
		setDescription("Memory currently free");
		setID(SampledType.FREEMEM.toString());
		setValue(1);
		setColor(C.GOLD, C.GOLD);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getMemoryMonitor().getMemoryMax() - ss().getMemoryUse());
	}

	@Override
	public String get()
	{
		return F.memSize((long) getValue());
	}
}
