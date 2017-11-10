/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class UlAU$1
implements Runnable {
    final /* synthetic */ UlAU CDxK;

    UlAU$1(UlAU ulAU) {
        this.CDxK = ulAU;
    }

    @Override
    public void run() {
        UlAU$1.Em(NVIs$JbpD.H("\u85f0\u9867\u8000\udf83\u25a2\u6ff7\u6f03\ubbc7\u5840\u375e\u4980\u4c5f\ue416\u85d3\uf6fe"));
        UlAU$1.Em(UlAU$1.Em((UlAU)yy.h(this, -1184037343)));
    }

    private static Object Em(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

