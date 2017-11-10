package react.api;

public enum CPUResult
{
	ULTRA_SLOW("Ultra Slow"), // Under 900
	VERY_SLOW("Very Slow"), // Over 900
	SLOW("Slow"), // Over 1700
	AVERAGE("Average"), // Over 2300
	GOOD("Good"), // Over 3500
	FAST("Fast"), // Over 4400
	VERY_FAST("Very Fast"), // Over 5900
	ULTRA_FAST("Ultra Fast"); // Over 9000!

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
		if(s > 9000)
		{
			return ULTRA_FAST.toString();
		}

		if(s > 5900)
		{
			return VERY_FAST.toString();
		}

		if(s > 4400)
		{
			return FAST.toString();
		}

		if(s > 3500)
		{
			return GOOD.toString();
		}

		if(s > 2300)
		{
			return AVERAGE.toString();
		}

		if(s > 1700)
		{
			return SLOW.toString();
		}

		if(s > 900)
		{
			return VERY_SLOW.toString();
		}

		return ULTRA_SLOW.toString();
	}
}
