package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.math.Average;
import surge.util.C;
import surge.util.F;

public class SampleChunksLoadedPerSecond extends MSampler
{
	private Average a = new Average(20);
	private Average b = new Average(20);

	@Override
	public void construct()
	{
		setName("Chunks/s");
		setDescription("Chunks per second");
		setID(SampledType.CHKS.toString());
		setValue(1);
		setColor(C.RED, C.RED);
		setInterval(0);
	}

	@Override
	public void sample()
	{
		a.put(ss().getChunksLoaded());
		b.put(ss().getChunksUnloaded());
		setValue(a.getAverage() - b.getAverage());
	}

	@Override
	public String get()
	{
		return "\u29F1 " + F.f((int) getValue()) + "/s";
	}
}
