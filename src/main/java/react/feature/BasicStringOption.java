package react.feature;

import java.lang.reflect.Field;

public class BasicStringOption extends BasicConfigurationOption<String> implements IStringOption
{
	public BasicStringOption(String name, String description, Field configurationField)
	{
		super(name, description, configurationField);
	}
}
