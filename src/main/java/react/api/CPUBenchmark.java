package react.api;

import org.bukkit.command.CommandSender;

import com.volmit.react.util.C;
import com.volmit.react.util.F;

import react.Gate;
import react.Lang;

public class CPUBenchmark extends Thread
{
	private CommandSender sender;
	private int score;
	private Runnable onFinish;
	public static int low = 1000000;
	public static int high = 0;

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
		for(CommandSender i : Gate.broadcastReactUsers())
		{
			Gate.msgSuccess(i, Lang.getString("react.bench.benchmarking-for") + F.time(1000 * 30, 0)); //$NON-NLS-1$
		}

		int tt = 0;
		int max = Integer.MIN_VALUE;

		if(interrupted())
		{
			return;
		}

		for(int i = 0; i < 30; i++)
		{
			if(interrupted())
			{
				return;
			}

			tt = DTest.test();

			if(tt < low)
			{
				low = tt;
			}

			if(tt > high)
			{
				high = tt;
			}

			if(tt > max)
			{
				max = tt;
				score = max;
			}
		}

		score += 100;

		if(interrupted())
		{
			return;
		}

		if(score < low)
		{
			low = score;
		}

		if(score > high)
		{
			high = score;
		}

		for(CommandSender i : Gate.broadcastReactUsers())
		{
			Gate.msgSuccess(i, Lang.getString("react.bench.looks-like-its") + C.WHITE + CPUResult.c(score) + Lang.getString("react.bench.cpu")); //$NON-NLS-1$ //$NON-NLS-2$
			Gate.msgSuccess(i, C.RED + F.f(low) + C.GRAY + " <- " + C.YELLOW + F.f(high - low) + C.GRAY + " -> " + C.GREEN + F.f(high));
		}

		if(onFinish != null)
		{
			onFinish.run();
		}
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
