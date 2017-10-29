package react.api;

import surge.collection.GSet;

public class Selector implements ISelector
{
	private Class<?> objectType;
	private SelectionMode mode;
	private GSet<Object> list;
	private GSet<Object> possibilities;

	public Selector(Class<?> objectType, SelectionMode mode)
	{
		this.objectType = objectType;
		this.mode = mode;
		list = new GSet<Object>();
		possibilities = new GSet<Object>();
	}

	@Override
	public SelectionMode getMode()
	{
		return mode;
	}

	@Override
	public Class<?> getType()
	{
		return objectType;
	}

	@Override
	public boolean can(Object o)
	{
		return (getMode().equals(SelectionMode.WHITELIST) && getList().contains(o)) || (getMode().equals(SelectionMode.BLACKLIST) && !getList().contains(o));
	}

	@Override
	public GSet<Object> getList()
	{
		return list;
	}

	@Override
	public GSet<Object> getPossibilities()
	{
		return possibilities;
	}
}
