package react.feature;

import java.lang.reflect.Field;

public class BasicIntegerOption extends BasicConfigurationOption<Integer> implements IIntegerOption
{
	public BasicIntegerOption(String name, String description, Field configurationField)
	{
		super(name, description, configurationField);
	}
}
