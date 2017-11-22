/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class BuHU$1$1
extends dDce {
    final /* synthetic */ BuHU.1 lwcK;

    BuHU$1$1(BuHU.1 var1_1) {
        this.lwcK = var1_1;
    }

    @Override
    public void run() {
        BuHU$1$1.qz(KUXS$dwji.S("\u11e5\uc3af\u0216\u3463\uebca\ud9e8\u2112\u8d6b\u662b\u8764\u16fd\u7e1d\u18a4\u91dd\u0e38\u2b93\u1944\u37bb\u97c1"));
        try {
            BuHU$1$1.qz();
            BuHU$1$1.qz(KUXS$dwji.S("\u11f5\uc3a3\u021a\u347d\uebc8\ud9e4\u2108\u8d69\u666f\u8715"));
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            BuHU$1$1.qz(iOException);
            return;
        }
    }

    private static Object qz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

