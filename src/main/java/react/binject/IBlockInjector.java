package react.binject;

import surge.util.Protocol;

public interface IBlockInjector<T, B>
{
	public void register(int id, String rkey, String ckey, T registered);

	public void add(int index, String name, T block);

	public T get(String name);

	public void inject();

	public Protocol getVersion();
}
