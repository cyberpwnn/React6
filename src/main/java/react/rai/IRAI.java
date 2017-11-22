package react.rai;

import org.bukkit.command.CommandSender;
import org.cyberpwn.glang.GList;

public interface IRAI
{
	public GList<IGoal> getGoals();

	public void tick();

	public void addGoal(IGoal goal);

	public GList<RAIEvent> getEvents();

	public void callEvent(RAIEvent e);

	public GList<CommandSender> getListeners();
}
