/*
 * Decompiled with CFR 0_123.
 */
public class TFYr {
    private int i;

    public TFYr(int n) {
        this.i = n;
    }

    public int get() {
        return (Integer)cv.b(this, -182585312);
    }

    public void set(int n) {
        cv.e(this, -182585312, n);
    }

    public void add(int n) {
        TFYr tFYr = this;
        cv.e(tFYr, -182585312, (Integer)cv.b(tFYr, -182585312) + n);
    }

    public void rMgK(int n) {
        TFYr tFYr = this;
        cv.e(tFYr, -182585312, (Integer)cv.b(tFYr, -182585312) - n);
    }
}

