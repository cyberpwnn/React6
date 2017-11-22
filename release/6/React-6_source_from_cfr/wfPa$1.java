/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Comparator;

class wfPa$1
implements Comparator<T> {
    final /* synthetic */ wfPa wnsJ;

    wfPa$1(wfPa wfPa2) {
        this.wnsJ = wfPa2;
    }

    @Override
    public int compare(T t, T t2) {
        return (int)wfPa$1.Fh(wfPa$1.Fh(t), wfPa$1.Fh(t2));
    }

    private static Object Fh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

