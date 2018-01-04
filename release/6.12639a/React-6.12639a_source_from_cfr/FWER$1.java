/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class FWER$1
extends vbvg {
    final /* synthetic */ FWER hcXW;

    FWER$1(FWER fWER, String string, int n) {
        this.hcXW = fWER;
        super(string, n);
    }

    @Override
    public void run() {
        if (FWER$1.ES((FWER)o.a(this, 1724012040)) != false) {
            FWER$1.ES();
        }
    }

    private static Object ES(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

