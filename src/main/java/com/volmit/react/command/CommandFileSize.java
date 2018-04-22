package com.volmit.react.command;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import com.volmit.react.Info;
import com.volmit.react.ReactPlugin;
import com.volmit.react.api.Gate;
import com.volmit.react.api.Permissable;
import com.volmit.react.api.ReactCommand;
import com.volmit.react.api.SideGate;
import com.volmit.react.util.A;
import com.volmit.react.util.C;
import com.volmit.react.util.DataCluster;
import com.volmit.react.util.F;
import com.volmit.react.util.GMap;
import com.volmit.react.util.Paste;
import com.volmit.react.util.S;

public class CommandFileSize extends ReactCommand
{
	public CommandFileSize()
	{
		command = Info.COMMAND_FS;
		aliases = new String[] {Info.COMMAND_FS_ALIAS_1, Info.COMMAND_FS_ALIAS_2};
		permissions = new String[] {Permissable.ACCESS.getNode(), Permissable.MONITOR_ENVIRONMENT.getNode(), Permissable.SYSTEMINFO.getNode()};
		usage = Info.COMMAND_FS_USAGE;
		description = Info.COMMAND_FS_DESCRIPTION;
		sideGate = SideGate.ANYTHING;
	}

	@Override
	public void fire(CommandSender sender, String[] args)
	{
		Gate.msgActing(sender, "Calculating File Sizes Please Wait...");
		GMap<String, Long> map = new GMap<String, Long>();

		File f = new File(".");

		new A()
		{
			@Override
			public void run()
			{
				long tw = 0;

				Gate.msgActing(sender, "Calculating World Sizes");
				for(World i : Bukkit.getWorlds())
				{
					Gate.msgActing(sender, "  Calculating World " + i.getName() + "'s size");
					long ws = size(i.getWorldFolder());
					map.put("worlds.world." + i.getName().replaceAll(" ", "-"), ws);
					tw += ws;
				}
				Gate.msgActing(sender, "Calculating Plugin Sizes");

				for(Plugin i : Bukkit.getPluginManager().getPlugins())
				{
					File fxx = i.getDataFolder();

					if(fxx.exists() && fxx.isDirectory())
					{
						Gate.msgActing(sender, "  Calculating " + i.getName() + "'s data size");
						map.put("plugins.plugin-data." + i.getName(), size(fxx));
					}
				}

				Gate.msgActing(sender, "  Calculating Total Plugin Size");
				map.put("plugins.total", size(ReactPlugin.i.getDataFolder().getParentFile()));
				Gate.msgActing(sender, "Calculating literally everything's size");
				map.put("everything", size(f));
				map.put("worlds.total", tw);

				DataCluster cc = new DataCluster();

				for(String i : map.k())
				{
					cc.set(i, F.ofSize(map.get(i), 1000, 2));
				}

				String d = cc.toFileConfiguration().saveToString();

				try
				{
					String u = Paste.paste(d);

					new S("respond")
					{
						@Override
						public void run()
						{
							Gate.msgSuccess(sender, "Ding! " + C.WHITE + C.UNDERLINE + u + ".txt");
						}
					};
				}

				catch(Exception e)
				{
					e.printStackTrace();

					new S("respond")
					{
						@Override
						public void run()
						{
							Gate.msg(sender, d);
							Gate.msgError(sender, "Failed to paste to volmit.");
						}
					};
				}
			}
		};
	}

	public long size(File f)
	{
		long size = 0;

		if(f != null && f.exists())
		{
			if(f.isDirectory())
			{
				for(File i : f.listFiles())
				{
					size += size(i);
				}
			}

			else
			{
				size += f.length();
			}
		}

		return size;
	}
}
