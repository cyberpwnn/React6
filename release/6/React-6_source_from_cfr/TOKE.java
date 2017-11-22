/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class TOKE
extends RuntimeException {
    private static final long serialVersionUID = 0;
    private Throwable Ngae;

    public TOKE(String string) {
        super(string);
    }

    public TOKE(Throwable throwable) {
        super((String)TOKE.zQ(throwable));
        this.Ngae = throwable;
    }

    @Override
    public Throwable getCause() {
        return (Throwable)cv.b(this, -390596375);
    }

    private static Object zQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

