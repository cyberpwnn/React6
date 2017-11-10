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

public class CVAs {
    private static NumberFormat dMNe;
    private static DecimalFormat jVod;
    private static final String[] wnXH;
    private static final BigInteger qKCn;
    private static final NavigableMap<BigInteger, String> HdqI;

    static {
        yy.K(-1486291270, new String[]{KDGY$JAHk.Y("\u4245\u2f6a\u28a4\u0615\uf82b\u2f56\u80bc\u0cc2"), KDGY$JAHk.Y("\u425c\u2f6b\u28a7\u060c\uf831\u2f58\u80bc"), KDGY$JAHk.Y("\u4253\u2f6b\u28a7\u060c\uf831\u2f58\u80bc"), KDGY$JAHk.Y("\u4245\u2f70\u28a2\u060c\uf834\u2f5e\u80bd\u0cc8"), KDGY$JAHk.Y("\u4240\u2f77\u28aa\u0604\uf82a\u2f5e\u80be\u0cca\u43ca\u0829\u50eb"), KDGY$JAHk.Y("\u4240\u2f77\u28a2\u060e\uf82c\u2f5e\u80be\u0cca\u43ca\u0829\u50eb"), KDGY$JAHk.Y("\u4242\u2f67\u28b3\u0614\uf831\u2f5b\u80be\u0ccf\u43cc\u0828"), KDGY$JAHk.Y("\u4242\u2f67\u28bb\u0614\uf831\u2f5b\u80be\u0ccf\u43cc\u0828"), KDGY$JAHk.Y("\u425e\u2f61\u28bf\u0609\uf834\u2f5b\u80bb\u0cc9\u43cd"), KDGY$JAHk.Y("\u425f\u2f6d\u28a5\u0609\uf834\u2f5b\u80bb\u0cc9\u43cd"), KDGY$JAHk.Y("\u4255\u2f67\u28a8\u0609\uf834\u2f5b\u80bb\u0cc9\u43cd"), KDGY$JAHk.Y("\u4244\u2f6c\u28af\u0605\uf83b\u2f5e\u80be\u0cca\u43ca\u0829\u50eb"), KDGY$JAHk.Y("\u4255\u2f77\u28a4\u0604\uf83d\u2f54\u80bb\u0cca\u43cf\u082f\u50ea\u93b2"), KDGY$JAHk.Y("\u4245\u2f70\u28ae\u0604\uf83d\u2f54\u80bb\u0cca\u43cf\u082f\u50ea\u93b2"), KDGY$JAHk.Y("\u4240\u2f77\u28aa\u0614\uf82c\u2f42\u80bd\u0cd4\u43c7\u0823\u50e6\u93b5\u5f48\u48f3\ufafa\u94db\u5f1d"), KDGY$JAHk.Y("\u4240\u2f77\u28a2\u060e\uf83c\u2f52\u80b1\u0ccf\u43cf\u082a\u50ec\u93b3\u5f4a"), KDGY$JAHk.Y("\u4242\u2f67\u28b3\u0604\uf83d\u2f54\u80bb\u0cca\u43cf\u082f\u50ea\u93b2"), KDGY$JAHk.Y("\u4242\u2f67\u28bb\u0614\uf83d\u2f59\u80b6\u0cc3\u43c0\u082f\u50e9\u93b0\u5f4d\u48f0\ufafd"), KDGY$JAHk.Y("\u425e\u2f61\u28bf\u060f\uf83c\u2f52\u80b1\u0ccf\u43cf\u082a\u50ec\u93b3\u5f4a"), KDGY$JAHk.Y("\u425f\u2f6d\u28bd\u0605\uf835\u2f53\u80b7\u0cc5\u43ca\u082a\u50e9\u93b5\u5f4b\u48f1"), KDGY$JAHk.Y("\u4247\u2f6b\u28ac\u0609\uf836\u2f43\u80bb\u0cca\u43cf\u082f\u50ea\u93b2")});
        yy.K(-309526864, CVAs.cC(1000));
        yy.K(-1704788347, new TreeMap());
        int n = 0;
        while (n < ((String[])yy.p(-1486291270)).length) {
            ((NavigableMap)yy.p(-1704788347)).put(CVAs.cC((BigInteger)yy.p(-309526864), n + 1), ((String[])yy.p(-1486291270))[n]);
            ++n;
        }
    }

    public static String capitalize(String string) {
        Object object = "";
        boolean bl = true;
        char[] arrc = (char[])CVAs.cC(CVAs.cC(string));
        int n = arrc.length;
        int n2 = 0;
        while (n2 < n) {
            Object object2 = CVAs.cC(arrc[n2]);
            if (bl) {
                object = CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(object)), CVAs.cC(CVAs.cC(object2))));
                bl = false;
            } else {
                object = CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(object)), object2));
            }
            ++n2;
        }
        return object;
    }

    public static String mXJp(String string) {
        Object object = "";
        String[] arrstring = (String[])CVAs.cC(CVAs.cC(string), BkvY$LhxG.I("\ub953"));
        int n = arrstring.length;
        int n2 = 0;
        while (n2 < n) {
            String string2 = arrstring[n2];
            object = CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(object)), BkvY$LhxG.I("\ub953")), CVAs.capitalize((String)CVAs.cC(string2))));
            ++n2;
        }
        return CVAs.cC(object, true);
    }

    public static String mXJp(double d, int n) {
        if (d < 1000.0) {
            return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs(d, n))), BkvY$LhxG.I("\ub91e\ud950")));
        }
        if (d / 1000.0 < 60.0) {
            return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs(d / 1000.0, n))), BkvY$LhxG.I("\ub900")));
        }
        if (d / 1000.0 / 60.0 < 60.0) {
            return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs(d / 1000.0 / 60.0, n))), BkvY$LhxG.I("\ub91e")));
        }
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs(d, n))), BkvY$LhxG.I("\ub91e\ud950")));
    }

    public static String b(int n) {
        return CVAs.mXJp(new BigInteger((String)CVAs.cC(n)));
    }

    public static String mXJp(long l) {
        return CVAs.mXJp(new BigInteger((String)CVAs.cC(l)));
    }

    public static String SnBs(double d) {
        return CVAs.mXJp(new BigInteger((String)CVAs.cC((long)d)));
    }

    public static String mXJp(BigInteger bigInteger) {
        Map.Entry entry = ((NavigableMap)yy.p(-1704788347)).floorEntry(bigInteger);
        if (entry == null) {
            return NVIs$JbpD.H("\uc377\ub2f3\u22f1\u4b8d\u7c96\u0fad\u05ac\ubabc\u169e\u76e7\ua3d3\uda28\uef9a\u9a8c");
        }
        BigInteger bigInteger2 = entry.getKey();
        Object object = CVAs.cC(bigInteger2, (BigInteger)yy.p(-309526864));
        Object object2 = CVAs.cC(bigInteger, object);
        reference var5_5 = CVAs.cC(object2) / 1000.0f;
        reference var6_6 = (Object)((Object)var5_5 * 100.0) / 100.0f;
        if (var6_6 % 1.0f == 0.0f) {
            return CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(var6_6)), NVIs$JbpD.H("\uc319")), (String)entry.getValue()));
        }
        return CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(var6_6)), NVIs$JbpD.H("\uc319")), (String)entry.getValue()));
    }

    private static void HdqI() {
        if ((NumberFormat)yy.p(-1279918451) == null) {
            yy.K(-1279918451, CVAs.cC((Locale)yy.p(-2124611962)));
        }
    }

    public static String ksfs(long l) {
        return CVAs.mXJp(l, 1000);
    }

    public static String yJLL(long l) {
        return CVAs.mXJp(l, 1024);
    }

    public static String SnBs(long l) {
        Date date = new Date(l);
        return CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.cC(date))), KDGY$JAHk.Y("\u36e3")), CVAs.cC(date)), KDGY$JAHk.Y("\u36e3")), CVAs.cC(date) + 1900), KDGY$JAHk.Y("\u36ee")), CVAs.cC(date)), KDGY$JAHk.Y("\u36a6\u2aac")), CVAs.cC(date)), KDGY$JAHk.Y("\u36a3\u2aac")), CVAs.cC(date)), KDGY$JAHk.Y("\u36bd\u2aac")));
    }

    public static String mXJp(long l, int n) {
        Object object = CVAs.cC(l);
        String string = KDGY$JAHk.Y("\uc18f\u0dd5\uaa51\u9ccc\u7a04");
        if (CVAs.cC(object) > (double)(n - 1)) {
            object = CVAs.cC(CVAs.cC(object) / (double)n);
            string = KDGY$JAHk.Y("\uc186\u0dee");
            if (CVAs.cC(object) > (double)(n - 1)) {
                object = CVAs.cC(CVAs.cC(object) / (double)n);
                string = KDGY$JAHk.Y("\uc180\u0dee");
                if (CVAs.cC(object) > (double)(n - 1)) {
                    object = CVAs.cC(CVAs.cC(object) / (double)n);
                    string = KDGY$JAHk.Y("\uc18a\u0dee");
                    if (CVAs.cC(object) > (double)(n - 1)) {
                        object = CVAs.cC(CVAs.cC(object) / (double)n);
                        string = KDGY$JAHk.Y("\uc199\u0dee");
                    }
                }
            }
        }
        return CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs((double)CVAs.cC(object), 2))), KDGY$JAHk.Y("\uc1ed")), string));
    }

    public static String mXJp(String string, int n) {
        if (CVAs.cC(string) <= n) {
            return string;
        }
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.cC(string, false, n))), KDGY$JAHk.Y("\uc1e3\u0d82\uaa0b")));
    }

    public static String ksfs(String string) {
        Object object = "";
        char[] arrc = (char[])CVAs.cC(string);
        int n = arrc.length;
        int n2 = 0;
        while (n2 < n) {
            Object object2 = CVAs.cC(arrc[n2]);
            object = CVAs.cC(CVAs.cC(object2)) != false ? CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(object)), BkvY$LhxG.I("\u0099")), CVAs.cC(CVAs.cC(object2)))) : CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(object)), object2));
            ++n2;
        }
        if (CVAs.cC(object, BkvY$LhxG.I("\u0099")) != false) {
            object = CVAs.cC(object, true);
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
            CVAs.cC(stringBuilder, string);
            ++n2;
        }
        return CVAs.cC(stringBuilder);
    }

    public static String qdWJ(long l) {
        if (l < 1024) {
            return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.halY(l))), NVIs$JbpD.H("\u76ef\u8ea3\u0d72")));
        }
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs((double)l / 1024.0, 1))), NVIs$JbpD.H("\u76ef\u8ea9\u0d72")));
    }

    public static String JRFt(long l) {
        if (l < 1024) {
            return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.yJLL((double)l, 2))), NVIs$JbpD.H("\uba2b\u5c61\u87b9")));
        }
        double d = (double)l / 1024.0;
        if (d < 1024.0) {
            return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.yJLL(d, 2))), NVIs$JbpD.H("\uba2b\u5c67\u87b9")));
        }
        double d2 = d / 1024.0;
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.yJLL(d2, 2))), NVIs$JbpD.H("\uba2b\u5c6d\u87b9")));
    }

    public static String halY(long l) {
        CVAs.HdqI();
        return CVAs.cC((NumberFormat)yy.p(-1279918451), l);
    }

    public static String SnBs(int n) {
        CVAs.HdqI();
        return CVAs.cC((NumberFormat)yy.p(-1279918451), n);
    }

    public static String ksfs(double d, int n) {
        Object object = NVIs$JbpD.H("\u06ff");
        if (n > 0) {
            object = CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(object)), NVIs$JbpD.H("\u06f2")), CVAs.repeat(NVIs$JbpD.H("\u06ff"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        yy.K(-467140909, decimalFormat);
        return CVAs.cC(decimalFormat, d);
    }

    public static String yJLL(double d, int n) {
        Object object = KDGY$JAHk.Y("\ue6d5");
        if (n > 0) {
            object = CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(object)), KDGY$JAHk.Y("\ue6cb")), CVAs.repeat(KDGY$JAHk.Y("\ue6d5"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        yy.K(-467140909, decimalFormat);
        return CVAs.cC(decimalFormat, d);
    }

    public static String mXJp(float f, int n) {
        Object object = KDGY$JAHk.Y("\uc1ee");
        if (n > 0) {
            object = CVAs.cC(CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(object)), KDGY$JAHk.Y("\uc1e3")), CVAs.repeat(KDGY$JAHk.Y("\uc1ee"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        yy.K(-467140909, decimalFormat);
        return CVAs.cC(decimalFormat, f);
    }

    public static String qdWJ(double d) {
        return CVAs.ksfs(d, 1);
    }

    public static String mXJp(float f) {
        return CVAs.mXJp(f, 1);
    }

    public static String SnBs(double d, int n) {
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs(d * 100.0, n))), KDGY$JAHk.Y("\u36eb")));
    }

    public static String ksfs(float f, int n) {
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.mXJp(f * 100.0f, n))), BkvY$LhxG.I("\u0091")));
    }

    public static String JRFt(double d) {
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs(d * 100.0, 0))), BkvY$LhxG.I("\uc413")));
    }

    public static String ksfs(float f) {
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.mXJp(f * 100.0f, 0))), BkvY$LhxG.I("\u0091")));
    }

    public static String mXJp(int n, int n2, int n3) {
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs(100.0 * ((double)n / (double)n2), n3))), BkvY$LhxG.I("\ub956")));
    }

    public static String mXJp(int n, int n2) {
        return CVAs.mXJp(n, n2, 0);
    }

    public static String mXJp(long l, long l2, int n) {
        return CVAs.cC(CVAs.cC(new StringBuilder((String)CVAs.cC(CVAs.ksfs(100.0 * ((double)l / (double)l2), n))), BkvY$LhxG.I("\ub956")));
    }

    public static String mXJp(long l, long l2) {
        return CVAs.mXJp(l, l2, 0);
    }

    public static String ssMm(long l) {
        return CVAs.qdWJ((double)l / 1000.0);
    }

    public static String ksfs(long l, int n) {
        return CVAs.ksfs((double)l / 1000.0, n);
    }

    public static String yIkI(long l) {
        return CVAs.qdWJ((double)l / 1000000.0);
    }

    public static String yJLL(long l, int n) {
        return CVAs.ksfs((double)l / 1000000.0, n);
    }

    public static String SnBs(long l, int n) {
        return CVAs.yJLL((double)l / 1000000.0, n);
    }

    private static Object cC(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

