package react;

import react.controller.ActionController;
import react.controller.CommandController;
import react.controller.DropMergeController;
import react.controller.EntityCacheController;
import react.controller.EntityCullController;
import react.controller.EntityStackController;
import react.controller.FastDecayController;
import react.controller.GlassController;
import react.controller.MonitorController;
import react.controller.NMSController;
import react.controller.PlayerController;
import react.controller.SampleController;
import surge.control.Control;
import surge.control.Disable;
import surge.control.Enable;
import surge.control.Instance;
import surge.util.Persist;

@Persist
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

	@Control
	public EntityCacheController entityCacheController;

	@Control
	public DropMergeController dropMergeController;

	@Control
	public FastDecayController fastDecayController;

	@Control
	public EntityStackController entityStackController;

	@Control
	public GlassController glassController;

	@Control
	public NMSController nmsController;

	@Control
	public EntityCullController entityCullController;

	@Enable
	public void enable()
	{

	}

	@Disable
	public void disable()
	{

	}
}
