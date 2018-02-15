package react.feature;

public interface IOption<T>
{
	public String getDescription();

	public String getName();

	public T getValue();

	public void setValue(T t);

	public String getID();
}
