package react.feature;

import org.cyberpwn.glang.GList;

public interface IFeature
{
	public String getName();

	public IBooleanOption getToggle();

	public GList<IOption<?>> getOptions();

	public String getID();

	public void addFeatureOption(IOption<?> opt);
}
