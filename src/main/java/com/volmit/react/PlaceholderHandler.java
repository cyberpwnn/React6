package com.volmit.react;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.bukkit.entity.Player;

import com.volmit.react.api.Capability;
import com.volmit.react.api.SampledType;
import com.volmit.react.util.F;

import me.clip.placeholderapi.external.EZPlaceholderHook;

@SuppressWarnings("deprecation")
public class PlaceholderHandler extends EZPlaceholderHook
{
	public PlaceholderHandler()
	{
		super(ReactPlugin.i, "react");
	}

	public void writeToFile() throws IOException
	{
		File f = new File(ReactPlugin.i.getDataFolder(), "placeholders.txt");
		f.getParentFile().mkdirs();
		PrintWriter pw = new PrintWriter(f);

		for(SampledType i : SampledType.values())
		{
			pw.println("%react_sample_" + i.name().toLowerCase() + "%");
			pw.println("%react_sample_" + i.name().toLowerCase() + "_raw%");
		}

		pw.close();
	}

	@Override
	public String onPlaceholderRequest(Player p, String s)
	{
		if(s.startsWith("sample_"))
		{
			for(SampledType i : SampledType.values())
			{
				if(s.startsWith("sample_" + i.name().toLowerCase()))
				{
					if(s.endsWith("_raw"))
					{
						return "" + F.f(i.get().getValue(), 9);
					}

					return i.get().get();
				}
			}

			if(s.startsWith("ping"))
			{
				if(!Capability.ACCELERATED_PING.isCapable())
				{
					return "NCA";
				}

				if(s.equals("ping") || s.equals("ping_raw"))
				{
					if(p == null)
					{
						return "NPI";
					}

					if(s.endsWith("_raw"))
					{
						return "" + React.instance.protocolController.ping(p);
					}

					else
					{
						return F.time(React.instance.protocolController.ping(p), 1);
					}
				}
			}
		}

		return s;
	}
}
