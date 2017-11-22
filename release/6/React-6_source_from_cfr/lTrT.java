/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class lTrT
extends Enum<lTrT> {
    public static final /* enum */ lTrT JBKU;
    public static final /* enum */ lTrT Nxje;
    public static final /* enum */ lTrT hRRY;
    public static final /* enum */ lTrT Fprl;
    public static final /* enum */ lTrT jOfu;
    public static final /* enum */ lTrT hAQN;
    public static final /* enum */ lTrT JBJv;
    private static final /* synthetic */ lTrT[] MBbo;

    static {
        cv.V(88732870, (Object)new lTrT(YEBy$TyVf.W("\ub209\ufb62"), 0));
        cv.V(904787137, (Object)new lTrT(YEBy$TyVf.W("\ub209\ufb00"), 1));
        cv.V(-505613120, (Object)new lTrT(YEBy$TyVf.W("\ub209\ufb0f"), 2));
        cv.V(2070279363, (Object)new lTrT(YEBy$TyVf.W("\ub209\ufb0e"), 3));
        cv.V(1050866882, (Object)new lTrT(YEBy$TyVf.W("\ub209\ufb06\uc8d2"), 4));
        cv.V(1784083661, (Object)new lTrT(YEBy$TyVf.W("\ub209\ufb06\uc8d2\uc082"), 5));
        cv.V(873460904, (Object)new lTrT(YEBy$TyVf.W("\ub209\ufb06\uc8d2\uc081"), 6));
        cv.V(325973196, new lTrT[]{(lTrT)((Object)cv.e(88732870)), (lTrT)((Object)cv.e(904787137)), (lTrT)((Object)cv.e(-505613120)), (lTrT)((Object)cv.e(2070279363)), (lTrT)((Object)cv.e(1050866882)), (lTrT)((Object)cv.e(1784083661)), (lTrT)((Object)cv.e(873460904))});
    }

    private lTrT(String string2, int n2) {
    }

    public static boolean xhxl() {
        if (lTrT.ydMI().equals((Object)((lTrT)((Object)cv.e(904787137))))) {
            return false;
        }
        return true;
    }

    public static boolean gWIG() {
        if (lTrT.ydMI().equals((Object)((lTrT)((Object)cv.e(904787137)))) || lTrT.ydMI().equals((Object)((lTrT)((Object)cv.e(-505613120))))) {
            return false;
        }
        return true;
    }

    public static lTrT ydMI() {
        if (lTrT.EE(lTrT.EE(), KUXS$dwji.S("\u32bd\u6412\ud248")) != false) {
            return (lTrT)((Object)cv.e(904787137));
        }
        if (lTrT.EE(lTrT.EE(), KUXS$dwji.S("\u32bd\u6412\ud247")) != false) {
            return (lTrT)((Object)cv.e(-505613120));
        }
        if (lTrT.EE(lTrT.EE(), KUXS$dwji.S("\u32bd\u6412\ud246")) != false) {
            return (lTrT)((Object)cv.e(2070279363));
        }
        if (lTrT.EE(lTrT.EE(), KUXS$dwji.S("\u32bd\u6412\ud24e\u6a1f")) != false) {
            return (lTrT)((Object)cv.e(1050866882));
        }
        if (lTrT.EE(lTrT.EE(), KUXS$dwji.S("\u32bd\u6412\ud24e\u6a1e")) != false) {
            return (lTrT)((Object)cv.e(1784083661));
        }
        if (lTrT.EE(lTrT.EE(), KUXS$dwji.S("\u32bd\u6412\ud24e\u6a1d")) != false) {
            return (lTrT)((Object)cv.e(873460904));
        }
        return (lTrT)((Object)cv.e(88732870));
    }

    public static lTrT[] values() {
        lTrT[] arrlTrT = (lTrT[])cv.e(325973196);
        int n = arrlTrT.length;
        lTrT[] arrlTrT2 = new lTrT[n];
        lTrT.EE(arrlTrT, false, arrlTrT2, false, n);
        return arrlTrT2;
    }

    public static lTrT valueOf(String string) {
        return (lTrT)((Object)lTrT.EE(lTrT.class, string));
    }

    private static Object EE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

