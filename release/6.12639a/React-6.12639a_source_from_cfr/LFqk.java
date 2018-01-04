/*
 * Decompiled with CFR 0_123.
 */
public class LFqk {
    private float i;

    public LFqk(float f) {
        this.i = f;
    }

    public float get() {
        return ((Float)o.a(this, 1557220418)).floatValue();
    }

    public void set(float f) {
        o.v(this, 1557220418, Float.valueOf(f));
    }

    public void add(float f) {
        LFqk lFqk = this;
        o.v(lFqk, 1557220418, Float.valueOf(((Float)o.a(lFqk, 1557220418)).floatValue() + f));
    }

    public void biLo(float f) {
        LFqk lFqk = this;
        o.v(lFqk, 1557220418, Float.valueOf(((Float)o.a(lFqk, 1557220418)).floatValue() - f));
    }
}

