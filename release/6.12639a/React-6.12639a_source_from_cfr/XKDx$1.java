/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.util.Vector;

class XKDx$1
extends CEKe<Vector, Vector> {
    private final /* synthetic */ Vector CGem;

    XKDx$1(Vector vector) {
        this.CGem = vector;
    }

    public Vector UQfI(Vector vector) {
        return XKDx$1.rO(vector, (Vector)o.a(this, -692829725));
    }

    @Override
    public /* synthetic */ Object GPlk(Object object) {
        return this.UQfI((Vector)object);
    }

    private static Object rO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

