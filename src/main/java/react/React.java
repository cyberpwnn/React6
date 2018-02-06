package react;

import react.action.source.AccessActionSource;
import react.controller.ActionController;
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
import react.controller.MessageController;
import react.controller.MetricsController;
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
import react.controller.WorldController;
import surge.Surge;
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
	public SmearTickController smearTickController;

	@Control
	public FeatureController featureController;

	@Control
	public HopperOvertickController hopperPlungeController;

	@Control
	public LanguageController languageController;

	@Control
	public RemoteController remoteController;

	@Control
	public ExplosiveController explosiveController;

	@Control
	public WorldController worldController;

	@Control
	public MessageController messageController;

	@Control
	public MetricsController metricsController;

	@Enable
	public void enable()
	{
		Surge.getAmp().setOnReload(new Runnable()
		{
			@Override
			public void run()
			{
				new AccessActionSource().sendResponseActing(Lang.getString("react.reinstance-jar")); //$NON-NLS-1$
			}
		});
	}

	@Disable
	public void disable()
	{

	}
}
