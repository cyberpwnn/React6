package com.volmit.react.controller;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.volmit.react.Config;
import com.volmit.react.E;
import com.volmit.react.Info;
import com.volmit.react.Lang;
import com.volmit.react.React;
import com.volmit.react.Surge;
import com.volmit.react.api.Gate;
import com.volmit.react.api.ICommand;
import com.volmit.react.api.IGoal;
import com.volmit.react.api.Permissable;
import com.volmit.react.api.RAI;
import com.volmit.react.api.SampledType;
import com.volmit.react.api.Side;
import com.volmit.react.api.SideGate;
import com.volmit.react.command.CommandAccept;
import com.volmit.react.command.CommandAccess;
import com.volmit.react.command.CommandAct;
import com.volmit.react.command.CommandActionLog;
import com.volmit.react.command.CommandCPUScore;
import com.volmit.react.command.CommandCapabilities;
import com.volmit.react.command.CommandChunkBlame;
import com.volmit.react.command.CommandChunkTP;
import com.volmit.react.command.CommandDump;
import com.volmit.react.command.CommandEnvironment;
import com.volmit.react.command.CommandFix;
import com.volmit.react.command.CommandGlasses;
import com.volmit.react.command.CommandHelp;
import com.volmit.react.command.CommandMap;
import com.volmit.react.command.CommandMonitor;
import com.volmit.react.command.CommandPing;
import com.volmit.react.command.CommandReload;
import com.volmit.react.command.CommandRequests;
import com.volmit.react.command.CommandRevoke;
import com.volmit.react.command.CommandStatus;
import com.volmit.react.command.CommandSubscribe;
import com.volmit.react.command.CommandTopChunk;
import com.volmit.react.command.CommandUnsubscribe;
import com.volmit.react.command.CommandVersion;
import com.volmit.react.util.C;
import com.volmit.react.util.Controller;
import com.volmit.react.util.F;
import com.volmit.react.util.GList;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.M;

public class CommandController extends Controller implements Listener, CommandExecutor
{
	private GList<ICommand> commands;
	private boolean k;

	@Override
	public void dump(JSONObject object)
	{
		object.put("commands-loaded", commands.size());
	}

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
		commands.add(new CommandAccept());
		commands.add(new CommandAccess());
		commands.add(new CommandAct());
		commands.add(new CommandActionLog());
		commands.add(new CommandCapabilities());
		commands.add(new CommandChunkBlame());
		commands.add(new CommandChunkTP());
		commands.add(new CommandCPUScore());
		commands.add(new CommandDump());
		commands.add(new CommandEnvironment());
		commands.add(new CommandFix());
		commands.add(new CommandGlasses());
		commands.add(new CommandHelp());
		commands.add(new CommandMap());
		commands.add(new CommandMonitor());
		commands.add(new CommandPing());
		commands.add(new CommandReload());
		commands.add(new CommandRequests());
		commands.add(new CommandRevoke());
		commands.add(new CommandStatus());
		commands.add(new CommandSubscribe());
		commands.add(new CommandTopChunk());
		commands.add(new CommandUnsubscribe());
		commands.add(new CommandVersion());
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
		Gate.msgError(s, msg);
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

			if(!(a.length >= 1 && (a[0].equalsIgnoreCase(Info.COMMAND_PING) || a[0].equalsIgnoreCase(Info.COMMAND_PING_ALIAS_1) || a[0].equalsIgnoreCase(Info.COMMAND_PING_ALIAS_2) || a[0].equalsIgnoreCase(Info.COMMAND_TEMPACCESS) || a[0].equalsIgnoreCase(Info.COMMAND_TEMPACCESS_ALIAS_1) || a[0].equalsIgnoreCase(Info.COMMAND_TEMPACCESS_ALIAS_2))))
			{
				if(!Permissable.ACCESS.has(s))
				{
					f(s, Info.MSG_PERMISSION);
					return true;
				}
			}

			if(a.length == 0)
			{
				onCommand(plr ? px : s, c, n, new String[] {"?"}); //$NON-NLS-1$
				return true;
			}

			if(a.length == 1 && a[0].length() == 1 && Character.isDigit(a[0].charAt(0)))
			{
				try
				{
					Integer ii = Integer.valueOf(a[0]);
					onCommand(plr ? px : s, c, n, new String[] {"?", ii + ""}); //$NON-NLS-1$
					return true;
				}

				catch(Throwable e)
				{
					E.t(e);
				}
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
		if(e.getMessage().toLowerCase().equalsIgnoreCase("/tps") || e.getMessage().toLowerCase().equalsIgnoreCase("/lag"))
		{
			if(Permissable.ACCESS.has(e.getPlayer()) && Config.COMMANDOVERRIDES_TPS)
			{
				Gate.msgSuccess(e.getPlayer(), "Current TPS: " + C.GREEN + SampledType.TPS.get().get() + C.GRAY + " (" + C.GREEN + F.f(SampledType.TICK.get().getValue(), 1) + C.GRAY + ")");
				e.setCancelled(true);
			}
		}

		if(e.getMessage().toLowerCase().equalsIgnoreCase("/mem") || e.getMessage().toLowerCase().equalsIgnoreCase("/memory") || e.getMessage().toLowerCase().equalsIgnoreCase("/gc"))
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
