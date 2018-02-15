package react.feature;

import java.lang.reflect.Field;

public class BasicDoubleOption extends BasicConfigurationOption<Double> implements IDoubleOption
{
	public BasicDoubleOption(String name, String description, Field configurationField)
	{
		super(name, description, configurationField);
	}
}
