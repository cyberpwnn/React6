package com.volmit.react.util;

public interface IController
{
	public void start();

	public void stop();

	public void tick();

	public void setTime(double ms);

	public double getTime();

	public void dump(JSONObject object);
}
