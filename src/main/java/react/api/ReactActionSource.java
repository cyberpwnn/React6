package react.api;

import surge.util.D;

public class ReactActionSource implements IActionSource
{
	@Override
	public void sendResponse(String r)
	{
		D.v("[RAI]: " + r);
	}

	@Override
	public void sendResponseSuccess(String r)
	{
		D.v("[RAI]: " + r);
	}

	@Override
	public void sendResponseError(String r)
	{
		D.v("[RAI]: " + r);
	}

	@Override
	public void sendResponseActing(String r)
	{
		D.v("[RAI]: " + r);
	}
}
