/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class kQsA$2
extends WaKm {
    final /* synthetic */ kQsA OjnV;

    kQsA$2(kQsA kQsA2) {
        this.OjnV = kQsA2;
    }

    @Override
    public void ktXM() {
        kQsA$2.Et((kQsA)cv.b(this, -1227950977), this.mrMJ());
        kQsA$2.Et((kQsA)cv.b(this, -1227950977), this.GtBM());
        kQsA$2.Et(kQsA$2.Et((kQsA)cv.b(this, -1227950977)), kQsA$2.Et((kQsA)cv.b(this, -1227950977)));
        kQsA$2.Et(kQsA$2.Et((kQsA)cv.b(this, -1227950977)), kQsA$2.Et((kQsA)cv.b(this, -1227950977)));
        kQsA$2.Et((kQsA)cv.b(this, -1227950977), kQsA$2.Et(kQsA$2.Et((kQsA)cv.b(this, -1227950977))));
        kQsA$2.Et((kQsA)cv.b(this, -1227950977), kQsA$2.Et(kQsA$2.Et((kQsA)cv.b(this, -1227950977))));
        kQsA$2.Et((kQsA)cv.b(this, -1227950977), kQsA$2.Et((kQsA)cv.b(this, -1227950977)) / 50.0);
        kQsA$2.Et((kQsA)cv.b(this, -1227950977), kQsA$2.Et((kQsA)cv.b(this, -1227950977)) / 50.0);
        kQsA$2.Et((kQsA)cv.b(this, -1227950977), 50.0 - kQsA$2.Et((kQsA)cv.b(this, -1227950977)) < 0.0 ? 0.0 : 50.0 - kQsA$2.Et((kQsA)cv.b(this, -1227950977)));
        kQsA$2.Et((kQsA)cv.b(this, -1227950977), this.isFrozen());
    }

    @Override
    public void IFas() {
        kQsA$2.Et(kQsA$2.Et((kQsA)cv.b(this, -1227950977)), kQsA$2.Et(kQsA$2.Et()), new wfPa<StackTraceElement>(this.OGsT()));
    }

    private static Object Et(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

