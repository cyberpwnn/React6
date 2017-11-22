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

public class oVCY {
    private QyFw<Entity> BSOO = new QyFw();

    public void jhSt(Entity entity) {
        oVCY.uR((QyFw)cv.b(this, 774836072), entity);
    }

    public boolean hasNext() {
        if (oVCY.uR((QyFw)cv.b(this, 774836072)) == false) {
            return true;
        }
        return false;
    }

    public Entity hHYn() {
        Entity entity = (Entity)oVCY.uR((QyFw)cv.b(this, 774836072)).next();
        oVCY.uR((QyFw)cv.b(this, 774836072), entity);
        return entity;
    }

    private static Object uR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

