package com.volmit.react.api;

import surge.util.Tag;

public enum SampledType
{
	@Tag("TPS")
	TPS,

	@Tag("TICK")
	TICK,

	@Tag("TIU")
	TIU,

	@Tag("MEM")
	MEM,

	@Tag("FREEMEM")
	FREEMEM,

	@Tag("MAXMEM")
	MAXMEM,

	@Tag("ALLOCMEM")
	ALLOCMEM,

	@Tag("MAHS")
	MAHS;

	private String node;

	private SampledType()
	{
		try
		{
			node = SampledType.class.getField(name()).getAnnotation(Tag.class).value();
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
