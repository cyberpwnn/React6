/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class IpeM
extends Enum<IpeM> {
    public static final /* enum */ IpeM MJee;
    public static final /* enum */ IpeM pajf;
    private static final /* synthetic */ IpeM[] XKEb;

    static {
        o.w(459099971, (Object)new IpeM(FMkR$WjFM.a("\uad62\u74e4\udbab\u7496\u0106\u5dc3\ub412\u703b\uedce\u239f"), 0));
        o.w(-1699461838, (Object)new IpeM(FMkR$WjFM.a("\uad61\u74f2\udbab\u748b\u0117\u5dc7"), 1));
        o.w(-1673247439, new IpeM[]{(IpeM)((Object)o.k(459099971)), (IpeM)((Object)o.k(-1699461838))});
    }

    private IpeM(String string2, int n2) {
    }

    public static IpeM[] values() {
        IpeM[] arripeM = (IpeM[])o.k(-1673247439);
        int n = arripeM.length;
        IpeM[] arripeM2 = new IpeM[n];
        IpeM.VF(arripeM, false, arripeM2, false, n);
        return arripeM2;
    }

    public static IpeM valueOf(String string) {
        return (IpeM)((Object)IpeM.VF(IpeM.class, string));
    }

    private static Object VF(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

