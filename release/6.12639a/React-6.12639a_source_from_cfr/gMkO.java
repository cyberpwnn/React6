/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.DyeColor
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.attribute.Attribute
 *  org.bukkit.attribute.AttributeInstance
 *  org.bukkit.entity.Ageable
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.material.Colorable
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.material.Colorable;

public class gMkO {
    private LivingEntity vkvK;
    private int count;
    private double MJoL;

    public gMkO(LivingEntity livingEntity, int n) {
        this.MJoL = gMkO.yJLS(livingEntity);
        if (n > this.UcJv()) {
            n = this.UcJv();
        }
        this.vkvK = livingEntity;
        this.count = n;
    }

    public static double yJLS(LivingEntity livingEntity) {
        if (gMkO.LD((JIWX)o.k(180045077)) == false) {
            return livingEntity.getMaxHealth();
        }
        return livingEntity.getAttribute((Attribute)o.k(-1458548035)).getValue();
    }

    public int UcJv() {
        return this.biLo(((Integer)o.k(1555518140)).intValue());
    }

    public static int UtIU(LivingEntity livingEntity) {
        return (int)((Object)gMkO.LD(2000.0 / gMkO.yJLS(livingEntity)));
    }

    public void update() {
        this.pHDn();
        this.qRvu();
    }

    private void qRvu() {
        double d = (double)this.getCount() / (double)this.UcJv();
        if (gMkO.LD(gMkO.LD(d)) != false) {
            gMkO.LD((Fpab)((Object)o.k(1457083720)), 0.2f * (float)this.getCount(), true, gMkO.LD(gMkO.LD(gMkO.LD(gMkO.LD(((LivingEntity)o.a(this, 784880967)).getLocation()), 0.0, 0.5, 0.0)), gMkO.LD(gMkO.LD(), gMkO.LD())), 16.0);
        }
    }

    private void pHDn() {
        int n;
        if ((Integer)o.a(this, -862104782) > this.oMRX()) {
            n = (Integer)o.a(this, -862104782) - this.oMRX();
            double d = this.HeSD(n);
            this.setMaxHealth(this.HeSD((Integer)o.a(this, -862104782)));
            this.UtIU(d);
        }
        if (this.oMRX() > this.biLo(this.getHealth()) && this.getCount() > 1) {
            n = (Integer)o.a(this, -862104782);
            o.v(this, -862104782, this.biLo(this.getHealth()));
            int n2 = n - (Integer)o.a(this, -862104782);
            if (n2 > 1) {
                --n2;
            }
            int n3 = 0;
            while (n3 < n2) {
                LivingEntity livingEntity = (LivingEntity)((LivingEntity)o.a(this, 784880967)).getWorld().spawnEntity(((LivingEntity)o.a(this, 784880967)).getLocation(), ((LivingEntity)o.a(this, 784880967)).getType());
                if (gMkO.LD((JIWX)o.k(-1569766124)) != false) {
                    livingEntity.setAI(false);
                } else {
                    gMkO.LD(gMkO.LD(gMkO.LD((wMJq)((Object)o.k(-960998607)), 10), 100), livingEntity);
                }
                livingEntity.setFireTicks(((LivingEntity)o.a(this, 784880967)).getFireTicks());
                if ((LivingEntity)o.a(this, 784880967) instanceof Ageable) {
                    ((Ageable)livingEntity).setAge(((Ageable)((LivingEntity)o.a(this, 784880967))).getAge());
                }
                if ((LivingEntity)o.a(this, 784880967) instanceof Colorable) {
                    ((Colorable)livingEntity).setColor(((Colorable)((LivingEntity)o.a(this, 784880967))).getColor());
                }
                livingEntity.damage(livingEntity.getHealth() + 1000.0);
                livingEntity.remove();
                ++n3;
            }
            this.setMaxHealth(this.HeSD((Integer)o.a(this, -862104782)));
        }
    }

    public void UtIU(double d) {
        this.setHealth(this.getHealth() + d);
    }

    public void setHealth(double d) {
        ((LivingEntity)o.a(this, 784880967)).setHealth(this.getMaxHealth() < d ? this.getMaxHealth() : d);
    }

    public int oMRX() {
        return this.biLo(this.getMaxHealth());
    }

    public int biLo(double d) {
        return (int)((Object)gMkO.LD(d / this.HTUD()));
    }

    public double HeSD(int n) {
        return this.HTUD() * (double)n;
    }

    public double HTUD() {
        return (Double)o.a(this, 1325290285);
    }

    public double getHealth() {
        return ((LivingEntity)o.a(this, 784880967)).getHealth();
    }

    public void setMaxHealth(double d) {
        if (this.getHealth() > d) {
            this.setHealth(d);
        }
        gMkO.yJLS((LivingEntity)o.a(this, 784880967), d);
    }

    public static void yJLS(LivingEntity livingEntity, double d) {
        if (gMkO.LD((JIWX)o.k(180045077)) == false) {
            livingEntity.setMaxHealth(d + 0.1);
            return;
        }
        livingEntity.getAttribute((Attribute)o.k(-1458548035)).setBaseValue(d);
    }

    public double getMaxHealth() {
        return gMkO.yJLS((LivingEntity)o.a(this, 784880967));
    }

    public LivingEntity getEntity() {
        return (LivingEntity)o.a(this, 784880967);
    }

    public int getCount() {
        return (Integer)o.a(this, -862104782);
    }

    private static Object LD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

