/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class fTHU$2
implements Runnable {
    final /* synthetic */ fTHU sAbF;

    fTHU$2(fTHU fTHU2) {
        this.sAbF = fTHU2;
    }

    @Override
    public void run() {
        fTHU$2.LF((fTHU)o.a(this, -452309737));
    }

    private static Object LF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

