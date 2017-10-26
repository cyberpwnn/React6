package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import react.React;
import react.api.MonitorHeading;
import react.api.Permissable;
import react.api.ReactPlayer;
import react.api.SampledType;
import react.api.TitleMonitor;
import surge.Surge;
import surge.collection.GSound;
import surge.control.Controller;
import surge.nms.NMSX;
import surge.util.C;
import surge.util.MSound;

public class MonitorController extends Controller
{
	public static int maxCooldown = 4;
	private TitleMonitor titleMonitor;

	public MonitorController()
	{
		titleMonitor = new TitleMonitor();
	}

	@Override
	public void start()
	{
		constructMonitor();
		Surge.register(this);

		for(Player i : Bukkit.getOnlinePlayers())
		{
			if(canMonitor(i))
			{
				React.instance.playerController.getPlayer(i);
			}
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	public void constructMonitor()
	{
		MonitorHeading tick = new MonitorHeading("Tick", React.instance.sampleController.getSampler(SampledType.TPS.toString()));
		tick.addSampler(React.instance.sampleController.getSampler(SampledType.TICK.toString()));
		tick.addSampler(React.instance.sampleController.getSampler(SampledType.TIU.toString()));

		MonitorHeading memory = new MonitorHeading("Memory", React.instance.sampleController.getSampler(SampledType.MEM.toString()));
		memory.addSampler(React.instance.sampleController.getSampler(SampledType.MAHS.toString()));

		MonitorHeading chunks = new MonitorHeading("Chunks", React.instance.sampleController.getSampler(SampledType.CHK.toString()));
		chunks.addSampler(React.instance.sampleController.getSampler(SampledType.CHKS.toString()));

		MonitorHeading entities = new MonitorHeading("Entities", React.instance.sampleController.getSampler(SampledType.ENT.toString()));
		entities.addSampler(React.instance.sampleController.getSampler(SampledType.ENTLIV.toString()));
		entities.addSampler(React.instance.sampleController.getSampler(SampledType.ENTDROP.toString()));
		entities.addSampler(React.instance.sampleController.getSampler(SampledType.ENTTILE.toString()));

		titleMonitor.addHeading(tick);
		titleMonitor.addHeading(memory);
		titleMonitor.addHeading(chunks);
		titleMonitor.addHeading(entities);
	}

	public boolean canMonitor(Player p)
	{
		return (Permissable.ACCESS.has(p) && Permissable.MONITOR_TITLE.has(p)) || p.isOp();
	}

	public boolean isMonitoring(Player p)
	{
		if(canMonitor(p))
		{
			return React.instance.playerController.getPlayer(p).isMonitoring();
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
		}

		if(React.instance.playerController.has(p) && !canMonitor(p))
		{
			React.instance.playerController.getPlayer(p).setMonitoring(false);
		}
	}

	@Override
	public void tick()
	{
		for(ReactPlayer i : React.instance.playerController.getPlayers())
		{
			processPlayer(i);

			if(i.isMonitoring())
			{
				tickMonitor(i);
			}
		}
	}

	private void processPlayer(ReactPlayer i)
	{
		double height = i.getP().getLocation().getY();
		double lheight = i.getLastHeight();
		i.setHeightMovement(Math.abs(lheight - height) > 0.001);
		i.setLastHeight(height);
		boolean sh = i.getP().isSneaking() && (!i.isHeightMovement() || !i.getP().isFlying());
		boolean osh = i.isShifting();

		if(sh != osh)
		{
			if(sh)
			{
				i.setMonitorSelection(i.getMonitorLastSelection());
				i.setSwitchNotification(maxCooldown);
				new GSound(MSound.HORSE_SADDLE.bukkitSound(), 0.7f, 1.9f).play(i.getP());
			}

			else
			{
				i.setMonitorLastSelection(i.getMonitorSelection());
				i.setMonitorSelection(-1);
				new GSound(MSound.HORSE_ARMOR.bukkitSound(), 0.7f, 1.5f).play(i.getP());
			}
		}

		i.setSwitchNotification(i.getSwitchNotification() > 0 ? i.getSwitchNotification() - 1 : 0);
		i.setShifting(sh);
		int lhot = i.getHotbarSlot();
		int hot = i.getP().getInventory().getHeldItemSlot();
		int right = hot - lhot;
		int left = lhot - hot;

		if(right != left && right != 0 && left != 0)
		{
			if(right == Math.max(left, right))
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
				new GSound(MSound.HORSE_LAND.bukkitSound(), 0.5f, 1.9f).play(i.getP());
			}

			i.setMonitorSelection(nsel);
		}
	}

	public String prefixFor(ReactPlayer rp, int sel, int cd)
	{
		if(sel == -1)
		{
			return "";
		}

		double pct = (double) cd / (double) maxCooldown;
		String acolor = titleMonitor.getHeadFor(sel).getHead().getColor() + "";

		if(pct > 0.6)
		{
			return acolor + C.BOLD;
		}

		if(pct > 0.3)
		{
			return acolor;
		}

		return C.DARK_GRAY + "";
	}

	public String prefixForSub(ReactPlayer rp, C color, int cd)
	{
		double pct = (double) cd / (double) maxCooldown;
		pct = 1.0 - pct;
		String acolor = color + "";

		if(pct > 0.6)
		{
			return acolor;
		}

		if(pct > 0.3)
		{
			return acolor + C.BOLD;
		}

		return C.DARK_GRAY + "" + C.BOLD;
	}

	public void tickMonitor(ReactPlayer rp)
	{
		Player p = rp.getP();
		int sel = rp.getMonitorSelection();
		NMSX.sendActionBar(p, titleMonitor.getHotbarFor(sel, rp.isShift()));
		String k = titleMonitor.getHotbarHeadFor(sel, rp.isShift(), this, rp, rp.getSwitchNotification());
		String m = prefixFor(rp, sel, rp.getSwitchNotification());
		String v = sel != -1 ? (rp.getSwitchNotification() > 0 ? (m + titleMonitor.getHeadFor(sel).getName()) : "  ") : "  ";
		NMSX.sendTitle(p, 0, 5, 0, v, k);
	}

	public TitleMonitor getTitleMonitor()
	{
		return titleMonitor;
	}

	@EventHandler
	public void on(PlayerJoinEvent e)
	{
		if(canMonitor(e.getPlayer()))
		{
			React.instance.playerController.getPlayer(e.getPlayer());
		}
	}
}
