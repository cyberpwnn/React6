/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class Lhol
extends Enum<Lhol> {
    public static final /* enum */ Lhol tLId;
    public static final /* enum */ Lhol rxfr;
    public static final /* enum */ Lhol dUlA;
    private static final /* synthetic */ Lhol[] DGnt;

    public static Lhol[] values() {
        return (Lhol[])((Lhol[])yy.p(79096240)).clone();
    }

    public static Lhol valueOf(String string) {
        return (Lhol)((Object)Lhol.wX(Lhol.class, string));
    }

    private Lhol() {
    }

    static {
        yy.K(1174858110, (Object)new Lhol());
        yy.K(473033091, (Object)new Lhol());
        yy.K(1055975812, (Object)new Lhol());
        yy.K(79096240, new Lhol[]{(Lhol)((Object)yy.p(1174858110)), (Lhol)((Object)yy.p(473033091)), (Lhol)((Object)yy.p(1055975812))});
    }

    private static Object wX(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

