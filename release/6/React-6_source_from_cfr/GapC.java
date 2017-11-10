/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class GapC
extends Enum<GapC> {
    public static final /* enum */ GapC vkaS;
    public static final /* enum */ GapC myxM;
    private static final /* synthetic */ GapC[] FNWD;

    public static GapC[] values() {
        return (GapC[])((GapC[])yy.p(-1322522238)).clone();
    }

    public static GapC valueOf(String string) {
        return (GapC)((Object)GapC.uv(GapC.class, string));
    }

    private GapC() {
    }

    static {
        yy.K(657648055, (Object)new GapC());
        yy.K(764078520, (Object)new GapC());
        yy.K(-1322522238, new GapC[]{(GapC)((Object)yy.p(657648055)), (GapC)((Object)yy.p(764078520))});
    }

    private static Object uv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

