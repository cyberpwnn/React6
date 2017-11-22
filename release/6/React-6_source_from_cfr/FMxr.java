/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class FMxr
extends Enum<FMxr> {
    public static final /* enum */ FMxr iVUp;
    public static final /* enum */ FMxr neeV;
    private static final /* synthetic */ FMxr[] XLTt;

    static {
        cv.V(1362425990, (Object)new FMxr(rgig$AWxc.r("\u00db\u6596\u715f\u31fe"), 0));
        cv.V(840956033, (Object)new FMxr(rgig$AWxc.r("\u00c4\u6598\u7148\u31ff"), 1));
        cv.V(1860040832, new FMxr[]{(FMxr)((Object)cv.e(1362425990)), (FMxr)((Object)cv.e(840956033))});
    }

    private FMxr(String string2, int n2) {
    }

    public static FMxr[] values() {
        FMxr[] arrfMxr = (FMxr[])cv.e(1860040832);
        int n = arrfMxr.length;
        FMxr[] arrfMxr2 = new FMxr[n];
        FMxr.ER(arrfMxr, false, arrfMxr2, false, n);
        return arrfMxr2;
    }

    public static FMxr valueOf(String string) {
        return (FMxr)((Object)FMxr.ER(FMxr.class, string));
    }

    private static Object ER(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

