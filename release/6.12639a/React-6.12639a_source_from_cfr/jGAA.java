/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class jGAA
extends Enum<jGAA> {
    public static final /* enum */ jGAA RdDC;
    public static final /* enum */ jGAA QWnf;
    public static final /* enum */ jGAA VyAN;
    public static final /* enum */ jGAA DHwk;
    private static final /* synthetic */ jGAA[] neSE;

    public static jGAA[] values() {
        return (jGAA[])((jGAA[])o.k(312757251)).clone();
    }

    public static jGAA valueOf(String string) {
        return (jGAA)((Object)jGAA.sp(jGAA.class, string));
    }

    private jGAA() {
    }

    static {
        o.w(-1180152590, (Object)new jGAA());
        o.w(693521649, (Object)new jGAA());
        o.w(310791408, (Object)new jGAA());
        o.w(-1984279313, (Object)new jGAA());
        o.w(312757251, new jGAA[]{(jGAA)((Object)o.k(-1180152590)), (jGAA)((Object)o.k(693521649)), (jGAA)((Object)o.k(310791408)), (jGAA)((Object)o.k(-1984279313))});
    }

    private static Object sp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

