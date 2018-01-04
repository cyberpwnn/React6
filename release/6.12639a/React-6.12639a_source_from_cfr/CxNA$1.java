/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class CxNA$1
extends mFpP {
    final /* synthetic */ CxNA lUpI;

    CxNA$1(CxNA cxNA) {
        this.lUpI = cxNA;
    }

    @Override
    public void run() {
        CxNA$1.he((CxNA)o.a(this, -127451596));
    }

    private static Object he(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

