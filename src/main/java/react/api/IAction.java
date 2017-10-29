package react.api;

import surge.util.PositionalSelector;

public interface IAction
{
	public String getName();

	public String getDescription();

	public ActionHandle getHandleType();

	public void act(IActionSource source, PositionalSelector position);

	public ActionState getState();

	public String getStatus();

	public void setStatus(String status);

	public double getProgress();

	public void setProgress(double progress);
}
