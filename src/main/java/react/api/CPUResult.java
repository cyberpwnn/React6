package react.api;

public enum CPUResult
{
	ULTRA_SLOW("Ultra Slow"), // Under 100
	VERY_SLOW("Very Slow"), // Over 100
	SLOW("Slow"), // Over 800
	AVERAGE("Average"), // Over 1100
	GOOD("Good"), // Over 1350
	FAST("Fast"), // Over 1500
	VERY_FAST("Very Fast"), // Over 1700
	ULTRA_FAST("Ultra Fast"); // Over 2000!

	private String m;

	private CPUResult(String m)
	{
		this.m = m;
	}

	@Override
	public String toString()
	{
		return m;
	}

	public static String c(int s)
	{
		if(s > 2000)
		{
			return ULTRA_FAST.toString();
		}

		if(s > 1700)
		{
			return VERY_FAST.toString();
		}

		if(s > 1500)
		{
			return FAST.toString();
		}

		if(s > 1350)
		{
			return GOOD.toString();
		}

		if(s > 1100)
		{
			return AVERAGE.toString();
		}

		if(s > 800)
		{
			return SLOW.toString();
		}

		if(s > 100)
		{
			return VERY_SLOW.toString();
		}

		return ULTRA_SLOW.toString();
	}
}
