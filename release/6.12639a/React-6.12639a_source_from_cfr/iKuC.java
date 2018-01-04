/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class iKuC
extends Enum<iKuC> {
    public static final /* enum */ iKuC OdXt;
    public static final /* enum */ iKuC wykl;
    private static final /* synthetic */ iKuC[] JKxU;

    static {
        o.w(753287658, (Object)new iKuC(FMkR$WjFM.a("\u9248\u63a1\ucfab\u9ffe"), 0));
        o.w(1498628585, (Object)new iKuC(FMkR$WjFM.a("\u9257\u63af\ucfbc\u9fff"), 1));
        o.w(197935592, new iKuC[]{(iKuC)((Object)o.k(753287658)), (iKuC)((Object)o.k(1498628585))});
    }

    private iKuC(String string2, int n2) {
    }

    public static iKuC[] values() {
        iKuC[] arriKuC = (iKuC[])o.k(197935592);
        int n = arriKuC.length;
        iKuC[] arriKuC2 = new iKuC[n];
        iKuC.Qe(arriKuC, false, arriKuC2, false, n);
        return arriKuC2;
    }

    public static iKuC valueOf(String string) {
        return (iKuC)((Object)iKuC.Qe(iKuC.class, string));
    }

    private static Object Qe(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

