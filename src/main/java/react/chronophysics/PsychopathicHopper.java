package react.chronophysics;

import org.bukkit.Material;
import org.bukkit.block.Hopper;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PsychopathicHopper implements Listener
{
	private Hopper h;

	public PsychopathicHopper(Hopper h)
	{
		this.h = h;
	}

	public int addFrom(Inventory inv, int maxStacks)
	{
		int transfered = 0;

		for(int i = 0; i < maxStacks && getInventory().firstEmpty() >= 0; i++)
		{
			ItemStack[] contents = inv.getContents();
			ItemStack isf = null;
			int isi = -1;

			for(int j = 0; j < contents.length; j++)
			{
				if(contents[j] != null && !contents[j].getType().equals(Material.AIR))
				{
					isf = contents[j];
					isi = j;
					break;
				}
			}

			if(isf != null && isi >= 0)
			{
				contents[isi] = new ItemStack(Material.AIR);
				getInventory().addItem(isf);
				inv.setContents(contents);
				transfered++;
			}
		}

		return transfered;
	}

	public Inventory getInventory()
	{
		return h.getInventory();
	}

	public HopperDirection getDirection()
	{
		return HopperDirection.getDirection(h);
	}

	public boolean isLockedByRedstone()
	{
		return HopperDirection.isLocked(h);
	}
}
