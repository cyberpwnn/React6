/*
 * Decompiled with CFR 0_123.
 */
public abstract class FVgY
implements xyxr {
    private String name;
    private mrIy vSUH;
    private long QGJW;
    private double max;

    public FVgY(String string, long l) {
        this.name = string;
        this.QGJW = l;
        this.vSUH = new mrIy();
        this.max = 0.0;
    }

    @Override
    public String getName() {
        return (String)o.a(this, -1615111864);
    }

    @Override
    public mrIy FViO() {
        return (mrIy)o.a(this, 161569095);
    }

    @Override
    public long yIwi() {
        return (Long)o.a(this, -1172088506);
    }

    @Override
    public void biLo(UQqm uQqm) {
        this.yJLS(uQqm);
    }

    @Override
    public double getMax() {
        return (Double)o.a(this, -1588045499);
    }

    @Override
    public void dfaE(double d) {
        o.v(this, -1588045499, d);
    }

    public abstract void yJLS(UQqm var1);
}

