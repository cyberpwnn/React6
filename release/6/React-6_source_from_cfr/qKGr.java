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

public class qKGr {
    private LivingEntity dxVy;
    private int count;
    private double woMD;

    public qKGr(LivingEntity livingEntity, int n) {
        this.woMD = livingEntity.getAttribute((Attribute)yy.p(690489196)).getValue();
        if (n > this.lfOH()) {
            n = this.lfOH();
        }
        this.dxVy = livingEntity;
        this.count = n;
    }

    public int lfOH() {
        return this.qArm(((Integer)yy.p(-518322335)).intValue());
    }

    public static int mXJp(LivingEntity livingEntity) {
        return (int)((Object)qKGr.tf(2000.0 / livingEntity.getAttribute((Attribute)yy.p(690489196)).getValue()));
    }

    public void update() {
        this.bFnS();
        this.ydCs();
    }

    private void ydCs() {
        double d = (double)this.getCount() / (double)this.lfOH();
        if (qKGr.tf(qKGr.tf(d)) != false) {
            qKGr.tf((OGmN)((Object)yy.p(-633469259)), 0.2f * (float)this.getCount(), true, qKGr.tf(qKGr.tf(qKGr.tf(qKGr.tf(((LivingEntity)yy.h(this, 2031879854)).getLocation()), 0.0, 0.5, 0.0)), qKGr.tf(qKGr.tf(), qKGr.tf())), 16.0);
        }
    }

    private void bFnS() {
        int n;
        if ((Integer)yy.h(this, 117704381) > this.RkDm()) {
            n = (Integer)yy.h(this, 117704381) - this.RkDm();
            double d = this.WNxt(n);
            this.setMaxHealth(this.WNxt((Integer)yy.h(this, 117704381)));
            this.yIkA(d);
        }
        if (this.RkDm() > this.qArm(this.getHealth()) && this.getCount() > 1) {
            n = (Integer)yy.h(this, 117704381);
            yy.E(this, 117704381, this.qArm(this.getHealth()));
            int n2 = n - (Integer)yy.h(this, 117704381);
            if (n2 > 1) {
                --n2;
            }
            for (int i = 0; i < n2; ++i) {
                LivingEntity livingEntity = (LivingEntity)((LivingEntity)yy.h(this, 2031879854)).getWorld().spawnEntity(((LivingEntity)yy.h(this, 2031879854)).getLocation(), ((LivingEntity)yy.h(this, 2031879854)).getType());
                livingEntity.setAI(false);
                livingEntity.setFireTicks(((LivingEntity)yy.h(this, 2031879854)).getFireTicks());
                if ((LivingEntity)yy.h(this, 2031879854) instanceof Ageable) {
                    ((Ageable)livingEntity).setAge(((Ageable)((LivingEntity)yy.h(this, 2031879854))).getAge());
                }
                if ((LivingEntity)yy.h(this, 2031879854) instanceof Colorable) {
                    ((Colorable)livingEntity).setColor(((Colorable)((LivingEntity)yy.h(this, 2031879854))).getColor());
                }
                livingEntity.damage(livingEntity.getHealth() + 1000.0);
                livingEntity.remove();
            }
            this.setMaxHealth(this.WNxt((Integer)yy.h(this, 117704381)));
        }
    }

    public void yIkA(double d) {
        this.setHealth(this.getHealth() + d);
    }

    public void setHealth(double d) {
        ((LivingEntity)yy.h(this, 2031879854)).setHealth(this.getMaxHealth() < d ? this.getMaxHealth() : d);
    }

    public int RkDm() {
        return this.qArm(this.getMaxHealth());
    }

    public int qArm(double d) {
        return (int)((Object)qKGr.tf(d / this.rNNN()));
    }

    public double WNxt(int n) {
        return this.rNNN() * (double)n;
    }

    public double rNNN() {
        return (Double)yy.h(this, 905709238);
    }

    public double getHealth() {
        return ((LivingEntity)yy.h(this, 2031879854)).getHealth();
    }

    public void setMaxHealth(double d) {
        if (this.getHealth() > d) {
            this.setHealth(d);
        }
        ((LivingEntity)yy.h(this, 2031879854)).getAttribute((Attribute)yy.p(690489196)).setBaseValue(d);
    }

    public double getMaxHealth() {
        return ((LivingEntity)yy.h(this, 2031879854)).getAttribute((Attribute)yy.p(690489196)).getValue();
    }

    public LivingEntity getEntity() {
        return (LivingEntity)yy.h(this, 2031879854);
    }

    public int getCount() {
        return (Integer)yy.h(this, 117704381);
    }

    private static Object tf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

