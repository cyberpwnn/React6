package react.security.ipsec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import surge.util.Anchor;

@Anchor(-10)
public class IPSecCharlie extends Thread
{
	private String ip = null;

	public IPSecCharlie()
	{

	}

	@Override
	public void run()
	{
		try
		{
			URL url = new URL("http://checkip.amazonaws.com/");
			InputStreamReader isr = new InputStreamReader(url.openStream());
			BufferedReader bu = new BufferedReader(isr);
			String i = bu.readLine();
			bu.close();
			ip = i;
		}

		catch(Exception e)
		{

		}
	}

	public String getIp()
	{
		return ip;
	}
}
