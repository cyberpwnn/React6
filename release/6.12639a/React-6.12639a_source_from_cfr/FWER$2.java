/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class FWER$2
extends vbvg {
    final /* synthetic */ FWER hcXW;

    FWER$2(FWER fWER, String string, int n) {
        this.hcXW = fWER;
        super(string, n);
    }

    @Override
    public void run() {
        if (FWER$2.bF(FWER$2.bF((FWER)o.a(this, 914511366))) == 0.0) {
            FWER$2.bF((FWER)o.a(this, 914511366));
        }
    }

    private static Object bF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

