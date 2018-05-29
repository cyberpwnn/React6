package com.volmit.react.command;

import java.io.File;

import org.bukkit.command.CommandSender;

import com.volmit.react.Config;
import com.volmit.react.React;
import com.volmit.react.ReactPlugin;
import com.volmit.react.api.Gate;
import com.volmit.react.api.Permissable;
import com.volmit.react.api.ReactCommand;
import com.volmit.react.api.SideGate;
import com.volmit.react.util.A;
import com.volmit.react.util.C;
import com.volmit.react.util.F;
import com.volmit.react.util.S;

public class CommandCache extends ReactCommand
{
	public CommandCache()
	{
		command = "cache";
		aliases = new String[] {"ch", "data", "dat"};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_ENVIRONMENT.getNode()};
		usage = "";
		description = "Displays cache information";
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		new A()
		{
			@Override
			public void run()
			{
				long size = 0;

				for(File i : new File(ReactPlugin.i.getDataFolder(), "cache").listFiles())
				{
					if(i.isFile())
					{
						size += i.length();
					}
				}

				long ss = size;

				new S("")
				{
					@Override
					public void run()
					{
						Gate.msgSuccess(sender, "Cache Utilization: " + C.WHITE + F.fileSize(ss, 2) + C.GRAY + " of " + C.WHITE + Config.DLG_MAX_MB + "MB");
					}
				};

				if(Config.DATALOG_ENABLED)
				{
					try
					{
						long totalDuration = React.instance.dataLogController.getTotalDuration();
						long frag = React.instance.dataLogController.getTotalFragmentation();
						double f = (double) frag / (double) totalDuration;

						new S("")
						{
							@Override
							public void run()
							{
								Gate.msgSuccess(sender, "Cached " + C.WHITE + F.timeLong(totalDuration, 1) + C.GRAY + " of sample data " + C.YELLOW + "(" + F.pc(f, 1) + " / " + F.timeLong(frag, 1) + " fragmented)");
							}
						};
					}

					catch(Exception e)
					{
						e.printStackTrace();

						new S("")
						{
							@Override
							public void run()
							{
								Gate.msgError(sender, "Error reading cache. Use /re cache fix");
							}
						};
					}
				}
			}
		};
	}
}
