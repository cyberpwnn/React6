package react.command;

import org.bukkit.command.CommandSender;

import react.Info;
import react.api.CPUBenchmark;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.util.Anchor;

@Anchor(0)
public class CommandCPUScore extends ReactCommand
{
	public CommandCPUScore()
	{
		command = Info.COMMAND_CPUSCORE;
		aliases = new String[] {Info.COMMAND_CPUSCORE_ALIAS_1, Info.COMMAND_CPUSCORE_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode()};
		usage = Info.COMMAND_CPUSCORE_USAGE;
		description = Info.COMMAND_CPUSCORE_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		new CPUBenchmark(sender).start();
	}
}