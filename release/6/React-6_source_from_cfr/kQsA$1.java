/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class kQsA$1
extends UARh {
    final /* synthetic */ kQsA OjnV;

    kQsA$1(kQsA kQsA2) {
        this.OjnV = kQsA2;
    }

    @Override
    public void ssNb(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        kQsA$1.SB((kQsA)cv.b(this, -1891044233), n);
        kQsA$1.SB((kQsA)cv.b(this, -1891044233), n2);
        kQsA$1.SB((kQsA)cv.b(this, -1891044233), n3);
        kQsA$1.SB((kQsA)cv.b(this, -1891044233), n5);
        kQsA$1.SB((kQsA)cv.b(this, -1891044233), n4);
        kQsA$1.SB((kQsA)cv.b(this, -1891044233), n6);
        kQsA$1.SB((kQsA)cv.b(this, -1891044233), n7);
    }

    private static Object SB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

