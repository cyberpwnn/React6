/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class BBFe {
    private static NumberFormat lLqG;
    private static DecimalFormat WjHa;
    private static final String[] migF;
    private static final BigInteger ivky;
    private static final NavigableMap<BigInteger, String> ntyl;

    static {
        cv.V(429521281, new String[]{rgig$AWxc.r("\uf5a5\u5b28\u6ca1\ud443\ud892\u59f5\u55f6\u3e30"), rgig$AWxc.r("\uf5bc\u5b29\u6ca2\ud45a\ud888\u59fb\u55f6"), rgig$AWxc.r("\uf5b3\u5b29\u6ca2\ud45a\ud888\u59fb\u55f6"), rgig$AWxc.r("\uf5a5\u5b32\u6ca7\ud45a\ud88d\u59fd\u55f7\u3e3a"), rgig$AWxc.r("\uf5a0\u5b35\u6caf\ud452\ud893\u59fd\u55f4\u3e38\u3b32\u522d\ub1a7"), rgig$AWxc.r("\uf5a0\u5b35\u6ca7\ud458\ud895\u59fd\u55f4\u3e38\u3b32\u522d\ub1a7"), rgig$AWxc.r("\uf5a2\u5b25\u6cb6\ud442\ud888\u59f8\u55f4\u3e3d\u3b34\u522c"), rgig$AWxc.r("\uf5a2\u5b25\u6cbe\ud442\ud888\u59f8\u55f4\u3e3d\u3b34\u522c"), rgig$AWxc.r("\uf5be\u5b23\u6cba\ud45f\ud88d\u59f8\u55f1\u3e3b\u3b35"), rgig$AWxc.r("\uf5bf\u5b2f\u6ca0\ud45f\ud88d\u59f8\u55f1\u3e3b\u3b35"), rgig$AWxc.r("\uf5b5\u5b25\u6cad\ud45f\ud88d\u59f8\u55f1\u3e3b\u3b35"), rgig$AWxc.r("\uf5a4\u5b2e\u6caa\ud453\ud882\u59fd\u55f4\u3e38\u3b32\u522d\ub1a7"), rgig$AWxc.r("\uf5b5\u5b35\u6ca1\ud452\ud884\u59f7\u55f1\u3e38\u3b37\u522b\ub1a6\u1d86"), rgig$AWxc.r("\uf5a5\u5b32\u6cab\ud452\ud884\u59f7\u55f1\u3e38\u3b37\u522b\ub1a6\u1d86"), rgig$AWxc.r("\uf5a0\u5b35\u6caf\ud442\ud895\u59e1\u55f7\u3e26\u3b3f\u5227\ub1aa\u1d81\uf4ca\u90a4\u6ca4\u453a\u99e5"), rgig$AWxc.r("\uf5a0\u5b35\u6ca7\ud458\ud885\u59f1\u55fb\u3e3d\u3b37\u522e\ub1a0\u1d87\uf4c8"), rgig$AWxc.r("\uf5a2\u5b25\u6cb6\ud452\ud884\u59f7\u55f1\u3e38\u3b37\u522b\ub1a6\u1d86"), rgig$AWxc.r("\uf5a2\u5b25\u6cbe\ud442\ud884\u59fa\u55fc\u3e31\u3b38\u522b\ub1a5\u1d84\uf4cf\u90a7\u6ca3"), rgig$AWxc.r("\uf5be\u5b23\u6cba\ud459\ud885\u59f1\u55fb\u3e3d\u3b37\u522e\ub1a0\u1d87\uf4c8"), rgig$AWxc.r("\uf5bf\u5b2f\u6cb8\ud453\ud88c\u59f0\u55fd\u3e37\u3b32\u522e\ub1a5\u1d81\uf4c9\u90a6"), rgig$AWxc.r("\uf5a7\u5b29\u6ca9\ud45f\ud88f\u59e0\u55f1\u3e38\u3b37\u522b\ub1a6\u1d86")});
        cv.V(-207947389, BBFe.eb(1000));
        cv.V(-563807870, new TreeMap());
        int n = 0;
        while (n < ((String[])cv.e(429521281)).length) {
            ((NavigableMap)cv.e(-563807870)).put(BBFe.eb((BigInteger)cv.e(-207947389), n + 1), ((String[])cv.e(429521281))[n]);
            ++n;
        }
    }

    public static String capitalize(String string) {
        Object object = "";
        boolean bl = true;
        char[] arrc = (char[])BBFe.eb(BBFe.eb(string));
        int n = arrc.length;
        int n2 = 0;
        while (n2 < n) {
            Object object2 = BBFe.eb(arrc[n2]);
            if (bl) {
                object = BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(object)), BBFe.eb(BBFe.eb(object2))));
                bl = false;
            } else {
                object = BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(object)), object2));
            }
            ++n2;
        }
        return object;
    }

    public static String BkpW(String string) {
        Object object = "";
        String[] arrstring = (String[])BBFe.eb(BBFe.eb(string), rgig$AWxc.r("\uf963"));
        int n = arrstring.length;
        int n2 = 0;
        while (n2 < n) {
            String string2 = arrstring[n2];
            object = BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(object)), rgig$AWxc.r("\uf963")), BBFe.capitalize((String)BBFe.eb(string2))));
            ++n2;
        }
        return BBFe.eb(object, true);
    }

    public static String ssNb(double d, int n) {
        if (d < 1000.0) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV(d, n))), YEBy$TyVf.W("\u70d6\u1384")));
        }
        if (d / 1000.0 < 60.0) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV(d / 1000.0, n))), YEBy$TyVf.W("\u70c8")));
        }
        if (d / 1000.0 / 60.0 < 60.0) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV(d / 1000.0 / 60.0, n))), YEBy$TyVf.W("\u70d6")));
        }
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV(d, n))), YEBy$TyVf.W("\u70d6\u1384")));
    }

    public static String ssNb(long l, int n) {
        if ((double)l < 1000.0) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.ssNb((float)l, n))), KUXS$dwji.S("\uca66\udfd2")));
        }
        if ((double)l / 1000.0 < 60.0) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV((double)l / 1000.0, n))), KUXS$dwji.S("\uca2b\udfd2\u3111\ub75d\u5a47\u76c5\u3c72\ue5d2")));
        }
        if ((double)l / 1000.0 / 60.0 < 60.0) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV((double)l / 1000.0 / 60.0, n))), KUXS$dwji.S("\uca2b\udfcc\u311d\ub750\u5a5d\u76df\u3c73\ue5d2")));
        }
        if ((double)l / 1000.0 / 60.0 / 60.0 < 24.0) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV((double)l / 1000.0 / 60.0, n))), KUXS$dwji.S("\uca2b\udfc9\u311b\ub74b\u5a5a\u76d8")));
        }
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.ssNb((float)l, n))), KUXS$dwji.S("\uca66\udfd2")));
    }

    public static String b(int n) {
        return BBFe.ssNb(new BigInteger((String)BBFe.eb(n)));
    }

    public static String IWSm(long l) {
        return BBFe.ssNb(new BigInteger((String)BBFe.eb(l)));
    }

    public static String TyVf(double d) {
        return BBFe.ssNb(new BigInteger((String)BBFe.eb((long)d)));
    }

    public static String ssNb(BigInteger bigInteger) {
        Map.Entry entry = ((NavigableMap)cv.e(-563807870)).floorEntry(bigInteger);
        if (entry == null) {
            return rgig$AWxc.r("\u4903\ub8d7\uc859\u6795]\ue57c\u1ae6\u86e3\u8dd1\ua0b5\ue8b5\u6ca5\uf39e\u79fc");
        }
        BigInteger bigInteger2 = entry.getKey();
        Object object = BBFe.eb(bigInteger2, (BigInteger)cv.e(-207947389));
        Object object2 = BBFe.eb(bigInteger, object);
        reference var5_5 = BBFe.eb(object2) / 1000.0f;
        reference var6_6 = (Object)((Object)var5_5 * 100.0) / 100.0f;
        if (var6_6 % 1.0f == 0.0f) {
            return BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(var6_6)), rgig$AWxc.r("\u496d")), (String)entry.getValue()));
        }
        return BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(var6_6)), rgig$AWxc.r("\u496d")), (String)entry.getValue()));
    }

    private static void AOcy() {
        if ((NumberFormat)cv.e(539818378) == null) {
            cv.V(539818378, BBFe.eb((Locale)cv.e(589166965)));
        }
    }

    public static String OXeK(long l) {
        return BBFe.DYFV(l, 1000);
    }

    public static String YoSa(long l) {
        return BBFe.DYFV(l, 1024);
    }

    public static String jhSt(long l) {
        Date date = new Date(l);
        return BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.eb(date))), YEBy$TyVf.W("\ua2a9")), BBFe.eb(date)), YEBy$TyVf.W("\ua2a9")), BBFe.eb(date) + 1900), YEBy$TyVf.W("\ua2a4")), BBFe.eb(date)), YEBy$TyVf.W("\ua2ec\u29aa")), BBFe.eb(date)), YEBy$TyVf.W("\ua2e9\u29aa")), BBFe.eb(date)), YEBy$TyVf.W("\ua2f7\u29aa")));
    }

    public static String DYFV(long l, int n) {
        Object object = BBFe.eb(l);
        String string = KUXS$dwji.S("\u1e53\ua41a\u3435\u83aa\u1e94");
        if (BBFe.eb(object) > (double)(n - 1)) {
            object = BBFe.eb(BBFe.eb(object) / (double)n);
            string = KUXS$dwji.S("\u1e5a\ua421");
            if (BBFe.eb(object) > (double)(n - 1)) {
                object = BBFe.eb(BBFe.eb(object) / (double)n);
                string = KUXS$dwji.S("\u1e5c\ua421");
                if (BBFe.eb(object) > (double)(n - 1)) {
                    object = BBFe.eb(BBFe.eb(object) / (double)n);
                    string = KUXS$dwji.S("\u1e56\ua421");
                    if (BBFe.eb(object) > (double)(n - 1)) {
                        object = BBFe.eb(BBFe.eb(object) / (double)n);
                        string = KUXS$dwji.S("\u1e45\ua421");
                    }
                }
            }
        }
        return BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV((double)BBFe.eb(object), 2))), KUXS$dwji.S("\u1e31")), string));
    }

    public static String ssNb(String string, int n) {
        if (BBFe.eb(string) <= n) {
            return string;
        }
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.eb(string, false, n))), YEBy$TyVf.W("\u7095\u13d9\u3fa8")));
    }

    public static String lCdp(String string) {
        Object object = "";
        char[] arrc = (char[])BBFe.eb(string);
        int n = arrc.length;
        int n2 = 0;
        while (n2 < n) {
            Object object2 = BBFe.eb(arrc[n2]);
            object = BBFe.eb(BBFe.eb(object2)) != false ? BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(object)), KUXS$dwji.S("\u3312")), BBFe.eb(BBFe.eb(object2)))) : BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(object)), object2));
            ++n2;
        }
        if (BBFe.eb(object, KUXS$dwji.S("\u3312")) != false) {
            object = BBFe.eb(object, true);
        }
        return object;
    }

    public static String repeat(String string, int n) {
        if (string == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < n) {
            BBFe.eb(stringBuilder, string);
            ++n2;
        }
        return BBFe.eb(stringBuilder);
    }

    public static String BkpW(long l) {
        if (l < 1024) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.nJLQ(l))), rgig$AWxc.r("\uf963\ue4ef\u7d27")));
        }
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV((double)l / 1024.0, 1))), rgig$AWxc.r("\uf963\ue4e5\u7d27")));
    }

    public static String lCdp(long l) {
        if (l < 1024) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.IWSm((double)l, 2))), KUXS$dwji.S("\u331f\uab1f\uae01")));
        }
        double d = (double)l / 1024.0;
        if (d < 1024.0) {
            return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.IWSm(d, 2))), KUXS$dwji.S("\u331f\uab19\uae01")));
        }
        double d2 = d / 1024.0;
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.IWSm(d2, 2))), KUXS$dwji.S("\u331f\uab13\uae01")));
    }

    public static String nJLQ(long l) {
        BBFe.AOcy();
        return BBFe.eb((NumberFormat)cv.e(539818378), l);
    }

    public static String kQcX(int n) {
        BBFe.AOcy();
        return BBFe.eb((NumberFormat)cv.e(539818378), n);
    }

    public static String DYFV(double d, int n) {
        Object object = YEBy$TyVf.W("\uc57e");
        if (n > 0) {
            object = BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(object)), YEBy$TyVf.W("\uc573")), BBFe.repeat(YEBy$TyVf.W("\uc57e"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        cv.V(-344589956, decimalFormat);
        return BBFe.eb(decimalFormat, d);
    }

    public static String IWSm(double d, int n) {
        Object object = KUXS$dwji.S("\u3a9b");
        if (n > 0) {
            object = BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(object)), KUXS$dwji.S("\u3a85")), BBFe.repeat(KUXS$dwji.S("\u3a9b"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        cv.V(-344589956, decimalFormat);
        return BBFe.eb(decimalFormat, d);
    }

    public static String ssNb(float f, int n) {
        Object object = KUXS$dwji.S("\uca28");
        if (n > 0) {
            object = BBFe.eb(BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(object)), KUXS$dwji.S("\uca25")), BBFe.repeat(KUXS$dwji.S("\uca28"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        cv.V(-344589956, decimalFormat);
        return BBFe.eb(decimalFormat, f);
    }

    public static String LGKl(double d) {
        return BBFe.DYFV(d, 1);
    }

    public static String ssNb(float f) {
        return BBFe.ssNb(f, 1);
    }

    public static String OXeK(double d, int n) {
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV(d * 100.0, n))), rgig$AWxc.r("\uc5b3")));
    }

    public static String DYFV(float f, int n) {
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.ssNb(f * 100.0f, n))), rgig$AWxc.r("\u7d3b")));
    }

    public static String ykmX(double d) {
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV(d * 100.0, 0))), YEBy$TyVf.W("\ueb27")));
    }

    public static String DYFV(float f) {
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.ssNb(f * 100.0f, 0))), KUXS$dwji.S("\u1e34")));
    }

    public static String ssNb(int n, int n2, int n3) {
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV(100.0 * ((double)n / (double)n2), n3))), YEBy$TyVf.W("\u709e")));
    }

    public static String ssNb(int n, int n2) {
        return BBFe.ssNb(n, n2, 0);
    }

    public static String ssNb(long l, long l2, int n) {
        return BBFe.eb(BBFe.eb(new StringBuilder((String)BBFe.eb(BBFe.DYFV(100.0 * ((double)l / (double)l2), n))), YEBy$TyVf.W("\u709e")));
    }

    public static String IWSm(long l, long l2) {
        return BBFe.ssNb(l, l2, 0);
    }

    public static String vtFs(long l) {
        return BBFe.LGKl((double)l / 1000.0);
    }

    public static String IWSm(long l, int n) {
        return BBFe.DYFV((double)l / 1000.0, n);
    }

    public static String EmLA(long l) {
        return BBFe.LGKl((double)l / 1000000.0);
    }

    public static String OXeK(long l, int n) {
        return BBFe.DYFV((double)l / 1000000.0, n);
    }

    public static String YoSa(long l, int n) {
        return BBFe.IWSm((double)l / 1000000.0, n);
    }

    private static Object eb(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

