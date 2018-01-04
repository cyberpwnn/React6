/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class INlt {
    private static final int pYoK = 128;
    private static final int PefB = 46080;
    private static final float[] IrSa;

    static {
        o.w(-1362542863, new float[46080]);
        int n = 0;
        while (n < ((float[])o.k(-1362542863)).length) {
            ((float[])o.k((int)-1362542863))[n] = INlt.dS((double)n * 3.141592653589793 / 23040.0);
            ++n;
        }
    }

    public static double yJLS(double d, double d2, double d3) {
        return (double)INlt.dS(d3, INlt.dS(d2, d));
    }

    public static boolean UtIU(Double d) {
        if (d == null) {
            if (INlt.dS() < 0.5) {
                return true;
            }
            return false;
        }
        if (INlt.dS() < INlt.dS(d)) {
            return true;
        }
        return false;
    }

    public static double KTiK(long l, int n) {
        return 20.0 * ((double)l / 5.0E7) / (double)n;
    }

    public static double Mkpo(long l) {
        return (double)l / 5.0E7;
    }

    public static String PKGC(int n) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22cb"), INlt.dS(1000));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22c5\u75b5"), INlt.dS(900));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22c2"), INlt.dS(500));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22c5\u75bc"), INlt.dS(400));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22c5"), INlt.dS(100));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22de\u75bb"), INlt.dS(90));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22ca"), INlt.dS(50));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22de\u75b4"), INlt.dS(40));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22de"), INlt.dS(10));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22cf\u75a0"), INlt.dS(9));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22d0"), INlt.dS(5));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22cf\u75ae"), INlt.dS(4));
        INlt.dS(linkedHashMap, mrFx$WjFM.d("\u22cf"), INlt.dS(true));
        Object object = "";
        Iterator iterator = INlt.dS(linkedHashMap).iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            int n2 = n / INlt.dS((Integer)entry.getValue());
            object = INlt.dS(INlt.dS(new StringBuilder((String)INlt.dS(object)), INlt.repeat((String)entry.getKey(), n2)));
            n %= INlt.dS((Integer)entry.getValue());
        }
        return object;
    }

    private static String repeat(String string, int n) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < n) {
            INlt.dS(stringBuilder, string);
            ++n2;
        }
        return INlt.dS(stringBuilder);
    }

    public static int GPlk(int n, int n2) {
        return n + (Object)(INlt.dS() * (double)(n2 - n + 1));
    }

    public static int dfaE(String object) {
        if (INlt.dS(object) != false) {
            return 0;
        }
        object = INlt.dS(object);
        if (INlt.dS(object, mrFx$WjFM.d("\u34e3")) != false) {
            return 1000 + INlt.dfaE((String)INlt.dS(object, true));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34ed\uc9c4")) != false) {
            return 900 + INlt.dfaE((String)INlt.dS(object, 2));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34ea")) != false) {
            return 500 + INlt.dfaE((String)INlt.dS(object, true));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34ed\uc9cd")) != false) {
            return 400 + INlt.dfaE((String)INlt.dS(object, 2));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34ed")) != false) {
            return 100 + INlt.dfaE((String)INlt.dS(object, true));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34f6\uc9ca")) != false) {
            return 90 + INlt.dfaE((String)INlt.dS(object, 2));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34e2")) != false) {
            return 50 + INlt.dfaE((String)INlt.dS(object, true));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34f6\uc9c5")) != false) {
            return 40 + INlt.dfaE((String)INlt.dS(object, 2));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34f6")) != false) {
            return 10 + INlt.dfaE((String)INlt.dS(object, true));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34e7\uc9d1")) != false) {
            return 9 + INlt.dfaE((String)INlt.dS(object, 2));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34f8")) != false) {
            return 5 + INlt.dfaE((String)INlt.dS(object, true));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34e7\uc9df")) != false) {
            return 4 + INlt.dfaE((String)INlt.dS(object, 2));
        }
        if (INlt.dS(object, mrFx$WjFM.d("\u34e7")) != false) {
            return 1 + INlt.dfaE((String)INlt.dS(object, true));
        }
        return 0;
    }

    public static long oDiX() {
        return (long)INlt.dS();
    }

    public static long ECDB() {
        return (long)INlt.dS();
    }

    public static float sin(float f) {
        return INlt.bhlC((int)(f * 128.0f + 0.5f));
    }

    public static float cos(float f) {
        return INlt.bhlC((int)((f + 90.0f) * 128.0f + 0.5f));
    }

    public static /* varargs */ int max(int ... arrn) {
        int n = Integer.MIN_VALUE;
        int[] arrn2 = arrn;
        int n2 = arrn2.length;
        int n3 = 0;
        while (n3 < n2) {
            int n4 = arrn2[n3];
            if (n4 > n) {
                n = n4;
            }
            ++n3;
        }
        return n;
    }

    public static /* varargs */ int min(int ... arrn) {
        int n = Integer.MAX_VALUE;
        int[] arrn2 = arrn;
        int n2 = arrn2.length;
        int n3 = 0;
        while (n3 < n2) {
            int n4 = arrn2[n3];
            if (n4 < n) {
                n = n4;
            }
            ++n3;
        }
        return n;
    }

    public static boolean UtIU(int n, int n2, int n3) {
        if (n3 >= n && n3 <= n2) {
            return true;
        }
        return false;
    }

    private static float bhlC(int n) {
        if (n >= 0) {
            return ((float[])o.k(-1362542863))[n % 46080];
        }
        return - ((float[])o.k(-1362542863))[(- n) % 46080];
    }

    private static Object dS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

