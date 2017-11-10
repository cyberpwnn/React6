/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class Bkpl
extends RuntimeException {
    private static final long serialVersionUID = 0;
    private Throwable ePUd;

    public Bkpl(String string) {
        super(string);
    }

    public Bkpl(Throwable throwable) {
        super((String)Bkpl.Vx(throwable));
        this.ePUd = throwable;
    }

    @Override
    public Throwable getCause() {
        return (Throwable)yy.h(this, -1589903388);
    }

    private static Object Vx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

