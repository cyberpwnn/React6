/*
 * Decompiled with CFR 0_123.
 */
public class FpWy {
    public static void yJLS(double[] arrd, double d) {
        int n = arrd.length - 2;
        while (n >= 0) {
            arrd[n + 1] = arrd[n];
            --n;
        }
        arrd[0] = d;
    }

    public static void yJLS(double[] arrd) {
        double d = arrd[arrd.length - 1];
        FpWy.yJLS(arrd, d);
    }

    public static void fill(double[] arrd, double d) {
        int n = 0;
        while (n < arrd.length) {
            arrd[n] = d;
            ++n;
        }
    }
}

