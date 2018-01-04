/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class dMfa {
    private long HxyT = 0;
    private long oige = 0;

    public void start() {
        o.v(this, -2000338457, (long)dMfa.UT());
    }

    public void stop() {
        o.v(this, 884031974, (long)(dMfa.UT() - (Long)o.a(this, -2000338457)));
        o.v(this, -2000338457, (long)dMfa.UT());
    }

    public long getTime() {
        return (Long)o.a(this, 884031974);
    }

    public long FOKU() {
        return (Long)o.a(this, -2000338457);
    }

    private static Object UT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

