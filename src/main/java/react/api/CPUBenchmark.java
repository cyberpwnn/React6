package react.api;

import org.bukkit.command.CommandSender;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gformat.F;

import react.Gate;
import surge.util.C;

public class CPUBenchmark extends Thread
{
	private CommandSender sender;
	private int score;

	public CPUBenchmark(CommandSender sender)
	{
		this.sender = sender;
		this.score = 0;
		setPriority(MAX_PRIORITY);
	}

	@Override
	public void run()
	{
		new S()
		{
			@Override
			public void run()
			{
				Gate.msgSuccess(sender, "Benchmarking CPU for ~" + F.time(1268 * 19, 0));
			}
		};

		int tt = 0;
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < 19; i++)
		{
			tt = DTest.test();

			if(tt > max)
			{
				max = tt;
				score = max;
			}
		}

		new S()
		{
			@Override
			public void run()
			{
				Gate.msgSuccess(sender, "CPU Score: " + score);
				Gate.msgSuccess(sender, "Looks like it's a " + C.WHITE + CPUResult.c(score) + " CPU");
			}
		};
	}
}
