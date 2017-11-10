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

public class kYtq {
    private hGxw<Entity> dobQ = new hGxw();

    public void JRFt(Entity entity) {
        kYtq.So((hGxw)yy.h(this, -1855198780), entity);
    }

    public boolean hasNext() {
        if (kYtq.So((hGxw)yy.h(this, -1855198780)) == false) {
            return true;
        }
        return false;
    }

    public Entity bWnA() {
        Entity entity = (Entity)kYtq.So((hGxw)yy.h(this, -1855198780)).next();
        kYtq.So((hGxw)yy.h(this, -1855198780), entity);
        return entity;
    }

    private static Object So(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

