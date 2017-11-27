package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleEntitiesTiles extends MSampler
{
	private IFormatter formatter;

	public SampleEntitiesTiles()
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

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
