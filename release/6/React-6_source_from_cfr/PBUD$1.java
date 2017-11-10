/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Comparator;

class PBUD$1
implements Comparator<T> {
    final /* synthetic */ PBUD jErH;

    PBUD$1(PBUD pBUD) {
        this.jErH = pBUD;
    }

    @Override
    public int compare(T t, T t2) {
        return (int)PBUD$1.OV(PBUD$1.OV(t), PBUD$1.OV(t2));
    }

    private static Object OV(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

