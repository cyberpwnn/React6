package react;

import react.controller.ActionController;
import react.controller.CommandController;
import react.controller.MonitorController;
import react.controller.PlayerController;
import react.controller.SampleController;
import surge.control.Control;
import surge.control.Disable;
import surge.control.Enable;
import surge.control.Instance;
import surge.control.Plugin;
import surge.util.Persist;

@Persist
@Plugin
public class React
{
	@Instance
	public static React instance;

	@Control
	public SampleController sampleController;

	@Control
	public PlayerController playerController;

	@Control
	public MonitorController monitorController;

	@Control
	public CommandController commandController;

	@Control
	public ActionController actionController;

	@Enable
	public void enable()
	{

	}

	@Disable
	public void disable()
	{

	}
}
