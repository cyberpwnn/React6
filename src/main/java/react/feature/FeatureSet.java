package react.feature;

import org.cyberpwn.glang.GList;

public class FeatureSet
{
	public GList<IFeature> features;

	public FeatureSet()
	{
		features = new GList<IFeature>();
	}

	public void addFeature(IFeature feature)
	{
		features.add(feature);
	}

	public GList<IFeature> getFeatures()
	{
		return features;
	}
}
