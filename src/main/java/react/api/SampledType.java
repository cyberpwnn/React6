package react.api;

import react.Info;

public enum SampledType
{
	TPS(Info.TPS),
	TICK(Info.TICK),
	TIU(Info.TIU),
	MEM(Info.MEM),
	FREEMEM(Info.FREEMEM),
	MAXMEM(Info.MAXMEM),
	ALLOCMEM(Info.ALLOCMEM),
	MAHS(Info.MAHS),
	CHK(Info.CHK),
	CHKS(Info.CHKS),
	ENT(Info.ENT),
	ENTLIV(Info.ENTLIV),
	ENTDROP(Info.ENTDROP),
	ENTTILE(Info.ENTTILE);

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
