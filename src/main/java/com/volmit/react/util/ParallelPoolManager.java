package com.volmit.react.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class ParallelPoolManager
{
	private int hp = 5000;
	private QueueMode mode;
	private GList<ParallelThread> threads;
	private int next;
	private int threadCount;
	private Queue<Execution> squeue;
	private String key;
	private ThreadInformation info;

	public ParallelPoolManager(String key, int threadCount, QueueMode mode)
	{
		this(threadCount, mode);
		this.key = key;
	}

	public ParallelPoolManager(int threadCount, QueueMode mode)
	{
		if(threadCount < 1)
		{
			threadCount = 1;
		}

		if(threadCount > 4)
		{
			System.out.println("WARNING: HIGH THREAD COUNT FOR CORETICK");
		}

		threads = new GList<ParallelThread>();
		this.threadCount = threadCount;
		next = 0;
		this.mode = mode;
		key = "Worker Thread";
		info = new ThreadInformation(-1);
		squeue = new ConcurrentLinkedQueue<Execution>();
	}

	public void syncQueue(Execution e)
	{
		squeue.offer(e);
	}

	public abstract long getNanoGate();

	public void tickSyncQueue()
	{
		long ns = M.ns();
		double nsl = 0.337 * 1000000.0;

		hp += 1 + (squeue.size() < 3 ? 5 : 0);

		if(hp > 300)
		{
			nsl += 2.25 * 1000000.0;
		}

		while(!squeue.isEmpty() && M.ns() - ns < nsl)
		{
			I.a("sync-queue.rawtick", 100);
			squeue.poll().run();
			hp--;
			I.b("sync-queue.rawtick");
		}

		if(hp < 0)
		{
			hp = 0;
		}

		if(hp > 5000)
		{
			hp = 5000;
		}
	}

	public long lock()
	{
		long k = M.ms();

		while(getTotalQueueSize() > 0)
		{
			try
			{
				Thread.sleep(1);
			}

			catch(Throwable e)
			{
				Ex.t(e);
			}
		}

		return M.ms() - k;
	}

	public int getTotalQueueSize()
	{
		int size = getQueueSize();

		for(ParallelThread i : threads)
		{
			size += i.getQueue().size();
		}

		return size;
	}

	public void start()
	{
		createThreads(threadCount);
	}

	public void shutdown()
	{
		for(ParallelThread i : threads)
		{
			i.interrupt();
		}
	}

	public ParallelPoolManager(int threadCount)
	{
		this(threadCount, QueueMode.ROUND_ROBIN);
	}

	public void queue(Execution e)
	{
		nextThread().queue(e);
	}

	public int getSize()
	{
		return threads.size();
	}

	public int getQueueSize()
	{
		int s = 0;

		for(ParallelThread i : getThreads())
		{
			s += i.getQueue().size();
		}

		return s;
	}

	public ParallelThread[] getThreads()
	{
		return threads.toArray(new ParallelThread[threads.size()]);
	}

	private void updateThreadInformation()
	{
		try
		{
			if(threads.isEmpty())
			{
				return;
			}

			double ticksPerSecond = 0;
			int queuedSize = 0;
			double utilization = 0;

			for(ParallelThread ph : threads.copy())
			{
				ticksPerSecond += ph.getInfo().getTicksPerSecondAverage();
				queuedSize += ph.getQueue().size();
				utilization += ph.getInfo().getUtilization();
			}

			utilization /= threads.size();
			ticksPerSecond /= threads.size();
			getAverageInfo().setTicksPerSecond(ticksPerSecond);
			getAverageInfo().setQueuedSize(queuedSize);
			getAverageInfo().setUtilization(utilization);
		}

		catch(Throwable e)
		{
			Ex.t(e);
		}
	}

	private ParallelThread nextThread()
	{
		updateThreadInformation();

		if(threads.size() == 1)
		{
			return threads.get(0);
		}

		int id = 0;

		switch(mode)
		{
			case ROUND_ROBIN:
				next = (next > threads.size() - 1 ? 0 : next + 1);
				id = next;
			case SMALLEST:
				int min = Integer.MAX_VALUE;

				for(ParallelThread i : threads)
				{
					int size = i.getQueue().size();

					if(size < min)
					{
						min = size;
						id = i.getInfo().getId();
					}
				}

			default:
				break;
		}

		return threads.get(id);
	}

	private void createThreads(int count)
	{

	}

	public QueueMode getMode()
	{
		return mode;
	}

	public int getNext()
	{
		return next;
	}

	public int getThreadCount()
	{
		return threadCount;
	}

	public Queue<Execution> getSqueue()
	{
		return squeue;
	}

	public String getKey()
	{
		return key;
	}

	public ThreadInformation getAverageInfo()
	{
		return info;
	}
}
