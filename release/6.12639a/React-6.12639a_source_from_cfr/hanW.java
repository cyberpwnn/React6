/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.entity.Entity;

public class hanW {
    private Lhwj<Entity> jWit = new Lhwj();

    public void TEqA(Entity entity) {
        hanW.PL((Lhwj)o.a(this, -109689534), entity);
    }

    public boolean hasNext() {
        if (hanW.PL((Lhwj)o.a(this, -109689534)) != false) {
            return false;
        }
        return true;
    }

    public Entity DaUw() {
        Entity entity = (Entity)hanW.PL((Lhwj)o.a(this, -109689534)).next();
        hanW.PL((Lhwj)o.a(this, -109689534), entity);
        return entity;
    }

    private static Object PL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

