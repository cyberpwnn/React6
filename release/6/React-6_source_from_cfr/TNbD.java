/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class TNbD
extends Enum<TNbD> {
    public static final /* enum */ TNbD APKB;
    public static final /* enum */ TNbD kstv;
    public static final /* enum */ TNbD uNna;
    public static final /* enum */ TNbD loHn;
    public static final /* enum */ TNbD xhxl;
    public static final /* enum */ TNbD gWIG;
    public static final /* enum */ TNbD ydMI;
    public static final /* enum */ TNbD rpXo;
    private String loHX;
    private static final /* synthetic */ TNbD[] lnfu;

    public static TNbD[] values() {
        return (TNbD[])((TNbD[])cv.e(1077415782)).clone();
    }

    public static TNbD valueOf(String string) {
        return (TNbD)((Object)TNbD.UG(TNbD.class, string));
    }

    private TNbD(String string2) {
        this.loHX = string2;
    }

    public String toString() {
        return (String)cv.b((Object)this, -1993863327);
    }

    public static String ssNb(int n) {
        if (n > 2000) {
            return ((TNbD)((Object)cv.e(-1234563232))).toString();
        }
        if (n > 1700) {
            return ((TNbD)((Object)cv.e(556076899))).toString();
        }
        if (n > 1500) {
            return ((TNbD)((Object)cv.e(-730001566))).toString();
        }
        if (n > 1350) {
            return ((TNbD)((Object)cv.e(-2069819539))).toString();
        }
        if (n > 1100) {
            return ((TNbD)((Object)cv.e(-2122772628))).toString();
        }
        if (n > 800) {
            return ((TNbD)((Object)cv.e(873598831))).toString();
        }
        if (n > 100) {
            return ((TNbD)((Object)cv.e(1542459246))).toString();
        }
        return ((TNbD)((Object)cv.e(-1983443095))).toString();
    }

    static {
        cv.V(-1983443095, (Object)new TNbD(rgig$AWxc.r("\u1240\ue365\u5c43\ud9bf\u750b\uc484\u5c00\u4965\u187f\u1764")));
        cv.V(1542459246, (Object)new TNbD(rgig$AWxc.r("\u1243\ue36c\u5c45\ud9b4\u754a\uc4f7\u5c3f\u4966\u1867")));
        cv.V(873598831, (Object)new TNbD(rgig$AWxc.r("\u1246\ue365\u5c58\ud9ba")));
        cv.V(-2122772628, (Object)new TNbD(rgig$AWxc.r("\u1254\ue37f\u5c52\ud9bf\u750b\uc4c3\u5c36")));
        cv.V(-2069819539, (Object)new TNbD(rgig$AWxc.r("\u1252\ue366\u5c58\ud9a9")));
        cv.V(-730001566, (Object)new TNbD(rgig$AWxc.r("\u1253\ue368\u5c44\ud9b9")));
        cv.V(556076899, (Object)new TNbD(rgig$AWxc.r("\u1243\ue36c\u5c45\ud9b4\u754a\uc4e2\u5c32\u497a\u1864")));
        cv.V(-1234563232, (Object)new TNbD(rgig$AWxc.r("\u1240\ue365\u5c43\ud9bf\u750b\uc484\u5c15\u4968\u1863\u1767")));
        cv.V(1077415782, new TNbD[]{(TNbD)((Object)cv.e(-1983443095)), (TNbD)((Object)cv.e(1542459246)), (TNbD)((Object)cv.e(873598831)), (TNbD)((Object)cv.e(-2122772628)), (TNbD)((Object)cv.e(-2069819539)), (TNbD)((Object)cv.e(-730001566)), (TNbD)((Object)cv.e(556076899)), (TNbD)((Object)cv.e(-1234563232))});
    }

    private static Object UG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

