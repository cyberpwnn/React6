/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class XdNf$1
implements ntkx {
    final /* synthetic */ XdNf RdCl;

    XdNf$1(XdNf xdNf) {
        this.RdCl = xdNf;
    }

    @Override
    public String uVol(double d) {
        return XdNf$1.Eu((int)d);
    }

    private static Object Eu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

