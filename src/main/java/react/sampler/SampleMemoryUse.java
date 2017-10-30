package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;
import surge.util.F;

@Anchor(2)
public class SampleMemoryUse extends MSampler
{
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
		return F.memSize((long) getValue());
	}
}
