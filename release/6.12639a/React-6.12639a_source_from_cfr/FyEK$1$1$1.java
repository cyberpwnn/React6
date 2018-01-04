/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class FyEK$1$1$1
implements Runnable {
    final /* synthetic */ FyEK$1$1 FNpY;

    FyEK$1$1$1(FyEK$1$1 var1_1) {
        this.FNpY = var1_1;
    }

    @Override
    public void run() {
        FyEK$1$1$1.op(FyEK$1$1$1.op(FyEK$1$1$1.op((FyEK$1$1)o.a(this, -1423419242))), true);
    }

    private static Object op(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

