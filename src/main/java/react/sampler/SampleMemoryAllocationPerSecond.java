package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.C;
import surge.util.F;

public class SampleMemoryAllocationPerSecond extends MSampler
{
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
		return "\u21AF " + F.memSize((long) getValue());
	}
}
