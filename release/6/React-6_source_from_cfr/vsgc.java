/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class vsgc
extends Enum<vsgc> {
    public static final /* enum */ vsgc KLcy;
    public static final /* enum */ vsgc Jkcx;
    public static final /* enum */ vsgc Wyys;
    private String name;
    private String description;
    private Lhol myxn;
    private GapC BclT;
    private static final /* synthetic */ vsgc[] gNSr;

    public static vsgc[] values() {
        return (vsgc[])((vsgc[])yy.p(1999694221)).clone();
    }

    public static vsgc valueOf(String string) {
        return (vsgc)((Object)vsgc.PT(vsgc.class, string));
    }

    private vsgc(Lhol lhol, GapC gapC, String string2, String string3) {
        this.name = string2;
        this.description = string3;
        this.myxn = lhol;
        this.BclT = gapC;
    }

    public String getName() {
        return (String)yy.h((Object)this, 1100933510);
    }

    public String getDescription() {
        return (String)yy.h((Object)this, -1495144053);
    }

    public Lhol qSYN() {
        return (Lhol)((Object)yy.h((Object)this, -1003492980));
    }

    public GapC nSBH() {
        return (GapC)((Object)yy.h((Object)this, -1333466751));
    }

    static {
        yy.K(2065623586, (Object)new vsgc((Lhol)((Object)yy.p(1055975812)), (GapC)((Object)yy.p(657648055)), (String)yy.p(-652285558), (String)yy.p(-525538945)));
        yy.K(-497948263, (Object)new vsgc((Lhol)((Object)yy.p(1055975812)), (GapC)((Object)yy.p(657648055)), (String)yy.p(1612573056), (String)yy.p(362801621)));
        yy.K(802875970, (Object)new vsgc((Lhol)((Object)yy.p(1055975812)), (GapC)((Object)yy.p(657648055)), (String)yy.p(1462626766), (String)yy.p(-937760301)));
        yy.K(1999694221, new vsgc[]{(vsgc)((Object)yy.p(2065623586)), (vsgc)((Object)yy.p(-497948263)), (vsgc)((Object)yy.p(802875970))});
    }

    private static Object PT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

