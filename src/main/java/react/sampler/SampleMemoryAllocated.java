package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
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
