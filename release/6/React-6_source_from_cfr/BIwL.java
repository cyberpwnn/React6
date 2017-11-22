/*
 * Decompiled with CFR 0_123.
 */
public class BIwL {
    public static void ssNb(double[] arrd, double d) {
        for (int i = arrd.length - 2; i >= 0; --i) {
            arrd[i + 1] = arrd[i];
        }
        arrd[0] = d;
    }

    public static void ssNb(double[] arrd) {
        double d = arrd[arrd.length - 1];
        BIwL.ssNb(arrd, d);
    }

    public static void fill(double[] arrd, double d) {
        for (int i = 0; i < arrd.length; ++i) {
            arrd[i] = d;
        }
    }
}

