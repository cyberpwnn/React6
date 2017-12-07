package react.controller;

import org.bukkit.Bukkit;
import org.cyberpwn.gconcurrent.A;

import react.Lang;
import react.api.CPUBenchmark;
import react.api.CPUResult;
import surge.control.Controller;
import surge.sched.TaskLater;
import surge.util.D;

public class BenchmarkController extends Controller
{
	private CPUBenchmark finished;
	private boolean done;
	private int score;

	@Override
	public void start()
	{
		score = Integer.MIN_VALUE;
		done = false;
		finished = null;

		new TaskLater("Benchmarker", 40) //$NON-NLS-1$
		{
			@Override
			public void run()
			{
				new A()
				{
					@Override
					public void run()
					{
						finished = new CPUBenchmark(Bukkit.getConsoleSender(), new Runnable()
						{
							@Override
							public void run()
							{
								done = true;
							}
						});
						finished.start();
					}
				};
			}
		};
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{
		if(done && score == Integer.MIN_VALUE)
		{
			score = Math.abs(finished.getScore());
			D.v(Lang.getString("command.cpu-scorecpu-score") + score + " (" + CPUResult.c(score).toString() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
	}
}
