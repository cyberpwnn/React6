/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class kQsA$3
extends DbEj {
    final /* synthetic */ kQsA OjnV;

    kQsA$3(kQsA kQsA2) {
        this.OjnV = kQsA2;
    }

    @Override
    public void BSOO() {
        kQsA$3.dS((kQsA)cv.b(this, -1377765585), this.QWIV());
        kQsA$3.dS((kQsA)cv.b(this, -1377765585), this.UIbl());
        kQsA$3.dS((kQsA)cv.b(this, -1377765585), this.hQYY());
        kQsA$3.dS(kQsA$3.dS((kQsA)cv.b(this, -1377765585)), this.vJEF());
        kQsA$3.dS((kQsA)cv.b(this, -1377765585), kQsA$3.dS(kQsA$3.dS((kQsA)cv.b(this, -1377765585))));
    }

    private static Object dS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

