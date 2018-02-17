package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.cyberpwn.gmath.M;

import react.Gate;
import surge.Surge;
import surge.control.Controller;
import surge.server.CPS;
import surge.util.C;

public class CrashController extends Controller implements Runnable
{
	private long lastTick;
	private Thread crashThread;

	@Override
	public void start()
	{
		Surge.register(this);
		lastTick = M.ms();
		crashThread = new Thread(this, "Surge Watchdog");
		crashThread.start();
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
		crashThread.interrupt();
	}

	@Override
	public void tick()
	{
		lastTick = M.ms();
	}

	@Override
	public void run()
	{
		boolean spiked = false;

		while(!Thread.interrupted())
		{
			if(M.ms() - lastTick > 7000 && !spiked)
			{
				spiked = true;
				System.out.println("[React]: WARNING SERVER MAY SHUT DOWN FROM LONG LOCK");
				System.out.println("[React]: Looking for the cause to this issue");
				System.out.println("||| CURRENTLY LOCKED AT: ");

				Plugin px = null;

				for(StackTraceElement i : Surge.getServerThread().getStackTrace())
				{
					String kv = "||| " + i.getClassName() + "." + i.getMethodName() + "(" + i.getLineNumber() + ")";

					for(Plugin k : CPS.identify(i.getClassName()))
					{
						px = k;
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

					for(Player i : Bukkit.getServer().getOnlinePlayers())
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
