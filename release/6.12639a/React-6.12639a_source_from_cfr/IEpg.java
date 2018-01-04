/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class IEpg
extends Enum<IEpg> {
    public static final /* enum */ IEpg UknG;
    public static final /* enum */ IEpg jXIQ;
    public static final /* enum */ IEpg OsNL;
    private static final /* synthetic */ IEpg[] yJbA;

    static {
        o.w(1538213157, (Object)new IEpg(FMkR$WjFM.a("\uf301\u74e3\u1a1a\ue00b\ud1df\u802c\u09b3"), 0));
        o.w(-281656028, (Object)new IEpg(FMkR$WjFM.a("\uf30d\u74e2\u1a1d\ue015\ud1ca\u8025\u09b2\u2e88"), 1));
        o.w(1098466595, (Object)new IEpg(FMkR$WjFM.a("\uf30d\u74e4\u1a00\ue005"), 2));
        o.w(-75086574, new IEpg[]{(IEpg)((Object)o.k(1538213157)), (IEpg)((Object)o.k(-281656028)), (IEpg)((Object)o.k(1098466595))});
    }

    private IEpg(String string2, int n2) {
    }

    public static IEpg[] values() {
        IEpg[] arriEpg = (IEpg[])o.k(-75086574);
        int n = arriEpg.length;
        IEpg[] arriEpg2 = new IEpg[n];
        IEpg.Eu(arriEpg, false, arriEpg2, false, n);
        return arriEpg2;
    }

    public static IEpg valueOf(String string) {
        return (IEpg)((Object)IEpg.Eu(IEpg.class, string));
    }

    private static Object Eu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

