/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class xGWE$1
implements ntkx {
    final /* synthetic */ xGWE pAHW;

    xGWE$1(xGWE xGWE2) {
        this.pAHW = xGWE2;
    }

    @Override
    public String uVol(double d) {
        return xGWE$1.jv(d, true);
    }

    private static Object jv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

