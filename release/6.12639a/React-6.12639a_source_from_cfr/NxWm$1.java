/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class NxWm$1
extends Lqeo {
    final /* synthetic */ NxWm igKq;

    NxWm$1(NxWm nxWm, String string, int n, gxcp gxcp2) {
        this.igKq = nxWm;
        super(string, n, gxcp2);
    }

    @Override
    public long Xtjf() {
        return (long)NxWm$1.FV((NxWm)o.a(this, -1412870914));
    }

    private static Object FV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

