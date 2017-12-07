package react.controller;

import surge.Surge;
import surge.control.Controller;

public class FeatureController extends Controller
{
	@Override
	public void start()
	{
		Surge.register(this);
	}

	@Override
	public void stop()
	{
		Surge.unregister(this);
	}

	@Override
	public void tick()
	{

	}
}
