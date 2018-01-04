/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class WaLc
extends Enum<WaLc> {
    public static final /* enum */ WaLc oNfv;
    public static final /* enum */ WaLc DcOm;
    public static final /* enum */ WaLc esmp;
    public static final /* enum */ WaLc GdKU;
    public static final /* enum */ WaLc Kouv;
    public static final /* enum */ WaLc huKT;
    private static final /* synthetic */ WaLc[] uGkW;

    static {
        o.w(-1498592084, (Object)new WaLc(FMkR$WjFM.a("\ub329\u71a1\ua9a4"), 0));
        o.w(465915054, (Object)new WaLc(FMkR$WjFM.a("\ub322\u71a0\ua9bf\u01fb\u72f5\uc7cd\ucdf2"), 1));
        o.w(330058938, (Object)new WaLc(FMkR$WjFM.a("\ub333\u71bb\ua9a2\u01fe\u72fe\uc7cb"), 2));
        o.w(233655481, (Object)new WaLc(FMkR$WjFM.a("\ub333\u71bb\ua9a2\u01fe\u72fe\uc7cb\ucde3\u5dcc\u15c9\u6d79\uad51"), 3));
        o.w(-1049080659, (Object)new WaLc(FMkR$WjFM.a("\ub324\u71a0\ua9a5\u01f5\u72fc\uc7c9"), 4));
        o.w(-1643098965, (Object)new WaLc(FMkR$WjFM.a("\ub32c\u71a0\ua9be\u01f0"), 5));
        o.w(-1674425160, new WaLc[]{(WaLc)((Object)o.k(-1498592084)), (WaLc)((Object)o.k(465915054)), (WaLc)((Object)o.k(330058938)), (WaLc)((Object)o.k(233655481)), (WaLc)((Object)o.k(-1049080659)), (WaLc)((Object)o.k(-1643098965))});
    }

    private WaLc(String string2, int n2) {
    }

    public static WaLc[] values() {
        WaLc[] arrwaLc = (WaLc[])o.k(-1674425160);
        int n = arrwaLc.length;
        WaLc[] arrwaLc2 = new WaLc[n];
        WaLc.pF(arrwaLc, false, arrwaLc2, false, n);
        return arrwaLc2;
    }

    public static WaLc valueOf(String string) {
        return (WaLc)((Object)WaLc.pF(WaLc.class, string));
    }

    private static Object pF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

