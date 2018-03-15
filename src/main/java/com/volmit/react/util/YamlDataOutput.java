package com.volmit.react.util;

import java.io.File;

import com.volmit.react.E;

public class YamlDataOutput implements IDataOutput
{
	@Override
	public void write(DataCluster c, File f)
	{
		try
		{
			c.toFileConfiguration().save(f);
		}

		catch(Throwable e)
		{
			E.t(e);
		}
	}
}
