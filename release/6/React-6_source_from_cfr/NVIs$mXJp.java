/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class NVIs$mXJp
extends Enum<NVIs$mXJp> {
    public static final /* enum */ NVIs$mXJp mYGN;
    public static final /* enum */ NVIs$mXJp VUdO;
    public static final /* enum */ NVIs$mXJp DsTI;
    public static final /* enum */ NVIs$mXJp cmKl;
    public static final /* enum */ NVIs$mXJp ghVm;
    public static final /* enum */ NVIs$mXJp vtbb;
    private static final /* synthetic */ NVIs$mXJp[] SCie;

    static {
        yy.K(-1459616183, (Object)new NVIs$mXJp(NVIs$JbpD.H("\u6565\u0405\u51a5"), 0));
        yy.K(-1583479214, (Object)new NVIs$mXJp(NVIs$JbpD.H("\u6565\u0405\u51aa"), 1));
        yy.K(-221903289, (Object)new NVIs$mXJp(NVIs$JbpD.H("\u6565\u0405\u51ab"), 2));
        yy.K(342230600, (Object)new NVIs$mXJp(NVIs$JbpD.H("\u6565\u0405\u51a3\u3975"), 3));
        yy.K(-2071001507, (Object)new NVIs$mXJp(NVIs$JbpD.H("\u6565\u0405\u51a3\u3974"), 4));
        yy.K(-901380522, (Object)new NVIs$mXJp(NVIs$JbpD.H("\u6565\u0405\u51a3\u3976"), 5));
        yy.K(1274873435, new NVIs$mXJp[]{(NVIs$mXJp)((Object)yy.p(-1459616183)), (NVIs$mXJp)((Object)yy.p(-1583479214)), (NVIs$mXJp)((Object)yy.p(-221903289)), (NVIs$mXJp)((Object)yy.p(342230600)), (NVIs$mXJp)((Object)yy.p(-2071001507)), (NVIs$mXJp)((Object)yy.p(-901380522))});
    }

    private NVIs$mXJp(String string2, int n2) {
    }

    public static NVIs$mXJp[] values() {
        NVIs$mXJp[] arrnVIs$mXJp = (NVIs$mXJp[])yy.p(1274873435);
        int n = arrnVIs$mXJp.length;
        NVIs$mXJp[] arrnVIs$mXJp2 = new NVIs$mXJp[n];
        NVIs$mXJp.YD(arrnVIs$mXJp, false, arrnVIs$mXJp2, false, n);
        return arrnVIs$mXJp2;
    }

    public static NVIs$mXJp valueOf(String string) {
        return (NVIs$mXJp)((Object)NVIs$mXJp.YD(NVIs$mXJp.class, string));
    }

    private static Object YD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

