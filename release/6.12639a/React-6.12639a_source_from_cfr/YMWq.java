/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class YMWq
extends Enum<YMWq> {
    public static final /* enum */ YMWq GJFd;
    public static final /* enum */ YMWq cujG;
    private static final /* synthetic */ YMWq[] lDng;

    static {
        o.w(-1421387489, (Object)new YMWq(nJPf$sILv.G("\ueae6\u358d\u36d9\uf8d8"), 0));
        o.w(1175935264, (Object)new YMWq(nJPf$sILv.G("\ueaf7\u3592"), 1));
        o.w(178280002, new YMWq[]{(YMWq)((Object)o.k(-1421387489)), (YMWq)((Object)o.k(1175935264))});
    }

    private YMWq(String string2, int n2) {
    }

    public static YMWq[] values() {
        YMWq[] arryMWq = (YMWq[])o.k(178280002);
        int n = arryMWq.length;
        YMWq[] arryMWq2 = new YMWq[n];
        YMWq.mK(arryMWq, false, arryMWq2, false, n);
        return arryMWq2;
    }

    public static YMWq valueOf(String string) {
        return (YMWq)((Object)YMWq.mK(YMWq.class, string));
    }

    private static Object mK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

