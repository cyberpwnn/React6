package react.feature;

import java.lang.reflect.Field;

public class BasicConfigurationOption<T> implements IOption<T>
{
	private String description;
	private String name;
	private Field configurationField;

	public BasicConfigurationOption(String name, String description, Field configurationField)
	{
		this.name = name;
		this.description = description;
		this.configurationField = configurationField;

		try
		{
			this.configurationField.setAccessible(true);
		}

		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getValue()
	{
		try
		{
			return (T) configurationField.get(null);
		}

		catch(IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void setValue(T t)
	{
		try
		{
			configurationField.set(null, t);
		}

		catch(IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public String getID()
	{
		return getName().toLowerCase().replaceAll(" ", "-");
	}
}
