package react.sampler;

import org.cyberpwn.gformat.F;
import org.cyberpwn.gmath.Average;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleChunksLoadedPerSecond extends MSampler
{
	private Average a = new Average(19);

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
		setValue(a.getAverage());
	}

	@Override
	public String get()
	{
		return "\u29F1 " + F.f((int) getValue()) + "/s";
	}
}
