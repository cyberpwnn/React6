package react.sampler;

import com.volmit.react.util.Anchor;
import com.volmit.react.util.C;
import com.volmit.react.util.F;

import react.Lang;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;

@Anchor(2)
public class SampleMemoryAllocationPerSecond extends MSampler
{
	private IFormatter formatter;

	public SampleMemoryAllocationPerSecond()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.memSize((long) d);
			}
		};
	}

	@Override
	public void construct()
	{
		setName(Lang.getString("sampler.mahs.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.mahs.description")); //$NON-NLS-1$
		setID(SampledType.MAHS.toString());
		setValue(1);
		setColor(C.GOLD, C.GOLD);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getMahs());
	}

	@Override
	public String get()
	{
		return "\u21AF " + getFormatter().from(getValue()); //$NON-NLS-1$
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
