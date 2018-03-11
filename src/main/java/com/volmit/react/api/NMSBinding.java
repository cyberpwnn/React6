package com.volmit.react.api;

public abstract class NMSBinding implements INMSBinding
{
	private String packageVersion;

	public NMSBinding(String packageVersion)
	{
		this.packageVersion = packageVersion;
	}

	@Override
	public String getPackageVersion()
	{
		return packageVersion;
	}
}
