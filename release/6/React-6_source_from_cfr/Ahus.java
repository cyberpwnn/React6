/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class Ahus
extends Enum<Ahus> {
    public static final /* enum */ Ahus WGef;
    public static final /* enum */ Ahus gWUP;
    public static final /* enum */ Ahus GcLL;
    public static final /* enum */ Ahus tKwh;
    public static final /* enum */ Ahus UlSs;
    public static final /* enum */ Ahus YpNa;
    public static final /* enum */ Ahus wLoo;
    private static final /* synthetic */ Ahus[] xqvX;

    static {
        yy.K(-862845406, (Object)new Ahus(NVIs$JbpD.H("\u2fdd\ue858"), 0));
        yy.K(2003371607, (Object)new Ahus(NVIs$JbpD.H("\u2fdd\ue83a"), 1));
        yy.K(410584664, (Object)new Ahus(NVIs$JbpD.H("\u2fdd\ue835"), 2));
        yy.K(-1728838099, (Object)new Ahus(NVIs$JbpD.H("\u2fdd\ue834"), 3));
        yy.K(-309197274, (Object)new Ahus(NVIs$JbpD.H("\u2fdd\ue83c\uef01"), 4));
        yy.K(788137515, (Object)new Ahus(NVIs$JbpD.H("\u2fdd\ue83c\uef01\u3b17"), 5));
        yy.K(-328464896, (Object)new Ahus(NVIs$JbpD.H("\u2fdd\ue83c\uef01\u3b14"), 6));
        yy.K(-1286601172, new Ahus[]{(Ahus)((Object)yy.p(-862845406)), (Ahus)((Object)yy.p(2003371607)), (Ahus)((Object)yy.p(410584664)), (Ahus)((Object)yy.p(-1728838099)), (Ahus)((Object)yy.p(-309197274)), (Ahus)((Object)yy.p(788137515)), (Ahus)((Object)yy.p(-328464896))});
    }

    private Ahus(String string2, int n2) {
    }

    public static boolean GbYt() {
        if (Ahus.lndQ().equals((Object)((Ahus)((Object)yy.p(2003371607))))) {
            return false;
        }
        return true;
    }

    public static boolean PeEO() {
        if (Ahus.lndQ().equals((Object)((Ahus)((Object)yy.p(2003371607)))) || Ahus.lndQ().equals((Object)((Ahus)((Object)yy.p(410584664))))) {
            return false;
        }
        return true;
    }

    public static Ahus lndQ() {
        if (Ahus.Qp(Ahus.Qp(), NVIs$JbpD.H("\u1f2b\ud65d\u095c")) != false) {
            return (Ahus)((Object)yy.p(2003371607));
        }
        if (Ahus.Qp(Ahus.Qp(), NVIs$JbpD.H("\u1f2b\ud65d\u0953")) != false) {
            return (Ahus)((Object)yy.p(410584664));
        }
        if (Ahus.Qp(Ahus.Qp(), NVIs$JbpD.H("\u1f2b\ud65d\u0952")) != false) {
            return (Ahus)((Object)yy.p(-1728838099));
        }
        if (Ahus.Qp(Ahus.Qp(), NVIs$JbpD.H("\u1f2b\ud65d\u095a\uaa4d")) != false) {
            return (Ahus)((Object)yy.p(-309197274));
        }
        if (Ahus.Qp(Ahus.Qp(), NVIs$JbpD.H("\u1f2b\ud65d\u095a\uaa4c")) != false) {
            return (Ahus)((Object)yy.p(788137515));
        }
        if (Ahus.Qp(Ahus.Qp(), NVIs$JbpD.H("\u1f2b\ud65d\u095a\uaa4f")) != false) {
            return (Ahus)((Object)yy.p(-328464896));
        }
        return (Ahus)((Object)yy.p(-862845406));
    }

    public static Ahus[] values() {
        Ahus[] arrahus = (Ahus[])yy.p(-1286601172);
        int n = arrahus.length;
        Ahus[] arrahus2 = new Ahus[n];
        Ahus.Qp(arrahus, false, arrahus2, false, n);
        return arrahus2;
    }

    public static Ahus valueOf(String string) {
        return (Ahus)((Object)Ahus.Qp(Ahus.class, string));
    }

    private static Object Qp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

