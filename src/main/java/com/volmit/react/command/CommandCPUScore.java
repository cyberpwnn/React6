package com.volmit.react.command;

import org.bukkit.command.CommandSender;

import com.volmit.react.Info;
import com.volmit.react.api.CPUBenchmark;
import com.volmit.react.api.Gate;
import com.volmit.react.api.Permissable;
import com.volmit.react.api.ReactCommand;
import com.volmit.react.api.SideGate;
import com.volmit.react.util.Anchor;

@Anchor(0)
public class CommandCPUScore extends ReactCommand
{
	public CommandCPUScore()
	{
		command = Info.COMMAND_CPUSCORE;
		aliases = new String[] {Info.COMMAND_CPUSCORE_ALIAS_1, Info.COMMAND_CPUSCORE_ALIAS_2, "cpu"};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_CPUSCORE_USAGE;
		description = Info.COMMAND_CPUSCORE_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		for(Thread i : Thread.getAllStackTraces().keySet())
		{
			if(i.getClass().equals(CPUBenchmark.class))
			{
				Gate.msgError(sender, "There is already a cpu benchmark running!");
				return;
			}
		}

		new CPUBenchmark(sender).start();
	}
}
