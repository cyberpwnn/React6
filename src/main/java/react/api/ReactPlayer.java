package react.api;

import java.io.File;

import org.bukkit.entity.Player;

import surge.Surge;
import surge.cluster.ConfigurationDataInput;
import surge.cluster.ConfigurationDataOutput;
import surge.cluster.IConfigurable;
import surge.cluster.Key;

public class ReactPlayer implements IConfigurable
{
	@Key("state.monitoring.enabled")
	public boolean monitoring = false;

	@Key("state.mapping.enabled")
	public boolean mapping = false;

	@Key("state.monitoring.tab")
	public int monitorSelection = -1;

	@Key("state.sound.plays")
	public int plays = 0;

	@Key("state.monitoring.posted")
	public boolean monitorPosted = false;

	@Key("state.monitoring.last-tab")
	public int monitorLastSelection = 0;

	@Key("state.monitoring.switch-notification")
	public int switchNotification = 0;

	@Key("state.player.hotbar")
	public int hotbarSlot = 0;

	@Key("state.player.shift")
	public boolean shift = false;

	@Key("state.player.scroll")
	public int scroll = 0;

	@Key("state.player.height.current")
	public double lastHeight = 0;

	@Key("state.player.height.changing")
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
			new ConfigurationDataOutput().write(this, new File(Surge.folder("cache"), p.getUniqueId().toString() + ".yml"));
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
			new ConfigurationDataInput().read(this, new File(Surge.folder("cache"), p.getUniqueId().toString() + ".yml"));
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
