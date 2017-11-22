/*
 * Decompiled with CFR 0_123.
 */
public abstract class LGOT<T>
implements NxGC<T> {
    private String jyhK;
    private long piwO;
    protected T object;

    public LGOT(long l, String string) {
        this.piwO = l;
        this.jyhK = string;
    }

    public LGOT(long l, T t, String string) {
        this(l, string);
        this.object = t;
    }

    @Override
    public String NUdB() {
        return (String)cv.b(this, -1772483068);
    }

    @Override
    public long OOtu() {
        return (Long)cv.b(this, 1192693255);
    }

    @Override
    public T Smci() {
        return (T)cv.b(this, -530641402);
    }

    @Override
    public abstract vslr aLYV();

    @Override
    public abstract void ssNb(vslr var1);
}

