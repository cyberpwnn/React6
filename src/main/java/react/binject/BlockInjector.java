package react.binject;

import surge.Main;
import surge.util.D;
import surge.util.Protocol;

public abstract class BlockInjector<T, B> implements IBlockInjector<T, B>
{
	private Protocol protocol;
	private Class<? extends B> blocksClass;

	public BlockInjector(Protocol protocol, Class<? extends B> blocksClass)
	{
		this.protocol = protocol;
		this.blocksClass = blocksClass;
	}

	@Override
	public void register(int id, String rkey, String ckey, T registered)
	{
		add(id, rkey, registered);
		ReflectionUtil.setStatic(ckey, blocksClass, get(rkey));
	}

	@SuppressWarnings("unchecked")
	@Override
	public void inject()
	{
		if(Main.anchors.get(87) == null)
		{
			D.w("No block injections for " + getVersion().toString());
			return;
		}

		for(Class<?> i : Main.anchors.get(87))
		{
			if(InjectedBlock.class.isAssignableFrom(i))
			{
				try
				{
					InjectedBlock binj = (InjectedBlock) i.newInstance();

					if(binj.getInjectProtocol().equals(getVersion()))
					{
						D.v("Injected BLOCK: " + binj.getInjectId() + " <> " + binj.getInjectProtocol().toString() + " :: " + binj.getInjectKey());
						register(binj.getInjectId(), binj.getInjectKey(), binj.getInjectCKey(), (T) binj);
					}
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Protocol getVersion()
	{
		return protocol;
	}
}
