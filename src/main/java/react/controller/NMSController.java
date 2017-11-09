package react.controller;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import react.core.IFeatureSet;
import react.core.Support;
import react.core.v1_12R1.V1_12R1;
import surge.control.Controller;
import surge.util.D;
import surge.util.Protocol;

public class NMSController extends Controller
{
	public static IFeatureSet core = null;

	public NMSController()
	{
		try
		{
			handleNMS();
		}

		catch(Exception e)
		{

		}
	}

	private void handleNMS() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		Protocol p = Protocol.getProtocolVersion();

		D.v("Server Version: " + p.toString());

		if(p.hasPackageSupport())
		{
			D.v("NMS: " + p.getPackageVersion());
			IFeatureSet set = findCore(p.getPackageVersion());
			core = set;
			if(set != null)
			{
				D.v("Package Level Support: " + p.getPackageVersion());

				for(Field i : set.getClass().getDeclaredFields())
				{
					if(i.isAnnotationPresent(Support.class))
					{
						Class<?> c = i.getType();
						Object inst = c.getConstructor().newInstance();
						i.set(set, inst);
					}
				}
			}
		}

		else
		{
			D.v("No NMS Support for " + p.getVersion());
		}
	}

	private IFeatureSet findCore(String p)
	{
		if(p.equals(Protocol.R1_12_2.getPackageVersion()))
		{
			return new V1_12R1();
		}

		if(p.equals(Protocol.R1_11_2.getPackageVersion()))
		{

		}

		if(p.equals(Protocol.R1_10_2.getPackageVersion()))
		{

		}

		if(p.equals(Protocol.R1_9_4.getPackageVersion()))
		{

		}

		if(p.equals(Protocol.R1_9_2.getPackageVersion()))
		{

		}

		if(p.equals(Protocol.R1_8_9.getPackageVersion()))
		{

		}

		return null;
	}

	@Override
	public void start()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void stop()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void tick()
	{
		// TODO Auto-generated method stub

	}
}
