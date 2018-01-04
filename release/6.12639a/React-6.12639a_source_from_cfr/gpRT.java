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

public class gpRT
extends avpo {
    private boolean fSxR;

    public gpRT(Sheep sheep) {
        super((Colorable)sheep);
        this.fSxR = sheep.isSheared();
    }

    @Override
    public void ktHX(Entity entity) {
        super.ktHX(entity);
        Sheep sheep = (Sheep)entity;
        sheep.setSheared(((Boolean)o.a(this, 549344184)).booleanValue());
    }

    public boolean isSheared() {
        return (Boolean)o.a(this, 549344184);
    }

    public void setSheared(boolean bl) {
        o.v(this, 549344184, bl);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + ((Boolean)o.a(this, 549344184) != false ? 1231 : 1237);
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
        if (gpRT.Tg(this) != gpRT.Tg(object)) {
            return false;
        }
        gpRT gpRT2 = (gpRT)object;
        if (((Boolean)o.a(this, 549344184)).booleanValue() != ((Boolean)o.a(gpRT2, 549344184)).booleanValue()) {
            return false;
        }
        return true;
    }

    private static Object Tg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

