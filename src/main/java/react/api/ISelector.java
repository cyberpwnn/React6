package react.api;

import surge.collection.GSet;

public interface ISelector
{
	public SelectionMode getMode();

	public Class<?> getType();

	public boolean can(Object o);

	public GSet<Object> getList();

	public GSet<Object> getPossibilities();
}
