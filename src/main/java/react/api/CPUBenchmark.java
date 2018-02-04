package react.api;

import org.bukkit.command.CommandSender;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.gformat.F;

import react.Gate;
import react.Lang;
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
		setName("Surge CPU Benchmark"); //$NON-NLS-1$
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
				Gate.msgSuccess(sender, Lang.getString("react.bench.benchmarking-for") + F.time(1268 * 19, 0)); //$NON-NLS-1$
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

		if(!this.getClass().getSimpleName().equals("CPUBenchmark")) //$NON-NLS-1$
		{
			score = (int) (7.14285 * score);
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
				Gate.msgSuccess(sender, Lang.getString("react.bench.cpu-score") + score); //$NON-NLS-1$
				Gate.msgSuccess(sender, Lang.getString("react.bench.looks-like-its") + C.WHITE + CPUResult.c(score) + Lang.getString("react.bench.cpu")); //$NON-NLS-1$ //$NON-NLS-2$

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
