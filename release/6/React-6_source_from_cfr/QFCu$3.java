/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class QFCu$3
implements Runnable {
    final /* synthetic */ QFCu bHDr;
    private final /* synthetic */ int SCiU;

    QFCu$3(QFCu qFCu, int n) {
        this.bHDr = qFCu;
        this.SCiU = n;
    }

    @Override
    public void run() {
        QFCu$3.GM(QFCu$3.GM((QFCu)yy.h(this, -454949306)));
        QFCu$3.GM((QFCu)yy.h(this, -454949306));
        QFCu qFCu = (QFCu)yy.h(this, -454949306);
        yy.E(qFCu, 456132215, (Integer)yy.h(qFCu, 456132215) + 1);
        QFCu$3.GM(QFCu$3.GM((QFCu)yy.h(this, -454949306)));
        QFCu$3.GM((QFCu)yy.h(this, -454949306), QFCu$3.GM(QFCu$3.GM((QFCu)yy.h(this, -454949306))));
        QFCu qFCu2 = (QFCu)yy.h(this, -454949306);
        QFCu$3.GM(qFCu2, QFCu$3.GM(qFCu2) + QFCu$3.GM((QFCu)yy.h(this, -454949306)));
        QFCu$3.GM(QFCu$3.GM((QFCu)yy.h(this, -454949306)));
        QFCu qFCu3 = (QFCu)yy.h(this, -454949306);
        QFCu$3.GM(qFCu3, QFCu$3.GM(qFCu3) + QFCu$3.GM(QFCu$3.GM((QFCu)yy.h(this, -454949306))));
        QFCu$3.GM(QFCu$3.GM((QFCu)yy.h(this, -454949306)));
        QFCu$3.GM(QFCu$3.GM((QFCu)yy.h(this, -454949306)));
        QFCu$3.GM(QFCu$3.GM((QFCu)yy.h(this, -454949306)));
        if ((Integer)yy.h((QFCu)yy.h(this, -454949306), 456132215) >= (Integer)yy.h(this, -1401944501)) {
            QFCu$3.GM((QFCu)yy.h(this, -454949306));
        }
    }

    private static Object GM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

