/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Ageable
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.LivingEntity
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class VCjX
extends WqbE {
    private int HKpq;
    private boolean KDYk;
    private boolean MBPH;

    public VCjX(Ageable ageable) {
        super((LivingEntity)ageable);
        this.HKpq = ageable.getAge();
        this.MBPH = ageable.canBreed();
        this.KDYk = ageable.getAgeLock();
    }

    @Override
    public void yIkI(Entity entity) {
        super.yIkI(entity);
        Ageable ageable = (Ageable)entity;
        ageable.setAge(((Integer)yy.h(this, 1636370128)).intValue());
        ageable.setBreed(((Boolean)yy.h(this, 1843529381)).booleanValue());
        ageable.setAgeLock(((Boolean)yy.h(this, 556861086)).booleanValue());
    }

    public int getAge() {
        return (Integer)yy.h(this, 1636370128);
    }

    public void setAge(int n) {
        yy.E(this, 1636370128, n);
    }

    public boolean MlWV() {
        return (Boolean)yy.h(this, 556861086);
    }

    public void setAgeLock(boolean bl) {
        yy.E(this, 556861086, bl);
    }

    public boolean biSA() {
        return (Boolean)yy.h(this, 1843529381);
    }

    public void setBreed(boolean bl) {
        yy.E(this, 1843529381, bl);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Integer)yy.h(this, 1636370128);
        n2 = n2 * 31 + ((Boolean)yy.h(this, 556861086) != false ? 1231 : 1237);
        n2 = n2 * 31 + ((Boolean)yy.h(this, 1843529381) != false ? 1231 : 1237);
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
        if (VCjX.wf(this) != VCjX.wf(object)) {
            return false;
        }
        VCjX vCjX = (VCjX)object;
        if (((Integer)yy.h(this, 1636370128)).intValue() != ((Integer)yy.h(vCjX, 1636370128)).intValue()) {
            return false;
        }
        if (((Boolean)yy.h(this, 556861086)).booleanValue() != ((Boolean)yy.h(vCjX, 556861086)).booleanValue()) {
            return false;
        }
        if (((Boolean)yy.h(this, 1843529381)).booleanValue() != ((Boolean)yy.h(vCjX, 1843529381)).booleanValue()) {
            return false;
        }
        return true;
    }

    private static Object wf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

