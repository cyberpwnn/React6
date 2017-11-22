/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class lnfu
extends Enum<lnfu> {
    public static final /* enum */ lnfu jHCJ;
    private static final /* synthetic */ lnfu[] YEqa;

    static {
        cv.V(1652487884, (Object)new lnfu(YEBy$TyVf.W("\uc76d\u52f5\u8af7"), 0));
        cv.V(1244395215, new lnfu[]{(lnfu)((Object)cv.e(1652487884))});
    }

    private lnfu(String string2, int n2) {
    }

    public static lnfu[] values() {
        lnfu[] arrlnfu = (lnfu[])cv.e(1244395215);
        int n = arrlnfu.length;
        lnfu[] arrlnfu2 = new lnfu[n];
        lnfu.CL(arrlnfu, false, arrlnfu2, false, n);
        return arrlnfu2;
    }

    public static lnfu valueOf(String string) {
        return (lnfu)((Object)lnfu.CL(lnfu.class, string));
    }

    private static Object CL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

