package react.cache;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public class CachedItemDrop extends CachedEntity
{
	private ItemStack is;

	public CachedItemDrop(Item e)
	{
		super(e);

		is = e.getItemStack();
	}

	@Override
	public void apply(Entity ee)
	{
		super.apply(ee);
		Item e = (Item) ee;
		e.setItemStack(is);
	}
}
