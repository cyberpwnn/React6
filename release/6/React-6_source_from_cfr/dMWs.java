/*
 * Decompiled with CFR 0_123.
 */
public class dMWs {
    private float i;

    public dMWs(float f) {
        this.i = f;
    }

    public float get() {
        return ((Float)cv.b(this, 985921569)).floatValue();
    }

    public void set(float f) {
        cv.e(this, 985921569, Float.valueOf(f));
    }

    public void add(float f) {
        dMWs dMWs2 = this;
        cv.e(dMWs2, 985921569, Float.valueOf(((Float)cv.b(dMWs2, 985921569)).floatValue() + f));
    }

    public void IWSm(float f) {
        dMWs dMWs2 = this;
        cv.e(dMWs2, 985921569, Float.valueOf(((Float)cv.b(dMWs2, 985921569)).floatValue() - f));
    }
}

