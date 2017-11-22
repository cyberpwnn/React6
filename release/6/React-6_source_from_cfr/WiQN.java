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

public class WiQN
extends mhnc {
    private boolean dogY;

    public WiQN(Sheep sheep) {
        super((Colorable)sheep);
        this.dogY = sheep.isSheared();
    }

    @Override
    public void nJLQ(Entity entity) {
        super.nJLQ(entity);
        Sheep sheep = (Sheep)entity;
        sheep.setSheared(((Boolean)cv.b(this, -230682396)).booleanValue());
    }

    public boolean isSheared() {
        return (Boolean)cv.b(this, -230682396);
    }

    public void setSheared(boolean bl) {
        cv.e(this, -230682396, bl);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = n2 * 31 + ((Boolean)cv.b(this, -230682396) != false ? 1231 : 1237);
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
        if (WiQN.CR(this) != WiQN.CR(object)) {
            return false;
        }
        WiQN wiQN = (WiQN)object;
        if (((Boolean)cv.b(this, -230682396)).booleanValue() != ((Boolean)cv.b(wiQN, -230682396)).booleanValue()) {
            return false;
        }
        return true;
    }

    private static Object CR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

