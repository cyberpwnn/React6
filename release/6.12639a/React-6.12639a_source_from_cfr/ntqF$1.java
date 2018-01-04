/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class ntqF$1
implements ntkx {
    final /* synthetic */ ntqF rrBM;

    ntqF$1(ntqF ntqF2) {
        this.rrBM = ntqF2;
    }

    @Override
    public String uVol(double d) {
        return ntqF$1.sq(d, true);
    }

    private static Object sq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

