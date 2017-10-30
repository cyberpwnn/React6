package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;
import surge.util.F;

@Anchor(2)
public class SampleTickUtilization extends MSampler
{
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
		setValue(ss().getTickUtilization());
	}

	@Override
	public String get()
	{
		return F.pc(getValue(), 0);
	}
}
