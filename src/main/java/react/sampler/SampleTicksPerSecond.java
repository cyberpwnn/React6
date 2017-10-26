package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.C;
import surge.util.F;

public class SampleTicksPerSecond extends MSampler
{
	@Override
	public void construct()
	{
		setName("Ticks Per Second");
		setDescription("Samples the tps");
		setID(SampledType.TPS.toString());
		setValue(20);
		setColor(C.GREEN, C.GREEN);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getTicksPerSecond());
	}

	@Override
	public String get()
	{
		return F.f(getValue() > 19.89 ? 20 : getValue(), 0) + "\u2126";
	}
}
