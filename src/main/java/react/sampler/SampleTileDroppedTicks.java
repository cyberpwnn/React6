package react.sampler;

import com.volmit.react.util.Anchor;
import com.volmit.react.util.C;
import com.volmit.react.util.F;

import react.Lang;
import react.React;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;

@Anchor(2)
public class SampleTileDroppedTicks extends MSampler
{
	private IFormatter formatter;

	public SampleTileDroppedTicks()
	{
		formatter = new IFormatter()
		{
			@Override
			public String from(double d)
			{
				return F.f(d, 1);
			}
		};
	}

	@Override
	public void construct()
	{
		setName(Lang.getString("sampler.tile.dropped-ticks.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.tile.dropped-ticks.description")); //$NON-NLS-1$
		setID(SampledType.TILE_DROPTICK.toString());
		setValue(0);
		setColor(C.LIGHT_PURPLE, C.LIGHT_PURPLE);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(React.instance.smearTickController.getUniversalTileDroppedTicks());
	}

	@Override
	public String get()
	{
		return getFormatter().from(getValue());
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
