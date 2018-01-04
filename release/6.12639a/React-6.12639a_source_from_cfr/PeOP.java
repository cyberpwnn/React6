/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class PeOP
extends Enum<PeOP> {
    public static final /* enum */ PeOP XTmF;
    private static final /* synthetic */ PeOP[] nKyk;

    static {
        o.w(605829898, (Object)new PeOP(mrFx$WjFM.d("\u72fd\u85a0\u528f"), 0));
        o.w(1125923593, new PeOP[]{(PeOP)((Object)o.k(605829898))});
    }

    private PeOP(String string2, int n2) {
    }

    public static PeOP[] values() {
        PeOP[] arrpeOP = (PeOP[])o.k(1125923593);
        int n = arrpeOP.length;
        PeOP[] arrpeOP2 = new PeOP[n];
        PeOP.sm(arrpeOP, false, arrpeOP2, false, n);
        return arrpeOP2;
    }

    public static PeOP valueOf(String string) {
        return (PeOP)((Object)PeOP.sm(PeOP.class, string));
    }

    private static Object sm(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

