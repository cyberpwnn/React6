/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class nuWa
extends Enum<nuWa> {
    public static final /* enum */ nuWa OSXO;
    public static final /* enum */ nuWa nfaV;
    public static final /* enum */ nuWa rGyN;
    public static final /* enum */ nuWa jQdK;
    public static final /* enum */ nuWa XUdO;
    private static final /* synthetic */ nuWa[] dqwv;

    static {
        o.w(-1792851468, (Object)new nuWa(FMkR$WjFM.a("\ueef4\u9154\ua0b1\u2880\u24dd"), 0));
        o.w(-202096141, (Object)new nuWa(FMkR$WjFM.a("\ueee2\u914e\ua0b1\u2890\u24c5\uf2dd"), 1));
        o.w(126173666, (Object)new nuWa(FMkR$WjFM.a("\ueee3\u9149\ua0a3\u2893\u24cb\uf2d4\u15dc"), 2));
        o.w(-1437974047, (Object)new nuWa(FMkR$WjFM.a("\ueef4\u9154\ua0bf\u2882"), 3));
        o.w(-1875820064, (Object)new nuWa(FMkR$WjFM.a("\ueef5\u9155\ua0be\u289c\u24c0\uf2d6\u15de"), 4));
        o.w(1742684639, new nuWa[]{(nuWa)((Object)o.k(-1792851468)), (nuWa)((Object)o.k(-202096141)), (nuWa)((Object)o.k(126173666)), (nuWa)((Object)o.k(-1437974047)), (nuWa)((Object)o.k(-1875820064))});
    }

    private nuWa(String string2, int n2) {
    }

    public static nuWa[] values() {
        nuWa[] arrnuWa = (nuWa[])o.k(1742684639);
        int n = arrnuWa.length;
        nuWa[] arrnuWa2 = new nuWa[n];
        nuWa.tL(arrnuWa, false, arrnuWa2, false, n);
        return arrnuWa2;
    }

    public static nuWa valueOf(String string) {
        return (nuWa)((Object)nuWa.tL(nuWa.class, string));
    }

    private static Object tL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

