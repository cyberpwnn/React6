/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class DrcY {
    private long GtsO = 0;
    private long vBdr = 0;

    public void start() {
        yy.E(this, 2018967995, (long)DrcY.ji());
    }

    public void stop() {
        yy.E(this, 16056764, (long)(DrcY.ji() - (Long)yy.h(this, 2018967995)));
        yy.E(this, 2018967995, (long)DrcY.ji());
    }

    public long getTime() {
        return (Long)yy.h(this, 16056764);
    }

    public long TGFR() {
        return (Long)yy.h(this, 2018967995);
    }

    private static Object ji(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

