package react;

import react.controller.ActionController;
import react.controller.CommandController;
import react.controller.DropMergeController;
import react.controller.EntityCacheController;
import react.controller.EntityCullController;
import react.controller.EntityStackController;
import react.controller.FastDecayController;
import react.controller.GlassController;
import react.controller.HopperController;
import react.controller.MonitorController;
import react.controller.NMSController;
import react.controller.PhysicsController;
import react.controller.PlayerController;
import react.controller.RAIController;
import react.controller.RedstoneController;
import react.controller.SampleController;
import react.controller.SecurityController;
import react.controller.SpikeController;
import react.controller.TickTimeController;
import surge.control.Control;
import surge.control.Disable;
import surge.control.Enable;
import surge.control.Instance;
import surge.control.Plugin;
import surge.util.Persist;

@Plugin
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

	@Control
	public SpikeController spikeController;

	@Control
	public SecurityController securityController;

	@Control
	public RedstoneController redstoneController;

	@Control
	public HopperController hopperController;

	@Control
	public PhysicsController physicsController;

	@Control
	public TickTimeController tickTimeController;

	@Control
	public RAIController raiController;

	@Enable
	public void enable()
	{

	}

	@Disable
	public void disable()
	{

	}
}
