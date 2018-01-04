/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class vsrN
extends Enum<vsrN> {
    public static final /* enum */ vsrN CWVK;
    public static final /* enum */ vsrN ebfb;
    public static final /* enum */ vsrN cvRs;
    private String[] NWTj;
    private static final /* synthetic */ vsrN[] uPUp;

    static {
        String[] arrstring = new String[3];
        arrstring[0] = vsrN.Zz(mrFx$WjFM.d("\u30a3\uea56\u8d8b\ue21c\u5010\u5c55\uf585\u7fa3\u0d2c\u986a\ua6ae\u16a0\u2ef7\u5b73\ud897\u1123\u9368\ufce8\u856a\u26c5\ue174\u5985\u76ce\u50cc"));
        arrstring[1] = vsrN.Zz(mrFx$WjFM.d("\u30a3\uea56\u8d8b\ue21c\u5010\u5c55\uf585\u7fa3\u0d2c\u986a\ua6ae\u16a0\u2ef7\u5b73\ud897\u1123\u9368\ufce8\u856a\u26c5\ue174\u5985\u76ce\u50cf"));
        arrstring[2] = vsrN.Zz(mrFx$WjFM.d("\u30a3\uea56\u8d8b\ue21c\u5010\u5c55\uf585\u7fa3\u0d2c\u986a\ua6ae\u16a0\u2ef7\u5b73\ud897\u1123\u9368\ufce8\u856a\u26c5\ue174\u5985\u76ce\u50ce"));
        o.w(400971763, (Object)new vsrN(mrFx$WjFM.d("\u3097\uea7e\u8db0\ue277\u502a\u5c62\uf5a3\u7f99\u0d11\u9808\ua68d"), 0, arrstring));
        String[] arrstring2 = new String[3];
        arrstring2[0] = vsrN.Zz(mrFx$WjFM.d("\u30a3\uea56\u8d8b\ue21c\u5010\u5c55\uf585\u7fa3\u0d2c\u986a\ua6ae\u16a0\u2ef7\u5b73\ud897\u1123\u9368\ufce8\u856b\u26c1\ue178\u5996\u76d6\u5098\u779e"));
        arrstring2[1] = vsrN.Zz(mrFx$WjFM.d("\u30a3\uea56\u8d8b\ue21c\u5010\u5c55\uf585\u7fa3\u0d2c\u986a\ua6ae\u16a0\u2ef7\u5b73\ud897\u1123\u9368\ufce8\u856b\u26c1\ue178\u5996\u76d6\u5098\u779d"));
        arrstring2[2] = vsrN.Zz(mrFx$WjFM.d("\u30a3\uea56\u8d8b\ue21c\u5010\u5c55\uf585\u7fa3\u0d2c\u986a\ua6ae\u16a0\u2ef7\u5b73\ud897\u1123\u9368\ufce8\u856b\u26c1\ue178\u5996\u76d6\u5098\u779c"));
        o.w(871061494, (Object)new vsrN(mrFx$WjFM.d("\u309f\uea78\u8db6\ue277\u502a\u5c64\uf5af\u7f8c\u0d14\u9818\ua685\u1684\u2ecd\u5b4c\ud8bf\u110a\u934a"), 1, arrstring2));
        String[] arrstring3 = new String[2];
        arrstring3[0] = vsrN.Zz(mrFx$WjFM.d("\u30a3\uea56\u8d8b\ue21c\u5010\u5c55\uf585\u7fa3\u0d2c\u986a\ua6ae\u16a0\u2ef7\u5b73\ud897\u1123\u9368\ufce8\u857e\u26c9\ue16d\u5983\u76de\u50cc"));
        arrstring3[1] = vsrN.Zz(mrFx$WjFM.d("\u30a3\uea56\u8d8b\ue21c\u5010\u5c55\uf585\u7fa3\u0d2c\u986a\ua6ae\u16a0\u2ef7\u5b73\ud897\u1123\u9368\ufce8\u857e\u26c9\ue16d\u5983\u76de\u50cf"));
        o.w(1411405812, (Object)new vsrN(mrFx$WjFM.d("\u309f\uea78\u8db6\ue277\u502a\u5c64\uf5af\u7f8c\u0d14\u9818\ua685\u168c\u2edc\u5b45\ud8b2"), 2, arrstring3));
        o.w(-593930323, new vsrN[]{(vsrN)((Object)o.k(400971763)), (vsrN)((Object)o.k(871061494)), (vsrN)((Object)o.k(1411405812))});
    }

    private /* varargs */ vsrN(String string2, int n2, String ... arrstring) {
        this.NWTj = string2;
    }

    public int getSize() {
        return ((String[])o.a((Object)this, 1986287532)).length;
    }

    public int jiGL() {
        return (int)((Object)(vsrN.Zz() * (double)(this.getSize() - 1)));
    }

    public String yJLS(int n, String[] arrstring) {
        Object object = ((String[])o.a((Object)this, 1986287532))[n];
        int n2 = 0;
        String[] arrstring2 = arrstring;
        int n3 = arrstring2.length;
        int n4 = 0;
        while (n4 < n3) {
            String string = arrstring2[n4];
            object = vsrN.Zz(object, vsrN.Zz(vsrN.Zz(new StringBuilder(nJPf$sILv.G("\ub68d")), ++n2)), string);
            ++n4;
        }
        return object;
    }

    public static vsrN[] values() {
        vsrN[] arrvsrN = (vsrN[])o.k(-593930323);
        int n = arrvsrN.length;
        vsrN[] arrvsrN2 = new vsrN[n];
        vsrN.Zz(arrvsrN, false, arrvsrN2, false, n);
        return arrvsrN2;
    }

    public static vsrN valueOf(String string) {
        return (vsrN)((Object)vsrN.Zz(vsrN.class, string));
    }

    private static Object Zz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

