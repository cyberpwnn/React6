/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class NUlR$1
extends rotp {
    final /* synthetic */ NUlR xrYE;

    NUlR$1(NUlR nUlR) {
        this.xrYE = nUlR;
    }

    @Override
    public void mXJp(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        NUlR$1.ct((NUlR)yy.h(this, 1281754536), n);
        NUlR$1.ct((NUlR)yy.h(this, 1281754536), n2);
        NUlR$1.ct((NUlR)yy.h(this, 1281754536), n3);
        NUlR$1.ct((NUlR)yy.h(this, 1281754536), n5);
        NUlR$1.ct((NUlR)yy.h(this, 1281754536), n4);
        NUlR$1.ct((NUlR)yy.h(this, 1281754536), n6);
        NUlR$1.ct((NUlR)yy.h(this, 1281754536), n7);
    }

    private static Object ct(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

