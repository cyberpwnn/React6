package react.sampler;

import org.cyberpwn.gformat.F;

import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleChunksLoaded extends MSampler
{
	private IFormatter formatter;

	public SampleChunksLoaded()
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
		return getFormatter().from(getValue()) + "\u2691";
	}

	@Override
	public IFormatter getFormatter()
	{
		return formatter;
	}
}
