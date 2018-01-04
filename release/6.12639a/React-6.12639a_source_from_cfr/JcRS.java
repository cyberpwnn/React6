/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class JcRS
extends Enum<JcRS> {
    public static final /* enum */ JcRS DtGC;
    public static final /* enum */ JcRS YyRV;
    public static final /* enum */ JcRS loga;
    private static /* synthetic */ int[] brjx;
    private static final /* synthetic */ JcRS[] awyA;

    static {
        o.w(-19506743, (Object)new JcRS(mrFx$WjFM.d("\u389d\u5aa7\uaf65\u128f"), 0));
        o.w(1895847680, (Object)new JcRS(mrFx$WjFM.d("\u388c\u5abb\uaf6d\u1286"), 1));
        o.w(-1776330296, (Object)new JcRS(mrFx$WjFM.d("\u3899\u5abf\uaf74\u128b\uc92d\u049f"), 2));
        o.w(720787136, new JcRS[]{(JcRS)((Object)o.k(-19506743)), (JcRS)((Object)o.k(1895847680)), (JcRS)((Object)o.k(-1776330296))});
    }

    private JcRS(String string2, int n2) {
    }

    public EBcM XSMK() {
        switch (JcRS.IhcW()[this.ordinal()]) {
            case 2: {
                return new EBcM(128, 128);
            }
            case 3: {
                return new EBcM(64, 64);
            }
            case 1: {
                return new EBcM(128, 64);
            }
        }
        return null;
    }

    public static JcRS[] values() {
        JcRS[] arrjcRS = (JcRS[])o.k(720787136);
        int n = arrjcRS.length;
        JcRS[] arrjcRS2 = new JcRS[n];
        JcRS.uA(arrjcRS, false, arrjcRS2, false, n);
        return arrjcRS2;
    }

    public static JcRS valueOf(String string) {
        return (JcRS)((Object)JcRS.uA(JcRS.class, string));
    }

    static /* synthetic */ int[] IhcW() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(-699115841);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[JcRS.values().length];
        try {
            arrn[((JcRS)o.k((int)1895847680)).ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((JcRS)o.k((int)-1776330296)).ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[((JcRS)o.k((int)-19506743)).ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(-699115841, arrn3);
        return arrn3;
    }

    private static Object uA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

