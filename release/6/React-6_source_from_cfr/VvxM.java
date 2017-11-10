/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class VvxM {
    public static String repeat(String string, int n) {
        return VvxM.Vx(string, n);
    }

    public static PBUD<String> JRFt(String string, int n) {
        Object object = VvxM.Vx(string);
        PBUD<String> pBUD = new PBUD<String>();
        String[] arrstring = (String[])VvxM.Vx(VvxM.Vx(string, n), KDGY$JAHk.Y("\udaf3"));
        int n2 = arrstring.length;
        int n3 = 0;
        while (n3 < n2) {
            String string2 = arrstring[n3];
            VvxM.Vx(pBUD, VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder((String)VvxM.Vx(object)), VvxM.Vx(string2)), VvxM.Vx(string2))));
            ++n3;
        }
        return pBUD;
    }

    public static String mXJp(ydHl ydHl2, ydHl ydHl3, ydHl ydHl4, ydHl ydHl5, String string) {
        return VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder(), ydHl2), NVIs$JbpD.H("\u6af6")), ydHl3), string), ydHl2), NVIs$JbpD.H("\u6af0")), ydHl4), NVIs$JbpD.H("\u6a97\u7247")), ydHl5));
    }

    public static String mXJp(ydHl ydHl2, ydHl ydHl3, ydHl ydHl4, String string) {
        return VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder(), ydHl2), NVIs$JbpD.H("\u6af6")), ydHl3), string), ydHl2), NVIs$JbpD.H("\u6af0\u725d\u8dd7")), ydHl4));
    }

    public static String mXJp(ydHl ydHl2, int n) {
        return VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder(), ydHl2), (ydHl)((Object)yy.p(-510852438))), VvxM.repeat(KDGY$JAHk.Y("\u8729"), n)));
    }

    public static String ksfs(ydHl ydHl2, int n) {
        return VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder(), ydHl2), (ydHl)((Object)yy.p(-510852438))), VvxM.repeat(NVIs$JbpD.H("\u11ff"), n)));
    }

    public static String mXJp(ydHl ydHl2, int object, double d, String string, String string2, String string3) {
        Object object2 = VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder(), ydHl2), (ydHl)((Object)yy.p(2047279775))), string));
        object = object < VvxM.Vx(string) + VvxM.Vx(string3) + VvxM.Vx(string2) ? (Object)(VvxM.Vx(string) + VvxM.Vx(string3) + VvxM.Vx(string2) + 6) : object;
        int n = object - (VvxM.Vx(string) + VvxM.Vx(string3) + VvxM.Vx(string2));
        int n2 = (int)((double)n * d);
        int n3 = object - n2;
        if (d == 0.0) {
            return VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder((String)VvxM.Vx(object2)), (ydHl)((Object)yy.p(-20248912))), (ydHl)((Object)yy.p(2047279775))), VvxM.Vx(BkvY$LhxG.I("\u684d"), n3)), (ydHl)((Object)yy.p(-20248912))), (ydHl)((Object)yy.p(2047279775))), string3));
        }
        return VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder((String)VvxM.Vx(object2)), VvxM.Vx(BkvY$LhxG.I("\u684d"), n2)), d == 1.0 ? string3 : VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(VvxM.Vx(new StringBuilder((String)VvxM.Vx(string2)), (ydHl)((Object)yy.p(-20248912))), (ydHl)((Object)yy.p(2047279775))), VvxM.Vx(BkvY$LhxG.I("\u684d"), n3)), (ydHl)((Object)yy.p(-20248912))), (ydHl)((Object)yy.p(2047279775))), string3))));
    }

    private static Object Vx(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

