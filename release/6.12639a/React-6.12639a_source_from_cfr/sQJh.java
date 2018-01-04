/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class sQJh
extends Enum<sQJh> {
    public static final /* enum */ sQJh lnpk;
    public static final /* enum */ sQJh iLTq;
    public static final /* enum */ sQJh VfbL;
    private static final /* synthetic */ sQJh[] SfIj;

    static {
        o.w(-424325302, (Object)new sQJh(nJPf$sILv.G("\u5d33\ub722\ued39\uc2fb\u0cf5\u77ed\udc21\ubf05\u3d6e"), 0));
        o.w(967724873, (Object)new sQJh(nJPf$sILv.G("\u5d3f\ub736\ued23\uc2e1\u0cf9\u77e0"), 1));
        o.w(-333885624, (Object)new sQJh(nJPf$sILv.G("\u5d3f\ub722\ued39\uc2f1\u0ce0"), 2));
        o.w(1692159815, new sQJh[]{(sQJh)((Object)o.k(-424325302)), (sQJh)((Object)o.k(967724873)), (sQJh)((Object)o.k(-333885624))});
    }

    private sQJh(String string2, int n2) {
    }

    public static sQJh[] values() {
        sQJh[] arrsQJh = (sQJh[])o.k(1692159815);
        int n = arrsQJh.length;
        sQJh[] arrsQJh2 = new sQJh[n];
        sQJh.ux(arrsQJh, false, arrsQJh2, false, n);
        return arrsQJh2;
    }

    public static sQJh valueOf(String string) {
        return (sQJh)((Object)sQJh.ux(sQJh.class, string));
    }

    private static Object ux(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

