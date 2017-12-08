package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.cyberpwn.gconcurrent.S;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.M;

import react.Gate;
import react.Info;
import react.Lang;
import react.React;
import react.api.MonitorHeading;
import react.api.Permissable;
import react.api.ReactPlayer;
import react.api.SampledType;
import react.api.TitleMonitor;
import react.slate.PhantomSlate;
import surge.Surge;
import surge.collection.GSound;
import surge.control.Controller;
import surge.nms.NMSX;
import surge.sched.IMasterTickComponent;
import surge.sched.TaskLater;
import surge.server.AsyncTick;
import surge.util.C;
import surge.util.D;
import surge.util.MSound;

@AsyncTick
public class MonitorController extends Controller implements IMasterTickComponent
{
	public static int maxCooldown = 4;
	private TitleMonitor titleMonitor;
	private GMap<Player, Integer> posts;
	private PhantomSlate sb;
	private boolean ready;

	public MonitorController()
	{
		ready = false;
		posts = new GMap<Player, Integer>();
		titleMonitor = new TitleMonitor();
	}

	@Override
	public void start()
	{
		Surge.register(this);
		Surge.registerTicked(this);

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
		Surge.unregisterTicked(this);

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
		tick.addSampler(React.instance.sampleController.getSampler(SampledType.TIU.toString()));

		MonitorHeading memory = new MonitorHeading(Info.NAME_MEMORY, React.instance.sampleController.getSampler(SampledType.MEM.toString()));
		memory.addSampler(React.instance.sampleController.getSampler(SampledType.MAHS.toString()));

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
		i.setPlays(i.getPlays() > 20 ? 20 : i.getPlays());
		float volume = 0.5f;
		int plays = (int) M.clip(i.getPlays(), 0, 20);
		volume -= ((float) plays / 20f) * 0.49f;

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
		new GSound(MSound.HORSE_GALLOP.bukkitSound(), calcVolume(i), 1.9f).play(i.getP());
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

			if(i.getMonitorSelection() != nsel)
			{
				i.setSwitchNotification(maxCooldown);
				new GSound(MSound.HORSE_LAND.bukkitSound(), calcVolume(i), 1.9f).play(i.getP());
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
		double lheight = i.getLastHeight();
		i.setHeightMovement(Math.abs(lheight - height) > 0.001);
		i.setLastHeight(height);
		boolean sh = i.getP().isSneaking() && (!i.isHeightMovement() || !i.getP().isFlying()) || i.getMonitorPosted();
		boolean osh = i.isShifting();

		if(sh != osh)
		{
			if(sh)
			{
				i.setMonitorSelection(i.getMonitorLastSelection());
				i.setSwitchNotification(maxCooldown);
				new GSound(MSound.HORSE_SADDLE.bukkitSound(), calcVolume(i), 1.9f).play(i.getP());
				i.setPlays(i.getPlays() + 3);
			}

			else
			{
				i.setMonitorLastSelection(i.getMonitorSelection());
				i.setMonitorSelection(-1);
				new GSound(MSound.HORSE_ARMOR.bukkitSound(), calcVolume(i), 1.5f).play(i.getP());
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
		Player p = rp.getP();
		int sel = rp.getMonitorSelection();
		NMSX.sendActionBar(p, titleMonitor.getHotbarFor(sel, rp.isShift()));
		String k = titleMonitor.getHotbarHeadFor(sel, rp.isShift(), this, rp, rp.getSwitchNotification());
		String m = prefixFor(rp, sel, rp.getSwitchNotification());
		String v = sel != -1 ? (rp.getSwitchNotification() > 0 ? (m + titleMonitor.getHeadFor(sel).getName()) : "  ") : "  "; //$NON-NLS-1$ //$NON-NLS-2$
		NMSX.sendTitle(p, 0, 5, 0, v, k);
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
		if(canMonitor(e.getPlayer()) && isMonitoring(e.getPlayer()))
		{
			if(!posts.containsKey(e.getPlayer()))
			{
				posts.put(e.getPlayer(), 0);
			}

			posts.put(e.getPlayer(), posts.get(e.getPlayer()) + 5);
		}
	}

	@Override
	public void onTick()
	{
		updateActionBoard();
		for(ReactPlayer i : React.instance.playerController.getPlayers())
		{
			processPlayer(i);

			if(i.isMonitoring())
			{
				tickMonitor(i);
			}

			i.setPlays(i.getPlays() > 0 ? i.getPlays() - 1 : 0);
		}
	}

	private void updateActionBoard()
	{
		new S()
		{
			@Override
			public void run()
			{
				if(!ready)
				{
					return;
				}

				sb.clearLines();

				sb.addLine(Lang.getString("controller.action-log.queue") + React.instance.actionController.pending.size()); //$NON-NLS-1$

				for(String i : React.instance.actionController.tasks)
				{
					sb.addLine(i);
				}

				sb.update();
			}
		};
	}

	@Override
	public String getTickName()
	{
		return Lang.getString("controller.action-log.monitor"); //$NON-NLS-1$
	}
}
