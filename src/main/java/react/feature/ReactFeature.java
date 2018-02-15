package react.feature;

import org.cyberpwn.glang.GList;

public class ReactFeature implements IFeature
{
	private String name;
	private IBooleanOption toggle;
	private GList<IOption<?>> options;

	public ReactFeature(String name, IBooleanOption toggle)
	{
		this.name = name;
		this.toggle = toggle;
		options = new GList<IOption<?>>();
	}

	@Override
	public void addFeatureOption(IOption<?> opt)
	{
		options.add(opt);
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public IBooleanOption getToggle()
	{
		return toggle;
	}

	@Override
	public GList<IOption<?>> getOptions()
	{
		return options;
	}

	@Override
	public String getID()
	{
		return getName().toLowerCase().replaceAll(" ", "-");
	}
}
