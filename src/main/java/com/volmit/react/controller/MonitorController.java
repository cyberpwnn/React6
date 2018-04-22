package com.volmit.react.controller;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import com.volmit.react.Config;
import com.volmit.react.Info;
import com.volmit.react.Lang;
import com.volmit.react.React;
import com.volmit.react.ReactPlugin;
import com.volmit.react.Surge;
import com.volmit.react.api.Capability;
import com.volmit.react.api.Gate;
import com.volmit.react.api.MonitorHeading;
import com.volmit.react.api.Permissable;
import com.volmit.react.api.ReactPlayer;
import com.volmit.react.api.SampledType;
import com.volmit.react.api.TitleMonitor;
import com.volmit.react.util.AsyncTick;
import com.volmit.react.util.C;
import com.volmit.react.util.Controller;
import com.volmit.react.util.D;
import com.volmit.react.util.F;
import com.volmit.react.util.GMap;
import com.volmit.react.util.GSound;
import com.volmit.react.util.JSONObject;
import com.volmit.react.util.M;
import com.volmit.react.util.MSound;
import com.volmit.react.util.NMSX;
import com.volmit.react.util.PhantomSlate;
import com.volmit.react.util.S;
import com.volmit.react.util.TICK;
import com.volmit.react.util.TaskLater;

@AsyncTick
public class MonitorController extends Controller
{
	public static int maxCooldown = 4;
	private TitleMonitor titleMonitor;
	private GMap<Player, Integer> posts;
	private PhantomSlate sb;
	private boolean ready;

	@Override
	public void dump(JSONObject object)
	{
		object.put("posting", posts.size());
	}

	public MonitorController()
	{
		ready = false;
		posts = new GMap<Player, Integer>();
		titleMonitor = new TitleMonitor();
	}

	@Override
	public void start()
	{
		File f = new File(new File(ReactPlugin.i.getDataFolder(), "cache"), "WIPE");

		if(f.exists())
		{
			f.delete();

			File c = new File(ReactPlugin.i.getDataFolder(), "cache");

			for(File i : c.listFiles())
			{
				i.delete();
			}
		}

		Surge.register(this);

		constructMonitor();

		for(Player i : Bukkit.getOnlinePlayers())
		{
			if(canMonitor(i) || canActionLog(i))
			{
				React.instance.playerController.getPlayer(i);
			}
		}

		D.v("Setup Monitor and Action Log"); //$NON-NLS-1$

		new TaskLater("waiter-sb") //$NON-NLS-1$
		{
			@Override
			public void run()
			{
				sb = constructActionLogBoard();
				ready = true;

				for(Player i : Bukkit.getOnlinePlayers())
				{
					if(React.instance.playerController.has(i) && canActionLog(i))
					{
						if(isActionLogging(i))
						{
							startActionLogging(i);
						}
					}
				}
			}
		};
	}

	private PhantomSlate constructActionLogBoard()
	{
		return new PhantomSlate(C.LIGHT_PURPLE + Lang.getString("controller.action-log.scoreboard-name")); //$NON-NLS-1$
	}

	public void toggleActionLog(Player p)
	{
		if(!canActionLog(p))
		{
			return;
		}

		if(isActionLogging(p))
		{
			stopActionLogging(p);
			Gate.msgSuccess(p, Info.MSG_ACTIONLOGGING_STOPPED);
			React.instance.playerController.requestSave(p, false);
		}

		else
		{
			startActionLogging(p);
			Gate.msgSuccess(p, Info.MSG_ACTIONLOGGING_STARTED);
			React.instance.playerController.requestSave(p, false);
		}
	}

	public void toggleMonitoring(Player p)
	{
		if(!canMonitor(p))
		{
			return;
		}

		if(isMonitoring(p))
		{
			stopMonitoring(p);
			Gate.msgSuccess(p, Info.MSG_MONITORING_STOPPED);
			React.instance.playerController.requestSave(p, false);
		}

		else
		{
			startMonitoring(p);
			Gate.msgSuccess(p, Info.MSG_MONITORING_STARTED);
			React.instance.playerController.requestSave(p, false);
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);

		for(Player i : Bukkit.getOnlinePlayers())
		{
			if(isActionLogging(i))
			{
				sb.removeViewer(i);
			}
		}
	}

	public void constructMonitor()
	{
		MonitorHeading tick = new MonitorHeading(Info.NAME_TICK, React.instance.sampleController.getSampler(SampledType.TPS.toString()));
		tick.addSampler(React.instance.sampleController.getSampler(SampledType.TICK.toString()));
		tick.addSampler(React.instance.sampleController.getSampler(SampledType.CPU.toString()));

		MonitorHeading memory = new MonitorHeading(Info.NAME_MEMORY, React.instance.sampleController.getSampler(SampledType.MEM.toString()));
		memory.addSampler(React.instance.sampleController.getSampler(SampledType.MAHS.toString()));
		memory.addSampler(React.instance.sampleController.getSampler(SampledType.MEMTOTALS.toString()));

		MonitorHeading chunks = new MonitorHeading(Info.NAME_CHUNKS, React.instance.sampleController.getSampler(SampledType.CHK.toString()));
		chunks.addSampler(React.instance.sampleController.getSampler(SampledType.CHKS.toString()));

		MonitorHeading entities = new MonitorHeading(Info.NAME_ENTITIES, React.instance.sampleController.getSampler(SampledType.ENT.toString()));
		entities.addSampler(React.instance.sampleController.getSampler(SampledType.ENTLIV.toString()));
		entities.addSampler(React.instance.sampleController.getSampler(SampledType.ENTDROP.toString()));
		entities.addSampler(React.instance.sampleController.getSampler(SampledType.ENTTILE.toString()));

		titleMonitor.addHeading(tick);
		titleMonitor.addHeading(memory);
		titleMonitor.addHeading(chunks);
		titleMonitor.addHeading(entities);
	}

	public float calcVolume(ReactPlayer i)
	{
		i.setPlays(i.getPlays() > 50 ? 50 : i.getPlays());
		float volume = 0.5f;
		int plays = (int) M.clip(i.getPlays(), 0, 20);
		volume -= ((float) plays / 20f) * 0.4f;

		return volume;
	}

	public boolean canMonitor(Player p)
	{
		return (Permissable.ACCESS.has(p) && Permissable.MONITOR_TITLE.has(p)) || p.isOp();
	}

	public boolean canActionLog(Player p)
	{
		return (Permissable.ACCESS.has(p) && Permissable.MONITOR_ACTIONLOG.has(p)) || p.isOp();
	}

	public boolean isMonitoring(Player p)
	{
		if(canMonitor(p))
		{
			return React.instance.playerController.getPlayer(p).isMonitoring();
		}

		return false;
	}

	public boolean isActionLogging(Player p)
	{
		if(canActionLog(p))
		{
			return React.instance.playerController.getPlayer(p).isActionlogging();
		}

		return false;
	}

	public void startMonitoring(Player p)
	{
		if(canMonitor(p) && !isMonitoring(p))
		{
			React.instance.playerController.getPlayer(p).setMonitoring(true);
		}
	}

	public void stopMonitoring(Player p)
	{
		if(canMonitor(p) && isMonitoring(p))
		{
			React.instance.playerController.getPlayer(p).setMonitoring(false);
			NMSX.sendActionBar(p, "    "); //$NON-NLS-1$
		}

		if(React.instance.playerController.has(p) && !canMonitor(p))
		{
			React.instance.playerController.getPlayer(p).setMonitoring(false);
			NMSX.sendActionBar(p, "    "); //$NON-NLS-1$
		}
	}

	public void startActionLogging(Player p)
	{
		if(canActionLog(p))
		{
			React.instance.playerController.getPlayer(p).setActionlogging(true);
			sb.addViewer(p);
		}
	}

	public void stopActionLogging(Player p)
	{
		if(canActionLog(p) && isActionLogging(p))
		{
			React.instance.playerController.getPlayer(p).setActionlogging(false);
			sb.removeViewer(p);
		}

		if(React.instance.playerController.has(p) && !canActionLog(p))
		{
			React.instance.playerController.getPlayer(p).setActionlogging(false);
			sb.removeViewer(p);
		}
	}

	@Override
	public void tick()
	{

	}

	private void changePost(ReactPlayer i)
	{
		i.setMonitorPosted(!i.getMonitorPosted());
		i.setLastSwt(5);

		if(Config.SOUNDS)
		{
			if(i.getMonitorPosted())
			{
				new GSound(MSound.FALL_SMALL.bukkitSound(), calcVolume(i), 1.9f).play(i.getP());
			}

			else
			{
				new GSound(MSound.FALL_SMALL.bukkitSound(), calcVolume(i), 1.9f).play(i.getP());
			}
		}

		i.setPlays(i.getPlays() + 3);
	}

	private void processPlayer(ReactPlayer i)
	{
		if(isActionLogging(i.getP()))
		{
			handleActionLog(i.getP());
		}

		if(isMonitoring(i.getP()))
		{
			handlePosting(i);
			handleShifting(i);
			handleScrolling(i);
			handleTriggers(i);
		}
	}

	private void handleActionLog(Player p)
	{

	}

	private void handleTriggers(ReactPlayer i)
	{
		if(i.isShifting())
		{
			TitleMonitor tm = React.instance.monitorController.getTitleMonitor();
			int nsel = i.getMonitorSelection();

			if(i.getScroll() == 1)
			{
				nsel = tm.right(nsel);
			}

			if(i.getScroll() == -1)
			{
				nsel = tm.left(nsel);
			}

			if(i.getMonitorSelection() != nsel && !i.getMonitorPosted())
			{
				i.setSwitchNotification(maxCooldown);

				if(Config.SOUNDS)
				{
					new GSound(MSound.HORSE_WOOD.bukkitSound(), calcVolume(i), 1.9f).play(i.getP());
				}

				i.setPlays(i.getPlays() + 3);
			}

			i.setMonitorSelection(nsel);
		}
	}

	private void handleScrolling(ReactPlayer i)
	{
		int lhot = i.getHotbarSlot();
		int hot = i.getP().getInventory().getHeldItemSlot();
		int right = hot - lhot;
		int left = lhot - hot;

		if(right != left && right != 0 && left != 0)
		{
			if(right == -8)
			{
				i.setScroll(1);
			}

			else if(left == -8)
			{
				i.setScroll(-1);
			}

			else if(right == Math.max(left, right))
			{
				i.setScroll(1);
			}

			else if(left == Math.max(left, right))
			{
				i.setScroll(-1);
			}

			else
			{
				i.setScroll(0);
			}
		}

		else
		{
			i.setScroll(0);
		}

		i.setHotbarSlot(hot);
	}

	private void handleShifting(ReactPlayer i)
	{
		double height = i.getP().getLocation().getY();
		i.setHeightMovement(false);
		i.setLastHeight(height);
		boolean sh = i.getP().isSneaking() && (!i.isHeightMovement() || !i.getP().isFlying());
		boolean osh = i.isShifting();

		if(i.getMonitorPosted())
		{
			return;
		}

		if(sh != osh)
		{
			if(sh)
			{
				i.setMonitorSelection(i.getMonitorLastSelection());
				i.setSwitchNotification(maxCooldown);

				if(Config.SOUNDS)
				{
					new GSound(MSound.DIG_WOOL.bukkitSound(), calcVolume(i), 1.9f).play(i.getP());
				}

				i.setPlays(i.getPlays() + 3);
			}

			else
			{
				i.setMonitorLastSelection(i.getMonitorSelection());
				i.setMonitorSelection(-1);

				if(Config.SOUNDS)
				{
					new GSound(MSound.DIG_WOOL.bukkitSound(), calcVolume(i), 1.5f).play(i.getP());
				}

				i.setPlays(i.getPlays() + 3);
			}
		}

		i.setSwitchNotification(i.getSwitchNotification() > 0 ? i.getSwitchNotification() - 1 : 0);
		i.setShifting(sh);
	}

	private void handlePosting(ReactPlayer i)
	{
		if(!posts.containsKey(i.getP()))
		{
			return;
		}

		if(!isMonitoring(i.getP()))
		{
			return;
		}

		posts.put(i.getP(), posts.get(i.getP()) - 1);

		if(posts.get(i.getP()) >= 11)
		{
			posts.remove(i.getP());
			changePost(i);
		}

		else if(posts.get(i.getP()) < 0)
		{
			posts.remove(i.getP());
		}
	}

	public String prefixFor(ReactPlayer rp, int sel, int cd)
	{
		if(sel == -1)
		{
			return ""; //$NON-NLS-1$
		}

		double pct = (double) cd / (double) maxCooldown;
		String acolor = titleMonitor.getHeadFor(sel).getHead().getColor() + ""; //$NON-NLS-1$

		if(pct > 0.6)
		{
			return acolor + C.BOLD;
		}

		if(pct > 0.3)
		{
			return acolor;
		}

		return C.DARK_GRAY + ""; //$NON-NLS-1$
	}

	public String prefixForSub(ReactPlayer rp, C color, int cd)
	{
		double pct = (double) cd / (double) maxCooldown;
		pct = 1.0 - pct;
		String acolor = color + ""; //$NON-NLS-1$

		if(pct > 0.6)
		{
			return acolor;
		}

		if(pct > 0.3)
		{
			return acolor + C.BOLD;
		}

		return C.DARK_GRAY + "" + C.BOLD; //$NON-NLS-1$
	}

	public void tickMonitor(ReactPlayer rp)
	{
		if(Capability.TITLE_BAR.isCapable())
		{
			Player p = rp.getP();
			boolean high = rp.highMonitor;
			int sel = rp.getMonitorSelection();

			if(sel < 0 && high)
			{
				String m = prefixFor(rp, sel, rp.getSwitchNotification());
				String v = sel != -1 ? (rp.getSwitchNotification() > 0 ? (m + titleMonitor.getHeadFor(sel).getName()) : "  ") : "  "; //$NON-NLS-1$ //$NON-NLS-2$
				NMSX.sendTitle(p, 0, 5, 0, v, titleMonitor.getHotbarFor(sel, rp.isShift(), rp));
			}

			else if(sel >= 0 && high)
			{
				String k = titleMonitor.getHotbarHeadFor(sel, rp.isShift(), this, rp, rp.getSwitchNotification());
				String m = prefixFor(rp, sel, rp.getSwitchNotification());
				String v = sel != -1 ? (rp.getSwitchNotification() > 0 ? (m + titleMonitor.getHeadFor(sel).getName()) : "  ") : "  "; //$NON-NLS-1$ //$NON-NLS-2$
				NMSX.sendTitle(p, 0, 5, 0, v, k);
			}

			else
			{
				if(Capability.ACTION_BAR.isCapable())
				{
					String lck = "";
					String rck = "";

					if(rp.getMonitorPosted())
					{
						C z = C.LIGHT_PURPLE;
						lck = C.RESET + "" + z + "\u2193";
						rck = C.RESET + "" + z + "\u2193";
					}

					NMSX.sendActionBar(p, lck + " " + titleMonitor.getHotbarFor(rp.getMonitorPosted() ? -1 : sel, rp.isShift(), rp) + " " + rck);
					String k = titleMonitor.getHotbarHeadFor(sel, rp.isShift() && !rp.getMonitorPosted(), this, rp, rp.getSwitchNotification());
					String m = prefixFor(rp, rp.getMonitorPosted() ? -1 : sel, rp.getSwitchNotification());
					String v = sel != -1 ? (rp.getSwitchNotification() > 0 ? (m + titleMonitor.getHeadFor(sel).getName()) : "  ") : "  "; //$NON-NLS-1$ //$NON-NLS-2$

					if(rp.getLastSwt() > 0)
					{
						rp.setLastSwt(rp.getLastSwt() - 1);
						v = rp.getMonitorPosted() ? "Locked" : "Unlocked";

						if(rp.getLastSwt() > 3)
						{
							v = C.LIGHT_PURPLE + "" + C.BOLD + v;
						}

						else if(rp.getLastSwt() > 2)
						{
							v = C.LIGHT_PURPLE + "" + v;
						}

						else if(rp.getLastSwt() > 1)
						{
							v = C.DARK_GRAY + "" + v;
						}

						else
						{
							v = "";
						}
					}

					else if(rp.getMonitorPosted())
					{
						v = "";
					}

					NMSX.sendTitle(p, 0, 5, 0, v, k);
				}
			}
		}
	}

	public TitleMonitor getTitleMonitor()
	{
		return titleMonitor;
	}

	@EventHandler
	public void on(PlayerJoinEvent e)
	{
		if(canMonitor(e.getPlayer()) || canActionLog(e.getPlayer()))
		{
			React.instance.playerController.getPlayer(e.getPlayer());
		}

		if(isActionLogging(e.getPlayer()))
		{
			startActionLogging(e.getPlayer());
		}
	}

	@EventHandler
	public void on(PlayerToggleSneakEvent e)
	{
		if(!Config.DOUBLE_LOCK_SNEAK)
		{
			return;
		}

		if(canMonitor(e.getPlayer()) && isMonitoring(e.getPlayer()))
		{
			if(!posts.containsKey(e.getPlayer()))
			{
				posts.put(e.getPlayer(), 0);
			}

			posts.put(e.getPlayer(), posts.get(e.getPlayer()) + 5);
		}
	}

	public void onTickAsync()
	{
		if(TICK.tick % 3 == 0)
		{
			updateActionBoard();
		}

		for(ReactPlayer i : React.instance.playerController.getPlayers())
		{
			processPlayer(i);

			if(i.isMonitoring())
			{
				tickMonitor(i);
			}

			i.setPlays(i.getPlays() > 0 ? i.getPlays() - 2 : 0);

			if(i.isActionlogging() && !Permissable.MONITOR_ACTIONLOG.has(i.getP()))
			{
				Gate.msgError(i.getP(), "You no longer have permission to action log.");

				new S("stop-alog")
				{
					@Override
					public void run()
					{
						stopActionLogging(i.getP());
					}
				};
			}

			if(i.isMonitoring() && !Permissable.MONITOR_TITLE.has(i.getP()))
			{
				Gate.msgError(i.getP(), "You no longer have permission to monitor");

				new S("stop-mon")
				{
					@Override
					public void run()
					{
						stopMonitoring(i.getP());
					}
				};
			}

			if(i.isMapping() && !Permissable.MONITOR_MAP.has(i.getP()))
			{
				Gate.msgError(i.getP(), "You no longer have permission to map");

				new S("stop-graph")
				{
					@Override
					public void run()
					{
						React.instance.graphController.stopMapping(i.getP());
					}
				};
			}

		}
	}

	private void updateActionBoard()
	{
		new S("action-board-update")
		{
			@Override
			public void run()
			{
				if(!ready)
				{
					return;
				}

				sb.clearLines();

				int total = 0;
				total += SampledType.FLUID_SECOND.get().getValue();
				total += SampledType.HOPPER_SECOND.get().getValue();
				total += SampledType.REDSTONE_SECOND.get().getValue();
				double use = SampledType.MEM.get().getValue() / SampledType.MAXMEM.get().getValue();
				sb.addLine(C.BLACK + "" + C.STRIKETHROUGH + F.repeat("-", 20));
				sb.addLine(C.GREEN + SampledType.TPS.get().get() + " (" + SampledType.TICK.get().get() + ") " + SampledType.CPU.get().get());
				sb.addLine(C.GOLD + SampledType.MEM.get().get() + " (" + F.pc(use, 1) + ") " + SampledType.MAHS.get().get());
				sb.addLine(C.RED + SampledType.CHK.get().get() + " " + SampledType.CHKS.get().get() + " (" + SampledType.CHK_TIME.get().get() + ")");
				sb.addLine(C.AQUA + SampledType.ENT.get().get() + " (" + SampledType.ENTLIV.get().get() + " " + SampledType.ENTDROP.get().get() + " " + SampledType.ENTTILE.get().get() + ")");
				sb.addLine(C.LIGHT_PURPLE + "ENT: " + C.WHITE + C.BOLD + SampledType.ENTITY_TIME.get().get() + C.RESET + "" + C.WHITE + " (" + SampledType.ENTITY_TIME_LOCK.get().get() + "c)");
				sb.addLine(C.LIGHT_PURPLE + "TILE: " + C.WHITE + C.BOLD + SampledType.TILE_TIME.get().get() + C.RESET + "" + C.WHITE + " (" + SampledType.TILE_TIME.get().get() + "c)");
				sb.addLine(C.LIGHT_PURPLE + "CHK: " + C.WHITE + C.BOLD + SampledType.CHK_TIME.get().get() + C.RESET + "" + C.WHITE + " (" + SampledType.CHKS.get().get() + ")");
				sb.addLine(C.LIGHT_PURPLE + "PHY: " + C.WHITE + C.BOLD + SampledType.PHYSICS_TIME.get().get() + C.RESET + "" + C.WHITE + " (" + F.f(total) + "/s)");
				sb.addLine(C.LIGHT_PURPLE + "REDS: " + C.WHITE + C.BOLD + SampledType.REDSTONE_TIME.get().get() + C.RESET + "" + C.WHITE + " (" + SampledType.REDSTONE_SECOND.get().get() + ")");
				sb.addLine(C.LIGHT_PURPLE + "HOPP: " + C.WHITE + C.BOLD + SampledType.HOPPER_TIME.get().get() + C.RESET + "" + C.WHITE + " (" + SampledType.HOPPER_SECOND.get().get() + ")");
				sb.addLine(C.LIGHT_PURPLE + "LIQ: " + C.WHITE + C.BOLD + SampledType.FLUID_TIME.get().get() + C.RESET + "" + C.WHITE + " (" + SampledType.FLUID_SECOND.get().get() + ")");
				sb.update();
			}
		};
	}

	public void doLock(Player p)
	{
		if(isMonitoring(p))
		{
			changePost(React.instance.playerController.getPlayer(p));
		}
	}
}
