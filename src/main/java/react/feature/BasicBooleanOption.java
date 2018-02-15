package react.feature;

import java.lang.reflect.Field;

public class BasicBooleanOption extends BasicConfigurationOption<Boolean> implements IBooleanOption
{
	public BasicBooleanOption(String name, String description, Field configurationField)
	{
		super(name, description, configurationField);
	}
}
