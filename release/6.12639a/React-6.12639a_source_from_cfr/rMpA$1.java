/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class rMpA$1
extends vbvg {
    final /* synthetic */ rMpA eIMQ;

    rMpA$1(rMpA rMpA2, String string, int n) {
        this.eIMQ = rMpA2;
        super(string, n);
    }

    @Override
    public void run() {
        if (((Boolean)o.k(1632262381)).booleanValue()) {
            rMpA$1.Kb((rMpA)o.a(this, 33969790));
        }
    }

    private static Object Kb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

