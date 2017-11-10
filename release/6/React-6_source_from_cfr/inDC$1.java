/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class inDC$1
implements qAsQ<NxIh> {
    final /* synthetic */ inDC YpAW;

    inDC$1(inDC inDC2) {
        this.YpAW = inDC2;
    }

    public NxIh AaAq() {
        Hdte hdte = new Hdte();
        inDC$1.OS(hdte);
        return hdte;
    }

    @Override
    public /* synthetic */ Object get() {
        return this.AaAq();
    }

    private static Object OS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

