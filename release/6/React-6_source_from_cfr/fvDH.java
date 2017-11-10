/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class fvDH
extends Enum<fvDH> {
    public static final /* enum */ fvDH YElP;
    private static final /* synthetic */ fvDH[] fTbe;

    static {
        yy.K(-1112799190, (Object)new fvDH(KDGY$JAHk.Y("\uea2d\uf354\u4deb"), 0));
        yy.K(779421727, new fvDH[]{(fvDH)((Object)yy.p(-1112799190))});
    }

    private fvDH(String string2, int n2) {
    }

    public static fvDH[] values() {
        fvDH[] arrfvDH = (fvDH[])yy.p(779421727);
        int n = arrfvDH.length;
        fvDH[] arrfvDH2 = new fvDH[n];
        fvDH.zv(arrfvDH, false, arrfvDH2, false, n);
        return arrfvDH2;
    }

    public static fvDH valueOf(String string) {
        return (fvDH)((Object)fvDH.zv(fvDH.class, string));
    }

    private static Object zv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

