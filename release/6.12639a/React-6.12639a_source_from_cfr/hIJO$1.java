/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class hIJO$1
implements ntkx {
    final /* synthetic */ hIJO iEFA;

    hIJO$1(hIJO hIJO2) {
        this.iEFA = hIJO2;
    }

    @Override
    public String uVol(double d) {
        return hIJO$1.Go((int)d);
    }

    private static Object Go(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}
