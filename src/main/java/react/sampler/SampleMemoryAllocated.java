package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.C;
import surge.util.F;

public class SampleMemoryAllocated extends MSampler
{
	@Override
	public void construct()
	{
		setName("Allocated Memory");
		setDescription("Allocated Memory");
		setID(SampledType.ALLOCMEM.toString());
		setValue(1);
		setColor(C.GOLD, C.GOLD);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getMemoryAllocated());
	}

	@Override
	public String get()
	{
		return F.memSize((long) getValue());
	}
}
