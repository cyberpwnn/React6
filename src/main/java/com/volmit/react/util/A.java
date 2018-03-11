package com.volmit.react.util;

public abstract class A extends Execution
{
	public static ParallelPoolManager mgr = null;

	public A()
	{
		mgr.queue(new Execution()
		{
			@Override
			public void run()
			{
				A.this.run();
			}
		});
	}
}
