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

public class WqbE
extends lekR {
    private PBUD<PotionEffect> hINH;
    private boolean hcAC;
    private ItemStack[] wCvd;
    private float fallDistance;
    private int fireTicks;
    private double oMbA;
    private double maxHealth;
    private int FWMk;
    private int sjoR;

    public WqbE(LivingEntity livingEntity) {
        super((Entity)livingEntity);
        this.hINH = new PBUD(livingEntity.getActivePotionEffects());
        this.hcAC = livingEntity.getCanPickupItems();
        this.wCvd = livingEntity.getEquipment().getArmorContents();
        this.fallDistance = livingEntity.getFallDistance();
        this.fireTicks = livingEntity.getFireTicks();
        this.oMbA = livingEntity.getHealth();
        this.maxHealth = livingEntity.getMaxHealth();
        this.FWMk = livingEntity.getMaximumAir();
        this.sjoR = livingEntity.getRemainingAir();
    }

    @Override
    public void yIkI(Entity entity) {
        super.yIkI(entity);
        LivingEntity livingEntity = (LivingEntity)entity;
        Object object = WqbE.lh((PBUD)yy.h(this, -489224487));
        while (object.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)object.next();
            livingEntity.addPotionEffect(potionEffect);
        }
        livingEntity.setCanPickupItems(((Boolean)yy.h(this, -1688467806)).booleanValue());
        livingEntity.getEquipment().setArmorContents((ItemStack[])yy.h(this, 533006039));
        livingEntity.setFallDistance(((Float)yy.h(this, -2120481064)).floatValue());
        livingEntity.setMaxHealth(((Double)yy.h(this, 1043269293)).doubleValue());
        livingEntity.setHealth(((Double)yy.h(this, -166328666)).doubleValue());
        livingEntity.setMaximumAir(((Integer)yy.h(this, 607454891)).intValue());
        livingEntity.setRemainingAir(((Integer)yy.h(this, 342886060)).intValue());
        livingEntity.setFireTicks(((Integer)yy.h(this, 177145505)).intValue());
    }

    public PBUD<PotionEffect> MJTO() {
        return (PBUD)yy.h(this, -489224487);
    }

    public void yJLL(PBUD<PotionEffect> pBUD) {
        yy.E(this, -489224487, pBUD);
    }

    public boolean vtKx() {
        return (Boolean)yy.h(this, -1688467806);
    }

    public void setCanPickupItems(boolean bl) {
        yy.E(this, -1688467806, bl);
    }

    public ItemStack[] getArmorContents() {
        return (ItemStack[])yy.h(this, 533006039);
    }

    public void setArmorContents(ItemStack[] arritemStack) {
        yy.E(this, 533006039, arritemStack);
    }

    public float getFallDistance() {
        return ((Float)yy.h(this, -2120481064)).floatValue();
    }

    public void setFallDistance(float f) {
        yy.E(this, -2120481064, Float.valueOf(f));
    }

    public int getFireTicks() {
        return (Integer)yy.h(this, 177145505);
    }

    public void setFireTicks(int n) {
        yy.E(this, 177145505, n);
    }

    public double getHealth() {
        return (Double)yy.h(this, -166328666);
    }

    public void setHealth(double d) {
        yy.E(this, -166328666, d);
    }

    public double getMaxHealth() {
        return (Double)yy.h(this, 1043269293);
    }

    public void setMaxHealth(double d) {
        yy.E(this, 1043269293, d);
    }

    public int Cfid() {
        return (Integer)yy.h(this, 607454891);
    }

    public void RjaO(int n) {
        yy.E(this, 607454891, n);
    }

    public int kHxI() {
        return (Integer)yy.h(this, 342886060);
    }

    public void mhmm(int n) {
        yy.E(this, 342886060, n);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Integer)yy.h(this, 342886060);
        n2 = n2 * 31 + WqbE.lh((ItemStack[])yy.h(this, 533006039));
        n2 = n2 * 31 + ((Boolean)yy.h(this, -1688467806) != false ? 1231 : 1237);
        n2 = n2 * 31 + WqbE.lh(((Float)yy.h(this, -2120481064)).floatValue());
        n2 = n2 * 31 + (Integer)yy.h(this, 177145505);
        Object object = WqbE.lh((Double)yy.h(this, -166328666));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Integer)yy.h(this, 607454891);
        object = WqbE.lh((Double)yy.h(this, 1043269293));
        n2 = n2 * 31 + (Object)(object ^ object >>> 32);
        n2 = n2 * 31 + (Object)((PBUD)yy.h(this, -489224487) == null ? 0 : (Object)WqbE.lh((PBUD)yy.h(this, -489224487)));
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
        if (WqbE.lh(this) != WqbE.lh(object)) {
            return false;
        }
        WqbE wqbE = (WqbE)object;
        if (((Integer)yy.h(this, 342886060)).intValue() != ((Integer)yy.h(wqbE, 342886060)).intValue()) {
            return false;
        }
        if (WqbE.lh((ItemStack[])yy.h(this, 533006039), (ItemStack[])yy.h(wqbE, 533006039)) == false) {
            return false;
        }
        if (((Boolean)yy.h(this, -1688467806)).booleanValue() != ((Boolean)yy.h(wqbE, -1688467806)).booleanValue()) {
            return false;
        }
        if (WqbE.lh(((Float)yy.h(this, -2120481064)).floatValue()) != WqbE.lh(((Float)yy.h(wqbE, -2120481064)).floatValue())) {
            return false;
        }
        if (((Integer)yy.h(this, 177145505)).intValue() != ((Integer)yy.h(wqbE, 177145505)).intValue()) {
            return false;
        }
        if (WqbE.lh((Double)yy.h(this, -166328666)) != WqbE.lh((Double)yy.h(wqbE, -166328666))) {
            return false;
        }
        if (((Integer)yy.h(this, 607454891)).intValue() != ((Integer)yy.h(wqbE, 607454891)).intValue()) {
            return false;
        }
        if (WqbE.lh((Double)yy.h(this, 1043269293)) != WqbE.lh((Double)yy.h(wqbE, 1043269293))) {
            return false;
        }
        if ((PBUD)yy.h(this, -489224487) == null) {
            if ((PBUD)yy.h(wqbE, -489224487) != null) {
                return false;
            }
        } else if (WqbE.lh((PBUD)yy.h(this, -489224487), (PBUD)yy.h(wqbE, -489224487)) == false) {
            return false;
        }
        return true;
    }

    private static Object lh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

