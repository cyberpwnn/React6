/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class upkX$1
extends SnBs {
    final /* synthetic */ upkX yRuF;

    upkX$1(upkX upkX2, String string, int n, JRFt jRFt) {
        this.yRuF = upkX2;
        super(string, n, jRFt);
    }

    @Override
    public long qAsQ() {
        return (long)upkX$1.fw((upkX)yy.h(this, 1902700714));
    }

    private static Object fw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

