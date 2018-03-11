package react.command;

import org.bukkit.command.CommandSender;

import com.volmit.react.util.Anchor;

import react.Gate;
import react.Info;
import react.api.CPUBenchmark;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;

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
