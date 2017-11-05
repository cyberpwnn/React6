package react.sampler;

import org.cyberpwn.gformat.F;
import org.cyberpwn.gmath.M;

import react.api.MSampler;
import react.api.SampledType;
import surge.util.Anchor;
import surge.util.C;

@Anchor(2)
public class SampleTicksPerSecond extends MSampler
{
	@Override
	public void construct()
	{
		setName("Ticks Per Second");
		setDescription("Samples the tps");
		setID(SampledType.TPS.toString());
		setValue(20);
		setColor(C.GREEN, C.GREEN);
		setInterval(1);
	}

	@Override
	public void sample()
	{
		setValue(ss().getTicksPerSecond());
	}

	@Override
	public String get()
	{
		if(-getValue() > 20)
		{
			return (M.r(0.5) ? C.GOLD : C.RED) + "\u26A0" + C.RED + " " + F.time(-getValue(), 1);
		}

		return F.f(getValue() > 19.89 ? 20 : getValue(), 0) + "\u2126";
	}
}
