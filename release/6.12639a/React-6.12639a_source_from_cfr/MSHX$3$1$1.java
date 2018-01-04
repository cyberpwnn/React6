/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class MSHX$3$1$1
extends vbvg {
    final /* synthetic */ MSHX.3.1 JcnX;

    MSHX$3$1$1(MSHX.3.1 var1_1, String string, int n) {
        this.JcnX = var1_1;
        super(string, n);
    }

    @Override
    public void run() {
        MSHX$3$1$1.kF(MSHX$3$1$1.kF(MSHX$3$1$1.kF()));
    }

    private static Object kF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

