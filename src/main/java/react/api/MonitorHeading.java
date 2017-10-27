package react.api;

import react.Info;
import surge.collection.GList;
import surge.util.C;

public class MonitorHeading
{
	private ISampler head;
	private GList<ISampler> children;
	private String name;

	public MonitorHeading(String name, ISampler head)
	{
		this.name = name;
		this.head = head;
		children = new GList<ISampler>();
	}

	public void addSampler(ISampler s)
	{
		children.add(s);
	}

	public ISampler getHead()
	{
		return head;
	}

	public void setHead(ISampler head)
	{
		this.head = head;
	}

	public GList<ISampler> getChildren()
	{
		return children;
	}

	public String getHeadText()
	{
		return getHead().getColor() + getHead().get() + C.RESET + getHead().getColor() + Info.SPACE + getHead().getID();
	}

	public String getChildText()
	{
		String m = "";

		for(ISampler i : getChildren())
		{
			String p = i.getColor() + i.get() + C.RESET + i.getColor() + Info.SPACE + i.getID();
			m += Info.SPACE + p;
		}

		if(m.length() < 2)
		{
			return m;
		}

		return m.substring(1);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setChildren(GList<ISampler> children)
	{
		this.children = children;
	}
}
