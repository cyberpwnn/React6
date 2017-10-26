package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.C;
import surge.util.F;

public class SampleEntitiesTiles extends MSampler
{
	@Override
	public void construct()
	{
		setName("Tiles");
		setDescription("Total Tiles");
		setID(SampledType.ENTTILE.toString());
		setValue(0);
		setColor(C.AQUA, C.AQUA);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getTotalTiles());
	}

	@Override
	public String get()
	{
		return "\u2756" + F.f((int) getValue());
	}
}
