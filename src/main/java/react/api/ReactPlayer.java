package react.api;

import java.io.File;

import org.bukkit.entity.Player;
import org.cyberpwn.glang.GMap;

import react.Info;
import surge.Surge;
import surge.cluster.ConfigurationDataInput;
import surge.cluster.ConfigurationDataOutput;
import surge.cluster.IConfigurable;
import surge.cluster.KeyPointer;
import surge.cluster.KeyStore;

public class ReactPlayer implements IConfigurable
{
	@KeyStore
	public static GMap<Integer, String> keystore;

	static
	{
		keystore = new GMap<Integer, String>();
		keystore.put(-175, Info.STATE_MONITORING_ENABLED);
		keystore.put(234, Info.STATE_MAPPING_ENABLED);
		keystore.put(-885, Info.STATE_MONITORING_TAB);
		keystore.put(343, Info.STATE_SOUND_PLAYS);
		keystore.put(765, Info.STATE_MONITORING_POSTED);
		keystore.put(-112, Info.STATE_MONITORING_LASTTAB);
		keystore.put(-694, Info.STATE_MONITORING_SWITCHNOTIFICATION);
		keystore.put(492, Info.STATE_PLAYER_HOTBAR);
		keystore.put(117, Info.STATE_PLAYER_SHIFT);
		keystore.put(-592, Info.STATE_PLAYER_SCROLL);
		keystore.put(841, Info.STATE_PLAYER_HEIGHT_CURRENT);
		keystore.put(-413, Info.STATE_PLAYER_HEIGHT_CHANGING);
	}

	@KeyPointer(-175)
	public boolean monitoring = false;

	@KeyPointer(234)
	public boolean mapping = false;

	@KeyPointer(-885)
	public int monitorSelection = -1;

	@KeyPointer(343)
	public int plays = 0;

	@KeyPointer(765)
	public boolean monitorPosted = false;

	@KeyPointer(-112)
	public int monitorLastSelection = 0;

	@KeyPointer(-694)
	public int switchNotification = 0;

	@KeyPointer(492)
	public int hotbarSlot = 0;

	@KeyPointer(117)
	public boolean shift = false;

	@KeyPointer(-592)
	public int scroll = 0;

	@KeyPointer(841)
	public double lastHeight = 0;

	@KeyPointer(-413)
	public boolean heightMovement = false;

	private Player p;

	public ReactPlayer(Player p)
	{
		this.p = p;
		load();
	}

	public void save()
	{
		try
		{
			new ConfigurationDataOutput().write(this, new File(Surge.folder(Info.CORE_CACHE), p.getUniqueId().toString() + Info.CORE_DOTYML));
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void load()
	{
		try
		{
			new ConfigurationDataInput().read(this, new File(Surge.folder(Info.CORE_CACHE), p.getUniqueId().toString() + Info.CORE_DOTYML));
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public boolean isMonitoring()
	{
		return monitoring;
	}

	public boolean isMapping()
	{
		return mapping;
	}

	public Player getP()
	{
		return p;
	}

	public void setMonitoring(boolean monitoring)
	{
		this.monitoring = monitoring;
	}

	public void setMapping(boolean mapping)
	{
		this.mapping = mapping;
	}

	public int getMonitorSelection()
	{
		return monitorSelection;
	}

	public void setMonitorSelection(int monitorSelection)
	{
		this.monitorSelection = monitorSelection;
	}

	public int getHotbarSlot()
	{
		return hotbarSlot;
	}

	public void setHotbarSlot(int hotbarSlot)
	{
		this.hotbarSlot = hotbarSlot;
	}

	public boolean isShifting()
	{
		return shift;
	}

	public void setShifting(boolean shift)
	{
		this.shift = shift;
	}

	public boolean isShift()
	{
		return shift;
	}

	public void setShift(boolean shift)
	{
		this.shift = shift;
	}

	public int getScroll()
	{
		return scroll;
	}

	public void setScroll(int scroll)
	{
		this.scroll = scroll;
	}

	public int getMonitorLastSelection()
	{
		return monitorLastSelection;
	}

	public void setMonitorLastSelection(int monitorLastSelection)
	{
		this.monitorLastSelection = monitorLastSelection;
	}

	public void setP(Player p)
	{
		this.p = p;
	}

	public double getLastHeight()
	{
		return lastHeight;
	}

	public void setLastHeight(double lastHeight)
	{
		this.lastHeight = lastHeight;
	}

	public boolean isHeightMovement()
	{
		return heightMovement;
	}

	public void setHeightMovement(boolean heightMovement)
	{
		this.heightMovement = heightMovement;
	}

	public int getSwitchNotification()
	{
		return switchNotification;
	}

	public void setSwitchNotification(int switchNotification)
	{
		this.switchNotification = switchNotification;
	}

	public boolean getMonitorPosted()
	{
		return monitorPosted;
	}

	public void setMonitorPosted(boolean monitorPosted)
	{
		this.monitorPosted = monitorPosted;
	}

	public int getPlays()
	{
		return plays;
	}

	public void setPlays(int plays)
	{
		this.plays = plays;
	}
}
