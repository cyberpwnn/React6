package react.cache;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import surge.collection.GList;

public class CachedEntityLiving extends CachedEntity
{
	private GList<PotionEffect> potionEffects;
	private boolean canPickupItems;
	private ItemStack[] armorContents;
	private float fallDistance;
	private int fireTicks;
	private double health;
	private double maxHealth;
	private int maxAir;
	private int air;

	@SuppressWarnings("deprecation")
	public CachedEntityLiving(LivingEntity e)
	{
		super(e);

		potionEffects = new GList<PotionEffect>(e.getActivePotionEffects());
		canPickupItems = e.getCanPickupItems();
		armorContents = e.getEquipment().getArmorContents();
		fallDistance = e.getFallDistance();
		fireTicks = e.getFireTicks();
		health = e.getHealth();
		maxHealth = e.getMaxHealth();
		maxAir = e.getMaximumAir();
		air = e.getRemainingAir();
	}

	@Override
	@SuppressWarnings("deprecation")
	public void apply(Entity ef)
	{
		super.apply(ef);
		LivingEntity e = (LivingEntity) ef;

		for(PotionEffect i : potionEffects)
		{
			e.addPotionEffect(i);
		}

		e.setCanPickupItems(canPickupItems);
		e.getEquipment().setArmorContents(armorContents);
		e.setFallDistance(fallDistance);
		e.setMaxHealth(maxHealth);
		e.setHealth(health);
		e.setMaximumAir(maxAir);
		e.setRemainingAir(air);
		e.setFireTicks(fireTicks);
	}

	public GList<PotionEffect> getPotionEffects()
	{
		return potionEffects;
	}

	public void setPotionEffects(GList<PotionEffect> potionEffects)
	{
		this.potionEffects = potionEffects;
	}

	public boolean isCanPickupItems()
	{
		return canPickupItems;
	}

	public void setCanPickupItems(boolean canPickupItems)
	{
		this.canPickupItems = canPickupItems;
	}

	public ItemStack[] getArmorContents()
	{
		return armorContents;
	}

	public void setArmorContents(ItemStack[] armorContents)
	{
		this.armorContents = armorContents;
	}

	public float getFallDistance()
	{
		return fallDistance;
	}

	public void setFallDistance(float fallDistance)
	{
		this.fallDistance = fallDistance;
	}

	public int getFireTicks()
	{
		return fireTicks;
	}

	public void setFireTicks(int fireTicks)
	{
		this.fireTicks = fireTicks;
	}

	public double getHealth()
	{
		return health;
	}

	public void setHealth(double health)
	{
		this.health = health;
	}

	public double getMaxHealth()
	{
		return maxHealth;
	}

	public void setMaxHealth(double maxHealth)
	{
		this.maxHealth = maxHealth;
	}

	public int getMaxAir()
	{
		return maxAir;
	}

	public void setMaxAir(int maxAir)
	{
		this.maxAir = maxAir;
	}

	public int getAir()
	{
		return air;
	}

	public void setAir(int air)
	{
		this.air = air;
	}
}
