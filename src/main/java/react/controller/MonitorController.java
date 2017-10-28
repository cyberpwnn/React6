package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import react.Info;
import react.React;
import react.api.MonitorHeading;
import react.api.Permissable;
import react.api.ReactPlayer;
import react.api.SampledType;
import react.api.TitleMonitor;
import surge.Surge;
import surge.collection.GMap;
import surge.collection.GSound;
import surge.control.Controller;
import surge.math.M;
import surge.nms.NMSX;
import surge.util.C;
import surge.util.MSound;

public class MonitorController extends Controller
{
	public static int maxCooldown = 4;
	private TitleMonitor titleMonitor;
	private GMap<Player, Integer> posts;

	public MonitorController()
	{
		posts = new GMap<Player, Integer>();
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

	public void toggleMonitoring(Player p)
	{
		if(!canMonitor(p))
		{
			return;
		}

		if(isMonitoring(p))
		{
			stopMonitoring(p);
		}

		else
		{
			startMonitoring(p);
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
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

			i.setPlays(i.getPlays() > 0 ? i.getPlays() - 1 : 0);
		}
	}

	private void changePost(ReactPlayer i)
	{
		i.setMonitorPosted(!i.getMonitorPosted());
		new GSound(MSound.HORSE_GALLOP.bukkitSound(), calcVolume(i), 1.9f).play(i.getP());
		i.setPlays(i.getPlays() + 3);
	}

	private void processPlayer(ReactPlayer i)
	{
		if(!isMonitoring(i.getP()))
		{
			return;
		}

		handlePosting(i);
		handleShifting(i);
		handleScrolling(i);
		handleTriggers(i);
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
}
