/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class Bcie$1$1
extends CxNA {
    final /* synthetic */ Bcie.1 LPfX;

    Bcie$1$1(Bcie.1 var1_1) {
        this.LPfX = var1_1;
    }

    @Override
    public void run() {
        Bcie$1$1.qJ(Bcie$1$1.qJ(mrFx$WjFM.d("\u96e2\ufd1f\u9619\u2ced\u7950\ud11d\ufcc8\u6e08\ue9a6\u5d8e\u654f\u8232\ua527\uc70c\ue96b\uf0be\u7294\uc405\u7f01\u6569\u230a\uf54a\u8c36\u91a7\u399c\u96b5\ua846\u03c8\u24d2\u7a1d\u808a\ue343\u91e7\uf34b\u10b8\u90d9\u4a47\uf87e\ufef4\ue693\u0083")));
        try {
            Bcie$1$1.qJ();
            Bcie$1$1.qJ(Bcie$1$1.qJ(mrFx$WjFM.d("\u96e2\ufd1f\u9619\u2ced\u7950\ud11d\ufcc8\u6e08\ue9a6\u5d8e\u654f\u8232\ua527\uc70c\ue96b\uf0be\u7294\uc405\u7f01\u6569\u230a\uf54a\u8c36\u91a7\u399c\u96a5\ua84a\u03c4\u24cc\u7a1f\u8086\ue359\u91e5\uf302")));
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            Bcie$1$1.qJ(iOException);
            return;
        }
    }

    private static Object qJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

