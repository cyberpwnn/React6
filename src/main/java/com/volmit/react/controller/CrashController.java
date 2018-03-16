package com.volmit.react.controller;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import com.volmit.react.Config;
import com.volmit.react.Surge;
import com.volmit.react.api.Gate;
import com.volmit.react.util.C;
import com.volmit.react.util.CPS;
import com.volmit.react.util.Controller;
import com.volmit.react.util.D;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.M;

public class CrashController extends Controller implements Runnable
{
	private long lastTick;
	public static int cd;
	public static CrashController inst = null;

	@Override
	public void dump(JSONObject object)
	{
		object.put("last-tick", lastTick);
		object.put("cooldown", cd);
	}

	@Override
	public void start()
	{
		cd = 1200;
		Surge.register(this);
		lastTick = M.ms();
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{
		if(!Config.TRACK_SERVER_LOCKS)
		{
			return;
		}

		lastTick = M.ms();

		if(cd > 0)
		{
			cd--;

			if(cd == 0)
			{
				D.v("Watchdog Thread Started!");
				inst = this;
			}
		}
	}

	@Override
	public void run()
	{
		if(!Config.TRACK_SERVER_LOCKS)
		{
			return;
		}

		boolean spiked = false;

		while(!Thread.interrupted())
		{
			try
			{
				Thread.sleep(1000);
			}

			catch(InterruptedException e)
			{
				return;
			}

			if(M.ms() - lastTick > 7000 && !spiked)
			{
				spiked = true;
				Plugin px = null;

				for(StackTraceElement i : Surge.getServerThread().getStackTrace())
				{
					String kv = "||| " + i.getClassName() + "." + i.getMethodName() + "(" + i.getLineNumber() + ")";

					for(Plugin k : CPS.identify(i.getClassName()))
					{
						if(px == null)
						{
							px = k;
						}

						kv += " BLAMING " + k.getName();
					}

					System.out.println(kv);
				}

				if(px != null)
				{
					System.out.println("[React]: Notifying React Players");
					System.out.println("=====================================================");
					System.out.println("=====================================================");
					System.out.println("=====================================================");
					System.out.println("PLUGIN FREEZING SERVER: " + px.getName());
					System.out.println("=====================================================");
					System.out.println("=====================================================");
					System.out.println("=====================================================");

					for(CommandSender i : Gate.broadcastReactUsers())
					{
						Gate.msgError(i, "Warning! The server has been frozen for more than 7 seconds");
						i.sendMessage(Gate.header("Server Lock: " + px.getName(), C.RED));
						int lim = 0;

						for(StackTraceElement j : Surge.getServerThread().getStackTrace())
						{
							lim++;
							String kv = C.WHITE + fcf(j.getClassName()) + C.GRAY + "." + j.getMethodName() + "(" + j.getLineNumber() + ")";

							for(Plugin k : CPS.identify(j.getClassName()))
							{
								kv += " " + C.RED + k.getName();
							}

							i.sendMessage(kv);

							if(lim > 5)
							{
								break;
							}
						}

						i.sendMessage(Gate.header(C.RED));

						Gate.msgError(i, "Identified Cause: " + px.getName());
					}
				}
			}

			if(M.ms() - lastTick < 7000 && spiked)
			{
				for(CommandSender i : Gate.broadcastReactUsers())
				{
					Gate.msgSuccess(i, "The server has recovered from a lock!");
				}

				System.out.println("[React]: The server has recovered and resumed ticking.");
				spiked = false;
			}
		}
	}

	private String fcf(String className)
	{
		return className.split("\\.")[className.split("\\.").length - 1];
	}
}
