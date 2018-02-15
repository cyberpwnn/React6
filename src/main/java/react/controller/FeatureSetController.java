package react.controller;

import org.bukkit.entity.Player;
import org.cyberpwn.gformat.F;

import react.Config;
import react.Gate;
import react.api.Unused;
import react.feature.BasicBooleanOption;
import react.feature.BasicIntegerOption;
import react.feature.FeatureSet;
import react.feature.IFeature;
import react.feature.IOption;
import react.feature.ReactFeature;
import react.text.ColoredString;
import react.text.RTEX;
import react.text.RTX;
import surge.Surge;
import surge.control.Controller;
import surge.util.C;

public class FeatureSetController extends Controller
{
	private FeatureSet f;

	@Override
	public void start()
	{
		Surge.register(this);
		constructFeatureSet();
	}

	private void constructFeatureSet()
	{
		f = new FeatureSet();

		try
		{
			IFeature featureFastLeafDecay = new ReactFeature("Fast Leaf Decay", new BasicBooleanOption("Fast Leaf Decay", "Toggle Fast Leaf Decay", Config.class.getDeclaredField("FASTLEAF_ENABLED")));
			featureFastLeafDecay.addFeatureOption(new BasicIntegerOption("Decay Period", "Change how natural leaf decay looks by randomly waiting to decay in ticks.", Config.class.getField("FASTLEAF_DECAYPERIOD")));
			featureFastLeafDecay.addFeatureOption(new BasicBooleanOption("Instantaneous Decay", "Make decay as fast as possible", Config.class.getField("FASTLEAF_INSTANT")));
			featureFastLeafDecay.addFeatureOption(new BasicBooleanOption("On Decay", "Trigger Fastleaf when leaves are decayed by the server.", Config.class.getField("FASTLEAF_ONDECAY")));
			f.addFeature(featureFastLeafDecay);

			IFeature featureEntityCulling = new ReactFeature("Entity Culling", new BasicBooleanOption("Entity Culling", "Toggle Entity Culling", Config.class.getDeclaredField("CULLING_ENABLED")));
			f.addFeature(featureEntityCulling);

			IFeature featureRedstoneDanymic = new ReactFeature("Redstone Dynamic Tick", new BasicBooleanOption("Dynamic Tick", "Toggle Dynamic Ticking", Config.class.getDeclaredField("REDSTONE_DYNAMIC_CLOCK")));
			f.addFeature(featureRedstoneDanymic);

			IFeature featureEntityStacking = new ReactFeature("Entity Stacking", new BasicBooleanOption("Entity Stacking", "Toggle Entity Stacking", Config.class.getDeclaredField("ENTITYSTACK_ENABLED")));
			f.addFeature(featureEntityStacking);

			IFeature featureEntityThrottle = new ReactFeature("Entity Throttling", new BasicBooleanOption("Entity Throttling", "Toggle Entity throttling", Config.class.getDeclaredField("SMEAR_TICK_ENTITIES_ENABLE")));
			f.addFeature(featureEntityThrottle);

			IFeature featureTileThrottle = new ReactFeature("Tile Throttling", new BasicBooleanOption("Tile Throttling", "Toggle Tile throttling", Config.class.getDeclaredField("SMEAR_TICK_TILES_ENABLE")));
			f.addFeature(featureTileThrottle);
		}

		catch(NoSuchFieldException | SecurityException e)
		{
			e.printStackTrace();
		}
	}

	public void sendPage(Player p, String id)
	{
		IFeature ff = null;

		for(IFeature i : f.getFeatures())
		{
			if(i.getID().equalsIgnoreCase(id))
			{
				ff = i;
				break;
			}
		}

		if(ff == null)
		{
			Gate.msgError(p, "Unknown configuration ID " + id);
			return;
		}

		p.sendMessage(Gate.header(ff.getName(), C.AQUA));

		for(IOption<?> i : ff.getOptions())
		{
			RTX rtx = new RTX();
			RTEX rtex = new RTEX();
			rtex.getExtras().add(new ColoredString(C.WHITE, i.getName() + "\n"));
			rtex.getExtras().add(new ColoredString(C.GRAY, F.wrapWords(i.getDescription(), 48)));
			rtx.addTextHover(i.getName(), rtex, C.WHITE);
			rtx.addText(" ");

			if(i instanceof BasicBooleanOption)
			{
				Boolean b = ((BasicBooleanOption) i).getValue();
				RTEX rtt = new RTEX();
				rtt.getExtras().add(new ColoredString(!b ? C.RED : C.GREEN, "Turn " + i.getName() + (!b ? " off" : " on")));
				rtx.addTextFireHoverCommand(b ? "[OFF]" : "[ON]", rtt, "/re f " + ff.getID() + " " + i.getID(), b ? C.RED : C.GREEN);
			}

			else
			{
				RTEX rtt = new RTEX();
				rtt.getExtras().add(new ColoredString(C.YELLOW, "Edit " + i.getName()));
				rtx.addTextFireHoverCommand("[" + i.getValue().toString() + "]", rtt, "/re f " + ff.getID() + " " + i.getID(), C.YELLOW);
			}

			rtx.tellRawTo(p);
		}

		p.sendMessage(Gate.header(C.AQUA));
	}

	public void toggle(Player p, String string)
	{
		IFeature ff = null;

		for(IFeature i : f.getFeatures())
		{
			if(i.getID().equalsIgnoreCase(string))
			{
				ff = i;
				break;
			}
		}

		if(ff == null)
		{
			Gate.msgError(p, "Unknown configuration ID " + string);
			return;
		}

		ff.getToggle().setValue(!ff.getToggle().getValue());
		sendMain(p);
	}

	public void toggleElement(Player p, String string, String string2)
	{
		IFeature ff = null;

		for(IFeature i : f.getFeatures())
		{
			if(i.getID().equalsIgnoreCase(string))
			{
				ff = i;
				break;
			}
		}

		if(ff == null)
		{
			Gate.msgError(p, "Unknown configuration ID " + string);
			return;
		}

		IOption<?> opt = null;

		for(IOption<?> i : ff.getOptions())
		{
			if(i.getID().equals(string2))
			{
				opt = i;
				break;
			}
		}

		if(opt == null)
		{
			Gate.msgError(p, "Unknown configuration ID " + string + " -> " + string2);
			return;
		}

		((BasicBooleanOption) opt).setValue(!((BasicBooleanOption) opt).getValue());
		sendPage(p, string);
	}

	public void sendMain(Player p)
	{
		p.sendMessage(Gate.header("Features", C.AQUA));

		for(IFeature i : f.getFeatures())
		{
			boolean on = i.getToggle().getValue();
			RTX rtx = new RTX();
			RTEX rth = new RTEX();
			rth.getExtras().add(new ColoredString(C.WHITE, i.getName()));
			rth.getExtras().add(new ColoredString(C.GRAY, "\n" + F.wrapWords("Configure " + i.getName() + " by clicking on configure, or simply click the toggle.", 48)));
			RTEX rto = new RTEX();
			rto.getExtras().add(new ColoredString(C.GOLD, "Options\n"));
			rto.getExtras().add(new ColoredString(C.GRAY, "Click to view " + i.getName() + " options."));
			RTEX rtt = new RTEX();
			rtt.getExtras().add(new ColoredString(on ? C.RED : C.GREEN, "Turn " + i.getName() + " " + (on ? "OFF" : "ON") + "\n"));
			rtt.getExtras().add(new ColoredString(C.GRAY, "Click to toggle " + i.getName() + (on ? "OFF" : "ON")));
			rtx.addTextHover(i.getName(), rth, C.WHITE);
			rtx.addText(" ");

			if(!i.getOptions().isEmpty())
			{
				rtx.addTextFireHoverCommand("[OPTIONS]", rto, "/re f " + i.getID(), C.GOLD);
				rtx.addText(" ");
			}

			rtx.addTextFireHoverCommand("[" + (on ? "ON" : "OFF") + "]", rtt, "/re f " + i.getID() + " -t", on ? C.GREEN : C.RED);
			rtx.tellRawTo(p);
		}

		p.sendMessage(Gate.header(C.AQUA));
	}

	public FeatureSet getF()
	{
		return f;
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Unused
	@Override
	public void tick()
	{

	}
}
