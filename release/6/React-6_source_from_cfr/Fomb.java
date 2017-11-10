/*
 * Decompiled with CFR 0_123.
 */
public class Fomb {
    private float i;

    public Fomb(float f) {
        this.i = f;
    }

    public float get() {
        return ((Float)yy.h(this, -748421414)).floatValue();
    }

    public void set(float f) {
        yy.E(this, -748421414, Float.valueOf(f));
    }

    public void add(float f) {
        Fomb fomb = this;
        yy.E(fomb, -748421414, Float.valueOf(((Float)yy.h(fomb, -748421414)).floatValue() + f));
    }

    public void yJLL(float f) {
        Fomb fomb = this;
        yy.E(fomb, -748421414, Float.valueOf(((Float)yy.h(fomb, -748421414)).floatValue() - f));
    }
}

