/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class QMsU$2
implements Runnable {
    final /* synthetic */ QMsU RAMh;

    QMsU$2(QMsU qMsU) {
        this.RAMh = qMsU;
    }

    @Override
    public void run() {
        QMsU$2.JW((QMsU)cv.b(this, -283708215));
    }

    private static Object JW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

