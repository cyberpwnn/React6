/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class ktRX
extends Enum<ktRX> {
    public static final /* enum */ ktRX dyOx;
    public static final /* enum */ ktRX YVmJ;
    private static final /* synthetic */ ktRX[] Dsch;

    public static ktRX[] values() {
        return (ktRX[])((ktRX[])o.k(-2047328609)).clone();
    }

    public static ktRX valueOf(String string) {
        return (ktRX)((Object)ktRX.kL(ktRX.class, string));
    }

    private ktRX() {
    }

    static {
        o.w(1453473456, (Object)new ktRX());
        o.w(-1645330742, (Object)new ktRX());
        o.w(-2047328609, new ktRX[]{(ktRX)((Object)o.k(1453473456)), (ktRX)((Object)o.k(-1645330742))});
    }

    private static Object kL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

