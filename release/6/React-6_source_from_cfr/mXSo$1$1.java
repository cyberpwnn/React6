/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class mXSo$1$1
extends vIXT {
    final /* synthetic */ mXSo$1 SfPt;

    mXSo$1$1(mXSo$1 var1_1) {
        this.SfPt = var1_1;
    }

    @Override
    public void run() {
        ((Runnable)cv.b((mXSo$1)cv.b(this, 1261826970), 1334571909)).run();
        mXSo$1$1.dJ();
    }

    private static Object dJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

