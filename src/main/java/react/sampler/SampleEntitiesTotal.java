package react.sampler;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;
import surge.util.F;

@Anchor(2)
public class SampleEntitiesTotal extends MSampler
{
	@Override
	public void construct()
	{
		setName("Entities");
		setDescription("Total Entities");
		setID(SampledType.ENT.toString());
		setValue(0);
		setColor(C.AQUA, C.AQUA);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getTotalEntities());
	}

	@Override
	public String get()
	{
		return F.f((int) getValue()) + "\u2618";
	}
}
