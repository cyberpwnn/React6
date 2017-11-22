/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class IXDX
extends Enum<IXDX> {
    public static final /* enum */ IXDX qCyr;
    public static final /* enum */ IXDX yUHH;
    public static final /* enum */ IXDX UBmo;
    public static final /* enum */ IXDX iVYf;
    public static final /* enum */ IXDX HNJp;
    private static final /* synthetic */ IXDX[] eIlI;

    static {
        cv.V(522385500, (Object)new IXDX(KUXS$dwji.S("\u82ea\ud9bc\uc614\u0f98\u1903"), 0));
        cv.V(-598935457, (Object)new IXDX(KUXS$dwji.S("\u82fc\ud9a6\uc614\u0f88\u191b\u997f"), 1));
        cv.V(-1668482978, (Object)new IXDX(KUXS$dwji.S("\u82fd\ud9a1\uc606\u0f8b\u1915\u9976\u4cc6"), 2));
        cv.V(1309341785, (Object)new IXDX(KUXS$dwji.S("\u82ea\ud9bc\uc61a\u0f9a"), 3));
        cv.V(226228376, (Object)new IXDX(KUXS$dwji.S("\u82eb\ud9bd\uc61b\u0f84\u191e\u9974\u4cc4"), 4));
        cv.V(1081079963, new IXDX[]{(IXDX)((Object)cv.e(522385500)), (IXDX)((Object)cv.e(-598935457)), (IXDX)((Object)cv.e(-1668482978)), (IXDX)((Object)cv.e(1309341785)), (IXDX)((Object)cv.e(226228376))});
    }

    private IXDX(String string2, int n2) {
    }

    public static IXDX[] values() {
        IXDX[] arriXDX = (IXDX[])cv.e(1081079963);
        int n = arriXDX.length;
        IXDX[] arriXDX2 = new IXDX[n];
        IXDX.mF(arriXDX, false, arriXDX2, false, n);
        return arriXDX2;
    }

    public static IXDX valueOf(String string) {
        return (IXDX)((Object)IXDX.mF(IXDX.class, string));
    }

    private static Object mF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

