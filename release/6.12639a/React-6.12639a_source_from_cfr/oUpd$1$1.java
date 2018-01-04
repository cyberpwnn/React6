/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class oUpd$1$1
extends xGOy {
    final /* synthetic */ oUpd.1 FGRw;
    private final /* synthetic */ Runnable yuww;

    oUpd$1$1(oUpd.1 var1_1, Runnable runnable) {
        this.FGRw = var1_1;
        this.yuww = runnable;
    }

    @Override
    public void run() {
        ((Runnable)o.a(this, 16078431)).run();
        oUpd$1$1.lV();
    }

    private static Object lV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

