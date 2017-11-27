package react.sampler;

import org.cyberpwn.gformat.F;

import react.React;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleEntitiesDrops extends MSampler
{
	private IFormatter formatter;

	public SampleEntitiesDrops()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f((int) d);
			}
		};
	}

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
		int ca = React.instance.entityCacheController.getCachedDrops();
		return "\u25CF" + getFormatter().from(getValue()) + C.LIGHT_PURPLE + "\u21C6" + F.f((int) ca);
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
