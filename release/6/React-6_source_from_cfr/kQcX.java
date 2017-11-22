/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class kQcX
extends Enum<kQcX> {
    public static final /* enum */ kQcX kbqG;
    public static final /* enum */ kQcX AWxc;
    private static final /* synthetic */ kQcX[] lDTo;

    public static kQcX[] values() {
        return (kQcX[])((kQcX[])cv.e(-593817705)).clone();
    }

    public static kQcX valueOf(String string) {
        return (kQcX)((Object)kQcX.YI(kQcX.class, string));
    }

    private kQcX() {
    }

    static {
        cv.V(-838922497, (Object)new kQcX());
        cv.V(-747106030, (Object)new kQcX());
        cv.V(-593817705, new kQcX[]{(kQcX)((Object)cv.e(-838922497)), (kQcX)((Object)cv.e(-747106030))});
    }

    private static Object YI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

