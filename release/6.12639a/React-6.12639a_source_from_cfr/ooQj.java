/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class ooQj
extends Enum<ooQj> {
    public static final /* enum */ ooQj WjFM;
    public static final /* enum */ ooQj BJdg;
    private static final /* synthetic */ ooQj[] tfGc;

    static {
        o.w(-2068033710, (Object)new ooQj(nJPf$sILv.G("\u39b8\ua98c\u91a7\ub6ee"), 0));
        o.w(1731151092, (Object)new ooQj(nJPf$sILv.G("\u39a3\ua99d\u91a5\ub6e5\u01cf\u5900\ue3f5"), 1));
        o.w(-1075818684, new ooQj[]{(ooQj)((Object)o.k(-2068033710)), (ooQj)((Object)o.k(1731151092))});
    }

    private ooQj(String string2, int n2) {
    }

    public static ooQj[] values() {
        ooQj[] arrooQj = (ooQj[])o.k(-1075818684);
        int n = arrooQj.length;
        ooQj[] arrooQj2 = new ooQj[n];
        ooQj.oG(arrooQj, false, arrooQj2, false, n);
        return arrooQj2;
    }

    public static ooQj valueOf(String string) {
        return (ooQj)((Object)ooQj.oG(ooQj.class, string));
    }

    private static Object oG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

