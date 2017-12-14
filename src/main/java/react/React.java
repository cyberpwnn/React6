package react;

import react.controller.ActionController;
import react.controller.BenchmarkController;
import react.controller.BlockInjectController;
import react.controller.ChronophyFluidController;
import react.controller.ChunkController;
import react.controller.CommandController;
import react.controller.EntityCullController;
import react.controller.EntityStackController;
import react.controller.EventController;
import react.controller.ExplosiveController;
import react.controller.FastDecayController;
import react.controller.FeatureController;
import react.controller.FluidController;
import react.controller.GlassController;
import react.controller.GraphController;
import react.controller.HopperController;
import react.controller.HopperOvertickController;
import react.controller.LanguageController;
import react.controller.MonitorController;
import react.controller.PhysicsController;
import react.controller.PlayerController;
import react.controller.RAIController;
import react.controller.RedstoneController;
import react.controller.RemoteController;
import react.controller.SampleController;
import react.controller.SecurityController;
import react.controller.SmearTickController;
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
	public ChronophyFluidController fluidChronophyController;

	@Control
	public EventController eventController;

	@Control
	public BlockInjectController blockInjectController;

	@Control
	public SmearTickController smearTickController;

	@Control
	public FeatureController featureController;

	@Control
	public HopperOvertickController hopperPlungeController;

	@Control
	public BenchmarkController benchmarkController;

	@Control
	public LanguageController languageController;

	@Control
	public RemoteController remoteController;

	@Control
	public ExplosiveController explosiveController;

	@Enable
	public void enable()
	{

	}

	@Disable
	public void disable()
	{

	}
}
