package react.api;

import react.Info;

public enum SampledType
{
	TPS(Info.SAMPLER_TPS),
	TICK(Info.SAMPLER_TICK),
	TIU(Info.SAMPLER_TIU),
	MEM(Info.SAMPLER_MEM),
	FREEMEM(Info.SAMPLER_FREEMEM),
	MAXMEM(Info.SAMPLER_MAXMEM),
	ALLOCMEM(Info.SAMPLER_ALLOCMEM),
	MAHS(Info.SAMPLER_MAHS),
	CHK(Info.SAMPLER_CHK),
	CHKS(Info.SAMPLER_CHKS),
	ENT(Info.SAMPLER_ENT),
	ENTLIV(Info.SAMPLER_ENTLIV),
	ENTDROP(Info.SAMPLER_ENTDROP),
	ENTTILE(Info.SAMPLER_ENTTILE);

	private String node;

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
