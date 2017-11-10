/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class IydG
extends Enum<IydG> {
    public static final /* enum */ IydG lglV;
    public static final /* enum */ IydG JJyN;
    private static final /* synthetic */ IydG[] Ypvq;

    static {
        yy.K(737870247, (Object)new IydG(NVIs$JbpD.H("\u10b4\u0f99\uf58b\uc16f"), 0));
        yy.K(-1980825176, (Object)new IydG(NVIs$JbpD.H("\u10ab\u0f97\uf59c\uc16e"), 1));
        yy.K(-1027931715, new IydG[]{(IydG)((Object)yy.p(737870247)), (IydG)((Object)yy.p(-1980825176))});
    }

    private IydG(String string2, int n2) {
    }

    public static IydG[] values() {
        IydG[] arriydG = (IydG[])yy.p(-1027931715);
        int n = arriydG.length;
        IydG[] arriydG2 = new IydG[n];
        IydG.mH(arriydG, false, arriydG2, false, n);
        return arriydG2;
    }

    public static IydG valueOf(String string) {
        return (IydG)((Object)IydG.mH(IydG.class, string));
    }

    private static Object mH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

