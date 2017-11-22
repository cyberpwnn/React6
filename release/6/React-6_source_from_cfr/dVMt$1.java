/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class dVMt$1
extends SuxL {
    final /* synthetic */ dVMt rFXP;

    dVMt$1(dVMt dVMt2, String string, int n, hjbh hjbh2) {
        this.rFXP = dVMt2;
        super(string, n, hjbh2);
    }

    @Override
    public long FNTA() {
        return (long)dVMt$1.Mk((dVMt)cv.b(this, -939855312));
    }

    private static Object Mk(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

