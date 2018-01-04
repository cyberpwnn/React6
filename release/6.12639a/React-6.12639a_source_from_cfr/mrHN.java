/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class mrHN
extends Enum<mrHN> {
    public static final /* enum */ mrHN NVlg;
    public static final /* enum */ mrHN clyy;
    public static final /* enum */ mrHN Osbk;
    public static final /* enum */ mrHN lftX;
    private static final /* synthetic */ mrHN[] LYWw;

    public static mrHN[] values() {
        return (mrHN[])((mrHN[])o.k(-1625604428)).clone();
    }

    public static mrHN valueOf(String string) {
        return (mrHN)((Object)mrHN.EQ(mrHN.class, string));
    }

    private mrHN() {
    }

    static {
        o.w(1023688251, (Object)new mrHN());
        o.w(1506164424, (Object)new mrHN());
        o.w(1187528373, (Object)new mrHN());
        o.w(-1147584842, (Object)new mrHN());
        o.w(-1625604428, new mrHN[]{(mrHN)((Object)o.k(1023688251)), (mrHN)((Object)o.k(1506164424)), (mrHN)((Object)o.k(1187528373)), (mrHN)((Object)o.k(-1147584842))});
    }

    private static Object EQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

