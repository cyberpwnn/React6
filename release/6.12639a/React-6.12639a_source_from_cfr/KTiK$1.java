/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class KTiK$1
extends CxNA {
    final /* synthetic */ KTiK hjqu;
    private final /* synthetic */ xynF gFNH;

    KTiK$1(KTiK kTiK, xynF xynF2) {
        this.hjqu = kTiK;
        this.gFNH = xynF2;
    }

    @Override
    public void run() {
        Object object = KTiK$1.iF(KTiK$1.iF());
        KTiK$1.iF();
        Object object2 = KTiK$1.iF(KTiK$1.iF());
        new KTiK$1$1(this, (long)object2, (long)object, (xynF)o.a(this, 23413780));
    }

    static /* synthetic */ KTiK yJLS(KTiK$1 kTiK$1) {
        return (KTiK)o.a(kTiK$1, 794706963);
    }

    private static Object iF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

