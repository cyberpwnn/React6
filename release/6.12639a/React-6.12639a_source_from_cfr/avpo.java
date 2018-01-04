/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.DyeColor
 *  org.bukkit.entity.Ageable
 *  org.bukkit.entity.Entity
 *  org.bukkit.material.Colorable
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.DyeColor;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.material.Colorable;

public class avpo
extends hjch {
    private DyeColor lxOL;

    public avpo(Colorable colorable) {
        super((Ageable)colorable);
        this.lxOL = colorable.getColor();
    }

    @Override
    public void ktHX(Entity entity) {
        super.ktHX(entity);
        Colorable colorable = (Colorable)entity;
        colorable.setColor((DyeColor)o.a(this, 1353405384));
    }

    public DyeColor VwRc() {
        return (DyeColor)o.a(this, 1353405384);
    }

    public void yJLS(DyeColor dyeColor) {
        o.v(this, 1353405384, (Object)dyeColor);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Object)((DyeColor)o.a(this, 1353405384) == null ? 0 : (Object)avpo.Aw((DyeColor)o.a(this, 1353405384)));
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
        if (avpo.Aw(this) != avpo.Aw(object)) {
            return false;
        }
        avpo avpo2 = (avpo)object;
        if ((DyeColor)o.a(this, 1353405384) != (DyeColor)o.a(avpo2, 1353405384)) {
            return false;
        }
        return true;
    }

    private static Object Aw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

