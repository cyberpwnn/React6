package react.controller;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.cyberpwn.gformat.F;
import org.cyberpwn.glang.GList;
import org.cyberpwn.gmath.M;

import react.Config;
import react.Gate;
import react.Info;
import react.Lang;
import react.React;
import react.api.ICommand;
import react.api.Permissable;
import react.api.SampledType;
import react.api.Side;
import react.api.SideGate;
import react.rai.IGoal;
import react.rai.RAI;
import surge.Main;
import surge.Surge;
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
		Bukkit.getPluginCommand(Info.COMMAND_RAI).setExecutor(this);
		Surge.register(this);
		commands = new GList<ICommand>();

		for(Class<?> i : Main.anchors.get(0))
		{
			try
			{
				Object c = i.getConstructor().newInstance();
				commands.add((ICommand) c);
				D.v("@Command " + c.getClass().getSimpleName()); //$NON-NLS-1$
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
		Gate.msg(s, msg);
	}

	public void f(CommandSender s, String msg)
	{
		msg(s, C.RED + msg);
	}

	@Override
	public boolean onCommand(CommandSender s, Command c, String n, String[] a)
	{
		if(c.getName().equalsIgnoreCase(Info.COMMAND_RAI))
		{
			if(!Permissable.ACCESS.has(s))
			{
				f(s, Info.MSG_PERMISSION);
				return true;
			}

			if(!Permissable.RAI_ACCESS.has(s))
			{
				f(s, Info.MSG_PERMISSION);
				return true;
			}

			if(a.length == 0)
			{
				s.sendMessage(Gate.header(C.AQUA + "RAI", C.LIGHT_PURPLE)); //$NON-NLS-1$
				s.sendMessage(C.LIGHT_PURPLE + "/rai " + C.WHITE + "toggle" + C.GRAY + " - Toggle RAI on or off"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				s.sendMessage(C.LIGHT_PURPLE + "/rai " + C.WHITE + "status" + C.GRAY + " - Get RAI's Status"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				s.sendMessage(Gate.header(C.LIGHT_PURPLE));
			}

			else if(a[0].equalsIgnoreCase("toggle")) //$NON-NLS-1$
			{
				if(!Permissable.RAI_CONTROL.has(s))
				{
					f(s, Info.MSG_PERMISSION);
					return true;
				}

				React.instance.raiController.raiEnabled = !React.instance.raiController.raiEnabled;
				Gate.msgRAI(s, React.instance.raiController.raiEnabled ? Lang.getString("message.rai-online") : Lang.getString("message.rai-offline")); //$NON-NLS-1$ //$NON-NLS-2$
			}

			else if(a[0].equalsIgnoreCase("status")) //$NON-NLS-1$
			{
				if(!Permissable.RAI_MONITOR.has(s))
				{
					f(s, Info.MSG_PERMISSION);
					return true;
				}

				int m = 0;
				int f = 0;

				for(IGoal i : RAI.instance.getGoals())
				{
					for(IGoal j : i.getSubgoals())
					{
						m++;

						if(j.isFailing())
						{
							f++;
						}
					}

					m++;

					if(i.isFailing())
					{
						f++;
					}
				}

				s.sendMessage(Gate.header(C.AQUA + Lang.getString("message.rai-status"), C.LIGHT_PURPLE)); //$NON-NLS-1$
				s.sendMessage(Lang.getString("message.goal.goals") + C.WHITE + (m - f) + " / " + m + C.GRAY + Lang.getString("message.goal.achieved-sp")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				s.sendMessage(F.f(RAI.instance.getEvents().size()) + Lang.getString("message.goal.interventions-in-past") + F.timeLong(M.ms() - RAI.instance.since, 0)); //$NON-NLS-1$

				for(IGoal i : RAI.instance.getGoals())
				{
					s.sendMessage(C.WHITE + i.getTag() + C.GRAY + " -> " + (i.isFailing() ? C.RED + Lang.getString("message.goal.failing") : C.GREEN + Lang.getString("message.goal.achieved"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

					for(IGoal j : i.getSubgoals())
					{
						s.sendMessage("  " + C.WHITE + j.getTag() + C.GRAY + " -> " + (j.isFailing() ? C.RED + Lang.getString("message.goal.failing") : C.GREEN + Lang.getString("message.goal.achieved"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
					}
				}

				s.sendMessage(Gate.header(C.LIGHT_PURPLE));
			}
		}

		else if(c.getName().equalsIgnoreCase(Info.COMMAND_REACT))
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
				onCommand(plr ? px : s, c, n, new String[] {"?"}); //$NON-NLS-1$
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
					f(s, Lang.getString("message.failure.does-not-support-side") + side.ss()); //$NON-NLS-1$
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
				onCommand(plr ? px : s, c, n, new String[] {"?"}); //$NON-NLS-1$
				return true;
			}
		}

		return false;
	}

	@EventHandler
	public void on(PlayerCommandPreprocessEvent e)
	{
		if(e.getMessage().toLowerCase().startsWith("/tps") || e.getMessage().toLowerCase().startsWith("/lag"))
		{
			if(Permissable.ACCESS.has(e.getPlayer()) && Config.COMMANDOVERRIDES_TPS)
			{
				Gate.msgSuccess(e.getPlayer(), "Current TPS: " + C.GREEN + SampledType.TPS.get().get() + C.GRAY + " (" + C.GREEN + F.f(SampledType.TICK.get().getValue(), 1) + C.GRAY + ")");
				e.setCancelled(true);
			}
		}

		if(e.getMessage().toLowerCase().startsWith("/mem") || e.getMessage().toLowerCase().startsWith("/memory") || e.getMessage().toLowerCase().startsWith("/gc"))
		{
			if(Permissable.ACCESS.has(e.getPlayer()) && Config.COMMANDOVERRIDES_MEMORY)
			{
				Gate.msgSuccess(e.getPlayer(), "Current Memory Usage: " + C.GOLD + SampledType.MEM.get().get() + C.GRAY + " (" + C.GOLD + F.pc(SampledType.MEM.get().getValue() / SampledType.MAXMEM.get().getValue(), 0) + "ms" + C.GRAY + ")");
				e.setCancelled(true);
			}
		}
	}

	public GList<ICommand> getCommands()
	{
		return commands;
	}

	public void setCommands(GList<ICommand> commands)
	{
		this.commands = commands;
	}

	public boolean isK()
	{
		return k;
	}

	public void setK(boolean k)
	{
		this.k = k;
	}
}
