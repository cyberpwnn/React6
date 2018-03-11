package react.sampler;

import com.volmit.react.util.Anchor;
import com.volmit.react.util.C;
import com.volmit.react.util.F;

import react.Lang;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;

@Anchor(2)
public class SampleEntitiesLiving extends MSampler
{
	private IFormatter formatter;

	public SampleEntitiesLiving()
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
		setName(Lang.getString("sampler.entities-living.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.entities-living.description")); //$NON-NLS-1$
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
		return Lang.getString("sampler.entities-living.symbol") + getFormatter().from(getValue()); //$NON-NLS-1$
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
