/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class gxcp
extends Enum<gxcp> {
    public static final /* enum */ gxcp LXuY;
    public static final /* enum */ gxcp vtnr;
    private static final /* synthetic */ gxcp[] Seyx;

    static {
        o.w(-2042803064, (Object)new gxcp(mrFx$WjFM.d("\u1ba1\ue1f2\u61ac\ueef6\u21f6\uf018\ua8c0\udb66\u3635\u9e9a\u7e5f"), 0));
        o.w(1437613593, (Object)new gxcp(mrFx$WjFM.d("\u1ba0\ue1f0\u61b8\ueef4\u21fe\uf002\ua8c1\udb7d"), 1));
        o.w(-1354154366, new gxcp[]{(gxcp)((Object)o.k(-2042803064)), (gxcp)((Object)o.k(1437613593))});
    }

    private gxcp(String string2, int n2) {
    }

    public static gxcp[] values() {
        gxcp[] arrgxcp = (gxcp[])o.k(-1354154366);
        int n = arrgxcp.length;
        gxcp[] arrgxcp2 = new gxcp[n];
        gxcp.VE(arrgxcp, false, arrgxcp2, false, n);
        return arrgxcp2;
    }

    public static gxcp valueOf(String string) {
        return (gxcp)((Object)gxcp.VE(gxcp.class, string));
    }

    private static Object VE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

