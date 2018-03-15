package com.volmit.react.command;

import java.io.File;

import org.bukkit.command.CommandSender;

import com.volmit.react.Config;
import com.volmit.react.E;
import com.volmit.react.Info;
import com.volmit.react.Main;
import com.volmit.react.React;
import com.volmit.react.Surge;
import com.volmit.react.api.Gate;
import com.volmit.react.api.Permissable;
import com.volmit.react.api.ReactCommand;
import com.volmit.react.api.SideGate;
import com.volmit.react.util.Anchor;

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
				E.t(e);
			}
		}

		Main.reload();
		Gate.msgSuccess(sender, "React Reloaded");
	}
}
