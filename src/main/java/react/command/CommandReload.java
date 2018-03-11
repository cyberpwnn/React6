package react.command;

import java.io.File;

import org.bukkit.command.CommandSender;

import com.volmit.react.surge.Main;
import com.volmit.react.surge.Surge;
import com.volmit.react.util.Anchor;

import react.Config;
import react.Gate;
import react.Info;
import react.React;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;

@Anchor(0)
public class CommandReload extends ReactCommand
{
	public CommandReload()
	{
		command = Info.COMMAND_RELOAD;
		aliases = new String[] {Info.COMMAND_RELOAD_ALIAS_1, Info.COMMAND_RELOAD_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.RELOAD.getNode()};
		usage = Info.COMMAND_RELOAD_USAGE;
		description = Info.COMMAND_RELOAD_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
		registerParameterDescription("[options]", "-xconf Reset Configs\n\n-xwconf Reset World Configs\n\n-xcache Wipe Cache");
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		for(String i : args)
		{
			try
			{
				if(i.equalsIgnoreCase("-xconf"))
				{
					Config.resetConfigs();
					Gate.msgSuccess(sender, "Config wipe scheduled.");
				}

				if(i.equalsIgnoreCase("-xcache"))
				{
					new File(new File(Surge.getAmp().getPluginInstance().getDataFolder(), "cache"), "WIPE").mkdirs();
					Gate.msgSuccess(sender, "Cache wipe scheduled.");
				}

				if(i.equalsIgnoreCase("-xwconf"))
				{
					React.instance.worldController.wipe();
					Gate.msgSuccess(sender, "World config wipe scheduled.");
				}
			}

			catch(Throwable e)
			{
				e.printStackTrace();
			}
		}

		Main.reload();
		Gate.msgSuccess(sender, "React Reloaded");
	}
}
