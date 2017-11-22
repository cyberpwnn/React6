/*
 * Decompiled with CFR 0_123.
 */
public abstract class tvRU {
    protected final int[] perm = new int[512];
    protected double offsetX;
    protected double offsetY;
    protected double offsetZ;

    public static int floor(double d) {
        if (d >= 0.0) {
            return (int)d;
        }
        return (int)d - 1;
    }

    protected static double fade(double d) {
        return d * d * d * (d * (d * 6.0 - 15.0) + 10.0);
    }

    protected static double lerp(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    protected static double grad(int n, double d, double d2, double d3) {
        double d4;
        double d5 = d4 = (n &= 15) < 8 ? d : d2;
        double d6 = n < 4 ? d2 : (n == 12 || n == 14 ? d : d3);
        return ((n & 1) == 0 ? d4 : - d4) + ((n & 2) == 0 ? d6 : - d6);
    }

    public double noise(double d) {
        return this.noise(d, 0.0, 0.0);
    }

    public double noise(double d, double d2) {
        return this.noise(d, d2, 0.0);
    }

    public abstract double noise(double var1, double var3, double var5);

    public double noise(double d, int n, double d2, double d3) {
        return this.noise(d, 0.0, 0.0, n, d2, d3);
    }

    public double noise(double d, int n, double d2, double d3, boolean bl) {
        return this.noise(d, 0.0, 0.0, n, d2, d3, bl);
    }

    public double noise(double d, double d2, int n, double d3, double d4) {
        return this.noise(d, d2, 0.0, n, d3, d4);
    }

    public double noise(double d, double d2, int n, double d3, double d4, boolean bl) {
        return this.noise(d, d2, 0.0, n, d3, d4, bl);
    }

    public double noise(double d, double d2, double d3, int n, double d4, double d5) {
        return this.noise(d, d2, d3, n, d4, d5, false);
    }

    public double noise(double d, double d2, double d3, int n, double d4, double d5, boolean bl) {
        double d6 = 0.0;
        double d7 = 1.0;
        double d8 = 1.0;
        double d9 = 0.0;
        for (int i = 0; i < n; ++i) {
            d6 += this.noise(d * d8, d2 * d8, d3 * d8) * d7;
            d9 += d7;
            d8 *= d4;
            d7 *= d5;
        }
        if (bl) {
            d6 /= d9;
        }
        return d6;
    }
}

