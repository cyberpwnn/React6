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

public class VwRc
extends bWps {
    private feCR<PotionEffect> hlCK;
    private boolean XKRV;
    private ItemStack[] cKQY;
    private float fallDistance;
    private int fireTicks;
    private double dMqv;
    private double maxHealth;
    private int DkJf;
    private int USHk;

    public VwRc(LivingEntity livingEntity) {
        super((Entity)livingEntity);
        this.hlCK = new feCR(livingEntity.getActivePotionEffects());
        this.XKRV = livingEntity.getCanPickupItems();
        this.cKQY = livingEntity.getEquipment().getArmorContents();
        this.fallDistance = livingEntity.getFallDistance();
        this.fireTicks = livingEntity.getFireTicks();
        this.dMqv = livingEntity.getHealth();
        this.maxHealth = livingEntity.getMaxHealth();
        this.DkJf = livingEntity.getMaximumAir();
        this.USHk = livingEntity.getRemainingAir();
    }

    @Override
    public void ktHX(Entity entity) {
        super.ktHX(entity);
        LivingEntity livingEntity = (LivingEntity)entity;
        Object object = VwRc.HN((feCR)o.a(this, 1852724166));
        while (object.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)object.next();
            livingEntity.addPotionEffect(potionEffect);
        }
        livingEntity.setCanPickupItems(((Boolean)o.a(this, 1463112645)).booleanValue());
        livingEntity.getEquipment().setArmorContents((ItemStack[])o.a(this, 2115457988));
        livingEntity.setFallDistance(((Float)o.a(this, -1941154877)).floatValue());
        livingEntity.setMaxHealth(((Double)o.a(this, -1749331022)).doubleValue());
        livingEntity.setHealth(((Double)o.a(this, 176378801)).doubleValue());
        livingEntity.setMaximumAir(((Integer)o.a(this, -1278127184)).intValue());
        livingEntity.setRemainingAir(((Integer)o.a(this, -551660625)).intValue());
        livingEntity.setFireTicks(((Integer)o.a(this, 898847662)).intValue());
    }

    public feCR<PotionEffect> gpRT() {
        return (feCR)o.a(this, 1852724166);
    }

    public void UtIU(feCR<PotionEffect> feCR2) {
        o.v(this, 1852724166, feCR2);
    }

    public boolean DYLt() {
        return (Boolean)o.a(this, 1463112645);
    }

    public void setCanPickupItems(boolean bl) {
        o.v(this, 1463112645, bl);
    }

    public ItemStack[] getArmorContents() {
        return (ItemStack[])o.a(this, 2115457988);
    }

    public void setArmorContents(ItemStack[] arritemStack) {
        o.v(this, 2115457988, arritemStack);
    }

    public float getFallDistance() {
        return ((Float)o.a(this, -1941154877)).floatValue();
    }

    public void setFallDistance(float f) {
        o.v(this, -1941154877, Float.valueOf(f));
    }

    public int getFireTicks() {
        return (Integer)o.a(this, 898847662);
    }

    public void setFireTicks(int n) {
        o.v(this, 898847662, n);
    }

    public double getHealth() {
        return (Double)o.a(this, 176378801);
    }

    public void setHealth(double d) {
        o.v(this, 176378801, d);
    }

    public double getMaxHealth() {
        return (Double)o.a(this, -1749331022);
    }

    public void setMaxHealth(double d) {
        o.v(this, -1749331022, d);
    }

    public int GPsf() {
        return (Integer)o.a(this, -1278127184);
    }

    public void Mkpo(int n) {
        o.v(this, -1278127184, n);
    }

    public int Gaty() {
        return (Integer)o.a(this, -551660625);
    }

    public void CoVI(int n) {
        o.v(this, -551660625, n);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Integer)o.a(this, -551660625);
        n2 = n2 * 31 + VwRc.HN((ItemStack[])o.a(this, 2115457988));
        n2 = n2 * 31 + ((Boolean)o.a(this, 1463112645) != false ? 1231 : 1237);
        n2 = n2 * 31 + VwRc.HN(((Float)o.a(this, -1941154877)).floatValue());
        n2 = n2 * 31 + (Integer)o.a(this, 898847662);
        Object object = VwRc.HN((Double)o.a(this, 176378801));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Integer)o.a(this, -1278127184);
        object = VwRc.HN((Double)o.a(this, -1749331022));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Object)((feCR)o.a(this, 1852724166) == null ? 0 : (Object)VwRc.HN((feCR)o.a(this, 1852724166)));
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
        if (VwRc.HN(this) != VwRc.HN(object)) {
            return false;
        }
        VwRc vwRc = (VwRc)object;
        if (((Integer)o.a(this, -551660625)).intValue() != ((Integer)o.a(vwRc, -551660625)).intValue()) {
            return false;
        }
        if (VwRc.HN((ItemStack[])o.a(this, 2115457988), (ItemStack[])o.a(vwRc, 2115457988)) == false) {
            return false;
        }
        if (((Boolean)o.a(this, 1463112645)).booleanValue() != ((Boolean)o.a(vwRc, 1463112645)).booleanValue()) {
            return false;
        }
        if (VwRc.HN(((Float)o.a(this, -1941154877)).floatValue()) != VwRc.HN(((Float)o.a(vwRc, -1941154877)).floatValue())) {
            return false;
        }
        if (((Integer)o.a(this, 898847662)).intValue() != ((Integer)o.a(vwRc, 898847662)).intValue()) {
            return false;
        }
        if (VwRc.HN((Double)o.a(this, 176378801)) != VwRc.HN((Double)o.a(vwRc, 176378801))) {
            return false;
        }
        if (((Integer)o.a(this, -1278127184)).intValue() != ((Integer)o.a(vwRc, -1278127184)).intValue()) {
            return false;
        }
        if (VwRc.HN((Double)o.a(this, -1749331022)) != VwRc.HN((Double)o.a(vwRc, -1749331022))) {
            return false;
        }
        if ((feCR)o.a(this, 1852724166) == null) {
            if ((feCR)o.a(vwRc, 1852724166) != null) {
                return false;
            }
        } else if (VwRc.HN((feCR)o.a(this, 1852724166), (feCR)o.a(vwRc, 1852724166)) == false) {
            return false;
        }
        return true;
    }

    private static Object HN(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

