package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;
import surge.util.F;

@Anchor(2)
public class SampleEntitiesDrops extends MSampler
{
	@Override
	public void construct()
	{
		setName("Drops");
		setDescription("Total Drops");
		setID(SampledType.ENTDROP.toString());
		setValue(0);
		setColor(C.AQUA, C.AQUA);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getTotalDrops());
	}

	@Override
	public String get()
	{
		return "\u25CF" + F.f((int) getValue());
	}
}
