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

public class bhsi {
    private static NumberFormat vcmk;
    private static DecimalFormat WbFr;
    private static final String[] nvIm;
    private static final BigInteger uPNI;
    private static final NavigableMap<BigInteger, String> CqBT;

    static {
        o.w(643645163, new String[]{mrFx$WjFM.d("\uf360\u77b3\u890c\u105c\u5198\u23fc\ud548\u1c68"), mrFx$WjFM.d("\uf379\u77b2\u890f\u1045\u5182\u23f2\ud548"), mrFx$WjFM.d("\uf376\u77b2\u890f\u1045\u5182\u23f2\ud548"), mrFx$WjFM.d("\uf360\u77a9\u890a\u1045\u5187\u23f4\ud549\u1c62"), mrFx$WjFM.d("\uf365\u77ae\u8902\u104d\u5199\u23f4\ud54a\u1c60\u0372\u23cc\ude39"), mrFx$WjFM.d("\uf365\u77ae\u890a\u1047\u519f\u23f4\ud54a\u1c60\u0372\u23cc\ude39"), mrFx$WjFM.d("\uf367\u77be\u891b\u105d\u5182\u23f1\ud54a\u1c65\u0374\u23cd"), mrFx$WjFM.d("\uf367\u77be\u8913\u105d\u5182\u23f1\ud54a\u1c65\u0374\u23cd"), mrFx$WjFM.d("\uf37b\u77b8\u8917\u1040\u5187\u23f1\ud54f\u1c63\u0375"), mrFx$WjFM.d("\uf37a\u77b4\u890d\u1040\u5187\u23f1\ud54f\u1c63\u0375"), mrFx$WjFM.d("\uf370\u77be\u8900\u1040\u5187\u23f1\ud54f\u1c63\u0375"), mrFx$WjFM.d("\uf361\u77b5\u8907\u104c\u5188\u23f4\ud54a\u1c60\u0372\u23cc\ude39"), mrFx$WjFM.d("\uf370\u77ae\u890c\u104d\u518e\u23fe\ud54f\u1c60\u0377\u23ca\ude38\uff7e"), mrFx$WjFM.d("\uf360\u77a9\u8906\u104d\u518e\u23fe\ud54f\u1c60\u0377\u23ca\ude38\uff7e"), mrFx$WjFM.d("\uf365\u77ae\u8902\u105d\u519f\u23e8\ud549\u1c7e\u037f\u23c6\ude34\uff79\u5a69\u3beb\ua4a3\u124d\ud7e3"), mrFx$WjFM.d("\uf365\u77ae\u890a\u1047\u518f\u23f8\ud545\u1c65\u0377\u23cf\ude3e\uff7f\u5a6b"), mrFx$WjFM.d("\uf367\u77be\u891b\u104d\u518e\u23fe\ud54f\u1c60\u0377\u23ca\ude38\uff7e"), mrFx$WjFM.d("\uf367\u77be\u8913\u105d\u518e\u23f3\ud542\u1c69\u0378\u23ca\ude3b\uff7c\u5a6c\u3be8\ua4a4"), mrFx$WjFM.d("\uf37b\u77b8\u8917\u1046\u518f\u23f8\ud545\u1c65\u0377\u23cf\ude3e\uff7f\u5a6b"), mrFx$WjFM.d("\uf37a\u77b4\u8915\u104c\u5186\u23f9\ud543\u1c6f\u0372\u23cf\ude3b\uff79\u5a6a\u3be9"), mrFx$WjFM.d("\uf362\u77b2\u8904\u1040\u5185\u23e9\ud54f\u1c60\u0377\u23ca\ude38\uff7e")});
        o.w(-21938439, bhsi.tf(1000));
        o.w(1566392056, new TreeMap());
        int n = 0;
        while (n < ((String[])o.k(643645163)).length) {
            ((NavigableMap)o.k(1566392056)).put(bhsi.tf((BigInteger)o.k(-21938439), n + 1), ((String[])o.k(643645163))[n]);
            ++n;
        }
    }

    public static String capitalize(String string) {
        Object object = "";
        boolean bl = true;
        char[] arrc = (char[])bhsi.tf(bhsi.tf(string));
        int n = arrc.length;
        int n2 = 0;
        while (n2 < n) {
            Object object2 = bhsi.tf(arrc[n2]);
            if (bl) {
                object = bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(object)), bhsi.tf(bhsi.tf(object2))));
                bl = false;
            } else {
                object = bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(object)), object2));
            }
            ++n2;
        }
        return object;
    }

    public static String IFQY(String string) {
        Object object = "";
        String[] arrstring = (String[])bhsi.tf(bhsi.tf(string), FMkR$WjFM.a("\u7c2a"));
        int n = arrstring.length;
        int n2 = 0;
        while (n2 < n) {
            String string2 = arrstring[n2];
            object = bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(object)), FMkR$WjFM.a("\u7c2a")), bhsi.capitalize((String)bhsi.tf(string2))));
            ++n2;
        }
        return bhsi.tf(object, true);
    }

    public static String wrap(String string, int n) {
        return bhsi.wrap(string, n, null, false);
    }

    public static String yJLS(String string, int n) {
        return bhsi.wrap(string, n, null, true);
    }

    public static String wrap(String string, int n, String string2, boolean bl) {
        return bhsi.wrap(string, n, string2, bl, mrFx$WjFM.d("\ufdba"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static String wrap(String var0, int var1_1, String var2_2, boolean var3_3, String var4_4) {
        if (var0 == null) {
            return null;
        }
        if (var2_2 == null) {
            var2_2 = nJPf$sILv.G("\uf511");
        }
        if (var1_1 <= 0) {
            var1_1 = 1;
        }
        if (bhsi.tf(bhsi.tf(var4_4), "") != false) {
            var4_4 = nJPf$sILv.G("\uf53b");
        }
        var5_5 = bhsi.tf(var4_4);
        var6_6 = bhsi.tf(var0);
        var7_7 = 0;
        var8_8 = new StringBuilder((int)(var6_6 + 32));
        while (var7_7 < var6_6) {
            var9_9 = -1;
            var10_10 = bhsi.tf(var5_5, bhsi.tf(var0, var7_7, bhsi.tf(var7_7 + var1_1 + 1, var6_6)));
            if (bhsi.tf(var10_10) != false) {
                if (bhsi.tf(var10_10) == false) {
                    var7_7 += bhsi.tf(var10_10);
                    continue;
                }
                var9_9 = (reference)bhsi.tf(var10_10);
            }
            if (var6_6 - var7_7 > var1_1) ** GOTO lbl46
            break;
lbl-1000: // 1 sources:
            {
                var9_9 = bhsi.tf(var10_10) + var7_7;
lbl46: // 2 sources:
                ** while (bhsi.tf(var10_10) != false)
            }
lbl47: // 1 sources:
            if (var9_9 >= var7_7) {
                bhsi.tf(var8_8, bhsi.tf(var0, var7_7, var9_9));
                bhsi.tf(var8_8, var2_2);
                var7_7 = var9_9 + true;
                continue;
            }
            if (var3_3) {
                bhsi.tf(var8_8, bhsi.tf(var0, var7_7, var1_1 + var7_7));
                bhsi.tf(var8_8, var2_2);
                var7_7 += var1_1;
                continue;
            }
            var10_10 = bhsi.tf(var5_5, bhsi.tf(var0, var7_7 + var1_1));
            if (bhsi.tf(var10_10) != false) {
                var9_9 = bhsi.tf(var10_10) + var7_7 + var1_1;
            }
            if (var9_9 >= 0) {
                bhsi.tf(var8_8, bhsi.tf(var0, var7_7, var9_9));
                bhsi.tf(var8_8, var2_2);
                var7_7 = var9_9 + true;
                continue;
            }
            bhsi.tf(var8_8, bhsi.tf(var0, var7_7));
            var7_7 = var6_6;
        }
        bhsi.tf(var8_8, bhsi.tf(var0, var7_7));
        return bhsi.tf(var8_8);
    }

    public static String yJLS(double d, int n) {
        if (d < 1000.0) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU(d, n))), FMkR$WjFM.a("\udded\u0c79")));
        }
        if (d / 1000.0 < 60.0) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU(d / 1000.0, n))), FMkR$WjFM.a("\uddf3")));
        }
        if (d / 1000.0 / 60.0 < 60.0) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU(d / 1000.0 / 60.0, n))), FMkR$WjFM.a("\udded")));
        }
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU(d, n))), FMkR$WjFM.a("\udded\u0c79")));
    }

    public static String yJLS(long l, int n) {
        if ((double)l < 1000.0) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.yJLS((float)l, n))), nJPf$sILv.G("\u5b03\u65e9")));
        }
        if ((double)l / 1000.0 < 60.0) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU((double)l / 1000.0, n))), nJPf$sILv.G("\u5b4e\u65e9\u8f82\u7b2e\u752d\uec26\u259b\ud760")));
        }
        if ((double)l / 1000.0 / 60.0 < 60.0) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU((double)l / 1000.0 / 60.0, n))), nJPf$sILv.G("\u5b4e\u65f7\u8f8e\u7b23\u7537\uec3c\u259a\ud760")));
        }
        if ((double)l / 1000.0 / 60.0 / 60.0 < 24.0) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU((double)l / 1000.0 / 60.0, n))), nJPf$sILv.G("\u5b4e\u65f2\u8f88\u7b38\u7530\uec3b")));
        }
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.yJLS((float)l, n))), nJPf$sILv.G("\u5b03\u65e9")));
    }

    public static String b(int n) {
        return bhsi.yJLS(new BigInteger((String)bhsi.tf(n)));
    }

    public static String biLo(long l) {
        return bhsi.yJLS(new BigInteger((String)bhsi.tf(l)));
    }

    public static String Mkpo(double d) {
        return bhsi.yJLS(new BigInteger((String)bhsi.tf((long)d)));
    }

    public static String yJLS(BigInteger bigInteger) {
        Map.Entry entry = ((NavigableMap)o.k(1566392056)).floorEntry(bigInteger);
        if (entry == null) {
            return FMkR$WjFM.a("\uddce\u0c6f\u04dc\ua954\uf349\udb3c\uffb0\u5a24\u08b7\u3a48\u52e7\ud5da\u4f31\uf616");
        }
        BigInteger bigInteger2 = entry.getKey();
        Object object = bhsi.tf(bigInteger2, (BigInteger)o.k(-21938439));
        Object object2 = bhsi.tf(bigInteger, object);
        reference var5_5 = bhsi.tf(object2) / 1000.0f;
        reference var6_6 = (Object)((Object)var5_5 * 100.0) / 100.0f;
        if (var6_6 % 1.0f == 0.0f) {
            return bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(var6_6)), FMkR$WjFM.a("\udda0")), (String)entry.getValue()));
        }
        return bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(var6_6)), FMkR$WjFM.a("\udda0")), (String)entry.getValue()));
    }

    private static void vbpi() {
        if ((NumberFormat)o.k(527777502) == null) {
            o.w(527777502, bhsi.tf((Locale)o.k(-1539555619)));
        }
    }

    public static String VwLY(long l) {
        return bhsi.UtIU(l, 1000);
    }

    public static String TEqA(long l) {
        return bhsi.UtIU(l, 1024);
    }

    public static String KTiK(long l) {
        Date date = new Date(l);
        return bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.tf(date))), FMkR$WjFM.a("\u9034")), bhsi.tf(date)), FMkR$WjFM.a("\u9034")), bhsi.tf(date) + 1900), FMkR$WjFM.a("\u9039")), bhsi.tf(date)), FMkR$WjFM.a("\u9071\u8bbd")), bhsi.tf(date)), FMkR$WjFM.a("\u9074\u8bbd")), bhsi.tf(date)), FMkR$WjFM.a("\u906a\u8bbd")));
    }

    public static String UtIU(long l, int n) {
        Object object = bhsi.tf(l);
        String string = nJPf$sILv.G("\u1f84\u4924\ub671\u0449\u1284");
        if (bhsi.tf(object) > (double)(n - 1)) {
            object = bhsi.tf(bhsi.tf(object) / (double)n);
            string = nJPf$sILv.G("\u1f8d\u491f");
            if (bhsi.tf(object) > (double)(n - 1)) {
                object = bhsi.tf(bhsi.tf(object) / (double)n);
                string = nJPf$sILv.G("\u1f8b\u491f");
                if (bhsi.tf(object) > (double)(n - 1)) {
                    object = bhsi.tf(bhsi.tf(object) / (double)n);
                    string = nJPf$sILv.G("\u1f81\u491f");
                    if (bhsi.tf(object) > (double)(n - 1)) {
                        object = bhsi.tf(bhsi.tf(object) / (double)n);
                        string = nJPf$sILv.G("\u1f92\u491f");
                    }
                }
            }
        }
        return bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU((double)bhsi.tf(object), 2))), nJPf$sILv.G("\u1fe6")), string));
    }

    public static String UtIU(String string, int n) {
        if (bhsi.tf(string) <= n) {
            return string;
        }
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.tf(string, false, n))), mrFx$WjFM.d("\u5100\ucab3\uda7e")));
    }

    public static String uVol(String string) {
        Object object = "";
        char[] arrc = (char[])bhsi.tf(string);
        int n = arrc.length;
        int n2 = 0;
        while (n2 < n) {
            Object object2 = bhsi.tf(arrc[n2]);
            object = bhsi.tf(bhsi.tf(object2)) != false ? bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(object)), FMkR$WjFM.a("\u99ff")), bhsi.tf(bhsi.tf(object2)))) : bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(object)), object2));
            ++n2;
        }
        if (bhsi.tf(object, FMkR$WjFM.a("\u99ff")) != false) {
            object = bhsi.tf(object, true);
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
            bhsi.tf(stringBuilder, string);
            ++n2;
        }
        return bhsi.tf(stringBuilder);
    }

    public static String GPlk(long l) {
        if (l < 1024) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.HeSD(l))), nJPf$sILv.G("\u2f83\u636b\uc48b")));
        }
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU((double)l / 1024.0, 1))), nJPf$sILv.G("\u2f83\u6361\uc48b")));
    }

    public static String ktHX(long l) {
        if (l < 1024) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.biLo((double)l, 2))), mrFx$WjFM.d("\u078d\ufe3a\u329d")));
        }
        double d = (double)l / 1024.0;
        if (d < 1024.0) {
            return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.biLo(d, 2))), mrFx$WjFM.d("\u078d\ufe3c\u329d")));
        }
        double d2 = d / 1024.0;
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.biLo(d2, 2))), mrFx$WjFM.d("\u078d\ufe36\u329d")));
    }

    public static String HeSD(long l) {
        bhsi.vbpi();
        return bhsi.tf((NumberFormat)o.k(527777502), l);
    }

    public static String dfaE(int n) {
        bhsi.vbpi();
        return bhsi.tf((NumberFormat)o.k(527777502), n);
    }

    public static String UtIU(double d, int n) {
        Object object = FMkR$WjFM.a("\u67bb");
        if (n > 0) {
            object = bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(object)), FMkR$WjFM.a("\u67b6")), bhsi.repeat(FMkR$WjFM.a("\u67bb"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        o.w(949894884, decimalFormat);
        return bhsi.tf(decimalFormat, d);
    }

    public static String biLo(double d, int n) {
        Object object = FMkR$WjFM.a("\u0d61");
        if (n > 0) {
            object = bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(object)), FMkR$WjFM.a("\u0d7f")), bhsi.repeat(FMkR$WjFM.a("\u0d61"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        o.w(949894884, decimalFormat);
        return bhsi.tf(decimalFormat, d);
    }

    public static String yJLS(float f, int n) {
        Object object = mrFx$WjFM.d("\u1667");
        if (n > 0) {
            object = bhsi.tf(bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(object)), mrFx$WjFM.d("\u166a")), bhsi.repeat(mrFx$WjFM.d("\u1667"), n)));
        }
        DecimalFormat decimalFormat = new DecimalFormat((String)object);
        o.w(949894884, decimalFormat);
        return bhsi.tf(decimalFormat, f);
    }

    public static String CoVI(double d) {
        return bhsi.UtIU(d, 1);
    }

    public static String yJLS(float f) {
        return bhsi.yJLS(f, 1);
    }

    public static String VwLY(double d, int n) {
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU(d * 100.0, n))), mrFx$WjFM.d("\uf8ee")));
    }

    public static String UtIU(float f, int n) {
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.yJLS(f * 100.0f, n))), mrFx$WjFM.d("\u510b")));
    }

    public static String wKtV(double d) {
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU(d * 100.0, 0))), FMkR$WjFM.a("\u4146")));
    }

    public static String UtIU(float f) {
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.yJLS(f * 100.0f, 0))), FMkR$WjFM.a("\u67bd")));
    }

    public static String yJLS(int n, int n2, int n3) {
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU(100.0 * ((double)n / (double)n2), n3))), FMkR$WjFM.a("\udda5")));
    }

    public static String biLo(int n, int n2) {
        return bhsi.yJLS(n, n2, 0);
    }

    public static String yJLS(long l, long l2, int n) {
        return bhsi.tf(bhsi.tf(new StringBuilder((String)bhsi.tf(bhsi.UtIU(100.0 * ((double)l / (double)l2), n))), mrFx$WjFM.d("\u1661")));
    }

    public static String VwLY(long l, long l2) {
        return bhsi.yJLS(l, l2, 0);
    }

    public static String Ipep(long l) {
        return bhsi.CoVI((double)l / 1000.0);
    }

    public static String biLo(long l, int n) {
        return bhsi.UtIU((double)l / 1000.0, n);
    }

    public static String qcvH(long l) {
        return bhsi.CoVI((double)l / 1000000.0);
    }

    public static String VwLY(long l, int n) {
        return bhsi.UtIU((double)l / 1000000.0, n);
    }

    public static String TEqA(long l, int n) {
        return bhsi.biLo((double)l / 1000000.0, n);
    }

    private static Object tf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}

