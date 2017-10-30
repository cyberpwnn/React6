package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;
import surge.util.F;

@Anchor(2)
public class SampleChunksLoaded extends MSampler
{
	@Override
	public void construct()
	{
		setName("Chunks");
		setDescription("Total loaded chunks");
		setID(SampledType.CHK.toString());
		setValue(1);
		setColor(C.RED, C.RED);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getTotalChunks());
	}

	@Override
	public String get()
	{
		return F.f((int) getValue()) + "\u2691";
	}
}
