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

public class mhnc
extends RkCQ {
    private DyeColor uOTo;

    public mhnc(Colorable colorable) {
        super((Ageable)colorable);
        this.uOTo = colorable.getColor();
    }

    @Override
    public void nJLQ(Entity entity) {
        super.nJLQ(entity);
        Colorable colorable = (Colorable)entity;
        colorable.setColor((DyeColor)cv.b(this, -2121338060));
    }

    public DyeColor RkCQ() {
        return (DyeColor)cv.b(this, -2121338060);
    }

    public void ssNb(DyeColor dyeColor) {
        cv.e(this, -2121338060, (Object)dyeColor);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Object)((DyeColor)cv.b(this, -2121338060) == null ? 0 : (Object)mhnc.EH((DyeColor)cv.b(this, -2121338060)));
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
        if (mhnc.EH(this) != mhnc.EH(object)) {
            return false;
        }
        mhnc mhnc2 = (mhnc)object;
        if ((DyeColor)cv.b(this, -2121338060) != (DyeColor)cv.b(mhnc2, -2121338060)) {
            return false;
        }
        return true;
    }

    private static Object EH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

