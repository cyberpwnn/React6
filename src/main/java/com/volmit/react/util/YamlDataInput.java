package com.volmit.react.util;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.volmit.react.E;

public class YamlDataInput implements IDataInput
{
	@Override
	public DataCluster read(File f)
	{
		DataCluster d = new DataCluster();

		try
		{
			FileConfiguration fc = new YamlConfiguration();
			fc.load(f);
			d.fromFileConfiguration(fc);
		}

		catch(Throwable e)
		{
			E.t(e);
		}

		return d;
	}
}
