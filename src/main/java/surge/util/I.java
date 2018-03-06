package surge.util;

import org.cyberpwn.gbench.Profiler;
import org.cyberpwn.glang.GMap;
import org.cyberpwn.gmath.Average;

public class I
{
	public static GMap<String, Average> m = new GMap<String, Average>();
	public static GMap<String, Profiler> v = new GMap<String, Profiler>();
	public static GMap<String, Long> h = new GMap<String, Long>();
	public static GMap<String, Double> y = new GMap<String, Double>();

	public static void a(String name, int avg)
	{
		if(!m.containsKey(name))
		{
			m.put(name, new Average(avg));
		}

		if(!h.containsKey(name))
		{
			h.put(name, 0l);
		}

		if(!y.containsKey(name))
		{
			y.put(name, 0.0);
		}

		Profiler pr = new Profiler();
		pr.begin();
		v.put(name, pr);
	}

	public static void b(String name)
	{
		if(v.containsKey(name) && m.containsKey(name) && y.containsKey(name) && h.containsKey(name))
		{
			h.put(name, h.get(name) + 1);
			Profiler pr = v.get(name);
			pr.end();
			y.put(name, y.get(name) + pr.getMilliseconds());
			m.get(name).put(pr.getMilliseconds());
		}
	}
}