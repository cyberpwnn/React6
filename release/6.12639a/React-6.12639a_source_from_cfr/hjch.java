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

public class hjch
extends VwRc {
    private int oFCL;
    private boolean qKhQ;
    private boolean bjQb;

    public hjch(Ageable ageable) {
        super((LivingEntity)ageable);
        this.oFCL = ageable.getAge();
        this.bjQb = ageable.canBreed();
        this.qKhQ = ageable.getAgeLock();
    }

    @Override
    public void ktHX(Entity entity) {
        super.ktHX(entity);
        Ageable ageable = (Ageable)entity;
        ageable.setAge(((Integer)o.a(this, 1762284347)).intValue());
        ageable.setBreed(((Boolean)o.a(this, 1169707978)).booleanValue());
        ageable.setAgeLock(((Boolean)o.a(this, -1472244791)).booleanValue());
    }

    public int getAge() {
        return (Integer)o.a(this, 1762284347);
    }

    public void setAge(int n) {
        o.v(this, 1762284347, n);
    }

    public boolean hjch() {
        return (Boolean)o.a(this, -1472244791);
    }

    public void setAgeLock(boolean bl) {
        o.v(this, -1472244791, bl);
    }

    public boolean avpo() {
        return (Boolean)o.a(this, 1169707978);
    }

    public void setBreed(boolean bl) {
        o.v(this, 1169707978, bl);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Integer)o.a(this, 1762284347);
        n2 = n2 * 31 + ((Boolean)o.a(this, -1472244791) != false ? 1231 : 1237);
        n2 = n2 * 31 + ((Boolean)o.a(this, 1169707978) != false ? 1231 : 1237);
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
        if (hjch.ug(this) != hjch.ug(object)) {
            return false;
        }
        hjch hjch2 = (hjch)object;
        if (((Integer)o.a(this, 1762284347)).intValue() != ((Integer)o.a(hjch2, 1762284347)).intValue()) {
            return false;
        }
        if (((Boolean)o.a(this, -1472244791)).booleanValue() != ((Boolean)o.a(hjch2, -1472244791)).booleanValue()) {
            return false;
        }
        if (((Boolean)o.a(this, 1169707978)).booleanValue() != ((Boolean)o.a(hjch2, 1169707978)).booleanValue()) {
            return false;
        }
        return true;
    }

    private static Object ug(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

