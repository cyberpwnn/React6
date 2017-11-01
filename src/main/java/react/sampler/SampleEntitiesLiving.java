package react.sampler;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;
import surge.util.F;

@Anchor(2)
public class SampleEntitiesLiving extends MSampler
{
	@Override
	public void construct()
	{
		setName("Living");
		setDescription("Total Living");
		setID(SampledType.ENTLIV.toString());
		setValue(0);
		setColor(C.AQUA, C.AQUA);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getTotalLiving());
	}

	@Override
	public String get()
	{
		int ca = React.instance.entityCacheController.getCachedEntities();
		return "\u2764" + F.f((int) getValue()) + C.LIGHT_PURPLE + "\u21C6" + F.f((int) ca);
	}
}
