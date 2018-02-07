package react.command;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import react.Config;
import react.Gate;
import react.Info;
import react.api.Permissable;
import react.api.ReactCommand;
import react.api.SideGate;
import surge.Main;
import surge.util.Anchor;

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
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Config.onRead(Bukkit.getPluginManager().getPlugin("React"));
		Gate.msgSuccess(sender, "Configurations Reloaded");

		if(args.length == 1)
		{
			if(args[0].toLowerCase().equals("-f"))
			{
				Main.requestReload();
				Gate.msgActing(sender, "React Force Reloaded");
			}

			if(args[0].toLowerCase().equals("-xf"))
			{
				new Thread()
				{
					@SuppressWarnings("deprecation")
					@Override
					public void run()
					{
						for(Thread i : Thread.getAllStackTraces().keySet())
						{
							if(i.getName().startsWith("Surge"))
							{
								try
								{
									i.interrupt();
									i.stop();
									i.destroy();
								}

								catch(Throwable e)
								{

								}

								Gate.msgActing(sender, "Destroyed Thread " + i.getName());
							}
						}

						Gate.msgActing(sender, "React Force Destroyed");
					}
				}.start();
			}

			if(args[0].toLowerCase().equals("-xxf"))
			{
				new Thread()
				{
					@SuppressWarnings("deprecation")
					@Override
					public void run()
					{
						for(Thread i : Thread.getAllStackTraces().keySet())
						{
							if(i.getName().startsWith("Surge"))
							{
								try
								{
									i.interrupt();
									i.stop();
									i.destroy();
								}

								catch(Throwable e)
								{

								}

								Gate.msgActing(sender, "Destroyed Thread " + i.getName());
							}
						}

						Gate.msgActing(sender, "React Force Destroyed");
						Main.requestReload();
						Gate.msgActing(sender, "React Force Reloaded");
					}
				}.start();
			}
		}
	}
}
