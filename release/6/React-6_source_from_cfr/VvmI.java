/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class VvmI
extends Enum<VvmI> {
    public static final /* enum */ VvmI JtUd;
    public static final /* enum */ VvmI TNnN;
    public static final /* enum */ VvmI ryHL;
    public static final /* enum */ VvmI bOfK;
    public static final /* enum */ VvmI xrLK;
    public static final /* enum */ VvmI xWxN;
    public static final /* enum */ VvmI pacH;
    public static final /* enum */ VvmI OsFn;
    private String rNVu;
    private static final /* synthetic */ VvmI[] LPKY;

    public static VvmI[] values() {
        return (VvmI[])((VvmI[])yy.p(-832574986)).clone();
    }

    public static VvmI valueOf(String string) {
        return (VvmI)((Object)VvmI.Cg(VvmI.class, string));
    }

    private VvmI(String string2) {
        this.rNVu = string2;
    }

    public String toString() {
        return (String)yy.h((Object)this, -536614405);
    }

    public static String eYCP(int n) {
        if (n > 9000) {
            return ((VvmI)((Object)yy.p(-856430084))).toString();
        }
        if (n > 5900) {
            return ((VvmI)((Object)yy.p(-1278940687))).toString();
        }
        if (n > 4400) {
            return ((VvmI)((Object)yy.p(1796794874))).toString();
        }
        if (n > 3500) {
            return ((VvmI)((Object)yy.p(237627887))).toString();
        }
        if (n > 2300) {
            return ((VvmI)((Object)yy.p(-1733694992))).toString();
        }
        if (n > 1700) {
            return ((VvmI)((Object)yy.p(-798234171))).toString();
        }
        if (n > 900) {
            return ((VvmI)((Object)yy.p(1005840830))).toString();
        }
        return ((VvmI)((Object)yy.p(-1812272701))).toString();
    }

    static {
        yy.K(-1812272701, (Object)new VvmI(NVIs$JbpD.H("\u9558\u0ed8\ude9e\u7a85\u97ca\u59d7\u4438\u1529\ua4ad\uee31")));
        yy.K(1005840830, (Object)new VvmI(NVIs$JbpD.H("\u955b\u0ed1\ude98\u7a8e\u978b\u59a4\u4407\u152a\ua4b5")));
        yy.K(-798234171, (Object)new VvmI(NVIs$JbpD.H("\u955e\u0ed8\ude85\u7a80")));
        yy.K(-1733694992, (Object)new VvmI(NVIs$JbpD.H("\u954c\u0ec2\ude8f\u7a85\u97ca\u5990\u440e")));
        yy.K(237627887, (Object)new VvmI(NVIs$JbpD.H("\u954a\u0edb\ude85\u7a93")));
        yy.K(1796794874, (Object)new VvmI(NVIs$JbpD.H("\u954b\u0ed5\ude99\u7a83")));
        yy.K(-1278940687, (Object)new VvmI(NVIs$JbpD.H("\u955b\u0ed1\ude98\u7a8e\u978b\u59b1\u440a\u1536\ua4b6")));
        yy.K(-856430084, (Object)new VvmI(NVIs$JbpD.H("\u9558\u0ed8\ude9e\u7a85\u97ca\u59d7\u442d\u1524\ua4b1\uee32")));
        yy.K(-832574986, new VvmI[]{(VvmI)((Object)yy.p(-1812272701)), (VvmI)((Object)yy.p(1005840830)), (VvmI)((Object)yy.p(-798234171)), (VvmI)((Object)yy.p(-1733694992)), (VvmI)((Object)yy.p(237627887)), (VvmI)((Object)yy.p(1796794874)), (VvmI)((Object)yy.p(-1278940687)), (VvmI)((Object)yy.p(-856430084))});
    }

    private static Object Cg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

