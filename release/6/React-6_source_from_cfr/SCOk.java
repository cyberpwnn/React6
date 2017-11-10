/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class SCOk
extends Enum<SCOk> {
    public static final /* enum */ SCOk WaIA;
    public static final /* enum */ SCOk myyE;
    private static final /* synthetic */ SCOk[] NVMo;

    public static SCOk[] values() {
        return (SCOk[])((SCOk[])yy.p(-9770567)).clone();
    }

    public static SCOk valueOf(String string) {
        return (SCOk)((Object)SCOk.nC(SCOk.class, string));
    }

    private SCOk() {
    }

    static {
        yy.K(-1801459103, (Object)new SCOk());
        yy.K(-1947211227, (Object)new SCOk());
        yy.K(-9770567, new SCOk[]{(SCOk)((Object)yy.p(-1801459103)), (SCOk)((Object)yy.p(-1947211227))});
    }

    private static Object nC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

