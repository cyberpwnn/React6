/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class GHaL
extends Enum<GHaL> {
    public static final /* enum */ GHaL qlxe;
    public static final /* enum */ GHaL OjYY;
    private static final /* synthetic */ GHaL[] URWs;

    public static GHaL[] values() {
        return (GHaL[])((GHaL[])cv.e(1562317006)).clone();
    }

    public static GHaL valueOf(String string) {
        return (GHaL)((Object)GHaL.IZ(GHaL.class, string));
    }

    private GHaL() {
    }

    static {
        cv.V(1867452617, (Object)new GHaL());
        cv.V(1197936249, (Object)new GHaL());
        cv.V(1562317006, new GHaL[]{(GHaL)((Object)cv.e(1867452617)), (GHaL)((Object)cv.e(1197936249))});
    }

    private static Object IZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

