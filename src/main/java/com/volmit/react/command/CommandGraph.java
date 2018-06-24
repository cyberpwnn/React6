package com.volmit.react.command;

import java.io.File;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.volmit.react.Config;
import com.volmit.react.Gate;
import com.volmit.react.api.Permissable;
import com.volmit.react.api.ReactCommand;
import com.volmit.react.api.SampledType;
import com.volmit.react.api.SideGate;
import com.volmit.react.api.Whiteboard;
import com.volmit.react.util.A;
import com.volmit.react.util.C;
import com.volmit.react.util.M;
import com.volmit.react.util.Profiler;
import com.volmit.react.util.S;
import com.volmit.volume.lang.collections.GList;

public class CommandGraph extends ReactCommand
{
	public CommandGraph()
	{
		command = "graph";
		aliases = new String[] {"gg", "gr", "chart"};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_MAP.getNode()};
		usage = "<duration> [samplers...]";
		description = "Creates a graph";
		sideGate = SideGate.ANYTHING;
		registerParameterDescription("<duration>", "Duration of time back, 2m, 4h 1d, 30s etc.");
		registerParameterDescription("[samplers...]", "List of samplers to graph across this time.\nFor example /re graph 30m tps mem");
	}

	@Override
	public List<String> onTabComplete(CommandSender arg0, Command arg1, String arg2, String[] arg3)
	{
		GList<String> l = new GList<String>();

		return l;
	}

	public long parseTime(String input)
	{
		long ms = 10000;
		double mul = 1;
		String tag = "";

		if(input.toLowerCase().endsWith("ms"))
		{
			mul = 1;
			tag = "ms";
		}

		else if(input.toLowerCase().endsWith("t"))
		{
			mul = 50;
			tag = "t";
		}

		else if(input.toLowerCase().endsWith("s"))
		{
			mul = 1000;
			tag = "s";
		}

		else if(input.toLowerCase().endsWith("m"))
		{
			mul = 1000 * 60;
			tag = "m";
		}

		else if(input.toLowerCase().endsWith("h"))
		{
			mul = 1000 * 60 * 60;
			tag = "h";
		}

		else if(input.toLowerCase().endsWith("d"))
		{
			mul = 1000 * 60 * 60 * 24;
			tag = "d";
		}

		String trimmed = input.toLowerCase().substring(0, input.length() - tag.length()).trim();

		try
		{
			double d = Double.valueOf(trimmed);
			ms = (long) (d * mul);

			return ms;
		}

		catch(NumberFormatException e)
		{
			return 1000;
		}
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		if(!Config.DATALOG_ENABLED)
		{
			Gate.msgError(sender, "DataLogging is not enabled.");
			return;
		}

		Profiler p = new Profiler();
		p.begin();
		Gate.msgActing(sender, "Please Wait, This may take some time.");
		GList<SampledType> ssx = new GList<SampledType>();
		GList<Long> times = new GList<Long>();

		for(String i : args)
		{
			SampledType ss = null;

			try
			{
				ss = SampledType.valueOf(i.toUpperCase());
			}

			catch(Throwable e)
			{
				ss = null;
			}

			if(ss == null && times.size() < 2)
			{
				times.add(parseTime(i));
			}

			else if(ss != null)
			{
				ssx.add(ss);
			}
		}

		ssx.removeDuplicates();

		new A()
		{
			@Override
			public void run()
			{
				try
				{
					Whiteboard w = new Whiteboard((int) (1920), (int) (1080), times.size() > 0 ? times.get(0) : 60000, times.size() > 1 ? times.get(1) : M.ms(), ssx.toArray(new SampledType[ssx.size()]));
					File f = w.save();

					new S("")
					{
						@Override
						public void run()
						{
							p.end();
							Gate.msgSuccess(sender, "Saved to " + C.WHITE + " React/cache/" + f.getName());
						}
					};
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
	}
}
