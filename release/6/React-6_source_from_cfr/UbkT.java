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

public class UbkT {
    private LivingEntity BSSn;
    private int count;
    private double OsLy;

    public UbkT(LivingEntity livingEntity, int n) {
        this.OsLy = livingEntity.getAttribute((Attribute)cv.e(-1120989046)).getValue();
        if (n > this.OPXm()) {
            n = this.OPXm();
        }
        this.BSSn = livingEntity;
        this.count = n;
    }

    public int OPXm() {
        return this.IWSm(((Integer)cv.e(1402867829)).intValue());
    }

    public static int ssNb(LivingEntity livingEntity) {
        return (int)((Object)UbkT.re(2000.0 / livingEntity.getAttribute((Attribute)cv.e(-1120989046)).getValue()));
    }

    public void update() {
        this.kYwm();
        this.sapB();
    }

    private void sapB() {
        double d = (double)this.getCount() / (double)this.OPXm();
        if (UbkT.re(UbkT.re(d)) != false) {
            UbkT.re((JbuU)((Object)cv.e(1340674161)), 0.2f * (float)this.getCount(), true, UbkT.re(UbkT.re(UbkT.re(UbkT.re(((LivingEntity)cv.b(this, -1982197648)).getLocation()), 0.0, 0.5, 0.0)), UbkT.re(UbkT.re(), UbkT.re())), 16.0);
        }
    }

    private void kYwm() {
        int n;
        if ((Integer)cv.b(this, 599920761) > this.jyXs()) {
            n = (Integer)cv.b(this, 599920761) - this.jyXs();
            double d = this.nJLQ(n);
            this.setMaxHealth(this.nJLQ((Integer)cv.b(this, 599920761)));
            this.DYFV(d);
        }
        if (this.jyXs() > this.IWSm(this.getHealth()) && this.getCount() > 1) {
            n = (Integer)cv.b(this, 599920761);
            cv.e(this, 599920761, this.IWSm(this.getHealth()));
            int n2 = n - (Integer)cv.b(this, 599920761);
            if (n2 > 1) {
                --n2;
            }
            for (int i = 0; i < n2; ++i) {
                LivingEntity livingEntity = (LivingEntity)((LivingEntity)cv.b(this, -1982197648)).getWorld().spawnEntity(((LivingEntity)cv.b(this, -1982197648)).getLocation(), ((LivingEntity)cv.b(this, -1982197648)).getType());
                livingEntity.setAI(false);
                livingEntity.setFireTicks(((LivingEntity)cv.b(this, -1982197648)).getFireTicks());
                if ((LivingEntity)cv.b(this, -1982197648) instanceof Ageable) {
                    ((Ageable)livingEntity).setAge(((Ageable)((LivingEntity)cv.b(this, -1982197648))).getAge());
                }
                if ((LivingEntity)cv.b(this, -1982197648) instanceof Colorable) {
                    ((Colorable)livingEntity).setColor(((Colorable)((LivingEntity)cv.b(this, -1982197648))).getColor());
                }
                livingEntity.damage(livingEntity.getHealth() + 1000.0);
                livingEntity.remove();
            }
            this.setMaxHealth(this.nJLQ((Integer)cv.b(this, 599920761)));
        }
    }

    public void DYFV(double d) {
        this.setHealth(this.getHealth() + d);
    }

    public void setHealth(double d) {
        ((LivingEntity)cv.b(this, -1982197648)).setHealth(this.getMaxHealth() < d ? this.getMaxHealth() : d);
    }

    public int jyXs() {
        return this.IWSm(this.getMaxHealth());
    }

    public int IWSm(double d) {
        return (int)((Object)UbkT.re(d / this.uWVB()));
    }

    public double nJLQ(int n) {
        return this.uWVB() * (double)n;
    }

    public double uWVB() {
        return (Double)cv.b(this, 1560408888);
    }

    public double getHealth() {
        return ((LivingEntity)cv.b(this, -1982197648)).getHealth();
    }

    public void setMaxHealth(double d) {
        if (this.getHealth() > d) {
            this.setHealth(d);
        }
        ((LivingEntity)cv.b(this, -1982197648)).getAttribute((Attribute)cv.e(-1120989046)).setBaseValue(d);
    }

    public double getMaxHealth() {
        return ((LivingEntity)cv.b(this, -1982197648)).getAttribute((Attribute)cv.e(-1120989046)).getValue();
    }

    public LivingEntity getEntity() {
        return (LivingEntity)cv.b(this, -1982197648);
    }

    public int getCount() {
        return (Integer)cv.b(this, 599920761);
    }

    private static Object re(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

