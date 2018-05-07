package com.volmit.react.command;

import org.bukkit.command.CommandSender;

import com.volmit.react.api.Gate;
import com.volmit.react.api.Permissable;
import com.volmit.react.api.ReactCommand;
import com.volmit.react.api.SampledType;
import com.volmit.react.api.SideGate;
import com.volmit.react.controller.SampleController;
import com.volmit.react.util.C;
import com.volmit.react.util.F;

public class CommandMem extends ReactCommand
{
	public CommandMem()
	{
		command = "memory";
		aliases = new String[] {"mem", "ram", "wam"};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_ENVIRONMENT.getNode()};
		usage = "";
		description = "Displays Memory information";
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		showMem(sender);
	}

	public static void showMem(CommandSender sender)
	{
		if(Permissable.ACCESS.has(sender))
		{
			Gate.msgSuccess(sender, "Current Memory Usage: " + C.GOLD + SampledType.MEM.get().get() + C.GRAY + " (" + C.GOLD + F.pc(SampledType.MEM.get().getValue() / SampledType.MAXMEM.get().getValue(), 0) + C.GRAY + ")");
			Gate.msgSuccess(sender, "Maximum: " + C.GOLD + SampledType.MAXMEM.get().get());
			Gate.msgSuccess(sender, "Allocated: " + C.GOLD + SampledType.ALLOCMEM.get().get());
			Gate.msgSuccess(sender, "Free: " + C.GOLD + SampledType.FREEMEM.get().get());
			Gate.msgSuccess(sender, "Total Memory Allocated: " + C.GOLD + F.memSize(SampleController.m.getTotalAllocated(), 3));
			Gate.msgSuccess(sender, "Total Memory Collected: " + C.GOLD + F.memSize(SampleController.m.getTotalCollected(), 3));
		}
	}
}
