/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class NUdB
extends Enum<NUdB> {
    public static final /* enum */ NUdB GHjQ;
    public static final /* enum */ NUdB maJO;
    public static final /* enum */ NUdB pbBn;
    public static final /* enum */ NUdB QNWg;
    private static final /* synthetic */ NUdB[] sHhL;

    public static NUdB[] values() {
        return (NUdB[])((NUdB[])cv.e(-1374154805)).clone();
    }

    public static NUdB valueOf(String string) {
        return (NUdB)((Object)NUdB.fL(NUdB.class, string));
    }

    private NUdB() {
    }

    static {
        cv.V(585764810, (Object)new NUdB());
        cv.V(-1111289931, (Object)new NUdB());
        cv.V(760942516, (Object)new NUdB());
        cv.V(-1454239817, (Object)new NUdB());
        cv.V(-1374154805, new NUdB[]{(NUdB)((Object)cv.e(585764810)), (NUdB)((Object)cv.e(-1111289931)), (NUdB)((Object)cv.e(760942516)), (NUdB)((Object)cv.e(-1454239817))});
    }

    private static Object fL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

