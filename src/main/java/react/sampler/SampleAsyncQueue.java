package react.sampler;

import org.cyberpwn.gformat.F;

import react.Lang;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;
import surge.Surge;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleAsyncQueue extends MSampler
{
	private IFormatter formatter;

	public SampleAsyncQueue()
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
		setName(Lang.getString("sampler.async-queue.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.async-queue.description")); //$NON-NLS-1$
		setID(SampledType.ATASK.toString());
		setValue(1);
		setColor(C.AQUA, C.AQUA);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(Surge.getAmp().getPluginInstance().getThreadPool().getTotalQueueSize());
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