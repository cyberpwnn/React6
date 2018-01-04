/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class GQbv {
    public static String baAO(String string) {
        Object object = "";
        object = GQbv.Xp(GQbv.Xp(new StringBuilder((String)GQbv.Xp(object)), GQbv.Xp(GQbv.Xp())));
        object = GQbv.Xp(object, FMkR$WjFM.a("\ub11a"), GQbv.Xp(GQbv.Xp(new StringBuilder(FMkR$WjFM.a("\ub153\u6c6f\u6717")), string)));
        return object;
    }

    private static Object Xp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

