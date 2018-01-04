/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class biXx
extends Enum<biXx> {
    public static final /* enum */ biXx Eejd;
    public static final /* enum */ biXx GImf;
    private static final /* synthetic */ biXx[] RkpT;

    static {
        o.w(550983469, (Object)new biXx(nJPf$sILv.G("\u8a8d\u413a\uc987\ud891\uf875\u4661\ud42b\ub53f\u0198"), 0));
        o.w(1059673900, (Object)new biXx(nJPf$sILv.G("\u8a94\u413d\uc986\ud891\uf86c\u466d\ud43b"), 1));
        o.w(1628657451, new biXx[]{(biXx)((Object)o.k(550983469)), (biXx)((Object)o.k(1059673900))});
    }

    private biXx(String string2, int n2) {
    }

    public static biXx[] values() {
        biXx[] arrbiXx = (biXx[])o.k(1628657451);
        int n = arrbiXx.length;
        biXx[] arrbiXx2 = new biXx[n];
        biXx.bc(arrbiXx, false, arrbiXx2, false, n);
        return arrbiXx2;
    }

    public static biXx valueOf(String string) {
        return (biXx)((Object)biXx.bc(biXx.class, string));
    }

    private static Object bc(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

