/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class miYd {
    public static String RbOr(String string) {
        Object object = "";
        object = miYd.wn(miYd.wn(new StringBuilder((String)miYd.wn(object)), miYd.wn(miYd.wn())));
        object = miYd.wn(object, rgig$AWxc.r("\u328e"), miYd.wn(miYd.wn(new StringBuilder(rgig$AWxc.r("\u32c7\u0437\u4dcb")), string)));
        return object;
    }

    private static Object wn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

