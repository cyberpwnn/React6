/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class TNcV
extends Enum<TNcV> {
    public static final /* enum */ TNcV JbuU;
    public static final /* enum */ TNcV RkNM;
    public static final /* enum */ TNcV vJEF;
    private static final /* synthetic */ TNcV[] Nodd;

    public static TNcV[] values() {
        return (TNcV[])((TNcV[])cv.e(446107528)).clone();
    }

    public static TNcV valueOf(String string) {
        return (TNcV)((Object)TNcV.su(TNcV.class, string));
    }

    private TNcV() {
    }

    static {
        cv.V(-1414066293, (Object)new TNcV());
        cv.V(-1734733942, (Object)new TNcV());
        cv.V(-886698123, (Object)new TNcV());
        cv.V(446107528, new TNcV[]{(TNcV)((Object)cv.e(-1414066293)), (TNcV)((Object)cv.e(-1734733942)), (TNcV)((Object)cv.e(-886698123))});
    }

    private static Object su(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

