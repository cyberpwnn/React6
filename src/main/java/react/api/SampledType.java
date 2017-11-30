package react.api;

import react.Info;
import react.React;

public enum SampledType
{
	REDSTONE_TICK_USAGE(Info.SAMPLER_REDSTONE_TICK_USAGE),
	REDSTONE_TICK(Info.SAMPLER_REDSTONE_TICK),
	REDSTONE_SECOND(Info.SAMPLER_REDSTONE_SECOND),
	REDSTONE_TIME(Info.SAMPLER_REDSTONE_TIME),
	HOPPER_TICK_USAGE(Info.SAMPLER_HOPPER_TICK_USAGE),
	HOPPER_TICK(Info.SAMPLER_HOPPER_TICK),
	HOPPER_SECOND(Info.SAMPLER_HOPPER_SECOND),
	HOPPER_TIME(Info.SAMPLER_HOPPER_TIME),
	FLUID_TICK_USAGE(Info.SAMPLER_FLUID_TICK_USAGE),
	FLUID_TICK(Info.SAMPLER_FLUID_TICK),
	FLUID_SECOND(Info.SAMPLER_FLUID_SECOND),
	FLUID_TIME(Info.SAMPLER_FLUID_TIME),
	TPS(Info.SAMPLER_TPS),
	TICK(Info.SAMPLER_TICK),
	TIU(Info.SAMPLER_TIU),
	MEM(Info.SAMPLER_MEM),
	FREEMEM(Info.SAMPLER_FREEMEM),
	MAXMEM(Info.SAMPLER_MAXMEM),
	ALLOCMEM(Info.SAMPLER_ALLOCMEM),
	MAHS(Info.SAMPLER_MAHS),
	CHK_TIME(Info.SAMPLER_CHK_TIME),
	CHK(Info.SAMPLER_CHK),
	CHKS(Info.SAMPLER_CHKS),
	ENT(Info.SAMPLER_ENT),
	ENTLIV(Info.SAMPLER_ENTLIV),
	ENTDROP(Info.SAMPLER_ENTDROP),
	ENTTILE(Info.SAMPLER_ENTTILE);

	private String node;

	public ISampler get()
	{
		return React.instance.sampleController.getSampler(toString());
	}

	@Override
	public String toString()
	{
		return node;
	}

	private SampledType(String s)
	{
		try
		{
			node = s;
		}

		catch(Exception e)
		{

		}
	}

	public String getNode()
	{
		return node;
	}
}
