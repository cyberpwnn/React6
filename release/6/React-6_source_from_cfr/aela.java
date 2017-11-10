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

public class aela
extends VCjX {
    private DyeColor CUuW;

    public aela(Colorable colorable) {
        super((Ageable)colorable);
        this.CUuW = colorable.getColor();
    }

    @Override
    public void yIkI(Entity entity) {
        super.yIkI(entity);
        Colorable colorable = (Colorable)entity;
        colorable.setColor((DyeColor)yy.h(this, -292026717));
    }

    public DyeColor uVvB() {
        return (DyeColor)yy.h(this, -292026717);
    }

    public void mXJp(DyeColor dyeColor) {
        yy.E(this, -292026717, (Object)dyeColor);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + (Object)((DyeColor)yy.h(this, -292026717) == null ? 0 : (Object)aela.wT((DyeColor)yy.h(this, -292026717)));
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
        if (aela.wT(this) != aela.wT(object)) {
            return false;
        }
        aela aela2 = (aela)object;
        if ((DyeColor)yy.h(this, -292026717) != (DyeColor)yy.h(aela2, -292026717)) {
            return false;
        }
        return true;
    }

    private static Object wT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

