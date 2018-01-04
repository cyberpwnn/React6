/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class JQxi$yJLS
extends Enum<JQxi$yJLS> {
    public static final /* enum */ JQxi$yJLS KyJb;
    public static final /* enum */ JQxi$yJLS DtVL;
    public static final /* enum */ JQxi$yJLS UvGG;
    public static final /* enum */ JQxi$yJLS gqiY;
    public static final /* enum */ JQxi$yJLS kdcc;
    public static final /* enum */ JQxi$yJLS yBwa;
    private static final /* synthetic */ JQxi$yJLS[] lEci;

    static {
        o.w(-299348704, (Object)new JQxi$yJLS(FMkR$WjFM.a("\uc081\uf624\u6aee"), 0));
        o.w(-1865134817, (Object)new JQxi$yJLS(FMkR$WjFM.a("\uc081\uf624\u6ae1"), 1));
        o.w(-1253487330, (Object)new JQxi$yJLS(FMkR$WjFM.a("\uc081\uf624\u6ae0"), 2));
        o.w(-883077859, (Object)new JQxi$yJLS(FMkR$WjFM.a("\uc081\uf624\u6ae8\ud839"), 3));
        o.w(1296125212, (Object)new JQxi$yJLS(FMkR$WjFM.a("\uc081\uf624\u6ae8\ud838"), 4));
        o.w(1036012827, (Object)new JQxi$yJLS(FMkR$WjFM.a("\uc081\uf624\u6ae8\ud83a"), 5));
        o.w(1636191530, new JQxi$yJLS[]{(JQxi$yJLS)((Object)o.k(-299348704)), (JQxi$yJLS)((Object)o.k(-1865134817)), (JQxi$yJLS)((Object)o.k(-1253487330)), (JQxi$yJLS)((Object)o.k(-883077859)), (JQxi$yJLS)((Object)o.k(1296125212)), (JQxi$yJLS)((Object)o.k(1036012827))});
    }

    private JQxi$yJLS(String string2, int n2) {
    }

    public static JQxi$yJLS[] values() {
        JQxi$yJLS[] arrjQxi$yJLS = (JQxi$yJLS[])o.k(1636191530);
        int n = arrjQxi$yJLS.length;
        JQxi$yJLS[] arrjQxi$yJLS2 = new JQxi$yJLS[n];
        JQxi$yJLS.EP(arrjQxi$yJLS, false, arrjQxi$yJLS2, false, n);
        return arrjQxi$yJLS2;
    }

    public static JQxi$yJLS valueOf(String string) {
        return (JQxi$yJLS)((Object)JQxi$yJLS.EP(JQxi$yJLS.class, string));
    }

    private static Object EP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

