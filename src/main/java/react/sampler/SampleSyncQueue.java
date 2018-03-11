package react.sampler;

import com.volmit.react.surge.Surge;
import com.volmit.react.util.Anchor;
import com.volmit.react.util.C;
import com.volmit.react.util.F;

import react.Lang;
import react.api.MSampler;
import react.api.SampledType;
import react.graph.IFormatter;

@Anchor(2)
public class SampleSyncQueue extends MSampler
{
	private IFormatter formatter;

	public SampleSyncQueue()
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
		setName(Lang.getString("sampler.sync-queue.name")); //$NON-NLS-1$
		setDescription(Lang.getString("sampler.sync-queue.description")); //$NON-NLS-1$
		setID(SampledType.STASK.toString());
		setValue(1);
		setColor(C.AQUA, C.AQUA);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(Surge.getAmp().getPluginInstance().getThreadPool().getSqueue().size());
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
