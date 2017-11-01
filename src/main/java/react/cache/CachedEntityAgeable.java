package react.cache;

import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;

public class CachedEntityAgeable extends CachedEntityLiving
{
	private int age;
	private boolean ageLock;
	private boolean breed;

	public CachedEntityAgeable(Ageable e)
	{
		super(e);

		age = e.getAge();
		breed = e.canBreed();
		ageLock = e.getAgeLock();
	}

	@Override
	public void apply(Entity ee)
	{
		super.apply(ee);

		Ageable e = (Ageable) ee;
		e.setAge(age);
		e.setBreed(breed);
		e.setAgeLock(ageLock);
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public boolean isAgeLock()
	{
		return ageLock;
	}

	public void setAgeLock(boolean ageLock)
	{
		this.ageLock = ageLock;
	}

	public boolean isBreed()
	{
		return breed;
	}

	public void setBreed(boolean breed)
	{
		this.breed = breed;
	}
}
