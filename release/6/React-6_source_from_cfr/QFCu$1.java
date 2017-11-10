/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class QFCu$1
implements Runnable {
    final /* synthetic */ QFCu bHDr;

    QFCu$1(QFCu qFCu) {
        this.bHDr = qFCu;
    }

    @Override
    public void run() {
        QFCu$1.rL(QFCu$1.rL((QFCu)yy.h(this, 1033176699)));
        QFCu$1.rL((QFCu)yy.h(this, 1033176699));
        QFCu$1.rL(QFCu$1.rL((QFCu)yy.h(this, 1033176699)));
        QFCu$1.rL((QFCu)yy.h(this, 1033176699), true);
        QFCu$1.rL(QFCu$1.rL((QFCu)yy.h(this, 1033176699)));
        QFCu$1.rL((QFCu)yy.h(this, 1033176699), QFCu$1.rL(QFCu$1.rL((QFCu)yy.h(this, 1033176699))));
        QFCu$1.rL((QFCu)yy.h(this, 1033176699), QFCu$1.rL(QFCu$1.rL((QFCu)yy.h(this, 1033176699))));
        QFCu$1.rL((QFCu)yy.h(this, 1033176699), QFCu$1.rL((QFCu)yy.h(this, 1033176699)));
        QFCu$1.rL(QFCu$1.rL((QFCu)yy.h(this, 1033176699)));
        QFCu$1.rL(QFCu$1.rL((QFCu)yy.h(this, 1033176699)));
    }

    private static Object rL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

