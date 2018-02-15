package react.feature;

import java.lang.reflect.Field;

public class BasicLongOption extends BasicConfigurationOption<Long> implements ILongOption
{
	public BasicLongOption(String name, String description, Field configurationField)
	{
		super(name, description, configurationField);
	}
}
