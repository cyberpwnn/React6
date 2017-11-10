/*
 * Decompiled with CFR 0_123.
 */
public class SnAm {
    private long WNxt;

    public SnAm(long l) {
        this.WNxt = l;
    }

    public long get() {
        return (Long)yy.h(this, -922222896);
    }

    public void set(long l) {
        yy.E(this, -922222896, l);
    }

    public void add(long l) {
        SnAm snAm = this;
        yy.E(snAm, -922222896, (Long)yy.h(snAm, -922222896) + l);
    }

    public void CVAs(long l) {
        SnAm snAm = this;
        yy.E(snAm, -922222896, (Long)yy.h(snAm, -922222896) - l);
    }
}

