package react.api;

import surge.util.D;

public class ReactActionSource implements IActionSource
{
	@Override
	public void sendResponse(String r)
	{
		D.v("[RAI]: " + r);
	}
}
