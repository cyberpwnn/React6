package react.api;

import org.bukkit.command.CommandSender;
import org.cyberpwn.gbench.Profiler;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gformat.F;
import org.cyberpwn.gmath.Average;
import org.cyberpwn.gmath.M;

import react.Gate;

public class CPUBenchmark extends Thread
{
	private CommandSender sender;
	private int score;
	private Average roll;

	public CPUBenchmark(CommandSender sender)
	{
		this.sender = sender;
		this.score = 0;
		setPriority(MAX_PRIORITY);
		roll = new Average(100);
	}

	@Override
	public void run()
	{
		long st = M.ms();

		while(M.ms() - st < 10000)
		{
			Profiler p = new Profiler();
			p.begin();

			for(int ix = 0; ix < 1000; ix++)
			{
				double a = ix + 10000 - 401 + Math.PI + 400 / Math.E;
				double b = Math.sqrt(4 * a - 2);
				double c = Math.cbrt(b + a - 4);
				double d = Math.PI / c;
				double e = Math.E * a;
				double f = Math.pow(a, b) + Math.cbrt(e - d);
				double g = Math.pow(a + b - c + d - e + f, 0.02521);
				double h = Math.pow(a + g - c / d + f - e, 0.116342);
				double i = Math.sin(Math.cos(Math.cosh(h - g + a + b) + d + e) - f) + g;
				double j = Math.tan(Math.acos(a - f + i) + d + Math.atan(4 + g));
				double k = Math.cbrt(j + g - i + j / 4 * d + Math.sin(c));
				double l = Math.atan2(j, 3);
				Math.expm1(l + k - j + f * e);
			}

			score++;
			p.end();
			roll.put(p.getTime());
		}

		new S()
		{
			@Override
			public void run()
			{
				Gate.msgSuccess(sender, "CPU Score: " + score + " (avgms: " + F.f(roll.getAverage(), 2) + " ms)");
			}
		};
	}
}
