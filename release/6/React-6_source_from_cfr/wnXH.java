/*
 * Decompiled with CFR 0_123.
 */
public class wnXH {
    private static final int WXMo = 128;
    private static final int NLsD = 46080;
    private static final float[] CLqw;

    static {
        yy.K(-515834015, new float[46080]);
        int n = 0;
        while (n < ((float[])yy.p(-515834015)).length) {
            ((float[])yy.p((int)-515834015))[n] = (float)((Double)yy.b(39512490, new Object[]{(double)n * 3.141592653589793 / 23040.0})).doubleValue();
            ++n;
        }
    }

    public static double mXJp(double d, double d2, double d3) {
        Object[] arrobject = new Object[2];
        arrobject[1] = d;
        arrobject[0] = d2;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = (double)((Double)yy.b(1348861802, arrobject));
        arrobject2[0] = d3;
        return (Double)yy.b(810483551, arrobject2);
    }

    public static boolean mXJp(Double d) {
        if (d == null) {
            if ((Double)yy.b(202965629, null) < 0.5) {
                return true;
            }
            return false;
        }
        if ((Double)yy.b(202965629, null) < (Double)yy.k(d, -571873095, null)) {
            return true;
        }
        return false;
    }

    public static double qdWJ(long l, int n) {
        return 20.0 * ((double)l / 5.0E7) / (double)n;
    }

    public static double qAsQ(long l) {
        return (double)l / 5.0E7;
    }

    public static String qAsQ(int n) {
        Object object = yy.Y(1135804256, null);
        Object[] arrobject = new Object[2];
        arrobject[1] = yy.b(-2136340716, new Object[]{1000});
        arrobject[0] = KDGY$JAHk.Y("\u1363");
        yy.k(object, 443678389, arrobject);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = yy.b(-2136340716, new Object[]{900});
        arrobject2[0] = KDGY$JAHk.Y("\u136d\uc3f7");
        yy.k(object, 443678389, arrobject2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = yy.b(-2136340716, new Object[]{500});
        arrobject3[0] = KDGY$JAHk.Y("\u136a");
        yy.k(object, 443678389, arrobject3);
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = yy.b(-2136340716, new Object[]{400});
        arrobject4[0] = KDGY$JAHk.Y("\u136d\uc3fe");
        yy.k(object, 443678389, arrobject4);
        Object[] arrobject5 = new Object[2];
        arrobject5[1] = yy.b(-2136340716, new Object[]{100});
        arrobject5[0] = KDGY$JAHk.Y("\u136d");
        yy.k(object, 443678389, arrobject5);
        Object[] arrobject6 = new Object[2];
        arrobject6[1] = yy.b(-2136340716, new Object[]{90});
        arrobject6[0] = KDGY$JAHk.Y("\u1376\uc3f9");
        yy.k(object, 443678389, arrobject6);
        Object[] arrobject7 = new Object[2];
        arrobject7[1] = yy.b(-2136340716, new Object[]{50});
        arrobject7[0] = KDGY$JAHk.Y("\u1362");
        yy.k(object, 443678389, arrobject7);
        Object[] arrobject8 = new Object[2];
        arrobject8[1] = yy.b(-2136340716, new Object[]{40});
        arrobject8[0] = KDGY$JAHk.Y("\u1376\uc3f6");
        yy.k(object, 443678389, arrobject8);
        Object[] arrobject9 = new Object[2];
        arrobject9[1] = yy.b(-2136340716, new Object[]{10});
        arrobject9[0] = KDGY$JAHk.Y("\u1376");
        yy.k(object, 443678389, arrobject9);
        Object[] arrobject10 = new Object[2];
        arrobject10[1] = yy.b(-2136340716, new Object[]{9});
        arrobject10[0] = KDGY$JAHk.Y("\u1367\uc3e2");
        yy.k(object, 443678389, arrobject10);
        Object[] arrobject11 = new Object[2];
        arrobject11[1] = yy.b(-2136340716, new Object[]{5});
        arrobject11[0] = KDGY$JAHk.Y("\u1378");
        yy.k(object, 443678389, arrobject11);
        Object[] arrobject12 = new Object[2];
        arrobject12[1] = yy.b(-2136340716, new Object[]{4});
        arrobject12[0] = KDGY$JAHk.Y("\u1367\uc3ec");
        yy.k(object, 443678389, arrobject12);
        Object[] arrobject13 = new Object[2];
        arrobject13[1] = yy.b(-2136340716, new Object[]{1});
        arrobject13[0] = KDGY$JAHk.Y("\u1367");
        yy.k(object, 443678389, arrobject13);
        Object object2 = "";
        Object object3 = yy.k(yy.k(object, 1567227566, null), -115540301, null);
        while (((Boolean)yy.k(object3, 745733821, null)).booleanValue()) {
            Object object4 = yy.k(object3, -762642764, null);
            int n2 = n / (Integer)yy.k(yy.k(object4, 648281769, null), 2026768142, null);
            Object[] arrobject14 = new Object[2];
            arrobject14[1] = n2;
            arrobject14[0] = yy.k(object4, 168492711, null);
            object2 = yy.k(yy.k(yy.Y(-1716388174, new Object[]{yy.b(645392634, new Object[]{object2})}), 352905820, new Object[]{yy.b(2090532520, arrobject14)}), 169339473, null);
            n %= ((Integer)yy.k(yy.k(object4, 648281769, null), 2026768142, null)).intValue();
        }
        return object2;
    }

    private static String repeat(String string, int n) {
        if (string == null) {
            return null;
        }
        Object object = yy.Y(-1325269322, null);
        int n2 = 0;
        while (n2 < n) {
            yy.k(object, 352905820, new Object[]{string});
            ++n2;
        }
        return (String)yy.k(object, 169339473, null);
    }

    public static int yJLL(int n, int n2) {
        return n + (int)((Double)yy.b(202965629, null) * (double)(n2 - n + 1));
    }

    public static int yJLL(String object) {
        if (((Boolean)yy.k(object, -1842741573, null)).booleanValue()) {
            return 0;
        }
        if (((Boolean)yy.k(object = yy.k(object, 274466461, null), 1609762446, new Object[]{NVIs$JbpD.H("\ud4e0")})).booleanValue()) {
            return 1000 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{1})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4ee\u6d7b")})).booleanValue()) {
            return 900 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{2})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4e9")})).booleanValue()) {
            return 500 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{1})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4ee\u6d72")})).booleanValue()) {
            return 400 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{2})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4ee")})).booleanValue()) {
            return 100 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{1})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4f5\u6d75")})).booleanValue()) {
            return 90 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{2})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4e1")})).booleanValue()) {
            return 50 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{1})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4f5\u6d7a")})).booleanValue()) {
            return 40 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{2})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4f5")})).booleanValue()) {
            return 10 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{1})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4e4\u6d6e")})).booleanValue()) {
            return 9 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{2})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4fb")})).booleanValue()) {
            return 5 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{1})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4e4\u6d60")})).booleanValue()) {
            return 4 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{2})});
        }
        if (((Boolean)yy.k(object, 1609762446, new Object[]{NVIs$JbpD.H("\ud4e4")})).booleanValue()) {
            return 1 + (Integer)yy.b(-1398931780, new Object[]{yy.k(object, -1369176303, new Object[]{1})});
        }
        return 0;
    }

    public static long erWK() {
        return (Long)yy.b(-1442251118, null);
    }

    public static long MIoJ() {
        return (Long)yy.b(1779828851, null);
    }

    public static float sin(float f) {
        return ((Float)yy.b(-1636172111, new Object[]{(int)(f * 128.0f + 0.5f)})).floatValue();
    }

    public static float cos(float f) {
        return ((Float)yy.b(-1636172111, new Object[]{(int)((f + 90.0f) * 128.0f + 0.5f)})).floatValue();
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

    public static boolean ksfs(int n, int n2, int n3) {
        if (n3 >= n && n3 <= n2) {
            return true;
        }
        return false;
    }

    private static float gUxV(int n) {
        if (n >= 0) {
            return ((float[])yy.p(-515834015))[n % 46080];
        }
        return - ((float[])yy.p(-515834015))[(- n) % 46080];
    }
}

