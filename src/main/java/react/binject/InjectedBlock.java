package react.binject;

import surge.util.Protocol;

public interface InjectedBlock
{
	public Protocol getInjectProtocol();

	public String getInjectKey();

	public String getInjectCKey();

	public int getInjectId();
}
