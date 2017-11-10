/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class lfOH
extends Enum<lfOH> {
    public static final /* enum */ lfOH RABt;
    private static final /* synthetic */ lfOH[] awao;

    public static lfOH[] values() {
        return (lfOH[])((lfOH[])yy.p(-1193088701)).clone();
    }

    public static lfOH valueOf(String string) {
        return (lfOH)((Object)lfOH.To(lfOH.class, string));
    }

    private lfOH() {
    }

    static {
        yy.K(-1665996476, (Object)new lfOH());
        yy.K(-1193088701, new lfOH[]{(lfOH)((Object)yy.p(-1665996476))});
    }

    private static Object To(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

