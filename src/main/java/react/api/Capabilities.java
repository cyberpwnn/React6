package react.api;

import org.bukkit.command.CommandSender;

import react.Gate;
import react.Lang;
import surge.util.Protocol;
import surge.util.ProtocolRange;

public enum Capabilities
{
	DUAL_WIELD(Lang.getString("message.error.capabilities.dual-wield"), Protocol.R1_9, Protocol.LATEST), //$NON-NLS-1$
	SCOREBOARD(Lang.getString("message.error.capabilities.score0"), Protocol.B1_5, Protocol.LATEST), //$NON-NLS-1$
	HOPPERS(Lang.getString("message.error.capabilities.hoppers"), Protocol.B1_5, Protocol.LATEST), //$NON-NLS-1$
	ATTRIBUTES(Lang.getString("message.error.capabilities.attrib"), Protocol.R1_9, Protocol.LATEST), //$NON-NLS-1$
	ENTITY_AI(Lang.getString("message.error.capabilities.eai"), Protocol.R1_9, Protocol.LATEST), //$NON-NLS-1$
	ACTION_BAR(Lang.getString("message.error.capabilities.action-bars"), Protocol.R1_8, Protocol.LATEST), //$NON-NLS-1$
	ENTITY_NAMES(Lang.getString("message.error.capabilities.entity-names"), Protocol.R1_8, Protocol.LATEST); //$NON-NLS-1$

	private ProtocolRange r;
	private String n;

	private Capabilities(String name, Protocol from, Protocol to)
	{
		n = name;
		r = from.to(to);
	}

	@Override
	public String toString()
	{
		return n;
	}

	public boolean isCapable()
	{
		return r.contains(Protocol.getProtocolVersion());
	}

	public void sendNotCapable(CommandSender sender)
	{
		Gate.msgError(sender, Protocol.getProtocolVersion().getVersionString() + Lang.getString("message.error.capabilities.is-not-capable") + toString() + " (" + r.getFrom().getVersionString() + "+)"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	public void sendCapable(CommandSender sender)
	{
		Gate.msgSuccess(sender, Protocol.getProtocolVersion().getVersionString() + Lang.getString("message.error.capabilities.is-capable") + toString() + " (" + r.getFrom().getVersionString() + "+)"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
}
