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

public class RkCQ
extends YDcD {
    private int MctC;
    private boolean ndRm;
    private boolean Mcsc;

    public RkCQ(Ageable ageable) {
        super((LivingEntity)ageable);
        this.MctC = ageable.getAge();
        this.Mcsc = ageable.canBreed();
        this.ndRm = ageable.getAgeLock();
    }

    @Override
    public void nJLQ(Entity entity) {
        super.nJLQ(entity);
        Ageable ageable = (Ageable)entity;
        ageable.setAge(((Integer)cv.b(this, -502140085)).intValue());
        ageable.setBreed(((Boolean)cv.b(this, -1258949814)).booleanValue());
        ageable.setAgeLock(((Boolean)cv.b(this, 660534069)).booleanValue());
    }

    public int getAge() {
        return (Integer)cv.b(this, -502140085);
    }

    public void setAge(int n) {
        cv.e(this, -502140085, n);
    }

    public boolean YffC() {
        return (Boolean)cv.b(this, 660534069);
    }

    public void setAgeLock(boolean bl) {
        cv.e(this, 660534069, bl);
    }

    public boolean HuvK() {
        return (Boolean)cv.b(this, -1258949814);
    }

    public void setBreed(boolean bl) {
        cv.e(this, -1258949814, bl);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Integer)cv.b(this, -502140085);
        n2 = n2 * 31 + ((Boolean)cv.b(this, 660534069) != false ? 1231 : 1237);
        n2 = n2 * 31 + ((Boolean)cv.b(this, -1258949814) != false ? 1231 : 1237);
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
        if (RkCQ.kD(this) != RkCQ.kD(object)) {
            return false;
        }
        RkCQ rkCQ = (RkCQ)object;
        if (((Integer)cv.b(this, -502140085)).intValue() != ((Integer)cv.b(rkCQ, -502140085)).intValue()) {
            return false;
        }
        if (((Boolean)cv.b(this, 660534069)).booleanValue() != ((Boolean)cv.b(rkCQ, 660534069)).booleanValue()) {
            return false;
        }
        if (((Boolean)cv.b(this, -1258949814)).booleanValue() != ((Boolean)cv.b(rkCQ, -1258949814)).booleanValue()) {
            return false;
        }
        return true;
    }

    private static Object kD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

