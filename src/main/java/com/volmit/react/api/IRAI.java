package com.volmit.react.api;

import com.volmit.react.util.GList;

public interface IRAI
{
	public GList<IGoal> getGoals();

	public void tick();

	public void addGoal(IGoal goal);

	public GList<RAIEvent> getEvents();

	public void callEvent(RAIEvent e);

	public GList<IActionSource> getListeners();
}
