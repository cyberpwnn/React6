/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class rwyd
extends Enum<rwyd> {
    public static final /* enum */ rwyd aMCk;
    public static final /* enum */ rwyd XSJd;
    public static final /* enum */ rwyd kkap;
    private static final /* synthetic */ rwyd[] gyID;

    public static rwyd[] values() {
        return (rwyd[])((rwyd[])cv.e(-1903882328)).clone();
    }

    public static rwyd valueOf(String string) {
        return (rwyd)((Object)rwyd.hF(rwyd.class, string));
    }

    private rwyd() {
    }

    static {
        cv.V(-1387065430, (Object)new rwyd());
        cv.V(247533461, (Object)new rwyd());
        cv.V(324276116, (Object)new rwyd());
        cv.V(-1903882328, new rwyd[]{(rwyd)((Object)cv.e(-1387065430)), (rwyd)((Object)cv.e(247533461)), (rwyd)((Object)cv.e(324276116))});
    }

    private static Object hF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

