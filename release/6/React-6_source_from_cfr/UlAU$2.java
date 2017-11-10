/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class UlAU$2
implements Runnable {
    final /* synthetic */ UlAU CDxK;

    UlAU$2(UlAU ulAU) {
        this.CDxK = ulAU;
    }

    @Override
    public void run() {
        UlAU$2.Gb((UlAU)yy.h(this, 1818887711));
    }

    private static Object Gb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

