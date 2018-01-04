/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class xGOy$1
extends mFpP {
    final /* synthetic */ xGOy AsKB;

    xGOy$1(xGOy xGOy2) {
        this.AsKB = xGOy2;
    }

    @Override
    public void run() {
        xGOy$1.wV((xGOy)o.a(this, 948846209));
    }

    private static Object wV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

