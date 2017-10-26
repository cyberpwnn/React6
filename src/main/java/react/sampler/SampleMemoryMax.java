package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.C;
import surge.util.F;

public class SampleMemoryMax extends MSampler
{
	@Override
	public void construct()
	{
		setName("Max Memory");
		setDescription("Maximum Memory");
		setID(SampledType.MAXMEM.toString());
		setValue(1);
		setColor(C.GOLD, C.GOLD);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getMemoryMonitor().getMemoryMax());
	}

	@Override
	public String get()
	{
		return F.memSize((long) getValue());
	}
}
