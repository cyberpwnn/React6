/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class ksfs$1
extends yJLL {
    final /* synthetic */ ksfs ssMm;

    ksfs$1(ksfs ksfs2) {
        this.ssMm = ksfs2;
    }

    @Override
    public void run() {
        ksfs$1.Iq((ksfs)yy.h(this, -250413189));
    }

    private static Object Iq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

