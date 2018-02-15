package react.controller;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import react.nms.INMSBinding;
import react.nms.NMSBinding10;
import react.nms.NMSBinding11;
import react.nms.NMSBinding12;
import react.nms.NMSBinding8;
import react.nms.NMSBinding9;
import surge.Surge;
import surge.control.Controller;
import surge.util.MaterialBlock;
import surge.util.Protocol;

public class FeatureController extends Controller implements INMSBinding
{
	private INMSBinding trueBinding;

	@Override
	public void start()
	{
		Surge.register(this);

		if(Protocol.R1_8_8.to(Protocol.LATEST).contains(Protocol.getProtocolVersion()))
		{
			if(Protocol.R1_8.to(Protocol.R1_8_9).contains(Protocol.getProtocolVersion()))
			{
				trueBinding = new NMSBinding8(getPackageVersion());
			}

			else if(Protocol.R1_9.to(Protocol.R1_9_4).contains(Protocol.getProtocolVersion()))
			{
				trueBinding = new NMSBinding9(getPackageVersion());
			}

			else if(Protocol.R1_10.to(Protocol.R1_10_2).contains(Protocol.getProtocolVersion()))
			{
				trueBinding = new NMSBinding10(getPackageVersion());
			}

			else if(Protocol.R1_11.to(Protocol.R1_11_2).contains(Protocol.getProtocolVersion()))
			{
				trueBinding = new NMSBinding11(getPackageVersion());
			}

			else if(Protocol.R1_12.to(Protocol.R1_12_2).contains(Protocol.getProtocolVersion()))
			{
				trueBinding = new NMSBinding12(getPackageVersion());
			}

			else
			{
				trueBinding = null;
			}
		}

		else
		{
			trueBinding = null;
		}
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{

	}

	public static String findPackageVersion()
	{
		return Bukkit.getServer().getClass().toString().split("\\.")[3];
	}

	@Override
	public String getPackageVersion()
	{
		return findPackageVersion();
	}

	public boolean hasBinding()
	{
		return trueBinding != null;
	}

	@Override
	public void setBlock(Location l, MaterialBlock m)
	{
		if(hasBinding())
		{
			trueBinding.setBlock(l, m);
		}
	}
}
