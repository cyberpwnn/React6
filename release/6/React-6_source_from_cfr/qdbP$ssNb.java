/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class qdbP$ssNb
extends Enum<qdbP$ssNb> {
    public static final /* enum */ qdbP$ssNb SLbW;
    public static final /* enum */ qdbP$ssNb CpWt;
    public static final /* enum */ qdbP$ssNb lDhl;
    public static final /* enum */ qdbP$ssNb IPGL;
    public static final /* enum */ qdbP$ssNb FiAO;
    public static final /* enum */ qdbP$ssNb yuao;
    private static final /* synthetic */ qdbP$ssNb[] JJXh;

    static {
        cv.V(-1824131945, (Object)new qdbP$ssNb(YEBy$TyVf.W("\u2d8f\ucdc9\u3c5e"), 0));
        cv.V(1706030230, (Object)new qdbP$ssNb(YEBy$TyVf.W("\u2d8f\ucdc9\u3c51"), 1));
        cv.V(-360713071, (Object)new qdbP$ssNb(YEBy$TyVf.W("\u2d8f\ucdc9\u3c50"), 2));
        cv.V(1374942352, (Object)new qdbP$ssNb(YEBy$TyVf.W("\u2d8f\ucdc9\u3c58\u517b"), 3));
        cv.V(-677448557, (Object)new qdbP$ssNb(YEBy$TyVf.W("\u2d8f\ucdc9\u3c58\u517a"), 4));
        cv.V(-1418464110, (Object)new qdbP$ssNb(YEBy$TyVf.W("\u2d8f\ucdc9\u3c58\u5178"), 5));
        cv.V(-1718029155, new qdbP$ssNb[]{(qdbP$ssNb)((Object)cv.e(-1824131945)), (qdbP$ssNb)((Object)cv.e(1706030230)), (qdbP$ssNb)((Object)cv.e(-360713071)), (qdbP$ssNb)((Object)cv.e(1374942352)), (qdbP$ssNb)((Object)cv.e(-677448557)), (qdbP$ssNb)((Object)cv.e(-1418464110))});
    }

    private qdbP$ssNb(String string2, int n2) {
    }

    public static qdbP$ssNb[] values() {
        qdbP$ssNb[] arrqdbP$ssNb = (qdbP$ssNb[])cv.e(-1718029155);
        int n = arrqdbP$ssNb.length;
        qdbP$ssNb[] arrqdbP$ssNb2 = new qdbP$ssNb[n];
        qdbP$ssNb.Og(arrqdbP$ssNb, false, arrqdbP$ssNb2, false, n);
        return arrqdbP$ssNb2;
    }

    public static qdbP$ssNb valueOf(String string) {
        return (qdbP$ssNb)((Object)qdbP$ssNb.Og(qdbP$ssNb.class, string));
    }

    private static Object Og(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

