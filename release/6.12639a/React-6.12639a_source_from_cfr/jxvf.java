/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class jxvf
extends Enum<jxvf> {
    public static final /* enum */ jxvf WPTp;
    public static final /* enum */ jxvf YEYc;
    public static final /* enum */ jxvf TXMa;
    private static final /* synthetic */ jxvf[] GIUV;

    static {
        o.w(-644069899, (Object)new jxvf(nJPf$sILv.G("\ue75a\u5742\uebaa\u9dd6\ua9d1\u523e\u6e4c"), 0));
        o.w(409224692, (Object)new jxvf(nJPf$sILv.G("\ue74a\u574b\uebb9\u9dd3\ua9d7\u5223"), 1));
        o.w(-1058322957, (Object)new jxvf(nJPf$sILv.G("\ue75c\u574b\uebad\u9dc2\ua9d1\u523f"), 2));
        o.w(1608140258, new jxvf[]{(jxvf)((Object)o.k(-644069899)), (jxvf)((Object)o.k(409224692)), (jxvf)((Object)o.k(-1058322957))});
    }

    private jxvf(String string2, int n2) {
    }

    public static jxvf[] values() {
        jxvf[] arrjxvf = (jxvf[])o.k(1608140258);
        int n = arrjxvf.length;
        jxvf[] arrjxvf2 = new jxvf[n];
        jxvf.Re(arrjxvf, false, arrjxvf2, false, n);
        return arrjxvf2;
    }

    public static jxvf valueOf(String string) {
        return (jxvf)((Object)jxvf.Re(jxvf.class, string));
    }

    private static Object Re(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

