/*
 * Decompiled with CFR 0_123.
 */
public class clWu {
    private double FOFL;

    public clWu(double d) {
        this.FOFL = d;
    }

    public double get() {
        return (Double)cv.b(this, -1224148954);
    }

    public void set(double d) {
        cv.e(this, -1224148954, d);
    }

    public void add(double d) {
        clWu clWu2 = this;
        cv.e(clWu2, -1224148954, (Double)cv.b(clWu2, -1224148954) + d);
    }

    public void rwyd(double d) {
        clWu clWu2 = this;
        cv.e(clWu2, -1224148954, (Double)cv.b(clWu2, -1224148954) - d);
    }
}

