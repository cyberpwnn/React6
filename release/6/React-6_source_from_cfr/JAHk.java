/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Sheep
 *  org.bukkit.material.Colorable
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Sheep;
import org.bukkit.material.Colorable;

public class JAHk
extends aela {
    private boolean CNFI;

    public JAHk(Sheep sheep) {
        super((Colorable)sheep);
        this.CNFI = sheep.isSheared();
    }

    @Override
    public void yIkI(Entity entity) {
        super.yIkI(entity);
        Sheep sheep = (Sheep)entity;
        sheep.setSheared(((Boolean)yy.h(this, 1481705203)).booleanValue());
    }

    public boolean isSheared() {
        return (Boolean)yy.h(this, 1481705203);
    }

    public void setSheared(boolean bl) {
        yy.E(this, 1481705203, bl);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + ((Boolean)yy.h(this, 1481705203) != false ? 1231 : 1237);
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
        if (JAHk.fw(this) != JAHk.fw(object)) {
            return false;
        }
        JAHk jAHk = (JAHk)object;
        if (((Boolean)yy.h(this, 1481705203)).booleanValue() != ((Boolean)yy.h(jAHk, 1481705203)).booleanValue()) {
            return false;
        }
        return true;
    }

    private static Object fw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

