/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class qltY$1
implements ntkx {
    final /* synthetic */ qltY PfOf;

    qltY$1(qltY qltY2) {
        this.PfOf = qltY2;
    }

    @Override
    public String uVol(double d) {
        return qltY$1.mR(d / 1000000.0, true);
    }

    private static Object mR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

