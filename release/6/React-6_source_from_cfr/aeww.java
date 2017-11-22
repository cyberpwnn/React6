/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class aeww {
    private long PxFT = 0;
    private long bIUL = 0;

    public void start() {
        cv.e(this, 170457219, (long)aeww.vD());
    }

    public void stop() {
        cv.e(this, -732628862, (long)(aeww.vD() - (Long)cv.b(this, 170457219)));
        cv.e(this, 170457219, (long)aeww.vD());
    }

    public long getTime() {
        return (Long)cv.b(this, -732628862);
    }

    public long CDwg() {
        return (Long)cv.b(this, 170457219);
    }

    private static Object vD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

