/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class gggG
extends RuntimeException {
    private static final long serialVersionUID = 0;
    private Throwable fLWB;

    public gggG(String string) {
        super(string);
    }

    public gggG(Throwable throwable) {
        super((String)gggG.Hy(throwable));
        this.fLWB = throwable;
    }

    @Override
    public Throwable getCause() {
        return (Throwable)o.a(this, -854965883);
    }

    private static Object Hy(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

