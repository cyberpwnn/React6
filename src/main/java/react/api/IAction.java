package react.api;

import surge.collection.GMap;
import surge.util.Callback;

public interface IAction
{
	public String getName();

	public String getDescription();

	public ActionHandle getHandleType();

	public void act(IActionSource source, ISelector... selectors) throws ActionAlreadyRunningException;

	public void enact(IActionSource source, ISelector... selectors);

	public ActionState getState();

	public ActionTargetType getTarget();

	public String getStatus();

	public void setStatus(String status);

	public double getProgress();

	public void setProgress(double progress);

	public ActionType getType();

	public GMap<Class<?>, Callback<ISelector>> getDefaultSelectors();

	public void setDefaultSelector(Class<?> clazz, Callback<ISelector> selector);

	public ISelector[] biselect(ISelector... selectors);

	public IActionSource getCurrentSource();

	public void completeAction();
}
