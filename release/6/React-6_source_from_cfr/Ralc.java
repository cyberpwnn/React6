/*
 * Decompiled with CFR 0_123.
 */
public class Ralc {
    private int i;

    public Ralc(int n) {
        this.i = n;
    }

    public int get() {
        return (Integer)yy.h(this, 172359375);
    }

    public void set(int n) {
        yy.E(this, 172359375, n);
    }

    public void add(int n) {
        Ralc ralc = this;
        yy.E(ralc, 172359375, (Integer)yy.h(ralc, 172359375) + n);
    }

    public void qdWJ(int n) {
        Ralc ralc = this;
        yy.E(ralc, 172359375, (Integer)yy.h(ralc, 172359375) - n);
    }
}

