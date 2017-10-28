package react.controller;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

import react.Info;
import react.api.ICommand;
import react.api.Permissable;
import surge.Surge;
import surge.collection.GList;
import surge.control.Controller;
import surge.util.C;
import surge.util.TXT;

public class CommandController extends Controller implements Listener, CommandExecutor
{
	private GList<ICommand> commands;

	@Override
	public void start()
	{
		Surge.getAmp().getPluginInstance().getCommand(Info.COMMAND_REACT).setExecutor(this);
		Surge.register(this);
		commands = new GList<ICommand>();
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{

	}

	public String tag()
	{
		return TXT.makeTag(C.DARK_GRAY, Info.COLOR, C.GRAY, Info.NAME);
	}

	public void msg(CommandSender s, String msg)
	{
		s.sendMessage(tag() + msg);
	}

	public void f(CommandSender s, String msg)
	{
		msg(s, C.RED + msg);
	}

	@Override
	public boolean onCommand(CommandSender s, Command c, String n, String[] a)
	{
		if(c.getName().equalsIgnoreCase(Info.COMMAND_REACT))
		{
			if(!Permissable.ACCESS.has(s))
			{
				f(s, Info.MSG_PERMISSION);
				return true;
			}

			return true;
		}

		return false;
	}
}
