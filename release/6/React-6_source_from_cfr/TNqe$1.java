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

class TNqe$1
extends EvEN<Vector, Vector> {
    private final /* synthetic */ Vector MfKo;

    TNqe$1(Vector vector) {
        this.MfKo = vector;
    }

    public Vector WGJn(Vector vector) {
        return TNqe$1.ik(vector, (Vector)cv.b(this, 740030606));
    }

    @Override
    public /* synthetic */ Object jhSt(Object object) {
        return this.WGJn((Vector)object);
    }

    private static Object ik(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

