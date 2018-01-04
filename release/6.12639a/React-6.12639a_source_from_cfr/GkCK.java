/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class GkCK
extends Enum<GkCK> {
    public static final /* enum */ GkCK HfJm;
    public static final /* enum */ GkCK FFQt;
    public static final /* enum */ GkCK brVS;
    public static final /* enum */ GkCK tmxT;
    public static final /* enum */ GkCK uiLJ;
    private static final /* synthetic */ GkCK[] Droj;

    static {
        o.w(1853310433, (Object)new GkCK(FMkR$WjFM.a("\u7167\ue071\uf926\u12cb\ued23\uee60"), 0));
        o.w(1460684256, (Object)new GkCK(FMkR$WjFM.a("\u716a\ue070\uf922\u12d2\ued32\uee6b"), 1));
        o.w(1070941663, (Object)new GkCK(FMkR$WjFM.a("\u7170\ue07a\uf936\u12d1\ued23\uee76\uc131\u1379"), 2));
        o.w(-365017634, (Object)new GkCK(FMkR$WjFM.a("\u7164\ue073\uf927\u12cb\ued33"), 3));
        o.w(1957512669, (Object)new GkCK(FMkR$WjFM.a("\u7172\ue077\uf92b\u12d1\ued3e\uee7a\uc12c"), 4));
        o.w(1897350620, new GkCK[]{(GkCK)((Object)o.k(1853310433)), (GkCK)((Object)o.k(1460684256)), (GkCK)((Object)o.k(1070941663)), (GkCK)((Object)o.k(-365017634)), (GkCK)((Object)o.k(1957512669))});
    }

    private GkCK(String string2, int n2) {
    }

    public static GkCK[] values() {
        GkCK[] arrgkCK = (GkCK[])o.k(1897350620);
        int n = arrgkCK.length;
        GkCK[] arrgkCK2 = new GkCK[n];
        GkCK.tW(arrgkCK, false, arrgkCK2, false, n);
        return arrgkCK2;
    }

    public static GkCK valueOf(String string) {
        return (GkCK)((Object)GkCK.tW(GkCK.class, string));
    }

    private static Object tW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

