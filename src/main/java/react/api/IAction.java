package react.api;

import org.cyberpwn.glang.AccessCallback;
import org.cyberpwn.glang.GMap;

import react.action.source.ActionHandle;
import react.action.source.IActionSource;

public interface IAction
{
	public String getName();

	public String getDescription();

	public ActionHandle getHandleType();

	public void act(IActionSource source, ISelector... selectors) throws ActionAlreadyRunningException;

	public void enact(IActionSource source, ISelector... selectors);

	public ActionState getState();

	public ActionTargetType getTarget();

	public void setNodes(String... nodes);

	public String[] getNodes();

	public String getStatus();

	public void setStatus(String status);

	public double getProgress();

	public void setProgress(double progress);

	public ActionType getType();

	public GMap<Class<?>, AccessCallback<ISelector>> getDefaultSelectors();

	public void setDefaultSelector(Class<?> clazz, AccessCallback<ISelector> selector);

	public ISelector[] biselect(ISelector... selectors);

	public IActionSource getCurrentSource();

	public void completeAction();
}
