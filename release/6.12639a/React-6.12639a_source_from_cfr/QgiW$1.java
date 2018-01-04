/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class QgiW$1
implements ntkx {
    final /* synthetic */ QgiW qTlb;

    QgiW$1(QgiW qgiW) {
        this.qTlb = qgiW;
    }

    @Override
    public String uVol(double d) {
        return QgiW$1.MJ(d / 1000000.0, true);
    }

    private static Object MJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

