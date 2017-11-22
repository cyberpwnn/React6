/*
 * Decompiled with CFR 0_123.
 */
public class KwTH {
    private static final int tfMw = 128;
    private static final int HCle = 46080;
    private static final float[] mjJS;

    static {
        cv.V(-137561770, new float[46080]);
        int n = 0;
        while (n < ((float[])cv.e(-137561770)).length) {
            ((float[])cv.e((int)-137561770))[n] = (float)((Double)cv.o(959516498, new Object[]{(double)n * 3.141592653589793 / 23040.0})).doubleValue();
            ++n;
        }
    }

    public static double ssNb(double d, double d2, double d3) {
        Object[] arrobject = new Object[2];
        arrobject[1] = d;
        arrobject[0] = d2;
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = (double)((Double)cv.o(-1003095727, arrobject));
        arrobject2[0] = d3;
        return (Double)cv.o(841087312, arrobject2);
    }

    public static boolean ssNb(Double d) {
        if (d == null) {
            if ((Double)cv.o(-1542130742, null) < 0.5) {
                return true;
            }
            return false;
        }
        if ((Double)cv.o(-1542130742, null) < (Double)cv.A(d, 1113722988, null)) {
            return true;
        }
        return false;
    }

    public static double jhSt(long l, int n) {
        return 20.0 * ((double)l / 5.0E7) / (double)n;
    }

    public static double TyVf(long l) {
        return (double)l / 5.0E7;
    }

    public static String LGKN(int n) {
        Object object = cv.c(-724436653, null);
        Object[] arrobject = new Object[2];
        arrobject[1] = cv.o(916131721, new Object[]{1000});
        arrobject[0] = YEBy$TyVf.W("\u06e2");
        cv.A(object, -535955118, arrobject);
        Object[] arrobject2 = new Object[2];
        arrobject2[1] = cv.o(916131721, new Object[]{900});
        arrobject2[0] = YEBy$TyVf.W("\u06ec\u5f83");
        cv.A(object, -535955118, arrobject2);
        Object[] arrobject3 = new Object[2];
        arrobject3[1] = cv.o(916131721, new Object[]{500});
        arrobject3[0] = YEBy$TyVf.W("\u06eb");
        cv.A(object, -535955118, arrobject3);
        Object[] arrobject4 = new Object[2];
        arrobject4[1] = cv.o(916131721, new Object[]{400});
        arrobject4[0] = YEBy$TyVf.W("\u06ec\u5f8a");
        cv.A(object, -535955118, arrobject4);
        Object[] arrobject5 = new Object[2];
        arrobject5[1] = cv.o(916131721, new Object[]{100});
        arrobject5[0] = YEBy$TyVf.W("\u06ec");
        cv.A(object, -535955118, arrobject5);
        Object[] arrobject6 = new Object[2];
        arrobject6[1] = cv.o(916131721, new Object[]{90});
        arrobject6[0] = YEBy$TyVf.W("\u06f7\u5f8d");
        cv.A(object, -535955118, arrobject6);
        Object[] arrobject7 = new Object[2];
        arrobject7[1] = cv.o(916131721, new Object[]{50});
        arrobject7[0] = YEBy$TyVf.W("\u06e3");
        cv.A(object, -535955118, arrobject7);
        Object[] arrobject8 = new Object[2];
        arrobject8[1] = cv.o(916131721, new Object[]{40});
        arrobject8[0] = YEBy$TyVf.W("\u06f7\u5f82");
        cv.A(object, -535955118, arrobject8);
        Object[] arrobject9 = new Object[2];
        arrobject9[1] = cv.o(916131721, new Object[]{10});
        arrobject9[0] = YEBy$TyVf.W("\u06f7");
        cv.A(object, -535955118, arrobject9);
        Object[] arrobject10 = new Object[2];
        arrobject10[1] = cv.o(916131721, new Object[]{9});
        arrobject10[0] = YEBy$TyVf.W("\u06e6\u5f96");
        cv.A(object, -535955118, arrobject10);
        Object[] arrobject11 = new Object[2];
        arrobject11[1] = cv.o(916131721, new Object[]{5});
        arrobject11[0] = YEBy$TyVf.W("\u06f9");
        cv.A(object, -535955118, arrobject11);
        Object[] arrobject12 = new Object[2];
        arrobject12[1] = cv.o(916131721, new Object[]{4});
        arrobject12[0] = YEBy$TyVf.W("\u06e6\u5f98");
        cv.A(object, -535955118, arrobject12);
        Object[] arrobject13 = new Object[2];
        arrobject13[1] = cv.o(916131721, new Object[]{1});
        arrobject13[0] = YEBy$TyVf.W("\u06e6");
        cv.A(object, -535955118, arrobject13);
        Object object2 = "";
        Object object3 = cv.A(cv.A(object, 91093341, null), -442959524, null);
        while (((Boolean)cv.A(object3, 1326905754, null)).booleanValue()) {
            Object object4 = cv.A(object3, -1747715745, null);
            int n2 = n / (Integer)cv.A(cv.A(object4, 974518622, null), -109703281, null);
            Object[] arrobject14 = new Object[2];
            arrobject14[1] = n2;
            arrobject14[0] = cv.A(object4, -18548328, null);
            object2 = cv.A(cv.A(cv.c(1378548057, new Object[]{cv.o(1195315408, new Object[]{object2})}), -1120136937, new Object[]{cv.o(1879767451, arrobject14)}), -420867818, null);
            n %= ((Integer)cv.A(cv.A(object4, 974518622, null), -109703281, null)).intValue();
        }
        return object2;
    }

    private static String repeat(String string, int n) {
        if (string == null) {
            return null;
        }
        Object object = cv.c(87423365, null);
        int n2 = 0;
        while (n2 < n) {
            cv.A(object, -1120136937, new Object[]{string});
            ++n2;
        }
        return (String)cv.A(object, -420867818, null);
    }

    public static int IWSm(int n, int n2) {
        return n + (int)((Double)cv.o(-1542130742, null) * (double)(n2 - n + 1));
    }

    public static int nJLQ(String object) {
        if (((Boolean)cv.A(object, 250149252, null)).booleanValue()) {
            return 0;
        }
        if (((Boolean)cv.A(object = cv.A(object, 977408122, null), -1121644355, new Object[]{KUXS$dwji.S("\u2034")})).booleanValue()) {
            return 1000 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{1})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u203a\u6493")})).booleanValue()) {
            return 900 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{2})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u203d")})).booleanValue()) {
            return 500 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{1})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u203a\u649a")})).booleanValue()) {
            return 400 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{2})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u203a")})).booleanValue()) {
            return 100 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{1})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u2021\u649d")})).booleanValue()) {
            return 90 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{2})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u2035")})).booleanValue()) {
            return 50 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{1})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u2021\u6492")})).booleanValue()) {
            return 40 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{2})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u2021")})).booleanValue()) {
            return 10 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{1})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u2030\u6486")})).booleanValue()) {
            return 9 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{2})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u202f")})).booleanValue()) {
            return 5 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{1})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u2030\u6488")})).booleanValue()) {
            return 4 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{2})});
        }
        if (((Boolean)cv.A(object, -1121644355, new Object[]{KUXS$dwji.S("\u2030")})).booleanValue()) {
            return 1 + (Integer)cv.o(229112199, new Object[]{cv.A(object, -1942417552, new Object[]{1})});
        }
        return 0;
    }

    public static long KvwI() {
        return (Long)cv.o(-26472620, null);
    }

    public static long AFvO() {
        return (Long)cv.o(-918745259, null);
    }

    public static float sin(float f) {
        return ((Float)cv.o(74578310, new Object[]{(int)(f * 128.0f + 0.5f)})).floatValue();
    }

    public static float cos(float f) {
        return ((Float)cv.o(74578310, new Object[]{(int)((f + 90.0f) * 128.0f + 0.5f)})).floatValue();
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

    public static boolean DYFV(int n, int n2, int n3) {
        if (n3 >= n && n3 <= n2) {
            return true;
        }
        return false;
    }

    private static float NUdB(int n) {
        if (n >= 0) {
            return ((float[])cv.e(-137561770))[n % 46080];
        }
        return - ((float[])cv.e(-137561770))[(- n) % 46080];
    }
}

