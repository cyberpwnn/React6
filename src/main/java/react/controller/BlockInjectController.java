package react.controller;

import org.cyberpwn.glang.GMap;

import react.Lang;
import react.binject.IBlockInjector;
import react.binject.V10.BlockInjector10;
import react.binject.V11.BlockInjector11;
import react.binject.V12.BlockInjector12;
import react.binject.V8.BlockInjector8;
import react.binject.V9.BlockInjector9;
import surge.control.Controller;
import surge.util.D;
import surge.util.Protocol;
import surge.util.ProtocolRange;

public class BlockInjectController extends Controller
{
	private GMap<ProtocolRange, Protocol> rangeMapping;
	private IBlockInjector<?, ?> injector;
	private boolean injected;

	@Override
	public void start()
	{
		rangeMapping = new GMap<ProtocolRange, Protocol>();
		rangeMapping.put(new ProtocolRange(Protocol.R1_12, Protocol.R1_12_2), Protocol.R1_12);
		rangeMapping.put(new ProtocolRange(Protocol.R1_11, Protocol.R1_11_2), Protocol.R1_11);
		rangeMapping.put(new ProtocolRange(Protocol.R1_10, Protocol.R1_10_2), Protocol.R1_10);
		rangeMapping.put(new ProtocolRange(Protocol.R1_9, Protocol.R1_9_4), Protocol.R1_9);
		rangeMapping.put(new ProtocolRange(Protocol.R1_8, Protocol.R1_8_9), Protocol.R1_8);

		startInjection();
	}

	private void startInjection()
	{
		injected = false;
		injector = null;
		Protocol current = Protocol.getProtocolVersion();
		Protocol set = null;

		for(ProtocolRange i : rangeMapping.k())
		{
			if(i.contains(current))
			{
				set = rangeMapping.get(i);
				break;
			}
		}

		if(set != null)
		{
			if(set.equals(Protocol.R1_12))
			{
				injector = new BlockInjector12(set, net.minecraft.server.v1_12_R1.Blocks.class);
			}

			else if(set.equals(Protocol.R1_11))
			{
				injector = new BlockInjector11(set, net.minecraft.server.v1_11_R1.Blocks.class);
			}

			else if(set.equals(Protocol.R1_10))
			{
				injector = new BlockInjector10(set, net.minecraft.server.v1_10_R1.Blocks.class);
			}

			else if(set.equals(Protocol.R1_9))
			{
				injector = new BlockInjector9(set, net.minecraft.server.v1_9_R1.Blocks.class);
			}

			else if(set.equals(Protocol.R1_8))
			{
				injector = new BlockInjector8(set, net.minecraft.server.v1_8_R3.Blocks.class);
			}

			else
			{
				D.w(Lang.getString("block-injector.could-not-find-client") + current.toString()); //$NON-NLS-1$
				D.w(Lang.getString("block-injector.block-injections-wont")); //$NON-NLS-1$
			}
		}

		if(injector != null)
		{
			D.v(Lang.getString("block-injector.found-injector") + set.toString() + Lang.getString("block-injector.for") + current.toString()); //$NON-NLS-1$ //$NON-NLS-2$
			D.v(Lang.getString("block-injector.injecting-blocks")); //$NON-NLS-1$
			injector.inject();
			D.v("========================"); //$NON-NLS-1$
			injected = true;
		}
	}

	@Override
	public void stop()
	{

	}

	@Override
	public void tick()
	{

	}

	public GMap<ProtocolRange, Protocol> getRangeMapping()
	{
		return rangeMapping;
	}

	public IBlockInjector<?, ?> getInjector()
	{
		return injector;
	}

	public boolean isInjected()
	{
		return injected;
	}
}
