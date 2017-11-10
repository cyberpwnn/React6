/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class QFCu$2
implements Runnable {
    final /* synthetic */ QFCu bHDr;

    QFCu$2(QFCu qFCu) {
        this.bHDr = qFCu;
    }

    @Override
    public void run() {
        QFCu$2.Kl(QFCu$2.Kl((QFCu)yy.h(this, -871168446)));
        QFCu$2.Kl((QFCu)yy.h(this, -871168446));
        QFCu qFCu = (QFCu)yy.h(this, -871168446);
        yy.E(qFCu, 456132215, (Integer)yy.h(qFCu, 456132215) + 1);
        QFCu$2.Kl(QFCu$2.Kl((QFCu)yy.h(this, -871168446)));
        QFCu$2.Kl((QFCu)yy.h(this, -871168446), QFCu$2.Kl(QFCu$2.Kl((QFCu)yy.h(this, -871168446))));
        QFCu qFCu2 = (QFCu)yy.h(this, -871168446);
        QFCu$2.Kl(qFCu2, QFCu$2.Kl(qFCu2) + QFCu$2.Kl((QFCu)yy.h(this, -871168446)));
        QFCu$2.Kl(QFCu$2.Kl((QFCu)yy.h(this, -871168446)));
        QFCu qFCu3 = (QFCu)yy.h(this, -871168446);
        QFCu$2.Kl(qFCu3, QFCu$2.Kl(qFCu3) + QFCu$2.Kl(QFCu$2.Kl((QFCu)yy.h(this, -871168446))));
        QFCu$2.Kl(QFCu$2.Kl((QFCu)yy.h(this, -871168446)));
        QFCu$2.Kl(QFCu$2.Kl((QFCu)yy.h(this, -871168446)));
        QFCu$2.Kl(QFCu$2.Kl((QFCu)yy.h(this, -871168446)));
    }

    private static Object Kl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

