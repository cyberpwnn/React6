/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class MBLa$1
implements ntkx {
    final /* synthetic */ MBLa RRaY;

    MBLa$1(MBLa mBLa) {
        this.RRaY = mBLa;
    }

    @Override
    public String uVol(double d) {
        return MBLa$1.bx(d / 1000000.0, true);
    }

    private static Object bx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

