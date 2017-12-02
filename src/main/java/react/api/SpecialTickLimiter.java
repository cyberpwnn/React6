package react.api;

import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;
import org.spigotmc.TickLimiter;

public class SpecialTickLimiter extends TickLimiter // heh
{
	public double rMaxTime;
	public long rStartTime;
	public double rLastTime;
	public long rMark;
	public double tMaxTime;
	public Average atimes = new Average(2);
	public Average adropped = new Average(20);
	private int droppedTicks;
	public static boolean limit = true;

	public SpecialTickLimiter(double maxtime)
	{
		super((int) maxtime);

		this.rMark = M.ns();
		this.rMaxTime = maxtime;
		this.tMaxTime = maxtime;
		this.droppedTicks = 0;
	}

	@Override
	public void initTick()
	{
		rLastTime = (double) (rMark - rStartTime) / 1000000.0;
		this.rStartTime = M.ns();
		atimes.put(M.clip(rLastTime, 0, 50));
		adropped.put(droppedTicks);

		if(limit)
		{
			double k = atimes.getAverage();

			if(droppedTicks > 0)
			{
				k += 1.5;
			}

			tMaxTime = M.clip(k, 0.15, 50);

			if(Math.abs(tMaxTime - rMaxTime) > 0.01)
			{
				double d = Math.abs(tMaxTime - rMaxTime) / 20;

				if(tMaxTime > rMaxTime)
				{
					rMaxTime += d;
				}

				else
				{
					rMaxTime -= d;
				}
			}
		}

		else
		{
			rMaxTime = 50;
			tMaxTime = 50;
		}

		droppedTicks = 0;
	}

	@Override
	public boolean shouldContinue()
	{
		long remaining = M.ns() - this.rStartTime;
		boolean con = remaining < (long) (this.rMaxTime * 1000000.0);

		if(con)
		{
			rMark = M.ns();
		}

		else
		{
			droppedTicks++;
		}

		return con;
	}
}
