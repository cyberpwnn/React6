package react;

import react.controller.ActionController;
import react.controller.ChronophyFluidController;
import react.controller.ChronophyHopperController;
import react.controller.ChunkController;
import react.controller.CommandController;
import react.controller.DropMergeController;
import react.controller.EntityCacheController;
import react.controller.EntityCullController;
import react.controller.EntityStackController;
import react.controller.EventController;
import react.controller.FastDecayController;
import react.controller.FluidController;
import react.controller.GlassController;
import react.controller.GraphController;
import react.controller.HopperController;
import react.controller.MonitorController;
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

	@Control
	public FluidController fluidController;

	@Control
	public ChunkController chunkController;

	@Control
	public GraphController graphController;

	@Control
	public ChronophyHopperController chronophyHopperController;

	@Control
	public ChronophyFluidController fluidChronophyController;

	@Control
	public EventController eventController;

	@Enable
	public void enable()
	{

	}

	@Disable
	public void disable()
	{

	}
}
