/*
 * Decompiled with CFR 0_123.
 */
public class jVod {
    public static void mXJp(double[] arrd, double d) {
        for (int i = arrd.length - 2; i >= 0; --i) {
            arrd[i + 1] = arrd[i];
        }
        arrd[0] = d;
    }

    public static void mXJp(double[] arrd) {
        double d = arrd[arrd.length - 1];
        jVod.mXJp(arrd, d);
    }

    public static void fill(double[] arrd, double d) {
        for (int i = 0; i < arrd.length; ++i) {
            arrd[i] = d;
        }
    }
}

