/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.inventory.EntityEquipment
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.potion.PotionEffect
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Collection;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class YDcD
extends HuvK {
    private wfPa<PotionEffect> ogUp;
    private boolean jGEc;
    private ItemStack[] VoOY;
    private float fallDistance;
    private int fireTicks;
    private double dVUE;
    private double maxHealth;
    private int BtwX;
    private int bPOA;

    public YDcD(LivingEntity livingEntity) {
        super((Entity)livingEntity);
        this.ogUp = new wfPa(livingEntity.getActivePotionEffects());
        this.jGEc = livingEntity.getCanPickupItems();
        this.VoOY = livingEntity.getEquipment().getArmorContents();
        this.fallDistance = livingEntity.getFallDistance();
        this.fireTicks = livingEntity.getFireTicks();
        this.dVUE = livingEntity.getHealth();
        this.maxHealth = livingEntity.getMaxHealth();
        this.BtwX = livingEntity.getMaximumAir();
        this.bPOA = livingEntity.getRemainingAir();
    }

    @Override
    public void nJLQ(Entity entity) {
        super.nJLQ(entity);
        LivingEntity livingEntity = (LivingEntity)entity;
        Object object = YDcD.we((wfPa)cv.b(this, -1071320266));
        while (object.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)object.next();
            livingEntity.addPotionEffect(potionEffect);
        }
        livingEntity.setCanPickupItems(((Boolean)cv.b(this, -1503726799)).booleanValue());
        livingEntity.getEquipment().setArmorContents((ItemStack[])cv.b(this, 488829744));
        livingEntity.setFallDistance(((Float)cv.b(this, -1243548877)).floatValue());
        livingEntity.setMaxHealth(((Double)cv.b(this, -589171918)).doubleValue());
        livingEntity.setHealth(((Double)cv.b(this, -1745095875)).doubleValue());
        livingEntity.setMaximumAir(((Integer)cv.b(this, 984740668)).intValue());
        livingEntity.setRemainingAir(((Integer)cv.b(this, 948433727)).intValue());
        livingEntity.setFireTicks(((Integer)cv.b(this, -1844710594)).intValue());
    }

    public wfPa<PotionEffect> mhnc() {
        return (wfPa)cv.b(this, -1071320266);
    }

    public void DYFV(wfPa<PotionEffect> wfPa2) {
        cv.e(this, -1071320266, wfPa2);
    }

    public boolean YDcD() {
        return (Boolean)cv.b(this, -1503726799);
    }

    public void setCanPickupItems(boolean bl) {
        cv.e(this, -1503726799, bl);
    }

    public ItemStack[] getArmorContents() {
        return (ItemStack[])cv.b(this, 488829744);
    }

    public void setArmorContents(ItemStack[] arritemStack) {
        cv.e(this, 488829744, arritemStack);
    }

    public float getFallDistance() {
        return ((Float)cv.b(this, -1243548877)).floatValue();
    }

    public void setFallDistance(float f) {
        cv.e(this, -1243548877, Float.valueOf(f));
    }

    public int getFireTicks() {
        return (Integer)cv.b(this, -1844710594);
    }

    public void setFireTicks(int n) {
        cv.e(this, -1844710594, n);
    }

    public double getHealth() {
        return (Double)cv.b(this, -1745095875);
    }

    public void setHealth(double d) {
        cv.e(this, -1745095875, d);
    }

    public double getMaxHealth() {
        return (Double)cv.b(this, -589171918);
    }

    public void setMaxHealth(double d) {
        cv.e(this, -589171918, d);
    }

    public int WiQN() {
        return (Integer)cv.b(this, 984740668);
    }

    public void TyVf(int n) {
        cv.e(this, 984740668, n);
    }

    public int aCiR() {
        return (Integer)cv.b(this, 948433727);
    }

    public void LGKl(int n) {
        cv.e(this, 948433727, n);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Integer)cv.b(this, 948433727);
        n2 = n2 * 31 + YDcD.we((ItemStack[])cv.b(this, 488829744));
        n2 = n2 * 31 + ((Boolean)cv.b(this, -1503726799) != false ? 1231 : 1237);
        n2 = n2 * 31 + YDcD.we(((Float)cv.b(this, -1243548877)).floatValue());
        n2 = n2 * 31 + (Integer)cv.b(this, -1844710594);
        Object object = YDcD.we((Double)cv.b(this, -1745095875));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Integer)cv.b(this, 984740668);
        object = YDcD.we((Double)cv.b(this, -589171918));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Object)((wfPa)cv.b(this, -1071320266) == null ? 0 : (Object)YDcD.we((wfPa)cv.b(this, -1071320266)));
        return n2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (YDcD.we(this) != YDcD.we(object)) {
            return false;
        }
        YDcD yDcD = (YDcD)object;
        if (((Integer)cv.b(this, 948433727)).intValue() != ((Integer)cv.b(yDcD, 948433727)).intValue()) {
            return false;
        }
        if (YDcD.we((ItemStack[])cv.b(this, 488829744), (ItemStack[])cv.b(yDcD, 488829744)) == false) {
            return false;
        }
        if (((Boolean)cv.b(this, -1503726799)).booleanValue() != ((Boolean)cv.b(yDcD, -1503726799)).booleanValue()) {
            return false;
        }
        if (YDcD.we(((Float)cv.b(this, -1243548877)).floatValue()) != YDcD.we(((Float)cv.b(yDcD, -1243548877)).floatValue())) {
            return false;
        }
        if (((Integer)cv.b(this, -1844710594)).intValue() != ((Integer)cv.b(yDcD, -1844710594)).intValue()) {
            return false;
        }
        if (YDcD.we((Double)cv.b(this, -1745095875)) != YDcD.we((Double)cv.b(yDcD, -1745095875))) {
            return false;
        }
        if (((Integer)cv.b(this, 984740668)).intValue() != ((Integer)cv.b(yDcD, 984740668)).intValue()) {
            return false;
        }
        if (YDcD.we((Double)cv.b(this, -589171918)) != YDcD.we((Double)cv.b(yDcD, -589171918))) {
            return false;
        }
        if ((wfPa)cv.b(this, -1071320266) == null) {
            if ((wfPa)cv.b(yDcD, -1071320266) != null) {
                return false;
            }
        } else if (YDcD.we((wfPa)cv.b(this, -1071320266), (wfPa)cv.b(yDcD, -1071320266)) == false) {
            return false;
        }
        return true;
    }

    private static Object we(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

