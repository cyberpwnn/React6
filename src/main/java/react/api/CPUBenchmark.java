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
	private Runnable onFinish;

	public CPUBenchmark(CommandSender sender)
	{
		this.sender = sender;
		this.score = 0;
		setPriority(MAX_PRIORITY);
		onFinish = null;
		setName("Surge CPU Benchmark");
	}

	public CPUBenchmark(CommandSender sender, Runnable callb)
	{
		this(sender);
		onFinish = callb;
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

		if(interrupted())
		{
			return;
		}

		for(int i = 0; i < 19; i++)
		{
			if(interrupted())
			{
				return;
			}

			tt = DTest.test();

			if(tt > max)
			{
				max = tt;
				score = max;
			}
		}

		if(interrupted())
		{
			return;
		}

		new S()
		{
			@Override
			public void run()
			{
				Gate.msgSuccess(sender, "CPU Score: " + score);
				Gate.msgSuccess(sender, "Looks like it's a " + C.WHITE + CPUResult.c(score) + " CPU");

				if(onFinish != null)
				{
					onFinish.run();
				}
			}
		};
	}

	public CommandSender getSender()
	{
		return sender;
	}

	public int getScore()
	{
		return score;
	}

	public Runnable getOnFinish()
	{
		return onFinish;
	}
}
