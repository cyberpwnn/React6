/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class lUVJ$1
implements ntkx {
    final /* synthetic */ lUVJ VhCG;

    lUVJ$1(lUVJ lUVJ2) {
        this.VhCG = lUVJ2;
    }

    @Override
    public String uVol(double d) {
        return lUVJ$1.YK((long)d);
    }

    private static Object YK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

