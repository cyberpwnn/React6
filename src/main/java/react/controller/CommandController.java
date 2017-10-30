package react.controller;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import react.Base;
import react.Info;
import react.api.ICommand;
import react.api.Permissable;
import react.api.Side;
import react.api.SideGate;
import surge.Main;
import surge.Surge;
import surge.collection.GList;
import surge.control.Controller;
import surge.util.C;
import surge.util.D;

public class CommandController extends Controller implements Listener, CommandExecutor
{
	private GList<ICommand> commands;
	private boolean k;

	@Override
	public void start()
	{
		k = false;
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	public void begin()
	{
		k = true;
		Bukkit.getPluginCommand(Info.COMMAND_REACT).setExecutor(this);
		Surge.register(this);
		commands = new GList<ICommand>();

		for(Class<?> i : Main.anchors.get(0))
		{
			try
			{
				Object c = i.getConstructor().newInstance();
				commands.add((ICommand) c);
				D.v("@Command " + c.getClass().getSimpleName());
			}

			catch(InstantiationException e)
			{
				e.printStackTrace();
			}

			catch(IllegalAccessException e)
			{
				e.printStackTrace();
			}

			catch(IllegalArgumentException e)
			{
				e.printStackTrace();
			}

			catch(InvocationTargetException e)
			{
				e.printStackTrace();
			}

			catch(NoSuchMethodException e)
			{
				e.printStackTrace();
			}

			catch(SecurityException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public void tick()
	{
		if(!k)
		{
			begin();
		}
	}

	public void msg(CommandSender s, String msg)
	{
		Base.msg(s, msg);
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
			boolean plr = s instanceof Player;
			Player px = plr ? (Player) s : null;

			if(!Permissable.ACCESS.has(s))
			{
				f(s, Info.MSG_PERMISSION);
				return true;
			}

			if(a.length == 0)
			{
				onCommand(plr ? px : s, c, n, new String[] {"?"});
				return true;
			}

			ICommand cmd = null;

			for(ICommand i : commands)
			{
				if(i.getCommand().equalsIgnoreCase(a[0]))
				{
					cmd = i;
					break;
				}
			}

			if(cmd == null)
			{
				br1: for(ICommand i : commands)
				{
					for(String j : i.getAliases())
					{
						if(j.equalsIgnoreCase(a[0]))
						{
							cmd = i;
							break br1;
						}
					}
				}
			}

			if(cmd != null)
			{
				Side side = Side.get(s);
				SideGate gate = cmd.getSideGate();

				if(!gate.supports(side))
				{
					f(s, "This command does not support " + side.ss());
					return true;
				}
			}

			if(cmd != null)
			{
				if(a.length == 1)
				{
					cmd.fire(plr ? px : s, new String[0]);
				}

				else
				{
					String[] args = new String[a.length - 1];

					for(int i = 1; i < a.length; i++)
					{
						args[i - 1] = a[i];
					}

					cmd.fire(plr ? px : s, args);
				}

				return true;
			}

			else
			{
				onCommand(plr ? px : s, c, n, new String[] {"?"});
				return true;
			}
		}

		return false;
	}
}
