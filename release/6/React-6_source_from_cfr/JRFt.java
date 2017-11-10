/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class JRFt
extends Enum<JRFt> {
    public static final /* enum */ JRFt SnAm;
    public static final /* enum */ JRFt SBla;
    private static final /* synthetic */ JRFt[] gois;

    static {
        yy.K(-181213024, (Object)new JRFt(NVIs$JbpD.H("\ubade\u0ab1\u1429\ub1c4\u0f15\u2f91\ua8db\u50de\u5aa5\u0b3b\ue5ce"), 0));
        yy.K(-1315176823, (Object)new JRFt(NVIs$JbpD.H("\ubadf\u0ab3\u143d\ub1c6\u0f1d\u2f8b\ua8da\u50c5"), 1));
        yy.K(1823080081, new JRFt[]{(JRFt)((Object)yy.p(-181213024)), (JRFt)((Object)yy.p(-1315176823))});
    }

    private JRFt(String string2, int n2) {
    }

    public static JRFt[] values() {
        JRFt[] arrjRFt = (JRFt[])yy.p(1823080081);
        int n = arrjRFt.length;
        JRFt[] arrjRFt2 = new JRFt[n];
        JRFt.tW(arrjRFt, false, arrjRFt2, false, n);
        return arrjRFt2;
    }

    public static JRFt valueOf(String string) {
        return (JRFt)((Object)JRFt.tW(JRFt.class, string));
    }

    private static Object tW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

