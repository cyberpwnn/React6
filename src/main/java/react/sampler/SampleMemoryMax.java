package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
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
