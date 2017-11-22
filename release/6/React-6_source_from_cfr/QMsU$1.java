/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class QMsU$1
implements Runnable {
    final /* synthetic */ QMsU RAMh;

    QMsU$1(QMsU qMsU) {
        this.RAMh = qMsU;
    }

    @Override
    public void run() {
        QMsU$1.Tj(rgig$AWxc.r("\uae48\ud50e\u3381\u9599\u4e7e\u8882\u602e\u1a16\u8219\ucfc5\u2239\uba33\u9fa7\u2523\u12ba"));
        QMsU$1.Tj(QMsU$1.Tj((QMsU)cv.b(this, 996537551)));
    }

    private static Object Tj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

