/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class XAfJ
extends Enum<XAfJ> {
    public static final /* enum */ XAfJ scWh;
    public static final /* enum */ XAfJ tCvg;
    private static final /* synthetic */ XAfJ[] fLQc;

    public static XAfJ[] values() {
        return (XAfJ[])((XAfJ[])o.k(-406307170)).clone();
    }

    public static XAfJ valueOf(String string) {
        return (XAfJ)((Object)XAfJ.EZ(XAfJ.class, string));
    }

    private XAfJ() {
    }

    static {
        o.w(-497136612, (Object)new XAfJ());
        o.w(-1905570811, (Object)new XAfJ());
        o.w(-406307170, new XAfJ[]{(XAfJ)((Object)o.k(-497136612)), (XAfJ)((Object)o.k(-1905570811))});
    }

    private static Object EZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

