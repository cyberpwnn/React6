/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class IhWD
extends Enum<IhWD> {
    public static final /* enum */ IhWD IXOv;
    public static final /* enum */ IhWD oMiq;
    public static final /* enum */ IhWD afeX;
    private static final /* synthetic */ IhWD[] IWnu;

    static {
        o.w(-1365228123, (Object)new IhWD(mrFx$WjFM.d("\u2bcb\u9fa5\u2850\u3604"), 0));
        o.w(-798603868, (Object)new IhWD(mrFx$WjFM.d("\u2bcb\u9fa7\u2853\u3607\u9f15\u31ee\u1bf9\uee41\u7b21"), 1));
        o.w(-1235204701, (Object)new IhWD(mrFx$WjFM.d("\u2bca\u9fb7\u285d\u361b\u9f00\u31f8"), 2));
        o.w(1560495506, new IhWD[]{(IhWD)((Object)o.k(-1365228123)), (IhWD)((Object)o.k(-798603868)), (IhWD)((Object)o.k(-1235204701))});
    }

    private IhWD(String string2, int n2) {
    }

    public static IhWD[] values() {
        IhWD[] arrihWD = (IhWD[])o.k(1560495506);
        int n = arrihWD.length;
        IhWD[] arrihWD2 = new IhWD[n];
        IhWD.PP(arrihWD, false, arrihWD2, false, n);
        return arrihWD2;
    }

    public static IhWD valueOf(String string) {
        return (IhWD)((Object)IhWD.PP(IhWD.class, string));
    }

    private static Object PP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

